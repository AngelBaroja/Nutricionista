-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2024 at 08:42 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Table structure for table `comida`
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
-- Dumping data for table `comida`
--

INSERT INTO `comida` (`codComida`, `nombre`, `tipoComida`, `caloriasPorPorcion`, `detalle`, `baja`) VALUES
(1, 'Avena', 'desayuno', 389, 'Avena cocida con agua', 0),
(2, 'Pollo a la plancha', 'almuerzo', 165, 'Pechuga de pollo sin piel', 0),
(3, 'Ensalada mixta', 'cena', 45, 'Lechuga, tomate, zanahoria', 0),
(4, 'Pasta integral', 'almuerzo', 124, 'Pasta de trigo integral cocida', 1);

-- --------------------------------------------------------

--
-- Table structure for table `dieta`
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
  `nroPaciente` int(11) DEFAULT NULL,
  `codMenu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dieta`
--

INSERT INTO `dieta` (`codDieta`, `nombreD`, `fechaIni`, `fechaFin`, `pesoFinal`, `pesoInicial`, `estado`, `totalCalorias`, `nroPaciente`, `codMenu`) VALUES
(1, 'Dieta Baja en Carbohidratos', '2024-01-01', '2024-03-01', 75, 0, 1, 1500, 1, 1),
(2, 'Dieta Vegetariana', '2024-02-15', '2024-05-15', 60, 0, 1, 1800, 2, 2),
(3, 'Dieta Keto', '2024-01-10', '2024-04-10', 85, 0, 0, 2000, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `menudiario`
--

CREATE TABLE `menudiario` (
  `codMenu` int(11) NOT NULL,
  `diaNro` int(11) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `nroRenglon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `menudiario`
--

INSERT INTO `menudiario` (`codMenu`, `diaNro`, `estado`, `nroRenglon`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 2),
(3, 3, 0, 3);

-- --------------------------------------------------------

--
-- Table structure for table `paciente`
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
-- Dumping data for table `paciente`
--

INSERT INTO `paciente` (`nroPaciente`, `nombre`, `edad`, `altura`, `pesoActual`, `pesoBuscado`) VALUES
(1, 'Juan Perez', 105, 1.75, 80.5, 75),
(2, 'Maria Lopez', 42, 1.62, 68.1, 60),
(3, 'Carlos García', 28, 1.79, 90, 85);

-- --------------------------------------------------------

--
-- Table structure for table `renglondemenu`
--

CREATE TABLE `renglondemenu` (
  `nroRenglon` int(11) NOT NULL,
  `codComida` int(11) DEFAULT NULL,
  `cantidadPorciones` int(11) DEFAULT NULL,
  `subTotalCalorias` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `renglondemenu`
--

INSERT INTO `renglondemenu` (`nroRenglon`, `codComida`, `cantidadPorciones`, `subTotalCalorias`) VALUES
(1, 1, 1, 389),
(2, 2, 2, 330),
(3, 3, 1, 67.4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`codComida`);

--
-- Indexes for table `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`codDieta`),
  ADD KEY `nroPaciente` (`nroPaciente`),
  ADD KEY `codMenu` (`codMenu`);

--
-- Indexes for table `menudiario`
--
ALTER TABLE `menudiario`
  ADD PRIMARY KEY (`codMenu`),
  ADD KEY `codDieta` (`nroRenglon`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`nroPaciente`);

--
-- Indexes for table `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD PRIMARY KEY (`nroRenglon`),
  ADD KEY `codComida` (`codComida`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comida`
--
ALTER TABLE `comida`
  MODIFY `codComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `dieta`
--
ALTER TABLE `dieta`
  MODIFY `codDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `codMenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `renglondemenu`
--
ALTER TABLE `renglondemenu`
  MODIFY `nroRenglon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`nroPaciente`) REFERENCES `paciente` (`nroPaciente`),
  ADD CONSTRAINT `dieta_ibfk_2` FOREIGN KEY (`codMenu`) REFERENCES `menudiario` (`codMenu`);

--
-- Constraints for table `menudiario`
--
ALTER TABLE `menudiario`
  ADD CONSTRAINT `menudiario_ibfk_1` FOREIGN KEY (`nroRenglon`) REFERENCES `renglondemenu` (`nroRenglon`);

--
-- Constraints for table `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD CONSTRAINT `renglondemenu_ibfk_1` FOREIGN KEY (`codComida`) REFERENCES `comida` (`codComida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
