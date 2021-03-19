/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                  Script de Poblar las tablas de la bd TAPdb
:*        
:*  Archivo     : script-Poblar las tablas de la bd TAPdb.sql
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 04/May/2020
:*  Descripción : Script SQL para poblar las tablas Alumnos, Materias y Kardex
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  05/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------

/* ELIMINAR LOS REGISTROS DE LAS TABLAS ANTES DE POBLARLAS */
DELETE FROM Kardex;
DELETE FROM Alumnos;
DELETE FROM Materias;

/* POBLAR LAS TABLAS CON REGISTROS DE PRUEBA */
INSERT INTO Alumnos VALUES ( '17130856', 'Olivia', 'Olivares Oliveira', 19, 78.25 );
INSERT INTO Alumnos VALUES ( '17130433', 'Hernan', 'Hernandez', 21, 82.87 );
INSERT INTO Alumnos VALUES ( '18130945', 'Choncho', 'Renigris', 20, 92.14 );

INSERT INTO Materias VALUES ('ED1', 'Estructura de Datos', 8 );
INSERT INTO Materias VALUES ('TAP1', 'Topicos Av. de Progr.', 6 );
INSERT INTO Materias VALUES ('TBD1', 'Taller de B. de D.', 10 );
INSERT INTO Materias VALUES ('IA1', 'Inteligencia Artificial', 8 );

INSERT INTO Kardex VALUES ( 1, '17130856', 'TBD1', '2020A', 91 );
INSERT INTO Kardex VALUES ( 2, '17130856', 'ED1', '2020A', 75 );
INSERT INTO Kardex VALUES ( 3, '17130856', 'TAP1', '2020A', 81 );
INSERT INTO Kardex VALUES ( 4, '17130856', 'IA1', '2020A', 78 );

INSERT INTO Kardex VALUES ( 5, '17130433', 'TBD1', '2020A', 78 );
INSERT INTO Kardex VALUES ( 6, '17130433', 'ED1', '2020A', 81 );
INSERT INTO Kardex VALUES ( 7, '17130433', 'TAP1', '2020A', 75 );
INSERT INTO Kardex VALUES ( 8, '17130433', 'IA1', '2020A', 91 );

INSERT INTO Kardex VALUES ( 9, '18130945', 'TBD1', '2020A', 88 );
INSERT INTO Kardex VALUES ( 10, '18130945', 'ED1', '2020A', 86 );
INSERT INTO Kardex VALUES ( 11, '18130945', 'TAP1', '2020A', 94 );
INSERT INTO Kardex VALUES ( 12, '18130945', 'IA1', '2020A', 73 );