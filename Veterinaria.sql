CREATE SCHEMA `veterinaria` ;

CREATE TABLE `animales` (
  `IdAnimales` int NOT NULL AUTO_INCREMENT,
  `NombreCliente` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Color` varchar(50) NOT NULL,
  `Especie` varchar(50) NOT NULL,
  `Raza` varchar(45) DEFAULT NULL,
  `Peso` int DEFAULT NULL,
  `Motivo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdAnimales`)
);

CREATE TABLE `citas` (
  `IdCitas` int NOT NULL AUTO_INCREMENT,
  `IdAnimales` varchar(45) DEFAULT NULL,
  `Fecha` varchar(20) DEFAULT NULL,
  `Hora` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IdCitas`)
);

CREATE TABLE `clientes` (
  `idClientes` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Celular` varchar(20) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idClientes`)
);

CREATE TABLE `medicamentos` (
  `IdMedicamento` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Precio` int DEFAULT NULL,
  `Cantidad` int DEFAULT NULL,
  `fechaCaducidad` varchar(15) DEFAULT NULL,
  `sustanciaActiva` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdMedicamento`)
);

CREATE TABLE `registrados` (
  `idRegistrados` int NOT NULL AUTO_INCREMENT,
  `NombreCliente` varchar(45) DEFAULT NULL,
  `NombreAnimal` varchar(45) DEFAULT NULL,
  `Color` varchar(45) DEFAULT NULL,
  `Especie` varchar(45) DEFAULT NULL,
  `Raza` varchar(45) DEFAULT NULL,
  `Motivo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idRegistrados`)
);

CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) DEFAULT NULL,
  `Contrasenia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
);

