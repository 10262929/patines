-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-06-2021 a las 20:11:56
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alquilerpatinetas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuariopatineta`
--

CREATE TABLE `usuariopatineta` (
  `id` int(11) NOT NULL,
  `nombre_usuario` varchar(255) NOT NULL,
  `apellidos_usuarios` varchar(45) NOT NULL,
  `codigoPatineta` varchar(45) NOT NULL,
  `colorPatineta` varchar(45) NOT NULL,
  `descripcionPatineta` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuariopatineta`
--

INSERT INTO `usuariopatineta` (`id`, `nombre_usuario`, `apellidos_usuarios`, `codigoPatineta`, `colorPatineta`, `descripcionPatineta`) VALUES
(6, 'braham ', 'marin', '5489457897', 'negro', 'patineta adulto');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuariopatineta`
--
ALTER TABLE `usuariopatineta`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `codigoPatineta` (`codigoPatineta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuariopatineta`
--
ALTER TABLE `usuariopatineta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
