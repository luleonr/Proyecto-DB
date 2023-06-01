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
GRANT INSERT,SELECT,UPDATE,DELETE ON Asignatura_has_Asignatura TO Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON Grupo TO Admin_asignatura;
GRANT INSERT,SELECT,UPDATE,DELETE ON Horario TO Admin_asignatura;
GRANT SELECT ON Departamento TO Admin_asignatura;
GRANT SELECT ON Facultad TO Admin_asignatura;
GRANT SELECT ON Salon TO Admin_asignatura;
GRANT SELECT ON Edificio TO Admin_asignatura;


DROP ROLE IF EXISTS Admin_edificios;
CREATE ROLE Admin_edificios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Salon TO Admin_edificios;
GRANT INSERT,SELECT,UPDATE,DELETE ON Edificio TO Admin_edificios;


DROP ROLE IF EXISTS Admin_his_acad;
CREATE ROLE Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON Historia_Academica TO Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON Ponderado TO Admin_his_acad;
GRANT INSERT,SELECT,UPDATE,DELETE ON Evaluacion TO Admin_his_acad;

DROP ROLE IF EXISTS Admin_inscripciones;
CREATE ROLE Admin_inscripciones;
GRANT INSERT,SELECT,UPDATE,DELETE ON Inscripcion TO Admin_inscripciones;


DROP ROLE IF EXISTS Estudiante;
CREATE ROLE Estudiante;
GRANT SELECT ON vw_Estudiante_ver_datos_personales TO Estudiante;
GRANT SELECT,UPDATE ON vw_Estudiante_modificar_datos_personales TO Estudiante;
GRANT SELECT ON vw_Historia_academica TO Estudiante;
GRANT SELECT ON vw_Horario TO Estudiante;

DROP ROLE IF EXISTS Profesor;
CREATE ROLE Profesor;
GRANT SELECT ON vw_Profesor_ver_datos_personales TO Profesor;
GRANT SELECT,UPDATE ON vw_Profesor_modificar_datos_personales TO Profesor;