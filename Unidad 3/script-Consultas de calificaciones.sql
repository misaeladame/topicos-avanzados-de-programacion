/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                  Script de Creaci�n de Tablas de la BD TAPdb
:*        
:*  Archivo     : script-consultas de calificaciones.sql
:*  Autor       : Jos� Misael Adame Sandoval     18131209
:*  Fecha       : 04/May/2020
:*  Descripci�n : Scripts de consulta de calificaciones sobre la tabla Kardex 
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  13/May/2020 Misael Adame         Agregar pr�logo.
:*------------------------------------------------------------------------------------------


/* Consulta las calificaciones de todos los alumnos ordenados por matricula */
SELECT K.MATRICULA, A.NOMBRE, A.APELLIDOS, K.PERIODO, M.MATERIA, K.CALIFICACION 
FROM Kardex K, Alumnos A, Materias M
WHERE K.MATRICULA = A.MATRICULA AND K.IDMATERIA = M.IDMATERIA
ORDER BY K.MATRICULA;

/* Consulta de calificaciones de un solo alumno */
SELECT K.MATRICULA, A.NOMBRE, A.APELLIDOS, K.PERIODO, M.MATERIA, K.CALIFICACION 
FROM Kardex K, Alumnos A, Materias M
WHERE K.MATRICULA = A.MATRICULA AND K.IDMATERIA = M.IDMATERIA AND K.MATRICULA = '18130945'

