/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*					Archivo sql para crear tablas 
:*        
:*  Archivo     : SQL-Crear Tablas Hardware.sql
:*  Autor       : Jos� Misael Adame Sandoval     18131209
:*                Ricardo Ra�l Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       :16/May/2020
:*  Descripci�n : Archivo SQL Que contiene el script para
:*					la creaci�n de las tablas fabricante,
:*					distribuidor y producto.
:*                
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  16/Jun/2020 Arturo Galindo         Agregar pr�logo.
:*------------------------------------------------------------------------------------------*/

--Crear base de datos--
Create Database Hardware;
--Usar la BD--
Use Hardware;
--Creaci�n de cat�logos--
--Fabricante--
Create table Fabricante(
	Id_Fabricante INT NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
                (START WITH 1, INCREMENT BY 1),
	Nombre_Fabricante VARCHAR(80),
	Direccion_Fabricante VARCHAR(80),
	Presidente_Fabricante VARCHAR(30)
	
	);
--Distribuidor--
Create table Distribuidor(
	Id_Distribuidor INT NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
                (START WITH 1, INCREMENT BY 1),
	Nombre_Distribuidor VARCHAR(80),
	Direccion_Distribuidor VARCHAR(80),
	Tipo_Transporte VARCHAR(30)
	
);
--Creaci�n del detalle--
Create table Producto(
	Id_Producto INT NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
                (START WITH 1, INCREMENT BY 1),
	Id_Fabricante INT,
	Id_Distribuidor INT,
	Modelo_Producto VARCHAR(30),
	Precio_Producto DOUBLE
	
);
--Creaci�n de Constraints--
--Id Fabricante--
Alter Table Producto Add Constraint
	ChkFabricante Foreign key(Id_Fabricante)
	References Fabricante (Id_Fabricante);
--Id Distribuidor--
Alter Table Producto Add Constraint
	ChkDistribuidor Foreign key(Id_Distribuidor)
	References Distribuidor (Id_Distribuidor);





