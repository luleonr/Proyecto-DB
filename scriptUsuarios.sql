USE academico;

-- CREACION USUARIOS ESTUDIANTE --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar'; 
CALL create_user('cbarrerar', 'Estudiante');
DROP USER IF EXISTS 'luleonr'; 
CALL create_user('luleonr', 'Estudiante');

-- CREACION USUARIOS PROFESORES -----------------------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar1'; 
CALL create_user('cbarrerar1', 'Profesor');

-- CREACION USUARIO Administrador_usuarios --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar2'; 
CALL create_user('cbarrerar2', 'Admin_usuarios');

SELECT USER FROM mysql.user;
SELECT SUBSTRING_INDEX(CURRENT_USER(), '@', 1) AS Usuario;

