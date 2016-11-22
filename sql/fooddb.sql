-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 14. Nov 2016 um 16:46
-- Server-Version: 10.1.10-MariaDB
-- PHP-Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `fooddb`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tb_gericht`
--

CREATE TABLE `tb_gericht` (
  `gerichtid` int(10) NOT NULL,
  `gerichtname` varchar(80) NOT NULL,
  `dauermm` int(2) NOT NULL,
  `dauerhh` int(2) NOT NULL,
  `image` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `tb_gericht`
--

INSERT INTO `tb_gericht` (`gerichtid`, `gerichtname`, `dauermm`, `dauerhh`, `image`) VALUES
(3, 'Pizza', 19, 20, NULL);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `tb_gericht`
--
ALTER TABLE `tb_gericht`
  ADD PRIMARY KEY (`gerichtid`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `tb_gericht`
--
ALTER TABLE `tb_gericht`
  MODIFY `gerichtid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
