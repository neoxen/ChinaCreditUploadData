-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: db_credit_test
-- ------------------------------------------------------
-- Server version	5.7.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tab_penaly_wuhan_month`
--

DROP TABLE IF EXISTS `tab_penaly_wuhan_month`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_penaly_wuhan_month` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CF_WSH` varchar(256) DEFAULT NULL,
  `CF_CFMC` varchar(512) DEFAULT NULL,
  `CF_CFLB1` varchar(72) DEFAULT NULL,
  `CF_CFLB2` varchar(72) DEFAULT NULL,
  `CF_SY` varchar(4096) DEFAULT NULL,
  `CF_YJ` varchar(4096) DEFAULT NULL,
  `CF_XDR_MC` varchar(256) DEFAULT NULL,
  `CF_XDR_SHXYM` varchar(128) DEFAULT NULL,
  `CF_XDR_ZDM` varchar(128) DEFAULT NULL,
  `CF_XDR_GSDJ` varchar(128) DEFAULT NULL,
  `CF_XDR_SWDJ` varchar(128) DEFAULT NULL,
  `CF_XDR_SFZ` varchar(128) DEFAULT NULL,
  `CF_FR` varchar(512) DEFAULT NULL,
  `CF_JG` varchar(4096) DEFAULT NULL,
  `CF_JDRQ` date DEFAULT NULL,
  `CF_XZJG` varchar(128) DEFAULT NULL,
  `CF_ZT` varchar(2) DEFAULT NULL,
  `DFBM` varchar(12) DEFAULT NULL,
  `SJC` date DEFAULT NULL,
  `BZ` varchar(1024) DEFAULT NULL,
  `CF_AJMC` varchar(512) DEFAULT NULL,
  `CF_JZRQ` date DEFAULT NULL,
  `QT` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tab_permisson_wuhan_month`
--

DROP TABLE IF EXISTS `tab_permisson_wuhan_month`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_permisson_wuhan_month` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `XK_WSH` varchar(256) DEFAULT NULL,
  `XK_XMMC` varchar(512) DEFAULT NULL,
  `XK_SPLB` varchar(32) DEFAULT NULL,
  `XK_NR` varchar(4096) DEFAULT NULL,
  `XK_XDR` varchar(512) DEFAULT NULL,
  `XK_XDR_SHXYM` varchar(128) DEFAULT NULL,
  `XK_XDR_ZDM` varchar(128) DEFAULT NULL,
  `XK_XDR_GSDJ` varchar(128) DEFAULT NULL,
  `XK_XDR_SWDJ` varchar(128) DEFAULT NULL,
  `XK_XDR_SFZ` varchar(128) DEFAULT NULL,
  `XK_FR` varchar(512) DEFAULT NULL,
  `XK_JDRQ` date DEFAULT NULL,
  `XK_JZQ` date DEFAULT NULL,
  `XK_XZJG` varchar(128) DEFAULT NULL,
  `XK_ZT` varchar(32) DEFAULT NULL,
  `DFBM` varchar(12) DEFAULT NULL,
  `SJC` date DEFAULT NULL,
  `BZ` varchar(1024) DEFAULT NULL,
  `QTXX` varchar(1024) DEFAULT NULL,
  `SJMC` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-18  9:25:59
