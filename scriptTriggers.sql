USE academico;

-- ------------------------------------------------------------
-- CREAR USUARIO AUTOMATICAMENTE
-- ------------------------------------------------------------
DROP TRIGGER IF EXISTS tr_creacion_usuario;
DELIMITER $$
CREATE TRIGGER tr_creacion_usuario AFTER INSERT ON Persona
	FOR EACH ROW
	BEGIN 
    SET @cedula = NEW.per_cc;
    SET @correo = NEW.per_correo_institucional;
    SET @usuario = SUBSTRING_INDEX(@correo, '@', 1);
    INSERT INTO Usuario (user_cc, user_usuario) VALUES (@cedula, @usuario);

	END;
$$
DELIMITER ;

DROP TRIGGER IF EXISTS tr_agregar_rol_estudiante;
DELIMITER $$
CREATE TRIGGER tr_agregar_rol_estudiante AFTER INSERT ON Estudiante
	FOR EACH ROW
	BEGIN 
    SET @cedula = NEW.estud_cc;
    UPDATE Usuario SET user_rol = 'Estudiante' WHERE user_cc = @cedula ;

	END;
$$
DELIMITER ;

DROP TRIGGER IF EXISTS tr_agregar_rol_profesor;
DELIMITER $$
CREATE TRIGGER tr_agregar_rol_profesor AFTER INSERT ON Profesor
	FOR EACH ROW
	BEGIN 
    SET @cedula = NEW.prof_cc;
    UPDATE Usuario SET user_rol = 'Profesor' WHERE user_cc = @cedula ;

	END;
$$
DELIMITER ;

-- ------------------------------------------------------------
-- CALCULAR LOS PROMEDIOS CADA SEMESTRE
-- ------------------------------------------------------------

-- CREAR EVENTO PARA ACTUALIZAR PROMEDIOS AUTOMÁTICAMENTE
SET GLOBAL event_scheduler = ON;
DROP EVENT IF EXISTS Nuevo_semestre;
DELIMITER //
CREATE EVENT Nuevo_semestre
ON SCHEDULE
  EVERY 6 MONTH
  STARTS CONCAT(YEAR(CURRENT_TIMESTAMP), '-01-15 00:00:00')
DO
BEGIN  
  SET @Semestre_actual = f_obtener_semestre();
  
  UPDATE Historia_Academica SET histAcad_semestre = @Semestre_actual WHERE histAcad_estado = 'Abierto';
END //
DELIMITER ;
ALTER EVENT Nuevo_semestre ENABLE;

-- AHORA SÍ EL TRIGGER PARA QUE SE ACTUALICEN CUANDO OCURRA EL EVENTO
DROP TRIGGER IF EXISTS tr_calcular_promedios;
DELIMITER $$
CREATE TRIGGER tr_calcular_promedios BEFORE UPDATE ON Historia_Academica
	FOR EACH ROW
	BEGIN 
    
    DECLARE user_ VARCHAR(45);
    DECLARE suma_parcial DECIMAL(10,2);
	DECLARE Denominador INT;    
    
    IF NEW.histAcad_semestre != OLD.histAcad_semestre THEN	
	-- PAPA
    -- necesito que multiplique el numero de creditos por la nota y sume todo
		SELECT usuario INTO user_ FROM vw_Historia_academica WHERE ID_historia_academica = NEW.histAcad_id;
        
		SELECT SUM(Creditos * Calificacion) INTO suma_parcial FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo <= NEW.histAcad_semestre;
		-- Luego que sume el total de créditos
		SELECT SUM(Creditos) INTO Denominador FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo <= NEW.histAcad_semestre;      
		-- Por ultimo que lo divida y lo guarde en PAPA
		SET NEW.histAcad_PAPA = (suma_parcial/Denominador);
        
        -- PAPPI
        SELECT SUM(Creditos * Calificacion) INTO suma_parcial FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo = Old.histAcad_semestre;
		-- Luego que sume el total de créditos
		SELECT SUM(Creditos) INTO Denominador FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo = NEW.histAcad_semestre;      
		-- Por ultimo que lo divida y lo guarde en PAPA
		SET NEW.histAcad_PAPPI = (suma_parcial/Denominador);
        
        -- PROMEDIO ACUMULADO
        SELECT SUM(Creditos * Calificacion) INTO suma_parcial FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo <= NEW.histAcad_semestre AND ESTADO = 'Aprobado';
		-- Luego que sume el total de créditos
		SELECT SUM(Creditos) INTO Denominador FROM vw_Asignaturas_cursadas WHERE Usuario = User_ AND NEW.histAcad_id_programa = ID_Programa AND Periodo <= NEW.histAcad_semestre AND ESTADO = 'Aprobado';      
		-- Por ultimo que lo divida y lo guarde en PAPA
		SET NEW.histAcad_Promedio = (suma_parcial/Denominador);
        
	END IF;
    
	END;
$$
DELIMITER ;

-- ------------------------------------------------------------
-- CALCULAR LOS CREDITOS CADA SEMESTRE
-- ------------------------------------------------------------

DROP TRIGGER IF EXISTS tr_calcular_creditos;
DELIMITER $$
CREATE TRIGGER tr_calcular_creditos BEFORE UPDATE ON Historia_Academica
	FOR EACH ROW
	BEGIN 
    
    DECLARE user_ VARCHAR(45);
    DECLARE Avance DECIMAL(10,2);
	DECLARE Adicionales INT;    
    DECLARE Cupo INT;
	DECLARE Pendientes INT;
    SELECT usuario INTO user_ FROM vw_Historia_academica WHERE ID_historia_academica = NEW.histAcad_id;
    
    
    IF NEW.histAcad_semestre != OLD.histAcad_semestre THEN	   
    
	-- AVANCE
		SELECT (Cursados/Exigidos) INTO Avance FROM vw_resumen_creditos_totales LEFT JOIN vw_resumen_creditos_totales_cursados USING(Tipologia,ID_programa) 
        WHERE vw_resumen_creditos_totales_cursados.Usuario=user_ AND vw_resumen_creditos_totales.ID_programa=NEW.histAcad_id_programa AND Tipologia='TOTAL';
		SET NEW.histAcad_porcen_avance = Avance;
        
	-- Adicionales
		SELECT IFNULL(Creditos_aprobados,0)*2 INTO Adicionales FROM vw_resumen_creditos_totales_aprobados WHERE Usuario=user_ AND ID_programa = NEW.histAcad_id_programa AND Tipologia='TOTAL';
        IF Adicionales > 80 THEN 
			SET NEW.histAcad_cred_adicionales=80;
		ELSE 
			SET NEW.histAcad_cred_adicionales=Adicionales;
		END IF;
        
	-- Cupo
		SELECT (IFNULL(Creditos_totales,0)-IFNULL(Creditos_cursados,0)-IFNULL(Creditos_inscritos,0)+NEW.histAcad_cred_adicionales) INTO Cupo FROM vw_resumen_creditos_totales LEFT JOIN vw_resumen_creditos_totales_cursados 
		USING(Tipologia,ID_programa) LEFT JOIN vw_resumen_creditos_totales_inscritos USING(Tipologia,ID_programa) 
        WHERE vw_resumen_creditos_totales_cursados.Usuario=user_ AND vw_resumen_creditos_totales.ID_programa=NEW.histAcad_id_programa AND Tipologia='TOTAL';
		SET NEW.histAcad_cup_creditos = Cupo;
    
    -- Disponibles
		SELECT IFNULL((creditos_totales-creditos_aprobados),creditos_totales) INTO Pendientes FROM vw_resumen_creditos_totales LEFT JOIN vw_resumen_creditos_totales_cursados USING(Tipologia,ID_programa) 
        WHERE vw_resumen_creditos_totales_cursados.Usuario=user_ AND vw_resumen_creditos_totales.ID_programa=NEW.histAcad_id_programa AND Tipologia='TOTAL';
		SET NEW.histAcad_cred_disponibles = Cupo-Pendientes;
        
	-- Adicionales
		IF  100 <= NEW.histAcad_porcen_avance THEN
			SET NEW.histAcad_cred_excedentes = NEW.histAcad_cred_disponibles;
		ELSE 
			SET NEW.histAcad_cred_excedentes = 0;
		END IF;
	
    -- Cancelados (toca hacer otra tabla)
    
	END IF;
    
	END;
$$
DELIMITER ;