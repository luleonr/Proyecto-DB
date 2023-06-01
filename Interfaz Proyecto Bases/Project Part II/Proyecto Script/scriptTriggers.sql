
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

