-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bi2f7l02fgag4lgil8b9-mysql.services.clever-cloud.com:3306
-- Generation Time: Jul 01, 2023 at 01:49 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bi2f7l02fgag4lgil8b9`
--

-- --------------------------------------------------------

--
-- Table structure for table `conocimientos`
--

CREATE TABLE `conocimientos` (
  `id` int(11) NOT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimientos`
--

INSERT INTO `conocimientos` (`id`, `id_persona`, `logo`, `nombre`) VALUES
(2, 52, '../../../../assets/html5Logo.svg', 'HTML'),
(3, 52, '../../../../assets/css3Logo.svg', 'CSS'),
(4, 52, '../../../../assets/javaLogo.svg', 'Java'),
(5, 52, '../../../../assets/javascriptLogo.svg', 'JavaScript'),
(6, 52, '../../../../assets/javaLogo.svg', 'Java'),
(7, 52, '../../../../assets/angularLogo.svg', 'Angular'),
(8, 52, '../../../../assets/androidLogo.svg', 'Android'),
(9, 52, '../../../../assets/vaadinLogo.svg', 'Vaadin');

-- --------------------------------------------------------

--
-- Table structure for table `conocimientos_seq`
--

CREATE TABLE `conocimientos_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimientos_seq`
--

INSERT INTO `conocimientos_seq` (`next_val`) VALUES
(101),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` int(11) NOT NULL,
  `actual` bit(1) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `actual`, `descripcion`, `fecha_fin`, `fecha_inicio`, `id_persona`, `logo`, `nombre`) VALUES
(1, b'0', 'Bachiller en Ciencias Naturales', '2018-12-07', '2013-03-01', 52, '../../../assets/centenarioLogo.png', 'Escuela Secundaria N°16 \"Del Centenario\"'),
(2, b'1', 'Ingeniería en Sistemas de Información', NULL, '2019-03-05', 52, '../../../assets/utnLogo.png', 'Universidad Tecnológica Nacional');

-- --------------------------------------------------------

--
-- Table structure for table `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(101),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `experiencias`
--

CREATE TABLE `experiencias` (
  `id` int(11) NOT NULL,
  `actual` bit(1) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `periodo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencias`
--

INSERT INTO `experiencias` (`id`, `actual`, `descripcion`, `fecha_fin`, `fecha_inicio`, `id_persona`, `logo`, `nombre`, `periodo`) VALUES
(1, b'1', 'Desarrollador Fullstack', NULL, '2022-12-12', 52, '../../../assets/FlowingCodeLogo.svg', 'Flowing Code', 'Diciembre 2022 - Actualidad');

-- --------------------------------------------------------

--
-- Table structure for table `experiencias_seq`
--

CREATE TABLE `experiencias_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencias_seq`
--

INSERT INTO `experiencias_seq` (`next_val`) VALUES
(51),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `personas`
--

CREATE TABLE `personas` (
  `id` int(11) NOT NULL,
  `acerca_de` varchar(800) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `foto_perfil` varchar(255) DEFAULT NULL,
  `foto_portada` varchar(255) DEFAULT NULL,
  `link_github` varchar(255) DEFAULT NULL,
  `link_instagram` varchar(255) DEFAULT NULL,
  `link_linked_in` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `situacion_actual` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personas`
--

INSERT INTO `personas` (`id`, `acerca_de`, `email`, `foto_perfil`, `foto_portada`, `link_github`, `link_instagram`, `link_linked_in`, `nombre`, `situacion_actual`, `telefono`, `ubicacion`) VALUES
(52, 'Soy un estudiante de ingeniería en sistemas apasionado por el mundo de la tecnología y el desarrollo de software. Actualmente me desempeño como desarrollador Full Stack utilizando Java como lenguaje principal, lo que me ha permitido adquirir habilidades en el desarrollo de aplicaciones web y móviles, así como en la gestión de bases de datos y la implementación de soluciones escalables.\nMe considero una persona curiosa y comprometida con mi trabajo, siempre en busca de aprender y mejorar mis habilidades técnicas. valoro mucho el trabajo en equipo y la comunicación efectiva como pilares fundamentales para alcanzar los objetivos propuestos.', 'valenreynoso17@gmail.com', '../../../assets/IMG-20221026-WA0063.jpg', '../../../assets/programacion-java-2789481.webp', 'https://github.com/Valenreynoso17', 'https://www.instagram.com/valenreynoso17/', 'https://www.linkedin.com/in/valentin-reynoso-6526211b8/', 'Valentín Reynoso', 'Desarrollador en Flowing Code', '543435209560', 'Paraná, Entre Ríos, Argentina');

-- --------------------------------------------------------

--
-- Table structure for table `personas_seq`
--

CREATE TABLE `personas_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personas_seq`
--

INSERT INTO `personas_seq` (`next_val`) VALUES
(151),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(400) DEFAULT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id`, `descripcion`, `id_persona`, `link`, `nombre`) VALUES
(1, 'Desarrollada como trabajo práctico de la materia \"Desarrollo de aplicaciones móviles\". Permite buscar y reservar alojamientos turísticos temporales en diferentes ciudades. Se programó en Android usando las últimas tecnologías y patrones disponibles.', 52, 'https://github.com/FedericoQuarin/LabDam2022', 'AirBooking Mobile App'),
(2, 'En el 2021 realicé el curso de \"Desarrollo de Videojuegos – Nivel 1\" dictador por la Universidad Tecnológica Nacional, Regional Resistencia. Se llevaron a cabo tareas de diseño de videojuegos, modelado y desarrollo de objetos en 3D, animaciones y físicas. Blender, Unity y C# fueron utilizadas como principales herramientas.', 52, 'https://drive.google.com/drive/folders/1NNo4iHoNQfikl9_WGMK_-egh10FKXQ01?usp=sharing', 'Videojuego \"Agente 44\"'),
(3, 'A principios del 2023 tuve la oportunidad de realizar el \"Argentina Programa - #YoProgramo\".', 52, 'https://portafoliofrontend-debf3.web.app/', 'Portafolio Personal');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos_seq`
--

CREATE TABLE `proyectos_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos_seq`
--

INSERT INTO `proyectos_seq` (`next_val`) VALUES
(101),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id`, `email`, `password`) VALUES
(1, 'email@email.com', '$argon2d$v=19$m=1024,t=1,p=1$a9HabgzEguqmofwv4kk6cg$G7iuwR7zKk9Bc6fCWwmVZEy57I6wGBhTvcpYxKfPhTg');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios_seq`
--

CREATE TABLE `usuarios_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios_seq`
--

INSERT INTO `usuarios_seq` (`next_val`) VALUES
(51),
(1),
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `conocimientos`
--
ALTER TABLE `conocimientos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK12wm47gq8mqi1negqd5gcfpy7` (`id_persona`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi8xegjxjomldkv2ea4w6yb2md` (`id_persona`);

--
-- Indexes for table `experiencias`
--
ALTER TABLE `experiencias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs20g4ml1vubkj7j66baiiwfo4` (`id_persona`);

--
-- Indexes for table `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrvply3kkwwscqqrw41bc9b0kg` (`id_persona`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_kfsp0s1tflm1cwlj8idhqsad0` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `conocimientos`
--
ALTER TABLE `conocimientos`
  ADD CONSTRAINT `FK12wm47gq8mqi1negqd5gcfpy7` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`);

--
-- Constraints for table `educacion`
--
ALTER TABLE `educacion`
  ADD CONSTRAINT `FKi8xegjxjomldkv2ea4w6yb2md` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`);

--
-- Constraints for table `experiencias`
--
ALTER TABLE `experiencias`
  ADD CONSTRAINT `FKs20g4ml1vubkj7j66baiiwfo4` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`);

--
-- Constraints for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD CONSTRAINT `FKrvply3kkwwscqqrw41bc9b0kg` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
