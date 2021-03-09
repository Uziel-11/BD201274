CREATE SCHEMA `veterinaria` ;

CREATE TABLE `clientes` (
  `idClientes` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Celular` mediumint DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Ciudad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idClientes`)
);
  
  CREATE TABLE `animales` (
  `IdAnimales` int NOT NULL,
  `idClientes` int NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Raza` varchar(50) NOT NULL,
  `Sexo` varchar(50) NOT NULL,
  `Fecha_Ingreso` date NOT NULL,
  `Peso` float NOT NULL,
  `Motivo` varchar(50) NOT NULL,
  PRIMARY KEY (`IdAnimales`)
);

CREATE TABLE `citas` (
  `IdCitas` int NOT NULL,
  `idAnimales` varchar(45) DEFAULT NULL,
  `Fecha_Citas` date NOT NULL,
  `Total_Factura` int NOT NULL,
  `Forma_Pago` varchar(50) NOT NULL,
  `Cantidad_Pagada` int NOT NULL,
  `Facturacion` int NOT NULL,
  PRIMARY KEY (`IdCitas`)
);

CREATE TABLE `medicamentos` (
  `IdMedicamento` int NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Precio` int NOT NULL,
  `fechaCaducidad` date NOT NULL,
  `sustanciaActiva` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdMedicamento`)
);

CREATE TABLE `usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(45) NULL,
  `Contrasenia` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuario`));