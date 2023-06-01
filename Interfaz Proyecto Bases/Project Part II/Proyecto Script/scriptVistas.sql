use academico;

-- CREACION DE LA VISTA --------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Estudiante_ver_datos_personales;

CREATE VIEW vw_Estudiante_ver_datos_personales AS 
SELECT DISTINCT per_cc AS Cedula, per_nombre AS Nombre, per_direccion AS Direccion,
per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo, per_correo_institucional AS Correo, 
estud_año_ingreso AS AñoIngreso, prog_nombre AS Carrera, user_usuario AS usuario
FROM persona JOIN estudiante ON per_cc = estud_cc JOIN Estudiante_has_Programa ON per_cc = Estudiante_persona_cc
JOIN Programa ON Programa_id_programa = prog_id JOIN Usuario ON per_cc = user_cc ;

SELECT * FROM vw_Estudiante_ver_datos_personales;
-- -------------------------------

DROP VIEW IF EXISTS vw_Estudiante_modificar_datos_personales;

CREATE VIEW vw_Estudiante_modificar_datos_personales AS 
SELECT per_direccion AS Direccion ,per_tel_movil AS Telefono_Movil, per_tel_fijo AS Telefono_Fijo,
user_usuario AS usuario
FROM Persona JOIN Estudiante ON per_cc = estud_cc JOIN Usuario ON estud_cc = user_cc;

-- -------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Profesor_ver_estudiante;
CREATE VIEW vw_Profesor_ver_estudiante AS 
SELECT DISTINCT  per_cc AS Cedula, per_nombre AS Nombre, per_correo_institucional
AS Corre_Institucional, insc_id_asignatura AS ID_Asignatura, grup_prof_cc AS Profesor_cc_Grupo
FROM Persona JOIN Estudiante ON per_cc = estud_cc
JOIN Inscripcion ON estud_cc = per_cc JOIN Grupo ON 
insc_no_grupo = grup_no_grupo AND insc_id_asignatura = grup_asig_id
JOIN Profesor ON prof_cc = per_cc;

-- --------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Historia_academica;
CREATE VIEW vw_Historia_academica AS
SELECT DISTINCT histAcad_PAPA AS PAPA,histAcad_PAPPI AS PAPPI,
histAcad_porcen_avance AS Porcentaje_Avance, histAcad_cred_adicionales AS Creditos_Adicionales, 
histAcad_cup_creditos AS Cupo_Creditos, histAcad_cred_disponibles AS Creditos_Disponibles, 
histAcad_cred_doble_titulacion AS Creditos_Doble_Titulacion, 
histAcad_id_programa AS ID_Carrera ,histAcad_estudiante_cc AS Cedula, user_usuario AS usuario 
FROM Historia_Academica JOIN Usuario ON histAcad_estudiante_cc = user_cc;

-- --------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Horario;
CREATE VIEW vw_Horario AS
SELECT DISTINCT  Nombre, Dia, Hora_inicio, Hora_final,Actividad,`Academico`.`Horario`.`Salon_id_salon`,
`Academico`.`Horario`.`Salon_Edificio_id_Edificio`, Grupo_No_grupo,Estudiante_Persona_CC
FROM `Academico`.`Horario` JOIN `Academico`.`Inscripción` USING(Grupo_No_grupo) JOIN `Academico`.`Asignatura`
WHERE Grupo_Asignatura_id_asignatura =Asignatura_id_asignatura AND Asignatura_id_asignatura = id_asignatura;

-- ------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_ver_materias_inscritas;
CREATE VIEW vw_ver_materias_inscritas AS
SELECT DISTINCT Nombre, id_asignatura, Créditos,Estudiante_Persona_CC
FROM `Academico`.`Inscripción` JOIN `Academico`.`Asignatura` JOIN `Academico`.`Horario` USING(Grupo_No_grupo)
WHERE Asignatura_id_asignatura = id_asignatura AND Grupo_Asignatura_id_asignatura =Asignatura_id_asignatura;

-- ---------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_editar_inscripción;
CREATE VIEW vw_editar_inscripción AS 
SELECT DISTINCT Nombre, id_asignatura, Créditos,Estudiante_Persona_CC
FROM `Academico`.`Inscripción` JOIN `Academico`.`Asignatura` JOIN `Academico`.`Horario` USING(Grupo_No_grupo)
WHERE Asignatura_id_asignatura = id_asignatura AND Grupo_Asignatura_id_asignatura =Asignatura_id_asignatura;

-- -----------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Calificación;
CREATE VIEW vw_Calificación AS
SELECT DISTINCT * FROM evaluación JOIN estudiante JOIN inscripción natural JOIN grupo
WHERE Persona_CC = Estudiante_Persona_CC and Persona_CC = Ponderado_Inscripción_Estudiante_Persona_CC
AND Grupo_No_grupo = No_grupo AND Ponderado_Inscripción_Asignatura_id_asignatura = `Academico`.`Inscripción`.`Asignatura_id_asignatura`;

