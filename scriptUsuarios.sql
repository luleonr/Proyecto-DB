USE academico;

-- CREACION USUARIOS ESTUDIANTE --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar'; 
CALL sp_create_user('cbarrerar', 'Estudiante');
DROP USER IF EXISTS 'luleonr'; 
CALL sp_create_user('luleonr', 'Estudiante');
DROP USER IF EXISTS 'mcheshire'; 
CALL sp_create_user('mcheshire', 'Estudiante');
DROP USER IF EXISTS 'rathridge'; 
CALL sp_create_user('rathridge', 'Estudiante');

-- CREACION USUARIOS PROFESORES -----------------------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar1'; 
CALL create_user('cbarrerar1', 'Profesor');

-- CREACION USUARIO Administrador_usuarios --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar2'; 
CALL create_user('cbarrerar2', 'Admin_usuarios');

SELECT USER FROM mysql.user;
SELECT SUBSTRING_INDEX(CURRENT_USER(), '@', 1) AS Usuario;

