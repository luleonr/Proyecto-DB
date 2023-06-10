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

DROP TRIGGER IF EXISTS tr_agregar_rol;
DELIMITER $$
CREATE TRIGGER tr_agregar_rol AFTER INSERT ON Estudiante
	FOR EACH ROW
	BEGIN 
    SET @cedula = NEW.estud_cc;
    UPDATE Usuario SET user_rol = 'Estudiante' WHERE user_cc = @cedula ;

	END;
$$
DELIMITER ;