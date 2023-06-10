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