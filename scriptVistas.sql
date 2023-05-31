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

DROP VIEW IF EXISTS vw_Historia_academica;
CREATE VIEW vw_Historia_academica AS
SELECT DISTINCT histAcad_PAPA AS PAPA,histAcad_PAPPI AS PAPPI,
histAcad_porcen_avance AS Porcentaje_Avance, histAcad_cred_adicionales AS Creditos_Adicionales, 
histAcad_cup_creditos AS Cupo_Creditos, histAcad_cred_disponibles AS Creditos_Disponibles, 
histAcad_cred_doble_titulacion AS Creditos_Doble_Titulacion, 
histAcad_id_programa AS ID_Carrera ,histAcad_estudiante_cc AS Cedula, user_usuario AS usuario 
FROM Historia_Academica JOIN Usuario ON histAcad_estudiante_cc = user_cc;

-- SELECT * FROM  vw_Historia_academica;
-- --------------------------------------------------------------------------------------------

DROP VIEW IF EXISTS vw_Horario;
CREATE VIEW vw_Horario AS
SELECT DISTINCT horar_dia AS Dia, horar_hora_inicio AS Hora_inicio, horar_hora_final AS Hora_Final,
horar_actividad AS Actividad, horar_grup_no_grupo AS No_Grupo,
horar_sal_id AS Salon, horar_sal_edif_id  AS Edificio, insc_semestre AS Semeste, insc_estudiante_cc AS CEDULA,
asig_nombre AS MateriaNom, user_usuario AS usuario
FROM Horario JOIN Inscripcion ON insc_no_grupo = horar_grup_no_grupo AND insc_id_asignatura =horar_grup_asig_id
JOIN Asignatura ON horar_grup_asig_id = asig_id JOIN Usuario ON  insc_estudiante_cc = user_cc;

-- SELECT * FROM  vw_Horario;
-- ------------------------------------------------------------------------
