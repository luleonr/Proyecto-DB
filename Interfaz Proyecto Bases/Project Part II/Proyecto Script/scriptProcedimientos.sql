SET SQL_SAFE_UPDATES = 0;
USE Academico;


-- ---------------------------------------------------------------------------
-- CREAR UN USUARIO CON SOLO INGRESAR EL USUARIO Y EL ROL QUE TIENE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS create_user;
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

-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS mostrar_vw_Estudiante_ver_datos_personales;
DELIMITER //
CREATE PROCEDURE mostrar_vw_Estudiante_ver_datos_personales(IN user_ CHAR(40))
BEGIN
  -- Consulta que utiliza la vista
  SELECT * FROM vw_Estudiante_ver_datos_personales WHERE usuario = user_;
END //
DELIMITER ;

Call mostrar_vw_Estudiante_ver_datos_personales('cbarrerar');

-- ----------------------------------------------------------------------------
