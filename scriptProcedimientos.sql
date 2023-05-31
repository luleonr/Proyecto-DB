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
CREATE PROCEDURE Estudiante_mostrar_datos_personales(IN user_ CHAR(40))
BEGIN
  SELECT * FROM vw_Estudiante_ver_datos_personales WHERE usuario = user_;
END //
DELIMITER ;

GRANT EXECUTE ON PROCEDURE Estudiante_mostrar_datos_personales TO Estudiante;
-- CALL Estudiante_mostrar_datos_personales('cbarrerar');


-- ----------------------------------------------------------------------------
-- MODIFICAR DATOS ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS Estudiante_actualizar_datos_personales;
DELIMITER //
CREATE PROCEDURE Estudiante_actualizar_datos_personales(
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
