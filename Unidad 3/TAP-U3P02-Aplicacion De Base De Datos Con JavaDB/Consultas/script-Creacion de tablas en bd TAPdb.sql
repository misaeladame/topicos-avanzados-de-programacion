/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                  Script de Creación de Tablas de la BD TAPdb
:*        
:*  Archivo     : script-creacion de tablas en bd TAPdb.sql
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 04/May/2020
:*  Descripción : Script SQL para crear las tablas Alumnos, Materias y Kardex
:*                y poblarlas con registros de prueba 
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  05/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------

/* CREACION DE TABLAS */

CREATE TABLE Alumnos 
(
    MATRICULA VARCHAR ( 10 ) PRIMARY KEY,
    NOMBRE VARCHAR ( 30 ) NOT NULL,
    APELLIDOS VARCHAR ( 50 ) NOT NULL,
    EDAD INTEGER,
    PROMEDIO REAL
);

CREATE TABLE Materias
(
    IDMATERIA VARCHAR ( 10 ) PRIMARY KEY,
    MATERIA VARCHAR ( 50 ) NOT NULL,
    CREDITOS INTEGER
);

CREATE TABLE Kardex 
(
    IDCALIFIC INTEGER PRIMARY KEY,
    MATRICULA VARCHAR ( 10 ),
    IDMATERIA VARCHAR ( 10 ),
    PERIODO VARCHAR ( 5 ),
    CALIFICACION INTEGER
);

/* CREACION DE LLAVES FORANEAS PARA LA INTEGRIDAD REFERENCIAL */
ALTER TABLE Kardex
ADD CONSTRAINT fk_matricula
FOREIGN KEY ( MATRICULA ) 
REFERENCES Alumnos ( MATRICULA );

ALTER TABLE Kardex
ADD CONSTRAINT fk_idmateria
FOREIGN KEY ( IDMATERIA ) 
REFERENCES Materias ( IDMATERIA );

