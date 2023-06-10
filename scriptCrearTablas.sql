DROP SCHEMA IF EXISTS Academico;
CREATE SCHEMA Academico;
USE Academico;

-- -----------------------------------------------------
-- Table Persona
-- -----------------------------------------------------
DROP TABLE IF EXISTS Persona;

CREATE TABLE Persona (
  per_cc INT NOT NULL,
  per_nombre VARCHAR(45) NOT NULL,
  per_direccion VARCHAR(45) NOT NULL,
  per_tel_movil VARCHAR(20) NULL,
  per_tel_fijo VARCHAR(20) NULL,
  per_correo_institucional VARCHAR(45) NOT NULL,
  PRIMARY KEY (per_cc));


-- -----------------------------------------------------
-- Table Profesor
-- -----------------------------------------------------
DROP TABLE IF EXISTS Profesor;

CREATE TABLE Profesor (
  prof_cc INT NOT NULL,
  prof_oficina VARCHAR(45) NULL,
  PRIMARY KEY (prof_cc),
    FOREIGN KEY (prof_cc)
    REFERENCES Persona (per_cc)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Estudiante
-- -----------------------------------------------------
DROP TABLE IF EXISTS Estudiante;

CREATE TABLE Estudiante (
  estud_cc INT NOT NULL,
  estud_año_ingreso DATE NULL,
  estud_tutor_prof_cc INT NOT NULL, -- Profesor tutor del estudiante
  PRIMARY KEY (estud_cc),
    FOREIGN KEY (estud_cc)
    REFERENCES Persona (per_cc)
    ON UPDATE CASCADE,
    FOREIGN KEY (estud_tutor_prof_cc)
    REFERENCES Profesor (prof_cc)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Table Estudiante_posgrado
-- -----------------------------------------------------
DROP TABLE IF EXISTS Estudiante_posgrado ;

CREATE TABLE Estudiante_posgrado (
  estudi_posg_cc INT NOT NULL,
  estudi_posg_prof_cc INT NOT NULL,
  PRIMARY KEY (estudi_posg_cc),
    FOREIGN KEY (estudi_posg_cc)
    REFERENCES Estudiante (estud_cc)
	ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (estudi_posg_prof_cc)
    REFERENCES Profesor (prof_cc)
	ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Facultad
-- -----------------------------------------------------
DROP TABLE IF EXISTS Facultad;

CREATE TABLE Facultad (
  facu_id INT NOT NULL AUTO_INCREMENT,
  facu_nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (facu_id));


-- -----------------------------------------------------
-- Table Departamento
-- -----------------------------------------------------
DROP TABLE IF EXISTS Departamento ;

CREATE TABLE Departamento (
  depa_id INT NOT NULL AUTO_INCREMENT,
  depa_nombre VARCHAR(45) NOT NULL,
  depa_id_facultad INT NOT NULL,
  PRIMARY KEY (depa_id),
    FOREIGN KEY (depa_id_facultad)
    REFERENCES Facultad (facu_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Asignatura
-- -----------------------------------------------------
DROP TABLE IF EXISTS Asignatura ;

CREATE TABLE Asignatura (
  asig_id INT NOT NULL AUTO_INCREMENT,
  asig_nombre VARCHAR(45) NOT NULL,
  asig_no_creditos INT NOT NULL,
  asig_componente VARCHAR(45) NOT NULL,
  asig_descripcion VARCHAR(255) NULL,
  asig_id_departamento INT NOT NULL,
  PRIMARY KEY (asig_id),
    FOREIGN KEY (asig_id_departamento)
    REFERENCES Departamento (depa_id)
	ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Programa
-- -----------------------------------------------------
DROP TABLE IF EXISTS Programa ;

CREATE TABLE Programa (
  prog_id INT NOT NULL AUTO_INCREMENT,
  prog_nombre VARCHAR(45) NOT NULL,
  prog_id_departamento INT NOT NULL,
  PRIMARY KEY (prog_id),
    FOREIGN KEY (prog_id_departamento)
    REFERENCES Departamento (depa_id)
	ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Grupo
-- -----------------------------------------------------
DROP TABLE IF EXISTS Grupo ;

CREATE TABLE Grupo (
  grup_no_grupo INT NOT NULL,
  grup_cupos INT NULL,
  grup_asig_id INT NOT NULL,
  grup_prof_cc INT NOT NULL,
  grup_semestre VARCHAR(45) NULL,
  PRIMARY KEY (grup_no_grupo, grup_asig_id),
    FOREIGN KEY (grup_asig_id)
    REFERENCES Asignatura (asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (grup_prof_cc)
    REFERENCES Profesor (prof_cc)
	ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Inscripcion
-- -----------------------------------------------------
DROP TABLE IF EXISTS Inscripcion ;

CREATE TABLE Inscripcion (
  insc_semestre VARCHAR(10) NOT NULL,
  insc_estudiante_cc INT NOT NULL,
  insc_id_asignatura INT NOT NULL,
  insc_id_programa INT NOT NULL,
  insc_no_grupo INT NOT NULL,
  PRIMARY KEY (insc_semestre, insc_estudiante_cc, insc_id_programa, insc_id_asignatura),
    FOREIGN KEY (insc_estudiante_cc)
    REFERENCES Estudiante (estud_cc)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (insc_id_asignatura)
    REFERENCES Asignatura (asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (insc_id_programa)
    REFERENCES Programa (prog_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (insc_no_grupo)
    REFERENCES Grupo (grup_no_grupo)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Asignatura_has_Programa
-- -----------------------------------------------------
DROP TABLE IF EXISTS Asignatura_has_Programa;

CREATE TABLE Asignatura_has_Programa (
  Asignatura_id_asignatura INT NOT NULL,
  Programa_id_programa INT NOT NULL,
  PRIMARY KEY (Asignatura_id_asignatura, Programa_id_programa),
    FOREIGN KEY (Asignatura_id_asignatura)
    REFERENCES Asignatura (asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (Programa_id_programa)
    REFERENCES Programa (prog_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Estudiante_has_Programa
-- -----------------------------------------------------
DROP TABLE IF EXISTS Estudiante_has_Programa ;

CREATE TABLE Estudiante_has_Programa (
  Estudiante_persona_cc INT NOT NULL,
  Programa_id_programa INT NOT NULL,
  PRIMARY KEY (Estudiante_persona_cc, Programa_id_programa),
    FOREIGN KEY (Estudiante_persona_cc)
    REFERENCES Estudiante (estud_cc)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (Programa_id_programa)
    REFERENCES Programa (prog_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Historia Academica
-- -----------------------------------------------------
DROP TABLE IF EXISTS Historia_Academica ;

CREATE TABLE Historia_Academica (
  histAcad_id INT NOT NULL AUTO_INCREMENT,
  histAcad_PAPA DECIMAL(5,2) NOT NULL,
  histAcad_PAPPI DECIMAL(5,2) NOT NULL,
  histAcad_porcen_avance DECIMAL(5,2) NOT NULL,
  histAcad_cred_adicionales INT NOT NULL,
  histAcad_cup_creditos INT NOT NULL,
  histAcad_cred_disponibles INT NOT NULL,
  histAcad_cred_doble_titulacion INT NOT NULL,
  histAcad_id_programa INT NOT NULL,
  histAcad_estudiante_cc INT NOT NULL,
  histAcad_semestre VARCHAR(10) NOT NULL,
  PRIMARY KEY (histAcad_id),
    FOREIGN KEY (histAcad_id_programa)
    REFERENCES Programa (prog_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (histAcad_estudiante_cc)
    REFERENCES Estudiante (estud_cc)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Table Ponderado
-- -----------------------------------------------------
DROP TABLE IF EXISTS Ponderado ;

CREATE TABLE Ponderado (
  ponde_insc_semestre VARCHAR(10) NOT NULL,
  ponde_insc_estudiante_cc INT NOT NULL,
  ponde_insc_id_programa INT NOT NULL,
  ponde_insc_id_asignatura INT NOT NULL,
  ponde_nota_final DECIMAL(5,2) NULL,
  ponde_aprobado TINYINT NULL,
  ponde_id_histAcad INT NOT NULL,
  PRIMARY KEY (ponde_insc_semestre,  ponde_insc_estudiante_cc,  ponde_insc_id_programa,  ponde_insc_id_asignatura),
    FOREIGN KEY (ponde_insc_semestre,  ponde_insc_estudiante_cc,  ponde_insc_id_programa,  ponde_insc_id_asignatura)
    REFERENCES Inscripcion (insc_semestre , insc_estudiante_cc, insc_id_programa ,insc_id_asignatura)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (ponde_id_histAcad)
    REFERENCES Historia_Academica (histAcad_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Evaluación
-- -----------------------------------------------------
DROP TABLE IF EXISTS Evaluacion ;

CREATE TABLE Evaluacion (
  eval_nombre VARCHAR(45) NOT NULL,
  eval_nota DECIMAL(5,2) NULL,
  eval_porcentaje DECIMAL(5,2) NOT NULL,
  eval_calificacion_minima DECIMAL(5,2) NOT NULL DEFAULT 3.00,
  eval_ponde_insc_semestre VARCHAR(10) NOT NULL,
  eval_ponde_insc_estudiante_cc INT NOT NULL,
  eval_ponde_insc_id_programa INT NOT NULL,
  eval_ponde_insc_id_asignatura INT NOT NULL,
  PRIMARY KEY (eval_nombre, eval_ponde_insc_semestre, eval_ponde_insc_estudiante_cc,  eval_ponde_insc_id_programa,eval_ponde_insc_id_asignatura),
    FOREIGN KEY (eval_ponde_insc_semestre, eval_ponde_insc_estudiante_cc,  eval_ponde_insc_id_programa,eval_ponde_insc_id_asignatura)
    REFERENCES Ponderado (ponde_insc_semestre , ponde_insc_estudiante_cc, ponde_insc_id_programa , ponde_insc_id_asignatura)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Asignatura_has_Asignatura
-- -----------------------------------------------------
DROP TABLE IF EXISTS Asignatura_has_Asignatura ;

CREATE TABLE Asignatura_has_Asignatura (
  Asignatura_id_asignatura INT NOT NULL,-- Asignatura
  Asignatura_id_asignatura_pre INT NOT NULL,-- Asignatura prerequisito
  PRIMARY KEY (Asignatura_id_asignatura),
    FOREIGN KEY (Asignatura_id_asignatura)
    REFERENCES Asignatura (asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (Asignatura_id_asignatura_pre)
    REFERENCES Asignatura (asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table Edificio
-- -----------------------------------------------------
DROP TABLE IF EXISTS Edificio ;

CREATE TABLE Edificio (
  edif_id INT NOT NULL AUTO_INCREMENT,
  edif_nombre VARCHAR(45) NULL,
  edif_sede VARCHAR(45) NOT NULL,
  PRIMARY KEY (edif_id));


-- -----------------------------------------------------
-- Table Salon
-- -----------------------------------------------------
DROP TABLE IF EXISTS Salon ;

CREATE TABLE Salon (
  sal_id INT NOT NULL,
  sal_nombre VARCHAR(45) NULL,
  sal_edif_id INT NOT NULL,
  PRIMARY KEY (sal_id,sal_edif_id),
    FOREIGN KEY (sal_edif_id)
    REFERENCES Edificio (edif_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
-- TABLE Salon ADD INDEX idx_sal_id (sal_id, sal_edif_id);

-- -----------------------------------------------------
-- Table Horario
-- -----------------------------------------------------
DROP TABLE IF EXISTS Horario ;
CREATE TABLE IF NOT EXISTS Horario (
  horar_dia VARCHAR(45) NOT NULL,
  horar_hora_inicio INT NOT NULL,
  horar_hora_final INT NULL,
  horar_actividad VARCHAR(45) NOT NULL,
  horar_grup_no_grupo INT NOT NULL,
  horar_grup_asig_id INT NOT NULL,
  horar_sal_id INT NOT NULL,
  horar_sal_edif_id INT NOT NULL,
  PRIMARY KEY (horar_dia, horar_hora_inicio, horar_grup_no_grupo, horar_grup_asig_id),
    FOREIGN KEY (horar_grup_no_grupo , horar_grup_asig_id)
    REFERENCES Grupo (grup_no_grupo ,grup_asig_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (horar_sal_id, horar_sal_edif_id)
    REFERENCES Salon (sal_id, sal_edif_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

DROP TABLE IF EXISTS Usuario ;
CREATE TABLE IF NOT EXISTS Usuario (
  user_cc INT NOT NULL,
  user_usuario VARCHAR(45) NOT NULL,
  user_rol VARCHAR(45) NOT NULL DEFAULT '',
  user_contrasena VARCHAR(45) NOT NULL DEFAULT "1234",
  PRIMARY KEY (user_usuario),
  FOREIGN KEY (user_cc)
  REFERENCES Persona (per_cc)
  ON DELETE CASCADE
  ON UPDATE CASCADE 
  );    
       
