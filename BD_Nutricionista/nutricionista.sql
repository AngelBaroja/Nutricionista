-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2024 a las 19:43:21
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `codComida` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `tipoComida` varchar(20) DEFAULT NULL,
  `caloriasPorPorcion` int(11) DEFAULT NULL,
  `detalle` varchar(50) DEFAULT NULL,
  `baja` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`codComida`, `nombre`, `tipoComida`, `caloriasPorPorcion`, `detalle`, `baja`) VALUES
(1, 'Avena', 'desayuno', 389, 'Avena cocida con agua', 0),
(2, 'Pollo a la plancha', 'almuerzo', 165, 'Pechuga de pollo sin piel', 0),
(3, 'Ensalada mixta', 'cena', 45, 'Lechuga, tomate, zanahoria', 0),
(4, 'Pasta integral', 'almuerzo', 124, 'Pasta de trigo integral cocida', 1),
(5, 'Yogur natural', 'merienda', 100, 'Yogur', 0),
(6, 'Tostadas Integrales', 'desayuno', 120, 'Tostadas integrales con mermelada sin azúcar', 0),
(7, 'Huevos revueltos', 'desayuno', 200, 'Huevos revueltos con espinaca y tomate', 0),
(8, 'Panqueques de avena', 'desayuno', 180, 'Panqueques de avena y plátano', 0),
(9, 'Smoothie de frutas', 'merienda', 150, 'Smoothie de frutas mixtas con yogur', 0),
(10, 'Barrita de cereal', 'merienda', 90, 'Barrita de cereal y frutos secos', 0),
(11, 'Sándwich de pavo', 'merienda', 250, 'Sándwich de pan integral con pavo y queso', 0),
(12, 'Sopa de verduras', 'almuerzo', 200, 'Sopa de verduras variadas', 0),
(13, 'Arroz con pollo', 'almuerzo', 400, 'Arroz integral con pechuga de pollo', 0),
(14, 'Pasta integral con salsa', 'almuerzo', 350, 'Pasta integral con salsa de tomate y verduras', 0),
(15, 'Ensalada César', 'almuerzo', 300, 'Ensalada César con pollo y aderezo ligero', 0),
(16, 'Yogur con frutas', 'snack', 100, 'Yogur bajo en grasa con frutas frescas', 0),
(17, 'Frutos secos', 'snack', 150, 'Mezcla de almendras, nueces y pasas', 0),
(18, 'Galletas integrales', 'snack', 80, 'Galletas integrales sin azúcar', 0),
(19, 'Salmón al horno', 'cena', 350, 'Filete de salmón al horno con limón y especias', 0),
(20, 'Tacos de pescado', 'cena', 320, 'Tacos con pescado y vegetales', 0),
(21, 'Verduras asadas', 'cena', 200, 'Verduras asadas al horno con hierbas', 0),
(22, 'Omelette de vegetales', 'cena', 180, 'Omelette de claras de huevo y vegetales', 0),
(23, 'Ensalada de quinoa', 'cena', 250, 'Ensalada de quinoa con vegetales y aguacate', 0),
(24, 'Lasaña de berenjena', 'cena', 300, 'Lasaña con láminas de berenjena en lugar de pasta', 0),
(25, 'Hamburguesa de lentejas', 'cena', 280, 'Hamburguesa de lentejas con pan integral', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `codDieta` int(11) NOT NULL,
  `nombreD` varchar(30) DEFAULT NULL,
  `fechaIni` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `pesoFinal` double DEFAULT NULL,
  `pesoInicial` double DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `totalCalorias` double DEFAULT NULL,
  `nroPaciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`codDieta`, `nombreD`, `fechaIni`, `fechaFin`, `pesoFinal`, `pesoInicial`, `estado`, `totalCalorias`, `nroPaciente`) VALUES
(1, 'Dieta Baja en Carbohidratos', '2024-01-01', '2024-03-01', 75, NULL, 1, 1500, 1),
(2, 'Dieta Vegetariana', '2024-02-15', '2024-05-15', 60, NULL, 1, 1800, 2),
(3, 'Dieta Keto', '2024-01-10', '2024-04-10', 85, NULL, 0, 2000, 3),
(10, 'Dieta de Nicolas', '2024-01-01', '2024-01-04', 75, 85, 1, 0, 4),
(11, 'Dieta de Matias', '2024-02-02', '2024-02-06', 60, 65, 1, 0, 5),
(12, 'Dieta de Angel', '2024-02-15', '2024-02-20', 80, 92, 1, 0, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menudiario`
--

CREATE TABLE `menudiario` (
  `codMenu` int(11) NOT NULL,
  `diaNro` int(11) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `codDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `menudiario`
--

INSERT INTO `menudiario` (`codMenu`, `diaNro`, `estado`, `codDieta`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 2),
(3, 3, 0, 3),
(4, 1, 1, 10),
(5, 2, 1, 10),
(6, 1, 1, 11),
(7, 2, 1, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `nroPaciente` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `altura` double DEFAULT NULL,
  `pesoActual` double DEFAULT NULL,
  `pesoBuscado` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`nroPaciente`, `nombre`, `edad`, `altura`, `pesoActual`, `pesoBuscado`) VALUES
(1, 'Juan Perez', 105, 1.75, 80.5, 75),
(2, 'Maria Lopez', 42, 1.62, 68.1, 60),
(3, 'Carlos García', 28, 1.79, 90, 85),
(4, 'Nicolas Lucero', 39, 1.73, 85, 80),
(5, 'Matias Corvalan', 26, 1.7, 80, 75),
(6, 'Angel Baroja', 28, 1.8, 90, 86),
(7, 'Valentino Coppola', 42, 1.82, 92, 80),
(8, 'Luciano Camaño', 20, 1.7, 76, 70);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglondemenu`
--

CREATE TABLE `renglondemenu` (
  `nroRenglon` int(11) NOT NULL,
  `codComida` int(11) DEFAULT NULL,
  `cantidadPorciones` int(11) DEFAULT NULL,
  `subTotalCalorias` double DEFAULT NULL,
  `codMenu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `renglondemenu`
--

INSERT INTO `renglondemenu` (`nroRenglon`, `codComida`, `cantidadPorciones`, `subTotalCalorias`, `codMenu`) VALUES
(4, 1, 100, 389, 1),
(5, 2, 200, 330, 2),
(6, 3, 150, 67, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`codComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`codDieta`),
  ADD KEY `nroPaciente` (`nroPaciente`);

--
-- Indices de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD PRIMARY KEY (`codMenu`),
  ADD KEY `codDieta_2` (`codDieta`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`nroPaciente`);

--
-- Indices de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD PRIMARY KEY (`nroRenglon`),
  ADD KEY `codComida` (`codComida`),
  ADD KEY `codMenu` (`codMenu`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `codComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `codDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `codMenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  MODIFY `nroRenglon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`nroPaciente`) REFERENCES `paciente` (`nroPaciente`);

--
-- Filtros para la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD CONSTRAINT `menudiario_ibfk_1` FOREIGN KEY (`codDieta`) REFERENCES `dieta` (`codDieta`);

--
-- Filtros para la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD CONSTRAINT `renglondemenu_ibfk_1` FOREIGN KEY (`codComida`) REFERENCES `comida` (`codComida`),
  ADD CONSTRAINT `renglondemenu_ibfk_2` FOREIGN KEY (`codMenu`) REFERENCES `menudiario` (`codMenu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
