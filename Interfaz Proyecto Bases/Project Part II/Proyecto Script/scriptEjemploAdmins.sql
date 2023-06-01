SET SQL_SAFE_UPDATES=0;
USE academico;

SELECT * FROM `Academico`.`Persona`;
SELECT * FROM `Academico`.`Profesor/a`;
SELECT * FROM `Academico`.`Estudiante`;
SELECT * FROM `Academico`.`Estudiante_posgrado`;


UPDATE `Academico`.`Persona`
	SET Nombre = 'Cristian Barrera'
WHERE CC = 80150102;


UPDATE vw_Estudiante_modificar_datos_personales
	SET `Academico`.`Persona` = NULL
WHERE nombre LIKE 'Marcille Cheshire';