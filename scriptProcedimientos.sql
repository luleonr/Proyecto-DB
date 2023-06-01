USE Academico;

-- ROL ESTUDIANTE --------------------------------------------------------------
-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS ESTUDIANTE
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Estudiante_mostrar_datos_personales;
DELIMITER //
CREATE PROCEDURE sp_Estudiante_mostrar_datos_personales(IN user_ CHAR(40))
BEGIN
  SELECT * FROM vw_Estudiante_ver_datos_personales WHERE usuario = user_;
END //
DELIMITER ;

GRANT EXECUTE ON PROCEDURE sp_Estudiante_mostrar_datos_personales TO Estudiante;
-- CALL sp_Estudiante_mostrar_datos_personales('cbarrerar');

-- ----------------------------------------------------------------------------
-- MODIFICAR DATOS ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Estudiante_actualizar_datos_personales;
DELIMITER //
CREATE PROCEDURE sp_Estudiante_actualizar_datos_personales(
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
GRANT EXECUTE ON PROCEDURE sp_Estudiante_actualizar_datos_personales TO Estudiante;
-- CALL sp_Estudiante_actualizar_datos_personales(
-- 'cbarrerar', 'Carrera 3D este # 85 - 24 sur', '3006747152','2058164'
-- );

-- ---------------------------------------------------------------------------
-- MOSTRAR HISTORIA ACADEMICA
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Estudiante_mostrar_historia_academica;
DELIMITER //
CREATE PROCEDURE sp_Estudiante_mostrar_historia_academica(IN user_ CHAR(40))
BEGIN
	SELECT * FROM vw_Historia_academica WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Estudiante_mostrar_historia_academica TO Estudiante;
-- CALL sp_Estudiante_mostrar_historia_academica('mcheshire');

-- ---------------------------------------------------------------------------
-- MOSTRAR HORARIO
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Estudiante_mostrar_horario;
DELIMITER //
CREATE PROCEDURE sp_Estudiante_mostrar_horario(user_ CHAR(40))
BEGIN
	SELECT * FROM  vw_Horario WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Estudiante_mostrar_horario TO Estudiante;
-- CALL sp_Estudiante_mostrar_horario('mcheshire');


-- ROL PROFESOR ----------------------------------------------------------------------------------------------
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
-- FUNCIÓN OBTENER SEMESTRE ACTUAL
-- -----------------------------------------------------------------------------------------

DROP FUNCTION IF EXISTS f_find_cc_from_user;
DELIMITER $$
CREATE FUNCTION f_find_cc_from_user(username VARCHAR(45)) RETURNS INT
BEGIN
    RETURN (SELECT user_cc FROM Usuario WHERE user_usuario LIKE username);
END $$
DELIMITER ;

-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS PROFESOR
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Profesor_mostrar_datos_personales;
DELIMITER //
CREATE PROCEDURE sp_Profesor_mostrar_datos_personales(IN user_ CHAR(40))
BEGIN
  SELECT * FROM vw_Profesor_ver_datos_personales WHERE usuario = user_;
END //
DELIMITER ;

GRANT EXECUTE ON PROCEDURE sp_Profesor_mostrar_datos_personales TO Profesor;
CALL sp_Profesor_mostrar_datos_personales('jcoleborn');

-- ----------------------------------------------------------------------------
-- MODIFICAR DATOS PROFESOR
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Profesor_actualizar_datos_personales;
DELIMITER //
CREATE PROCEDURE sp_Profesor_actualizar_datos_personales(
  user_ CHAR(40), 
  Direccion_ VARCHAR(40), 
  Tel_Mov VARCHAR(40), 
  Tel_Fij VARCHAR(40)
)
BEGIN
  UPDATE vw_Profesor_modificar_datos_personales 
  SET Direccion = Direccion_, Telefono_Movil = Tel_Mov, Telefono_Fijo = Tel_Fij
  WHERE usuario = user_;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Profesor_actualizar_datos_personales TO Profesor;
/*CALL sp_Profesor_actualizar_datos_personales(
  'jcoleborn', 'Carrera 3D este # 85 - 24 sur', '3006747152','2058164'
  );*/
  
  
  

-- ROL ADMIN USUARIOS --------------------------------------------------------------------------------------------------------------------

-- ----------------------------------------------------------------------------
-- INSERTAR ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_insertar_estudiante;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_insertar_estudiante( 
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
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_insertar_estudiante TO Admin_usuarios;
/*CALL sp_Admin_usuarios_insertar_estudiante(
	2010000004, 'Maria Florez', 'Calle 58 # 24 - 51 Sur',
	300875135 , NULL, 'mflorezr@unal.edu.co', '2023-01-01' , 
    80150101 ,'Ingeniería de Sistemas y Computación'
    );*/

-- ----------------------------------------------------------------------------
-- CONSULTAR ESTUDIANTES
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_mostrar_estudiante;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_mostrar_estudiante()
BEGIN
	SELECT * FROM  Persona JOIN Estudiante ON per_cc = estud_cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_mostrar_estudiante TO Admin_usuarios;
-- CALL sp_Admin_usuarios_mostrar_estudiante();

-- ---------------------------------------------------------------------------
-- ACTUALIZAR DATOS ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_actualizar_estudiante;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_actualizar_estudiante(
  cc INT,
  nombre VARCHAR(45),
  direccion VARCHAR(45),
  tel_movil VARCHAR(20),
  tel_fijo VARCHAR(20),
  correo_institucional VARCHAR(45),
  -- ---------------
  año_ingreso DATE ,
  tutor_prof_cc INT -- Profesor tutor del estudiante
)
BEGIN
  UPDATE Persona
  SET per_nombre = nombre,
  per_direccion = direccion,
  per_tel_movil = tel_movil,
  per_tel_fijo = tel_fijo,
  per_correo_institucional = correo_institucional 
  WHERE per_cc = cc;
  UPDATE Estudiante
  SET estud_año_ingreso = año_ingreso, estud_tutor_prof_cc = tutor_prof_cc
  WHERE estud_cc = cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_actualizar_estudiante TO Admin_usuarios;
/*CALL sp_Admin_usuarios_actualizar_estudiante(2010000004, 'Maria Angelica Florez',
	'Calle 58 # 24 - 51 Sur',350875135 , 2064681, 'mflorezr@unal.edu.co',
	'2023-01-01' , 80150101
	);*/

-- ----------------------------------------------------------------------------
-- BORRAR ESTUDIANTES
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_borrar_estudiante;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_borrar_estudiante(cc INT)
BEGIN
	DELETE FROM estudiante WHERE estud_cc = cc;
    DELETE FROM persona WHERE per_cc = cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_borrar_estudiante TO Admin_usuarios;
-- CALL sp_Admin_usuarios_borrar_estudiante(2010000004);


-- ----------------------------------------------------------------------------
-- INSERTAR PROFESOR
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_insertar_profesor;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_insertar_profesor( 
  per_cc INT ,
  per_nombre VARCHAR(45) ,
  per_direccion VARCHAR(45) ,
  per_tel_movil VARCHAR(20),
  per_tel_fijo VARCHAR(20),
  per_correo_institucional VARCHAR(45), 
  prof_oficina VARCHAR(45)
  )
BEGIN
	
	INSERT INTO Persona (per_cc, per_nombre, per_direccion, per_tel_movil, per_tel_fijo, per_correo_institucional) 
		VALUES (per_cc, per_nombre, per_direccion, per_tel_movil , per_tel_fijo, per_correo_institucional);
    -- -----------------------------------------    
	INSERT INTO Profesor (prof_cc,prof_oficina) 
		VALUES (per_cc,prof_oficina);
        
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_insertar_profesor TO Admin_usuarios;
/*CALL sp_Admin_usuarios_insertar_profesor(80150116, 'Maria Florez', 
	'Calle 58 # 24 - 51 Sur', 300875135 , NULL,
    'mflorezro@unal.edu.co', '405-416'
    );*/

-- ----------------------------------------------------------------------------
-- CONSULTAR PROFESORES
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_mostrar_profesor;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_mostrar_profesor()
BEGIN
	SELECT * FROM  Persona JOIN Profesor ON per_cc = prof_cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_mostrar_profesor TO Admin_usuarios;
-- CALL sp_Admin_usuarios_mostrar_profesor();

-- ---------------------------------------------------------------------------
-- ACTUALIZAR DATOS PROFESOR
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_actualizar_profesor;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_actualizar_profesor(
  cc INT,
  nombre VARCHAR(45),
  direccion VARCHAR(45),
  tel_movil VARCHAR(20),
  tel_fijo VARCHAR(20),
  correo_institucional VARCHAR(45),
  -- ---------------
  oficina VARCHAR(45)
)
BEGIN
  UPDATE Persona
  SET per_nombre = nombre,
  per_direccion = direccion,
  per_tel_movil = tel_movil,
  per_tel_fijo = tel_fijo,
  per_correo_institucional = correo_institucional 
  WHERE per_cc = cc;
  UPDATE Profesor
  SET prof_oficina = oficina
  WHERE prof_cc = cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_actualizar_profesor TO Admin_usuarios;
/*CALL sp_Admin_usuarios_actualizar_profesor(80150116, 'Maria Angelica Florez',
 'Calle 58 # 24 - 51 Sur',300875135 , 2057125, 'mflorezro@unal.edu.co', '405-417' 
 );*/

-- ----------------------------------------------------------------------------
-- BORRAR PROFESOR
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Admin_usuarios_borrar_profesor;
DELIMITER //
CREATE PROCEDURE sp_Admin_usuarios_borrar_profesor(cc INT)
BEGIN
	DELETE FROM profesor WHERE prof_cc = cc;
    DELETE FROM persona WHERE per_cc = cc;
END //
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_Admin_usuarios_borrar_profesor TO Admin_usuarios;
-- CALL sp_Admin_usuarios_borrar_profesor(80150116);


-- ---------------------------------------------------------------------------
-- CREAR UN USUARIO CON SOLO INGRESAR EL USUARIO Y EL ROL QUE TIENE
-- ----------------------------------------------------------------------------
/*DROP PROCEDURE IF EXISTS sp_create_user;
DELIMITER $$

CREATE PROCEDURE sp_create_user(usuario VARCHAR(40), rol VARCHAR(40))
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
