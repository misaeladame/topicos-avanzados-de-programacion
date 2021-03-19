/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                  Script de Poblar las tablas de la bd TAPdb
:*        
:*  Archivo     : SQL-Poblar Tablas Hardware.sql
:*  Autor       : Jose Misael Adame Sandoval     18131209
:*                Ricardo Raul Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 14/Jun/2020
:*  Descripci�n : Script SQL para poblar las tablas Fabricante, Distribuidor y Producto
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  15/Jun/2020 Misael Adame         Agregar pr�logo.
:*------------------------------------------------------------------------------------------*/

/* ELIMINAR LOS REGISTROS DE LAS TABLAS ANTES DE POBLARLAS */
DELETE FROM Producto;
DELETE FROM Fabricante;
DELETE FROM Distribuidor;

/* POBLAR LAS TABLAS CON REGISTROS DE PRUEBA */


INSERT INTO Fabricante (Nombre_Fabricante, Direccion_Fabricante, Presidente_Fabricante)
VALUES 
('ASUS', 'Av. Insurgentes #42 CDMX', 'Misael Adame'),
('DELL', 'Blvd. Reforma #543 Guadalajara, Jal', 'Arturo Galindo'),
('HP', 'Av. Rodriguez #541 Guadalajara, Jal', 'Ricardo Castro');

INSERT INTO Distribuidor (Nombre_Distribuidor, Direccion_Distribuidor, Tipo_Transporte) 
VALUES 
('Amazon MX', 'Casa Amazon CDMX', 'Terrestre, Aereo, Maritimo'),
('Mercado Libre', 'Av. Satelite #32 Naucalpan, EdoMex', 'Terrestre, Aereo'),
('Best Buy', 'Blvd. Santana #11 Guadalajara, Jal', 'Terrestre'),
('Sears', 'Blvd. Reforma #43 Monterrey, NL', 'Terrestre, Aereo');



INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Router RT-AC1200', 1489 
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'ASUS' AND D.Nombre_Distribuidor = 'Amazon MX');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Monitor VP228 LED 21.5"', 2564
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'ASUS' AND D.Nombre_Distribuidor = 'Mercado Libre');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Laptop A407ma', 8250 
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'ASUS' AND D.Nombre_Distribuidor = 'Best Buy');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Mouse P501', 871
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'ASUS' AND D.Nombre_Distribuidor = 'Sears');



INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Laptop 3400', 14990
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'DELL' AND D.Nombre_Distribuidor = 'Amazon MX');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,   'CPU Optiplex', 3200
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'DELL' AND D.Nombre_Distribuidor = 'Mercado Libre');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Proyector 1210s', 4000
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'DELL' AND D.Nombre_Distribuidor = 'Best Buy');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,   'Teclado KB216', 250
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'DELL' AND D.Nombre_Distribuidor = 'Sears');



INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Laptop Ryzen 3', 12999
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'HP' AND D.Nombre_Distribuidor = 'Amazon MX');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Bateria HS03', 580
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'HP' AND D.Nombre_Distribuidor = 'Mercado Libre');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,  'Impresora HP DeskJet 2143', 921
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'HP' AND D.Nombre_Distribuidor = 'Best Buy');

INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto)
(SELECT F.Id_Fabricante, D.Id_Distribuidor,   'Ventilador G4-2000', 295
FROM Fabricante F, Distribuidor D 
WHERE F.Nombre_Fabricante = 'HP' AND D.Nombre_Distribuidor = 'Sears');

