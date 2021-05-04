-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: assignment1sd
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `covidtest`
--

DROP TABLE IF EXISTS `covidtest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `covidtest` (
  `idCovidTests` int NOT NULL AUTO_INCREMENT,
  `fighterFirstName` varchar(45) NOT NULL,
  `fighterLastName` varchar(45) NOT NULL,
  `arrivalTest` varchar(45) NOT NULL,
  `arrivalTestDate` varchar(45) NOT NULL,
  `secondTest` varchar(45) DEFAULT NULL,
  `secondTestDate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCovidTests`),
  UNIQUE KEY `idcovidTests_UNIQUE` (`idCovidTests`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `covidtest`
--

LOCK TABLES `covidtest` WRITE;
/*!40000 ALTER TABLE `covidtest` DISABLE KEYS */;
INSERT INTO `covidtest` VALUES (21,'Ronan','Miki','Negative','2021-03-09',NULL,NULL),(22,'Connor','Kil','Negative','2021-03-13',NULL,NULL),(23,'Ramon','Urs','Negative','2021-03-11',NULL,NULL),(24,'Ray','Jones','Negative','2021-03-13',NULL,NULL),(25,'Ronan','Jon','Negative','2021-03-12',NULL,NULL),(26,'Roy','Jones','Negative','2021-03-10',NULL,NULL),(27,'Gligor','Hash','Negative','2021-03-16',NULL,NULL),(28,'Kol','Mikael','Negative','2021-03-16',NULL,NULL),(29,'Ron','Mcguire','Negative','2021-03-16',NULL,NULL),(31,'Mark','Paul','Negative','2021-03-16',NULL,NULL),(32,'Kelvin','Thor','Negative','2021-03-16',NULL,NULL),(34,'Mihai','Kux','Negative','2021-03-10',NULL,NULL);
/*!40000 ALTER TABLE `covidtest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-28 15:17:47
