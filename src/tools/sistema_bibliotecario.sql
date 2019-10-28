-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2019 a las 22:35:53
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_bibliotecario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionario`
--

CREATE TABLE `funcionario` (
  `idPersona` int(11) NOT NULL,
  `identificacion` varchar(50) NOT NULL,
  `nombre1` varchar(50) NOT NULL,
  `nombre2` varchar(50) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `password` varchar(50) NOT NULL,
  `rol` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `funcionario`
--

INSERT INTO `funcionario` (`idPersona`, `identificacion`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `fechaNacimiento`, `sexo`, `correo`, `telefono`, `password`, `rol`) VALUES
(1, '1007848568', 'Esteven', 'Javier', 'Moreno', 'Cañate', '2000-10-18', 'Masculino', 'a@a.com', '3024426044', '1234', 'Administardor'),
(2, '1', 'Glenis', '', 'Ramos', 'Care', '2010-05-16', 'Femenido', 'g@g.com', '3218374854', '1', 'Auxiliar'),
(3, '10438748723', 'Roy', 'David', 'Gomez', 'Noble', '1997-05-08', 'Masculino', 'r@r.com', '3002123242', '1234', 'Coordinador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE `material` (
  `idMaterial` int(11) NOT NULL,
  `codigoMaterial` varchar(50) NOT NULL,
  `tipoMaterial` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `descripcion` varchar(225) NOT NULL,
  `editorial` varchar(50) NOT NULL,
  `edicion` varchar(50) NOT NULL,
  `numPaginas` varchar(60) NOT NULL,
  `tema` varchar(225) NOT NULL,
  `disponible` tinyint(1) NOT NULL,
  `estadoFisico` varchar(50) NOT NULL,
  `codigoAsignatura` varchar(50) NOT NULL,
  `letraUbicacion` varchar(50) NOT NULL,
  `Ejemplar` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`idMaterial`, `codigoMaterial`, `tipoMaterial`, `autor`, `titulo`, `descripcion`, `editorial`, `edicion`, `numPaginas`, `tema`, `disponible`, `estadoFisico`, `codigoAsignatura`, `letraUbicacion`, `Ejemplar`) VALUES
(4, '01 87 FF 8B', 'libro', 'Gabriel García Márquez', 'El coronel no tiene quien le escriba', 'dwkfm', 'Harper', 'Novela', '92', 'la muerte de su hijo', 1, 'excelente', 'welm', 'f', 1),
(5, '9F 4D AC 89', 'libro', 'Gabriel García Márquez', 'Cien años de soledad', 'fg', 'Editorial Planeta', 'Ficción épica', '471', 'Saga familiar', 1, 'excelente', 'ret', 'fge', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multa`
--

CREATE TABLE `multa` (
  `idMulta` int(11) NOT NULL,
  `fechaMulta` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `valorMulta` double NOT NULL,
  `fechaPago` date NOT NULL,
  `motivoMulta` text NOT NULL,
  `controlPago` tinyint(1) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `idPrestamo` int(11) NOT NULL,
  `codigoPrestamo` varchar(50) NOT NULL,
  `fechaPrestamo` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `fechaLimite` timestamp NOT NULL DEFAULT current_timestamp(),
  `fechaDevolucion` timestamp NULL DEFAULT NULL,
  `tipoPrestamo` varchar(50) NOT NULL,
  `idMaterial` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idPersona` int(11) NOT NULL,
  `identificacion` varchar(50) NOT NULL,
  `nombre1` varchar(50) NOT NULL,
  `nombre2` varchar(50) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipoUsuario` varchar(50) NOT NULL,
  `inscrito` varchar(50) NOT NULL,
  `codigoInstitucional` varchar(50) NOT NULL,
  `pagoAnual` double NOT NULL,
  `controlPago` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idPersona`, `identificacion`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `fechaNacimiento`, `sexo`, `correo`, `telefono`, `password`, `tipoUsuario`, `inscrito`, `codigoInstitucional`, `pagoAnual`, `controlPago`) VALUES
(1, '10440495945', 'Rafael', '', 'Caro', 'Perez', '1997-05-07', 'Masculino', 'f@f.com', '3016234678', '1234', '1234', '1', '1810080034', 0, '1'),
(2, '2', 'Maria', 'Jose', 'Jimenez', 'Gonzales', '1999-06-16', 'Femenido', 'majo@gmail.com', '3212345654', '2', '2', '1', '181008934', 0, '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idPersona`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`idMaterial`),
  ADD UNIQUE KEY `codigoMaterial` (`codigoMaterial`);

--
-- Indices de la tabla `multa`
--
ALTER TABLE `multa`
  ADD PRIMARY KEY (`idMulta`),
  ADD KEY `idUsuario` (`idUsuario`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`idPrestamo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idPersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `material`
--
ALTER TABLE `material`
  MODIFY `idMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `multa`
--
ALTER TABLE `multa`
  MODIFY `idMulta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `idPrestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `multa`
--
ALTER TABLE `multa`
  ADD CONSTRAINT `multa_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idPersona`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
