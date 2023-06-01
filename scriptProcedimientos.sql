USE Academico;
-- -----------------------------------------------------------------------------
-- FUNCIÓN OBTENER SEMESTRE ACTUAL
-- -----------------------------------------------------------------------------
SET GLOBAL log_bin_trust_function_creators = 1;
DROP FUNCTION IF EXISTS f_obtener_semestre;
DELIMITER $$
CREATE FUNCTION f_obtener_semestre() RETURNS VARCHAR(10)
BEGIN
	SET @current_month = MONTH(curdate());
    SET @current_year = YEAR(curdate());
    IF @current_month <= 7 THEN
		RETURN CONCAT(@current_year,'-1');
	ELSE
		RETURN CONCAT(@current_year,'-2');
    END IF;
END $$
DELIMITER ;
-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS ESTUDIANTE
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mostrar_datos_personales;
DELIMITER //
CREATE PROCEDURE Estudiante_mostrar_datos_personales()
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  SELECT * FROM vw_Estudiante_ver_datos_personales WHERE usuario = user_;
END //
DELIMITER ;

GRANT EXECUTE ON PROCEDURE Estudiante_mostrar_datos_personales TO Estudiante;
-- CALL Estudiante_mostrar_datos_personales();


-- ----------------------------------------------------------------------------
-- MODIFICAR DATOS ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_actualizar_datos_personales;
DELIMITER //
CREATE PROCEDURE Estudiante_actualizar_datos_personales(
  Direccion_ VARCHAR(40), 
  Tel_Mov VARCHAR(40), 
  Tel_Fij VARCHAR(40)
)
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  IF Direccion_ IS NULL THEN
        SELECT Direccion INTO Direccion_
		FROM vw_Estudiante_modificar_datos_personales
		WHERE usuario = user_;
    END IF ;
  IF Tel_Mov IS NULL THEN
        SELECT Telefono_Movil INTO Tel_Mov
		FROM vw_Estudiante_modificar_datos_personales
		WHERE usuario = user_;
    END IF ;
  IF Tel_Fij IS NULL THEN
        SELECT Telefono_Fijo INTO Tel_Fij
		FROM vw_Estudiante_modificar_datos_personales
		WHERE usuario = user_;
    END IF ;
  
  UPDATE vw_Estudiante_modificar_datos_personales 
  SET Direccion = Direccion_, Telefono_Movil = Tel_Mov, Telefono_Fijo = Tel_Fij
  WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_actualizar_datos_personales TO Estudiante;
-- CALL Estudiante_actualizar_datos_personales('cbarrerar', 'Transversal 5C Este # 23 42', '300657574',null);

-- ---------------------------------------------------------------------------
-- MOSTRAR HISTORIA ACADEMICA
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mostrar_historia_academica;
DELIMITER //
CREATE PROCEDURE Estudiante_mostrar_historia_academica(IN user_ CHAR(40))
BEGIN
	SELECT * FROM vw_Historia_academica WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mostrar_historia_academica TO Estudiante;
-- CALL Estudiante_mostrar_historia_academica('mcheshire');

-- ---------------------------------------------------------------------------
-- MOSTRAR HORARIO
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mostrar_horario;
DELIMITER //
CREATE PROCEDURE Estudiante_mostrar_horario(IN user_ CHAR(40))
BEGIN
	SELECT * FROM  vw_Horario WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mostrar_horario TO Estudiante;
-- CALL Estudiante_mostrar_horario('mcheshire');

-- ---------------------------------------------------------------------------------------------------------------------------------

-- ---------------------------------------------------------------------------
-- INSERTAR ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Admin_usuarios_insertar_estudiante;
DELIMITER //
CREATE PROCEDURE Admin_usuarios_insertar_estudiante( 
  per_cc INT ,
  per_nombre VARCHAR(45) ,
  per_direccion VARCHAR(45) ,
  per_tel_movil VARCHAR(20),
  per_tel_fijo VARCHAR(20),
  per_correo_institucional VARCHAR(45),  
  estud_año_ingreso DATE,
  estud_tutor_prof_cc INT,
  prog_nombre_ VARCHAR(45)
  )
BEGIN
	DECLARE prog_id_ VARCHAR(45);
	
	INSERT INTO Persona (per_cc, per_nombre, per_direccion, per_tel_movil, per_tel_fijo, per_correo_institucional) 
		VALUES (per_cc, per_nombre, per_direccion, per_tel_movil , per_tel_fijo, per_correo_institucional);
    -- -----------------------------------------    
	INSERT INTO Estudiante (estud_cc, estud_año_ingreso, estud_tutor_prof_cc) 
		VALUES (per_cc, estud_año_ingreso, estud_tutor_prof_cc);

    SELECT prog_id INTO prog_id_ FROM Programa WHERE prog_nombre = prog_nombre_;
    
    INSERT INTO Estudiante_has_Programa (Estudiante_persona_CC, Programa_id_programa) VALUES (per_cc,prog_id_);
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Admin_usuarios_insertar_estudiante TO Admin_usuarios;
-- CALL insertar_estudiante_rol_Admin_usuarios(2010000004, 'Maria Florez', 'Calle 58 # 24 - 51 Sur',
-- 300875135 , NULL, 'mflorezr@unal.edu.co', '2023-01-01' , 80150101 ,'Ingeniería de Sistemas y Computación');

-- ---------------------------------------------------------------------------
-- CONSULTAR ESTUDIANTES
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Admin_usuarios_mostrar_estudiante;
DELIMITER //
CREATE PROCEDURE Admin_usuarios_mostrar_estudiante()
BEGIN
	SELECT * FROM  Persona JOIN Estudiante ON per_cc = estud_cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Admin_usuarios_mostrar_estudiante TO Admin_usuarios;
-- CALL Admin_usuarios_mostrar_estudiante();

-- ---------------------------------------------------------------------------
-- ACTUALIZAR DATOS ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Admin_usuarios_actualizar_estudiante;
DELIMITER //
CREATE PROCEDURE Admin_usuarios_actualizar_estudiante(
  user_ CHAR(40), 
  Direccion_ VARCHAR(40), 
  Tel_Mov VARCHAR(40), 
  Tel_Fij VARCHAR(40)
)
BEGIN
  UPDATE vw_Estudiante_modificar_datos_personales 
  SET Direccion = Direccion_, Telefono_Movil = Tel_Mov, Telefono_Fijo = Tel_Fij
  WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Admin_usuarios_actualizar_estudiante TO Admin_usuarios;
-- CALL Admin_usuarios_actualizar_estudiante();

-- ---------------------------------------------------------------------------
-- CONSULTAR CITAS ACTIVAS
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mirar_citas_activas;
DELIMITER //
CREATE PROCEDURE Estudiante_mirar_citas_activas(
  Program VARCHAR(45)
)
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  
  IF Program = NULL THEN 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Inicio<=now() AND Final>=now();
  ELSE 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Inicio<=now() AND Final>=now() AND Program=Programa;
  END IF ;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mirar_citas_activas TO Estudiante;
CALL Estudiante_mirar_citas_activas(null);

-- ---------------------------------------------------------------------------
-- CONSULTAR CITAS PRÓXIMAS
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mirar_citas_proximas;
DELIMITER //
CREATE PROCEDURE Estudiante_mirar_citas_proximas(
  Program VARCHAR(45)
)
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  
  IF Program = NULL THEN 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Inicio>now();
  ELSE 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Inicio>now() AND Program=Programa;
  END IF ;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mirar_citas_proximas TO Estudiante;
CALL Estudiante_mirar_citas_proximas(null);

-- ---------------------------------------------------------------------------
-- CONSULTAR CITAS VENCIDAS
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mirar_citas_vencidas;
DELIMITER //
CREATE PROCEDURE Estudiante_mirar_citas_vencidas(
  Program VARCHAR(45)
)
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  
  IF Program = NULL THEN 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Final<now();
  ELSE 
	SELECT * FROM vw_Citas_de_inscripcion WHERE Usuario = user_ AND Final>now() AND Program=Programa;
  END IF ;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mirar_citas_vencidas TO Estudiante;
CALL Estudiante_mirar_citas_vencidas(null);

-- ---------------------------------------------------------------------------
-- CONSULTAR PROGRAMAS DEL ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_mirar_programas;
DELIMITER //
CREATE PROCEDURE Estudiante_mirar_programas()
BEGIN
  DECLARE user_ VARCHAR(40);
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  
  SELECT Programa FROM vw_citas_de_inscripcion WHERE usuario=user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Estudiante_mirar_programas TO Estudiante;
CALL Estudiante_mirar_programas();

-- ---------------------------------------------------------------------------
-- INSCRIBIR MATERIA
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Inscribir_materia;
DELIMITER //
CREATE PROCEDURE Inscribir_materia(Asignatura INT, Programa INT, Grupo INT)
BEGIN
  DECLARE user_ VARCHAR(40);
  DECLARE cedula int;
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  SELECT user_cc INTO cedula FROM usuario WHERE user_usuario=user_;
  
  INSERT INTO inscripcion VALUES (f_obtener_semestre(),cedula,Asignatura,Programa,Grupo);

END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Inscribir_materia TO Estudiante;
-- CALL Inscribir_materia(1,1,1);

-- ---------------------------------------------------------------------------
-- NOTAS DEFINITIVAS
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Notas_definitivas;
DELIMITER //
CREATE PROCEDURE Notas_definitivas(Semestre VARCHAR(10))
BEGIN
  DECLARE user_ VARCHAR(40);
  DECLARE cedula int;
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  SELECT user_cc INTO cedula FROM usuario WHERE user_usuario=user_;
  
  SELECT ponde_insc_id_asignatura,ponde_nota_final,ponde_aprobado FROM ponderado WHERE ponde_insc_semestre=Semestre
  AND ponde_insc_estudiante_cc=cedula;

END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Notas_definitivas TO Estudiante;
CALL Notas_definitivas(1);


-- ---------------------------------------------------------------------------
-- NOTAS POR MATERIA
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Notas_materia;
DELIMITER //
CREATE PROCEDURE Notas_materia(Asignatura INT, Semestre VARCHAR(10))
BEGIN
  DECLARE user_ VARCHAR(40);
  DECLARE cedula int;
  SET user_ = SUBSTRING_INDEX(USER(), '@', 1);
  SELECT user_cc INTO cedula FROM usuario WHERE user_usuario=user_;
  
  SELECT eval_nota,eval_porcentaje FROM evaluacion WHERE eval_ponde_insc_id_asignatura=Asignatura AND eval_ponde_insc_semestre=Semestre
  AND eval_ponde_insc_estudiante_cc=cedula;

END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE Notas_materia TO Estudiante;
CALL Notas_materia(1,1);

-- ---------------------------------------------------------------------------
-- CREAR UN USUARIO CON SOLO INGRESAR EL USUARIO Y EL ROL QUE TIENE
-- ----------------------------------------------------------------------------
/*DROP PROCEDURE IF EXISTS create_user;
DELIMITER $$

CREATE PROCEDURE create_user(usuario VARCHAR(40), rol VARCHAR(40))
BEGIN
    -- Asignar los valores a las variables locales
    SET @usuario1 = usuario;
    SET @contrasena = '1234';
    SET @rol = rol;

    -- Crear el usuario en MySQL
    SET @sql = CONCAT('CREATE USER ', @usuario1, ' IDENTIFIED BY ''', @contrasena, '''');
    PREPARE stmt FROM @sql;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;

    -- Asignar rol al usuario
    SET @sql = CONCAT('GRANT ', @rol, ' TO ', @usuario1);
    PREPARE stmt FROM @sql;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;
    
	-- Establecer el rol predeterminado para el usuario
	SET @sql = CONCAT('SET DEFAULT ROLE ALL TO ', @usuario1);
	PREPARE stmt FROM @sql;
	EXECUTE stmt;
	DEALLOCATE PREPARE stmt;
    
END $$

DELIMITER ;

*/
