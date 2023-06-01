USE academico;
SELECT SUBSTRING_INDEX(CURRENT_USER (), '@', 1) AS Sesión;

-- ----------------------------------------------
-- VER DATOS ------------------------------------
-- ----------------------------------------------
CALL mostrar_vw_Estudiante_ver_datos_personales(SUBSTRING_INDEX(CURRENT_USER (), '@', 1));



UPDATE vw_Estudiante_ver_datos_personales
	SET per_nombre = 'Andres Vargas'
WHERE nombre LIKE 'Marcille Cheshire';

-- -------------------------------------------
-- MODIFICAR DATOS ---------------------------
-- -------------------------------------------

SELECT * FROM vw_Estudiante_modificar_datos_personales WHERE usuario = SUBSTRING_INDEX(CURRENT_USER (), '@', 1);

UPDATE vw_Estudiante_modificar_datos_personales
	SET Telefono_Fijo = NULL
WHERE usuario = SUBSTRING_INDEX(CURRENT_USER (), '@', 1);

CALL modificar_vw_Estudiante_modificar_datos_personales(SUBSTRING_INDEX(CURRENT_USER (), '@', 1), 'Transversal 5C Este # 23 42', '300657574',null);
-- -----------------------------------------------
-- -----------------------------------------------
-- -----------------------------------------------


SELECT * FROM vw_Historia_academica; -- WHERE usuario = SUBSTRING_INDEX(CURRENT_USER (), '@', 1);

UPDATE vw_Historia_academica
	SET PAPA = 5.0
WHERE CC =  1010000001;


SELECT * FROM vw_Horario WHERE Estudiante_Persona_CC =  1010000001;

UPDATE vw_Horario
	SET Salon_id_salon = 300
WHERE Estudiante_Persona_CC =  1010000001;

SELECT * FROM vw_ver_materias_inscritas WHERE Estudiante_Persona_CC = 1010000001;

UPDATE vw_ver_materias_inscritas
	SET Créditos = 5
WHERE Nombre LIKE 'Álgebra lineal';


SELECT * FROM vw_editar_inscripción WHERE Estudiante_Persona_CC = 1010000001;


UPDATE vw_editar_inscripción
	SET 
    Nombre = 'Cálculo diferencial',
    Créditos = 4,
    id_asignatura =2
WHERE Nombre LIKE 'Álgebra lineal';

DELETE FROM vw_editar_inscripción 
WHERE Nombre LIKE 'Álgebra lineal';
