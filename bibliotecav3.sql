-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-03-2018 a las 01:07:42
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `idAutor` int(11) NOT NULL,
  `idNacionalidad` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`idAutor`, `idNacionalidad`, `Nombre`, `Apellido`) VALUES
(1, 1, 'Karla', 'Quintanilla'),
(2, 20, 'Henry', 'Arana'),
(3, 4, 'Carlos', 'Zepeda'),
(4, 36, 'Charlie', 'Smith');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biblioteca`
--

CREATE TABLE `biblioteca` (
  `idBiblioteca` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Ubicacion` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo`
--

CREATE TABLE `catalogo` (
  `idCatalogo` int(11) NOT NULL,
  `idClasificacion` int(11) NOT NULL,
  `idIdioma` int(11) NOT NULL,
  `idMaterial` int(11) NOT NULL,
  `Titulo` varchar(40) NOT NULL,
  `Edicion` varchar(15) NOT NULL,
  `Descripcion` varchar(50) DEFAULT NULL,
  `Notas` varchar(50) DEFAULT NULL,
  `FechaAdquirido` date NOT NULL,
  `Resumen` varchar(255) DEFAULT NULL,
  `FechaPublicacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `catalogo`
--

INSERT INTO `catalogo` (`idCatalogo`, `idClasificacion`, `idIdioma`, `idMaterial`, `Titulo`, `Edicion`, `Descripcion`, `Notas`, `FechaAdquirido`, `Resumen`, `FechaPublicacion`) VALUES
(1, 1, 1, 1, 'Programando con Java', 'Primera', '525 páginas', 'Falta CD del libro', '2016-06-25', 'Se abordan temas esenciales de la programacion', '2012-06-27'),
(2, 2, 2, 1, 'El Salvador: Un pais Impresionante', 'Tercera Edición', 'Libro nacional', 'Primera página rasgada', '2014-06-25', 'Una vista hacia nuestro bello país', '2012-06-15'),
(3, 3, 2, 1, 'Industria de El Salvador', 'Quinta', '255 pags', 'Posee 5 copias', '2018-03-29', 'Libro con el top 5 de las industrias en ES', '2015-03-25'),
(4, 1, 1, 1, '123 Learning English', 'First Edition', '255 pags', 'Without CD', '2018-01-25', 'Book for english students', '2015-06-15'),
(5, 1, 3, 1, 'Societie de France', 'Primera', '144 pags', 'Se extravio una copia en 2017', '2016-02-15', 'Libro acerca de la sociedad en francia', '1999-06-23'),
(6, 4, 2, 1, 'Medicina e Ingeniería', 'Tercera', 'Libro multimedia con CD ', 'Primera página rota', '2017-11-18', '', '2014-03-25'),
(7, 3, 2, 1, 'Criterios de la ingeniería', 'Segunda', 'Libro multimedia con CD ', 'Primera página rota', '2017-11-28', '', '2014-03-24'),
(8, 2, 2, 1, 'Marketing en VR', 'Segunda', '155 pags', '', '2015-06-03', '', '2015-06-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogoautor`
--

CREATE TABLE `catalogoautor` (
  `idAutor` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `catalogoautor`
--

INSERT INTO `catalogoautor` (`idAutor`, `idCatalogo`) VALUES
(3, 3),
(2, 4),
(4, 5),
(2, 6),
(3, 7),
(2, 8),
(3, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriausuario`
--

CREATE TABLE `categoriausuario` (
  `idCategoria` int(11) NOT NULL,
  `NombreCategoria` varchar(25) NOT NULL,
  `MaxPrestamos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clasificacion`
--

CREATE TABLE `clasificacion` (
  `idClasificacion` int(11) NOT NULL,
  `Clasificacion` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clasificacion`
--

INSERT INTO `clasificacion` (`idClasificacion`, `Clasificacion`) VALUES
(1, 'Idiomas'),
(2, 'Arte y Cultura'),
(3, 'Industria'),
(4, 'Ingeniería');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion`
--

CREATE TABLE `devolucion` (
  `idDevolucion` int(11) NOT NULL,
  `idPrestamo` int(11) NOT NULL,
  `FechaDevolucion` date NOT NULL,
  `EstadoDevolucion` varchar(15) NOT NULL,
  `Observaciones` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dvdcd`
--

CREATE TABLE `dvdcd` (
  `idDVDCD` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `Duracion` varchar(7) NOT NULL,
  `Size` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplar`
--

CREATE TABLE `ejemplar` (
  `idEjemplar` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `idBiblioteca` int(11) NOT NULL,
  `EstadoEjemplar` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiallibro`
--

CREATE TABLE `historiallibro` (
  `idHistorial` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `CantidadPrestamo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idioma`
--

CREATE TABLE `idioma` (
  `idIdioma` int(11) NOT NULL,
  `Idioma` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `idioma`
--

INSERT INTO `idioma` (`idIdioma`, `Idioma`) VALUES
(1, 'Inglés'),
(2, 'Español'),
(3, 'Francés');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `idLibro` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `ISBN` varchar(25) DEFAULT NULL,
  `Publisher` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`idLibro`, `idCatalogo`, `ISBN`, `Publisher`) VALUES
(8, 3, '125-68-54-0', 'Ministerio de Economía'),
(9, 4, '125-68-54-0', 'English Studies'),
(10, 5, '125-63-87-51', 'Francia, Le Vroue'),
(11, 6, '125-96-36-87', 'España, Pearsons Editorial'),
(12, 7, '185-96-35-87', 'España, Pearsons Editorial 2015'),
(13, 8, '125-63-75-84', 'Peru; Blasters Editions');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE `material` (
  `idMaterial` int(11) NOT NULL,
  `NombreMaterial` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`idMaterial`, `NombreMaterial`) VALUES
(1, 'Libro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mora`
--

CREATE TABLE `mora` (
  `idMora` int(11) NOT NULL,
  `idPrestamo` int(11) NOT NULL,
  `EstadoMora` varchar(15) NOT NULL,
  `MontoMora` float NOT NULL,
  `DiasBajoMora` int(11) NOT NULL,
  `FechaPagoMora` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nacionalidad`
--

CREATE TABLE `nacionalidad` (
  `idNacionalidad` int(11) NOT NULL,
  `Nacionalidad` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `nacionalidad`
--

INSERT INTO `nacionalidad` (`idNacionalidad`, `Nacionalidad`) VALUES
(1, 'Afganistán'),
(2, 'Alemania'),
(3, 'Arabia Saudita'),
(4, 'Argentina'),
(5, 'Australia'),
(6, 'Bélgica'),
(7, 'Bolivia'),
(8, 'Brasil'),
(9, 'Camboya'),
(10, 'Canadá'),
(11, 'Chile'),
(12, 'China'),
(13, 'Colombia'),
(14, 'Corea'),
(15, 'Costa Rica'),
(16, 'Cuba'),
(17, 'Dinamatca'),
(18, 'Ecuador'),
(19, 'Egipto'),
(20, 'El Salvador'),
(21, 'Escocia'),
(22, 'España'),
(23, 'Estados Unidos'),
(24, 'Estonia'),
(25, 'Etiopia'),
(26, 'Filipinas'),
(27, 'Finlandia'),
(28, 'Francia'),
(29, 'Gales'),
(30, 'Grecia'),
(31, 'Guatemala'),
(32, 'Haití'),
(33, 'Holanda'),
(34, 'Honduras'),
(35, 'Indonesia'),
(36, 'Inglaterra'),
(37, 'Irak'),
(38, 'Irán'),
(39, 'Irlanda'),
(40, 'Israel'),
(41, 'Italia'),
(42, 'Japón'),
(43, 'Jordania'),
(44, 'Laos'),
(45, 'Letonia'),
(46, 'Lituania'),
(47, 'Malasia'),
(48, 'Marruecos'),
(49, 'México'),
(50, 'Nicaragua'),
(51, 'Noruega'),
(52, 'Nueva Zelanda'),
(53, 'Panamá'),
(54, 'Paraguay'),
(55, 'Perú'),
(56, 'Polonia'),
(57, 'Portugal'),
(58, 'Puerto Rico'),
(59, 'Rep. Dominicana'),
(60, 'Rumania'),
(61, 'Rusia'),
(62, 'Suecia'),
(63, 'Suiza'),
(64, 'Tailandia'),
(65, 'Taiwán'),
(66, 'Turquía'),
(67, 'Ucrania'),
(68, 'Uruguay'),
(69, 'Venezuela'),
(70, 'Vietnam');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `idPrestamo` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idEjemplar` int(11) NOT NULL,
  `FechaPrestamo` date NOT NULL,
  `EstadoPrestamo` varchar(15) NOT NULL,
  `DuracionDias` int(11) NOT NULL,
  `MontoDia` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renovacion`
--

CREATE TABLE `renovacion` (
  `idRenovacion` int(11) NOT NULL,
  `idPrestamo` int(11) NOT NULL,
  `FechaRenovacion` date NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaVencimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revista`
--

CREATE TABLE `revista` (
  `idRevista` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `VarianteTitulo` varchar(30) DEFAULT NULL,
  `Ejemplar` int(30) DEFAULT NULL,
  `Contenido` int(100) DEFAULT NULL,
  `Frecuencia` int(30) DEFAULT NULL,
  `ISSN` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE `tema` (
  `idTema` int(11) NOT NULL,
  `Tema` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`idTema`, `Tema`) VALUES
(1, 'Publicidad'),
(2, 'Programación'),
(3, 'Ciencias Sociales'),
(4, 'Medicina'),
(5, 'Computación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temacatalogo`
--

CREATE TABLE `temacatalogo` (
  `iIdTema` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `temacatalogo`
--

INSERT INTO `temacatalogo` (`iIdTema`, `idCatalogo`) VALUES
(3, 3),
(3, 4),
(3, 5),
(5, 6),
(5, 7),
(1, 8),
(3, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tesis`
--

CREATE TABLE `tesis` (
  `idTesis` int(11) NOT NULL,
  `idCatalogo` int(11) NOT NULL,
  `RecursoDigital` varchar(50) NOT NULL,
  `VarianteTitulo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Apellido` varchar(25) NOT NULL,
  `Carnet` varchar(8) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`idAutor`),
  ADD KEY `idNacionalidad` (`idNacionalidad`);

--
-- Indices de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  ADD PRIMARY KEY (`idBiblioteca`);

--
-- Indices de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD PRIMARY KEY (`idCatalogo`),
  ADD KEY `idClasificacion` (`idClasificacion`),
  ADD KEY `idIdioma` (`idIdioma`),
  ADD KEY `idMaterial` (`idMaterial`);

--
-- Indices de la tabla `catalogoautor`
--
ALTER TABLE `catalogoautor`
  ADD KEY `idAutor` (`idAutor`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `categoriausuario`
--
ALTER TABLE `categoriausuario`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  ADD PRIMARY KEY (`idClasificacion`);

--
-- Indices de la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD PRIMARY KEY (`idDevolucion`),
  ADD KEY `idPrestamo` (`idPrestamo`);

--
-- Indices de la tabla `dvdcd`
--
ALTER TABLE `dvdcd`
  ADD PRIMARY KEY (`idDVDCD`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  ADD PRIMARY KEY (`idEjemplar`),
  ADD KEY `idCatalogo` (`idCatalogo`),
  ADD KEY `idBiblioteca` (`idBiblioteca`);

--
-- Indices de la tabla `historiallibro`
--
ALTER TABLE `historiallibro`
  ADD PRIMARY KEY (`idHistorial`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `idioma`
--
ALTER TABLE `idioma`
  ADD PRIMARY KEY (`idIdioma`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`idLibro`),
  ADD KEY `idMaterial` (`idCatalogo`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`idMaterial`);

--
-- Indices de la tabla `mora`
--
ALTER TABLE `mora`
  ADD PRIMARY KEY (`idMora`),
  ADD KEY `idPrestamo` (`idPrestamo`);

--
-- Indices de la tabla `nacionalidad`
--
ALTER TABLE `nacionalidad`
  ADD PRIMARY KEY (`idNacionalidad`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`idPrestamo`),
  ADD KEY `idUsuario` (`idUsuario`),
  ADD KEY `idEjemplar` (`idEjemplar`);

--
-- Indices de la tabla `renovacion`
--
ALTER TABLE `renovacion`
  ADD PRIMARY KEY (`idRenovacion`),
  ADD KEY `idPrestamo` (`idPrestamo`);

--
-- Indices de la tabla `revista`
--
ALTER TABLE `revista`
  ADD PRIMARY KEY (`idRevista`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`idTema`);

--
-- Indices de la tabla `temacatalogo`
--
ALTER TABLE `temacatalogo`
  ADD KEY `iIdTema` (`iIdTema`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `tesis`
--
ALTER TABLE `tesis`
  ADD PRIMARY KEY (`idTesis`),
  ADD KEY `idCatalogo` (`idCatalogo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `idAutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  MODIFY `idBiblioteca` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  MODIFY `idCatalogo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `categoriausuario`
--
ALTER TABLE `categoriausuario`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  MODIFY `idClasificacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `devolucion`
--
ALTER TABLE `devolucion`
  MODIFY `idDevolucion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `dvdcd`
--
ALTER TABLE `dvdcd`
  MODIFY `idDVDCD` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  MODIFY `idEjemplar` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `historiallibro`
--
ALTER TABLE `historiallibro`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `idioma`
--
ALTER TABLE `idioma`
  MODIFY `idIdioma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `idLibro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `material`
--
ALTER TABLE `material`
  MODIFY `idMaterial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `mora`
--
ALTER TABLE `mora`
  MODIFY `idMora` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `nacionalidad`
--
ALTER TABLE `nacionalidad`
  MODIFY `idNacionalidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `idPrestamo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `renovacion`
--
ALTER TABLE `renovacion`
  MODIFY `idRenovacion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `revista`
--
ALTER TABLE `revista`
  MODIFY `idRevista` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tema`
--
ALTER TABLE `tema`
  MODIFY `idTema` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tesis`
--
ALTER TABLE `tesis`
  MODIFY `idTesis` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autor`
--
ALTER TABLE `autor`
  ADD CONSTRAINT `autor_ibfk_1` FOREIGN KEY (`idNacionalidad`) REFERENCES `nacionalidad` (`idNacionalidad`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD CONSTRAINT `catalogo_ibfk_2` FOREIGN KEY (`idIdioma`) REFERENCES `idioma` (`idIdioma`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `catalogo_ibfk_3` FOREIGN KEY (`idClasificacion`) REFERENCES `clasificacion` (`idClasificacion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `catalogo_ibfk_4` FOREIGN KEY (`idMaterial`) REFERENCES `material` (`idMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `catalogoautor`
--
ALTER TABLE `catalogoautor`
  ADD CONSTRAINT `catalogoautor_ibfk_1` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`idAutor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `catalogoautor_ibfk_2` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD CONSTRAINT `devolucion_ibfk_1` FOREIGN KEY (`idPrestamo`) REFERENCES `prestamo` (`idPrestamo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `dvdcd`
--
ALTER TABLE `dvdcd`
  ADD CONSTRAINT `dvdcd_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  ADD CONSTRAINT `ejemplar_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ejemplar_ibfk_2` FOREIGN KEY (`idBiblioteca`) REFERENCES `biblioteca` (`idBiblioteca`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `historiallibro`
--
ALTER TABLE `historiallibro`
  ADD CONSTRAINT `historiallibro_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mora`
--
ALTER TABLE `mora`
  ADD CONSTRAINT `mora_ibfk_1` FOREIGN KEY (`idPrestamo`) REFERENCES `prestamo` (`idPrestamo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`idEjemplar`) REFERENCES `ejemplar` (`idEjemplar`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `renovacion`
--
ALTER TABLE `renovacion`
  ADD CONSTRAINT `renovacion_ibfk_1` FOREIGN KEY (`idPrestamo`) REFERENCES `prestamo` (`idPrestamo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `revista`
--
ALTER TABLE `revista`
  ADD CONSTRAINT `revista_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `temacatalogo`
--
ALTER TABLE `temacatalogo`
  ADD CONSTRAINT `temacatalogo_ibfk_1` FOREIGN KEY (`iIdTema`) REFERENCES `tema` (`idTema`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `temacatalogo_ibfk_2` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `tesis`
--
ALTER TABLE `tesis`
  ADD CONSTRAINT `tesis_ibfk_1` FOREIGN KEY (`idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoriausuario` (`idCategoria`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
