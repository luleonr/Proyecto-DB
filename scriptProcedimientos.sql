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
-- cache index

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
GRANT EXECUTE ON FUNCTION f_obtener_semestre TO Profesor;

-- -----------------------------------------------------------------------------
-- FUNCIÓN OBTENER CC DEL PROFESOR CON SU USUARIO
-- -----------------------------------------------------------------------------

DROP FUNCTION IF EXISTS f_find_cc_from_user;
DELIMITER $$
CREATE FUNCTION f_find_cc_from_user(username VARCHAR(45)) RETURNS INT
BEGIN
    RETURN (SELECT user_cc FROM Usuario WHERE user_usuario LIKE username);
END $$
DELIMITER ;
GRANT EXECUTE ON FUNCTION f_find_cc_from_user TO Profesor;

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
  
-- ----------------------------------------------------------------------------
-- VER LISTA DE CLASE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_ver_lista_clase;
DELIMITER $$
CREATE PROCEDURE sp_ver_lista_clase(userProfesor VARCHAR(45), asig_id INT, grup INT)
BEGIN
	DECLARE profesor INT;
	SET profesor = f_find_cc_from_user(userProfesor);
    SELECT CC, Nombre, Correo, Nota_final FROM vw_Profesor_ver_estudiante WHERE Profesor_CC LIKE profesor
    AND Asignatura_ID = asig_id AND Grupo=grup AND Semestre LIKE f_obtener_semestre();
END $$
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_ver_lista_clase TO Profesor;

-- CALL sp_ver_lista_clase('jcoleborn','2','1');

-- ----------------------------------------------------------------------------
-- VER CALIFICACIONES DE CLASE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_ver_calificaciones;
DELIMITER $$
CREATE PROCEDURE sp_ver_calificaciones(userProfesor VARCHAR(45), asig_id INT, grup INT)
BEGIN
	DECLARE profesor INT;
	SET profesor = f_find_cc_from_user(userProfesor);
    SELECT CC, Nombre, Actividad, Puntaje, Porcentaje FROM vw_evaluaciones_estudiante WHERE Profesor_CC LIKE profesor 
    AND Asignatura_ID = asig_id AND Grupo=grup AND Semestre LIKE f_obtener_semestre();
END $$
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_ver_calificaciones TO Profesor;

-- ----------------------------------------------------------------------------
-- AGREGAR ACTIVIDAD EVALUATIVA
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_agregar_evaluacion;
DELIMITER $$
CREATE PROCEDURE sp_agregar_evaluacion(userProfesor VARCHAR(45), asig_id INT, grup INT, nom_actividad VARCHAR(45),act_porcentaje DECIMAL(5,2))
BEGIN
	DECLARE profesor INT;
	SET profesor = f_find_cc_from_user(userProfesor);
    INSERT INTO evaluacion(eval_nombre,eval_nota,eval_porcentaje,eval_ponde_insc_semestre,eval_ponde_insc_estudiante_cc,eval_ponde_insc_id_programa,
    eval_ponde_insc_id_asignatura)   SELECT DISTINCT nom_actividad,0,act_porcentaje,Semestre,CC,Programa,Asignatura_ID
    FROM vw_evaluaciones_estudiante WHERE Profesor_CC LIKE profesor 
    AND Asignatura_ID = asig_id AND Grupo=grup AND Semestre LIKE f_obtener_semestre();
END $$
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_agregar_evaluacion TO Profesor;

-- ----------------------------------------------------------------------------
-- MODIFICAR EVALUACION: NOMBRE O PORCENTAJE DE ACTIVIDAD
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_modificar_descripcion_evaluacion;
DELIMITER $$
CREATE PROCEDURE sp_modificar_descripcion_evaluacion(userProfesor VARCHAR(45), asig_id INT, grup INT, nom_actividad VARCHAR(45), nuevo_nombre VARCHAR(45),nuevo_porcentaje DECIMAL(5,2))
BEGIN
	DECLARE profesor INT;
	SET profesor = f_find_cc_from_user(userProfesor);
    
    UPDATE
		evaluacion JOIN persona ON eval_ponde_insc_estudiante_cc=per_cc 
		JOIN inscripcion ON (eval_ponde_insc_estudiante_cc=insc_estudiante_cc AND eval_ponde_insc_id_programa=insc_id_programa 
		AND eval_ponde_insc_id_asignatura = insc_id_asignatura)
		JOIN grupo ON (insc_no_grupo=grup_no_grupo AND insc_id_asignatura=grup_asig_id)
	SET eval_nombre = 
		CASE
			WHEN nuevo_nombre IS NOT NULL THEN nuevo_nombre
			ELSE eval_nombre -- mantener el valor original si no se lo anterior
		END,
		eval_porcentaje = 
		CASE
			WHEN nuevo_porcentaje IS NOT NULL THEN nuevo_porcentaje
			ELSE eval_porcentaje -- mantener el valor original si no se lo anterior
		END
	WHERE grup_prof_cc LIKE profesor AND grup_asig_id=asig_id AND grup_no_grupo=grup AND
	grup_semestre LIKE f_obtener_semestre() AND eval_nombre LIKE nom_actividad;
END $$
DELIMITER ;

-- ----------------------------------------------------------------------------
-- ASIGNAR CALIFICACION A ESTUDIANTE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_asignar_calificación;
DELIMITER $$
CREATE PROCEDURE sp_asignar_calificación(userProfesor VARCHAR(45), asig_id INT, grup INT, nom_actividad VARCHAR(45),estud INT, nota DECIMAL(5,2))
BEGIN
	DECLARE profesor INT;
	SET profesor = f_find_cc_from_user(userProfesor);
    
    UPDATE
		evaluacion JOIN persona ON eval_ponde_insc_estudiante_cc=per_cc 
		JOIN inscripcion ON (eval_ponde_insc_estudiante_cc=insc_estudiante_cc AND eval_ponde_insc_id_programa=insc_id_programa 
		AND eval_ponde_insc_id_asignatura = insc_id_asignatura)
		JOIN grupo ON (insc_no_grupo=grup_no_grupo AND insc_id_asignatura=grup_asig_id)
	SET eval_nota = nota
    WHERE grup_prof_cc LIKE profesor AND grup_asig_id=asig_id AND grup_no_grupo=grup AND eval_nombre LIKE nom_actividad
    AND eval_ponde_insc_estudiante_cc=estud AND grup_semestre LIKE f_obtener_semestre();
    
END $$
DELIMITER ;

-- ----------------------------------------------------------------------------
-- PUBLICAR DEFINITIVAS ESTUDIANTES DE CLASE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_publicar_definitivas;
DELIMITER $$
CREATE PROCEDURE sp_publicar_definitivas(userProfesor VARCHAR(45), asig_id INT, grup INT)
BEGIN
    DECLARE sumaPorcentajes DECIMAL(5,2);
    DECLARE msg varchar(255);
    DECLARE profesor INT;
    DECLARE semestreActual VARCHAR(10);
    SET profesor = f_find_cc_from_user(userProfesor);
    SET semestreActual = f_obtener_semestre();
    
    -- Verificar que los porcentajes sumen 100
    SELECT SUM(Porcentaje) INTO sumaPorcentajes FROM (SELECT DISTINCT Actividad, Porcentaje FROM vw_evaluaciones_estudiante WHERE Profesor_CC LIKE profesor AND Asignatura_ID = asig_id AND Grupo=grup AND Semestre LIKE semestreActual)EvaluacionesYporcentajes;

    IF sumaPorcentajes != 100.00 THEN
		SET msg = concat('Constraint violated: para publicar definitivas de clase, la suma de los porcentajes debe ser 100,
        pero resultó ', sumaPorcentajes);
        SIGNAL sqlstate '45000' SET message_text = msg;
    END IF;
    
    -- En esta tabla temporal se almacenara el puntaje de cada nota multiplicado por su porcentaje al ponderado de la materia
    CREATE TEMPORARY TABLE temp_nota_aporte_ponderado(
		CC INT,
		Actividad VARCHAR(45),
		Aporte_ponderado DECIMAL(5,2),
        IdPrograma INT,
        IdAsignatura INT
	);
    -- Hay un ponderado por cada estudiante en la materia indicada, entonces la cedula sera join en esta tabla auxiliar
	CREATE TEMPORARY TABLE temp_ponderados(
		CC INT,
        ponderado DECIMAL(5,2)
	);
    
    -- Inicializar las tablas temporales
    INSERT INTO temp_nota_aporte_ponderado 
	SELECT CC, Actividad, Puntaje*Porcentaje*0.01,Programa,Asignatura_ID FROM vw_evaluaciones_estudiante 
	WHERE Profesor_CC LIKE profesor AND Asignatura_ID = asig_id AND Grupo=grup AND Semestre LIKE semestreActual;
    
    INSERT INTO temp_ponderados SELECT CC, sum(Aporte_ponderado) FROM temp_nota_aporte_ponderado GROUP BY CC;
    
    -- Actualizar los ponderados
    -- Se hace join porque en ponderados hay que 
	UPDATE ponderado join (SELECT DISTINCT CC,IdPrograma,IdAsignatura,ponderado FROM temp_nota_aporte_ponderado natural join temp_ponderados)AS subquery
				ON CC = ponderado.ponde_insc_estudiante_cc 
				AND IdPrograma = ponderado.ponde_insc_id_programa 
				AND IdAsignatura = ponderado.ponde_insc_id_asignatura 
				AND ponde_insc_semestre LIKE f_obtener_semestre()
		SET ponde_nota_final = ponderado,
		ponde_aprobado =
			CASE
				WHEN ponde_nota_final>=3 THEN 1
				ELSE 0
			END;

	-- Las tablas auxiliares solo seran accesibles durante el procedimiento
    DROP TABLE temp_nota_aporte_ponderado;
    DROP TABLE temp_ponderados;
		
END $$
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_publicar_definitivas TO Profesor;

-- ----------------------------------------------------------------------------
-- VER HORARIO PROFESOR
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_ver_horario_profesor;
DELIMITER $$
CREATE PROCEDURE sp_ver_horario_profesor(usuario VARCHAR(45))
BEGIN
	DECLARE usuario_cc INT;
	SET usuario_cc = f_find_cc_from_user(usuario);
    
    SELECT Dia, Asignatura, HoraInicio, HoraFinal, Salon, Edificio
    FROM vw_horario_profesor WHERE Semestre LIKE f_obtener_semestre() AND usuario_cc=Profesor_cc;
    
END $$
DELIMITER ;
GRANT EXECUTE ON PROCEDURE sp_ver_horario_profesor TO Profesor;

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

-- ROL DECANO -------------------------------------------------------------------

-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS ESTUDIANTES
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Decano_mostrar_datos_personales_estudiantes;
DELIMITER //
CREATE PROCEDURE sp_Decano_mostrar_datos_personales_estudiantes()
BEGIN
  SELECT * FROM vw_Estudiante_ver_datos_personales;
END //
DELIMITER ;
CALL sp_Decano_mostrar_datos_personales_estudiantes();

-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS PROFESORES
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Decano_mostrar_datos_personales_profesores;
DELIMITER //
CREATE PROCEDURE sp_Decano_mostrar_datos_personales_profesores()
BEGIN
  SELECT * FROM vw_Profesor_ver_datos_personales;
END //
DELIMITER ;
CALL sp_Decano_mostrar_datos_personales_profesores();

-- -----------------------------------------------------------------------------
-- MOSTRAR DATOS PROGRAMAS
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_Decano_mostrar_programas;
DELIMITER //
CREATE PROCEDURE sp_Decano_mostrar_programas()
BEGIN
  SELECT * FROM vw_ver_programas;
END //
DELIMITER ;
CALL sp_Decano_mostrar_programas();

-- ---------------------------------------------------------------------------
-- CREAR UN USUARIO CON SOLO INGRESAR EL USUARIO Y EL ROL QUE TIENE
-- ----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_create_user;
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


-- Rol Admin Historia Academica?
-- -----------------------------------------------------------------------------
-- ACTUALIZAR HISTORIA ACADEMICA DE ESTUDIANTE
-- -----------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS sp_actualizar_historia_academica_estudiante;
DELIMITER //
CREATE PROCEDURE sp_actualizar_historia_academica_estudiante(estudUser VARCHAR(45), programaId INT)
BEGIN
    DECLARE semestreActual VARCHAR(10);
    DECLARE estud INT;
    DECLARE historiaAcademica INT;
    DECLARE creditosPrograma INT;
    DECLARE creditosInscritos INT;
    DECLARE creditosAprobados INT;
    DECLARE creditosAdicionales INT;
	SET semestreActual = f_obtener_semestre();
    SET estud = f_find_cc_from_user(estudUser);
    -- SELECT per_cc INTO estud FROM persona WHERE per_correo_institucional LIKE estudUser;
    SELECT histAcad_id INTO historiaAcademica FROM historia_academica WHERE histAcad_estudiante_cc=estud AND histAcad_id_programa=programaId;
    IF programaID = 80201 THEN -- Ing de sistemas y computacion
		SET creditosPrograma = 165;
	END IF;
    
    CREATE TEMPORARY TABLE nota_multiplicada_creditos(
    notaxcreditos DECIMAL(5,2),
    creditos INT,
    aprobado tinyint,
    asignatura INT
    );
    INSERT INTO nota_multiplicada_creditos SELECT ponde_nota_final*asig_no_creditos AS aporte_pappa,asig_no_creditos AS creditos_asig,ponde_aprobado,asig_id FROM ponderado join asignatura on ponde_insc_id_asignatura=asig_id WHERE ponde_id_histAcad=historiaAcademica;
    
    SELECT SUM(creditos) INTO creditosInscritos FROM nota_multiplicada_creditos;
    SELECT SUM(creditos) INTO creditosAprobados FROM nota_multiplicada_creditos WHERE aprobado = 1;
	
    SET creditosAdicionales = creditosAprobados*2;
    IF creditosAdicionales > creditosPrograma/2 THEN
		SET creditosAdicionales=creditosPrograma/2;
	END IF;
	IF creditosAdicionales > 80 THEN
		SET creditosAdicionales=80;
	END IF;
    
    UPDATE historia_academica 
		SET histAcad_PAPA = (SELECT SUM(notaxcreditos)/creditosInscritos FROM nota_multiplicada_creditos),
        histAcad_PAPPI = histAcad_PAPA,
        histAcad_cred_adicionales = creditosAdicionales,
		histAcad_cup_creditos=creditosPrograma-creditosInscritos+creditosAdicionales,
        histAcad_porcen_avance = (creditosAprobados/creditosPrograma)*100
	WHERE histAcad_id=historiaAcademica;
    
    DROP TABLE nota_multiplicada_creditos;
END //
DELIMITER ;

