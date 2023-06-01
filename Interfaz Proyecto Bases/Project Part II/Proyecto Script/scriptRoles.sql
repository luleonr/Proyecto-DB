USE academico;

-- CREACION DEL ROL ------------------------------------------------------------------------

DROP ROLE IF EXISTS Admin_usuarios;
CREATE ROLE Admin_usuarios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Persona TO Admin_usuarios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Profesor TO Admin_usuarios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Estudiante TO Admin_usuarios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Estudiante_posgrado TO Admin_usuarios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Estudiante_has_Programa TO Admin_usuarios;
GRANT SELECT ON Programa TO Admin_usuarios;


DROP ROLE IF EXISTS Admin_programa;
CREATE ROLE Admin_programa;
GRANT INSERT,SELECT,UPDATE,DELETE ON Programa TO Admin_programa;
GRANT INSERT,SELECT,UPDATE,DELETE ON Departamento TO Admin_programa;
GRANT INSERT,SELECT,UPDATE,DELETE ON Facultad TO Admin_programa;


DROP ROLE IF EXISTS Admin_asignatura;
CREATE ROLE Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON Asignatura TO Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON Asignatura_has_Asignatura` TO Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Grupo` TO Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Horario` TO Admin_asignatura;
GRANT SELECT ON `Academico`.`Departamento` TO Admin_asignatura;
GRANT SELECT ON `Academico`.`Facultad` TO Admin_asignatura;
GRANT SELECT ON `Academico`.`Salon` TO Admin_asignatura;
GRANT SELECT ON `Academico`.`Edificio` TO Admin_asignatura;


DROP ROLE IF EXISTS Admin_edificios;
CREATE ROLE Admin_edificios;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Salon` TO Admin_edificios;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Edificio` TO Admin_edificios;


DROP ROLE IF EXISTS Admin_his_acad;
CREATE ROLE Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Historia Académica` TO Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Ponderado` TO Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Evaluación` TO Admin_his_acad;

DROP ROLE IF EXISTS Admin_inscripciones;
CREATE ROLE Admin_inscripciones;
GRANT INSERT,SELECT,UPDATE,DELETE ON `Academico`.`Inscripción` TO Admin_inscripciones;


DROP ROLE IF EXISTS Estudiante;
CREATE ROLE Estudiante;
GRANT SELECT ON vw_Estudiante_ver_datos_personales TO Estudiante;
GRANT SELECT,UPDATE ON vw_Estudiante_modificar_datos_personales TO Estudiante;
GRANT SELECT ON vw_Historia_academica TO Estudiante;
GRANT SELECT ON vw_Horario TO Estudiante;
GRANT SELECT ON vw_ver_materias_inscritas TO Estudiante;
GRANT SELECT,INSERT, UPDATE, DELETE ON vw_editar_inscripción TO Estudiante;

DROP ROLE IF EXISTS Profesor;
CREATE ROLE Profesor;
GRANT SELECT ON vw_Profesor_ver_estudiante TO Profesor;