USE academico;

-- CREACION USUARIOS ESTUDIANTE --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar'; 
CALL sp_crear_usuario('cbarrerar', 'Estudiante');
DROP USER IF EXISTS 'luleonr'; 
CALL sp_crear_usuario('luleonr', 'Estudiante');
DROP USER IF EXISTS 'mcheshire'; 
CALL sp_crear_usuario('mcheshire', 'Estudiante');
DROP USER IF EXISTS 'gmcgovern'; 
CALL sp_crear_usuario('gmcgovern', 'Estudiante');
DROP USER IF EXISTS 'rathridge'; 
CALL sp_crear_usuario('rathridge', 'Estudiante');
DROP USER IF EXISTS 'dkimply'; 
CALL sp_crear_usuario('dkimply', 'Estudiante');

-- CREACION USUARIOS PROFESORES -----------------------------------------------------------------------
DROP USER IF EXISTS 'fzack'; 
CALL sp_crear_usuario('fzack', 'Profesor');
DROP USER IF EXISTS 'jcoleborn'; 
CALL sp_crear_usuario('jcoleborn', 'Profesor');

-- CREACION USUARIO Administrador_usuarios --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar2'; 
CALL sp_crear_usuario('cbarrerar2', 'Admin_usuarios');
DROP USER IF EXISTS 'cbarrerar1'; 
CALL sp_crear_usuario('cbarrerar1', 'Profesor');

-- CREACION USUARIO Administrador_usuarios --------------------------------------------------------
DROP USER IF EXISTS 'cbarrerar2'; 
CALL sp_crear_usuario('cbarrerar2', 'Admin_usuarios');

SELECT USER FROM mysql.user;
SELECT SUBSTRING_INDEX(CURRENT_USER(), '@', 1) AS Usuario;

