CREATE TABLE `animales` (
  `IdAnimales` int NOT NULL AUTO_INCREMENT,
  `idClientes` int NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Edad` int NOT NULL,
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

CREATE TABLE `clientes` (
  `idClientes` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Celular` varchar(20) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idClientes`)
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
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) DEFAULT NULL,
  `Contrasenia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
);

