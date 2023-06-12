USE academico;

-- CREACION DE LA VISTA --------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Estudiante_ver_datos_personales;

CREATE VIEW vw_Estudiante_ver_datos_personales AS 
SELECT DISTINCT per_cc AS Cedula, per_nombre AS Nombre, per_direccion AS Direccion,
per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo, per_correo_institucional AS Correo, 
estud_año_ingreso AS AñoIngreso, prog_nombre AS Carrera, user_usuario AS usuario
FROM persona JOIN estudiante ON per_cc = estud_cc JOIN Estudiante_has_Programa ON per_cc = Estudiante_persona_cc
JOIN Programa ON Programa_id_programa = prog_id JOIN Usuario ON per_cc = user_cc ;


-- SELECT * FROM vw_Estudiante_ver_datos_personales;
-- -------------------------------

DROP VIEW IF EXISTS vw_Estudiante_modificar_datos_personales;

CREATE VIEW vw_Estudiante_modificar_datos_personales AS 
SELECT per_direccion AS Direccion ,per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo,
user_usuario AS usuario
FROM Persona JOIN Estudiante ON per_cc = estud_cc JOIN Usuario ON estud_cc = user_cc;

-- SELECT * FROM vw_Estudiante_modificar_datos_personales;
-- -------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Estudiante_ver_programas;

CREATE VIEW vw_Estudiante_ver_programas AS 
SELECT per_cc AS Cedula, user_usuario AS Usuario, prog_id AS Id_programa, prog_nombre AS Nombre_programa,
 depa_nombre AS Nombre_departamento, facu_nombre AS Nombre_facultad FROM Persona JOIN Usuario ON per_cc=user_cc 
JOIN Estudiante ON per_cc=estud_cc JOIN estudiante_has_programa ON per_cc=Estudiante_persona_cc JOIN Programa 
ON Programa_id_programa=prog_id JOIN departamento ON prog_id_departamento=depa_id JOIN facultad ON depa_id_facultad=facu_id;

-- SELECT * FROM vw_Estudiante_ver_programas;

-- --------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Historia_academica;
CREATE VIEW vw_Historia_academica AS
SELECT DISTINCT histAcad_PAPA AS PAPA,histAcad_PAPPI AS PAPPI,
histAcad_porcen_avance AS Porcentaje_Avance, histAcad_cred_adicionales AS Creditos_Adicionales, 
histAcad_cup_creditos AS Cupo_Creditos, histAcad_cred_disponibles AS Creditos_Disponibles, 
histAcad_cred_doble_titulacion AS Creditos_Doble_Titulacion, 
histAcad_id_programa AS ID_Carrera , prog_nombre AS Carrera ,histAcad_estudiante_cc AS Cedula,
facu_nombre AS Facultad, user_usuario AS usuario
FROM Historia_Academica JOIN Usuario ON histAcad_estudiante_cc = user_cc
JOIN Programa ON histAcad_id_programa = prog_id JOIN Departamento ON prog_id_departamento = depa_id
JOIN Facultad ON depa_id_facultad = facu_id;

-- SELECT * FROM  vw_Historia_academica;
-- --------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Horario;
CREATE VIEW vw_Horario AS
SELECT DISTINCT horar_dia AS Dia, horar_hora_inicio AS Hora_inicio, horar_hora_final AS Hora_Final,
horar_actividad AS Actividad, horar_grup_no_grupo AS No_Grupo,
horar_sal_id AS Salon, horar_sal_edif_id  AS Edificio,edif_sede AS Sede, insc_semestre AS Semeste, insc_estudiante_cc AS CEDULA,
insc_id_asignatura AS MateriaID, asig_nombre AS MateriaNom, edif_nombre AS EdificoNom ,  sal_nombre AS SalonNom, 
per_nombre AS ProfeNom, user_usuario AS usuario
FROM Horario JOIN Inscripcion ON insc_no_grupo = horar_grup_no_grupo AND insc_id_asignatura =horar_grup_asig_id
JOIN Asignatura ON horar_grup_asig_id = asig_id JOIN Usuario ON  insc_estudiante_cc = user_cc 
JOIN Edificio ON edif_id = horar_sal_edif_id JOIN Salon ON sal_id = horar_sal_id 
JOIN Grupo ON grup_no_grupo = horar_grup_no_grupo AND grup_asig_id = horar_grup_asig_id  AND grup_semestre = insc_semestre
JOIN Persona ON grup_prof_cc = per_cc;

-- SELECT * FROM  vw_Horario;
-- ------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Profesor_ver_datos_personales;

CREATE VIEW vw_Profesor_ver_datos_personales AS 
SELECT DISTINCT per_cc AS Cedula, per_nombre AS Nombre, per_direccion AS Direccion,
per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo, per_correo_institucional AS Correo, 
user_usuario AS usuario
FROM persona JOIN profesor ON per_cc = prof_cc JOIN Usuario ON per_cc = user_cc ;


-- SELECT * FROM vw_Profesor_ver_datos_personales;

-- -------------------------------

DROP VIEW IF EXISTS vw_Profesor_ver_datos_personales;

CREATE VIEW vw_Profesor_ver_datos_personales AS 
SELECT DISTINCT per_cc AS Cedula, per_nombre AS Nombre, per_direccion AS Direccion,
per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo, per_correo_institucional AS Correo, 
user_usuario AS usuario
FROM persona JOIN profesor ON per_cc = prof_cc JOIN Usuario ON per_cc = user_cc ;


-- SELECT * FROM vw_Profesor_ver_datos_personales;

-- -------------------------------

DROP VIEW IF EXISTS vw_Profesor_modificar_datos_personales;

CREATE VIEW vw_Profesor_modificar_datos_personales AS 
SELECT per_direccion AS Direccion ,per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo,
user_usuario AS usuario
FROM Persona JOIN Profesor ON per_cc = prof_cc JOIN Usuario ON prof_cc = user_cc;

-- SELECT * FROM vw_Profesor_modificar_datos_personales;

-- ------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Profesor_ver_estudiante;
CREATE VIEW vw_Profesor_ver_estudiante AS 
SELECT DISTINCT per_cc AS CC, per_nombre AS Nombre, per_correo_institucional AS Correo, insc_id_programa AS Programa_ID,
insc_nota_final AS Nota_final, insc_aprobado AS Aprobado,
insc_id_asignatura AS Asignatura_ID,grup_no_grupo AS Grupo, 
grup_prof_cc AS Profesor_CC, insc_semestre AS Semestre
FROM persona JOIN estudiante ON estud_cc=per_cc 
JOIN inscripcion ON insc_estudiante_cc=per_cc 
JOIN grupo ON (insc_no_grupo=grup_no_grupo AND insc_id_asignatura=grup_asig_id);

-- SELECT * FROM vw_Profesor_ver_estudiante;

-- ------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_evaluaciones_estudiante;
CREATE VIEW vw_evaluaciones_estudiante AS 
SELECT DISTINCT per_cc AS CC, per_nombre AS Nombre,eval_nombre AS Actividad, eval_nota AS Puntaje, 
eval_porcentaje AS Porcentaje,eval_calificacion_minima AS Calificacion_minima,
eval_ponde_insc_id_asignatura AS Asignatura_ID, insc_no_grupo AS Grupo, grup_prof_cc AS Profesor_CC,
insc_id_programa AS Programa, insc_semestre AS Semestre
FROM evaluacion JOIN persona ON eval_ponde_insc_estudiante_cc=per_cc 
JOIN inscripcion ON (eval_ponde_insc_estudiante_cc=insc_estudiante_cc AND eval_ponde_insc_id_programa=insc_id_programa 
AND eval_ponde_insc_id_asignatura = insc_id_asignatura)
JOIN grupo ON (insc_no_grupo=grup_no_grupo AND insc_id_asignatura=grup_asig_id) ORDER BY per_cc;

-- -----------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_horario_profesor;
CREATE VIEW vw_horario_profesor AS 
SELECT horar_dia AS Dia, horar_hora_inicio AS HoraInicio, horar_hora_final AS HoraFinal, horar_actividad AS Actividad,
horar_grup_asig_id AS Asignatura_ID, asig_nombre AS Asignatura,horar_grup_no_grupo AS Grupo,
horar_sal_id AS Salon, horar_sal_edif_id AS Edificio, grup_prof_cc AS Profesor_cc, insc_semestre AS Semestre, insc_estudiante_cc AS Estudiante_cc
FROM horario join Asignatura on (horar_grup_asig_id=asig_id) join grupo ON (asig_id=grup_asig_id)
join inscripcion on (insc_id_asignatura=asig_id AND grup_no_grupo=insc_no_grupo)
ORDER BY horar_dia;


-- ---------------------------------------------------------------------------------------------
DROP VIEW IF EXISTS vw_ver_programas;
CREATE VIEW vw_ver_Programas AS
SELECT prog_nombre,depa_nombre, facu_nombre FROM Programa JOIN Departamento ON prog_id_departamento = depa_id 
JOIN Facultad ON depa_id_facultad  = facu_id;


DROP VIEW IF EXISTS vw_rol_usuario;
CREATE VIEW vw_rol_usuario AS
SELECT user_usuario, user_rol FROM Usuario;
-- ------------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Citas_de_inscripcion;
CREATE VIEW vw_Citas_de_inscripcion AS SELECT DISTINCT cit_inicio AS Inicio, cit_inicio AS Final, 
prog_nombre AS Programa, facu_nombre AS Facultad, user_usuario AS Usuario FROM Cita JOIN Estudiante 
ON cit_estudiante_cc=estud_cc JOIN persona ON estud_cc=per_cc JOIN Usuario ON estud_cc = user_cc JOIN Programa ON cit_id_programa=prog_id JOIN 
Departamento ON prog_id_departamento=depa_id JOIN Facultad ON depa_id_facultad=facu_id;

SELECT * FROM vw_Citas_de_inscripcion;

-- ---------------------------------------------------------------------------------------------------
DROP VIEW IF EXISTS vw_Asignaturas_cursadas;
CREATE VIEW vw_Asignaturas_cursadas AS SELECT DISTINCT asig_nombre AS Asignatura, asig_id AS Codigo, asig_no_creditos 
AS Creditos, Tipologia AS Tipologia, insc_semestre AS Periodo, insc_nota_final AS Calificacion, insc_aprobado AS Estado 
, user_usuario AS Usuario FROM inscripcion JOIN Asignatura ON insc_id_asignatura=asig_id JOIN programa_has_asignatura ON 
(insc_id_asignatura=Asignatura_id_asignatura AND insc_id_programa=Programa_id_programa) JOIN Usuario ON user_cc=insc_estudiante_cc;


SELECT * FROM vw_Asignaturas_cursadas;
