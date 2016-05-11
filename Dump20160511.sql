-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: directory
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `categoryId` int(11) NOT NULL,
  `categoryName` varchar(45) DEFAULT NULL,
  `categoryDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (101,'Web Programming','J2EE trainings'),(102,'Database','Oracle, mySQL trainings'),(103,'Management','Program management trainings'),(104,'Apigee','Apigee is the provider of API technology'),(105,'Splunk','Splunk Trainings');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `managerId` varchar(45) DEFAULT NULL,
  `officePhone` varchar(45) DEFAULT NULL,
  `cellPhone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Picture` varchar(45) DEFAULT NULL,
  `new_tablecol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Barack','Obama','President','Washington, DC','White House',NULL,'202-000-0000','202-111-1111','barack.obama@notmyrealmail.com',NULL,NULL),(2,'Joe','Biden','Vice President','Washington, DC','White House',NULL,'202-000-0000','202-111-1111','joe.biden@notmyrealmail.com',NULL,NULL),(3,'Hillary','Clinton','Secretary of State','Washington, DC','State Department',NULL,'202-000-0000','202-111-1111','hillary.clinton@notmyrealmail.com',NULL,NULL),(4,'Timothy','Geithner','Secretary of the Treasury','Washington, DC','Treasury Department',NULL,'202-000-0000','202-111-1111','tim.geithner@notmyrealmail.com',NULL,NULL),(5,'Robert','Gates','Secretary of Defense','Washington, DC','Defense Department',NULL,'202-000-0000','202-111-1111','robert.gates@notmyrealmail.com',NULL,NULL),(6,'Eric','Holder','Attorney General','Washington, DC','Justice Department',NULL,'202-000-0000','202-111-1111','eric.holder@notmyrealmail.com',NULL,NULL),(7,'Kenneth','Salazar','Interior Department','Washington, DC','Department of the Interior',NULL,'202-000-0000','202-111-1111','ken.salazar@notmyrealmail.com',NULL,NULL),(8,'Thomas','Vilsack','Agriculture Department','Washington, DC','Department of Agriculture',NULL,'202-000-0000','202-111-1111','tom.vilsack@notmyrealmail.com',NULL,NULL),(9,'Gary','Locke','Commerce Department','Washington, DC','Department of Commerce',NULL,'202-000-0000','202-111-1111','gary.locke@notmyrealmail.com',NULL,NULL),(10,'Hilda','Solis','Secretary of Labor','Washington, DC','Department of Labor',NULL,'202-000-0000','202-111-1111','hilda.solis@notmyrealmail.com',NULL,NULL),(11,'Kathleen','Sebelius','Secretary of Health','Washington, DC','Health Department',NULL,'202-000-0000','202-111-1111','kathleen_sebelius@notmyrealmail.com',NULL,NULL),(12,'Shaun','Donovan','Secretary of Housing','Washington, DC','Housing Department',NULL,'202-000-0000','202-111-1111','shaun_donovan@notmyrealmail.com',NULL,NULL),(13,'Ray','LaHood','Secretary of Transportation','Washington, DC','Transportation Department',NULL,'202-000-0000','202-111-1111','ray_lahood@notmyrealmail.com',NULL,NULL),(14,'Steven','Chu','Secretary of Energy','Washington, DC','Energy Department',NULL,'202-000-0000','202-111-1111','steven_chu@notmyrealmail.com',NULL,NULL),(15,'Arne','Duncan','Secretary of Education','Washington, DC','Education Department',NULL,'202-000-0000','202-111-1111','arne_duncan@notmyrealmail.com',NULL,NULL),(16,'Eric','Shinseki','Secretary of Veterans Affairs','Washington, DC','Veterans Affairs Department',NULL,'202-000-0000','202-111-1111','eric_shinseki@notmyrealmail.com',NULL,NULL),(17,'Janet','Napolitano','Secretary of Homeland Security','Washington, DC','Homeland Security Department',NULL,'202-000-0000','202-111-1111','janet_napolitano@notmyrealmail.com',NULL,NULL),(18,'Gordon','England','Dep. Secretary of Defense','Washington, DC','Defense Department',NULL,'202-000-0000','202-111-1111','gordon.england@notmyrealmail.com',NULL,NULL),(19,'William','Lynn','Dep. Secretary of Defense','Washington, DC','Defense Department',NULL,'202-000-0000','202-111-1111','william.lynn@notmyrealmail.com',NULL,NULL),(20,'Jim','Steinberg','Dep. Secretary of State','Washington, DC','State Department',NULL,'202-000-0000','202-111-1111','jim.steinberg@notmyrealmail.com',NULL,NULL),(21,'Jacob','Lew','Dep. Secretary of State','Washington, DC','State Department',NULL,'202-000-0000','202-111-1111','jacob.lew@notmyrealmail.com',NULL,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registeruser`
--

DROP TABLE IF EXISTS `registeruser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registeruser` (
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `careerlevel` int(11) DEFAULT NULL,
  `supname` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registeruser`
--

LOCK TABLES `registeruser` WRITE;
/*!40000 ALTER TABLE `registeruser` DISABLE KEYS */;
/*!40000 ALTER TABLE `registeruser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `roleid` int(11) NOT NULL,
  `roleName` varchar(45) DEFAULT NULL,
  `roleDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'admin','admin'),(2,'user','user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `training_status`
--

DROP TABLE IF EXISTS `training_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training_status` (
  `userId` int(11) NOT NULL,
  `trainingId` varchar(45) NOT NULL,
  `Status` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`,`trainingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_status`
--

LOCK TABLES `training_status` WRITE;
/*!40000 ALTER TABLE `training_status` DISABLE KEYS */;
INSERT INTO `training_status` VALUES (1111,'205',0),(1111,'207',0),(1111,'208',0),(1111,'209',0),(1111,'210',1),(1111,'211',1),(1111,'212',1),(1111,'213',2),(1111,'214',0),(1111,'215',0),(1111,'216',0),(1111,'217',1),(1111,'218',1),(1112,'206',0),(1113,'202',0),(1114,'203',0);
/*!40000 ALTER TABLE `training_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trainings`
--

DROP TABLE IF EXISTS `trainings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainings` (
  `trainingId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  `trainingName` varchar(45) DEFAULT NULL,
  `trainingDesc` varchar(145) DEFAULT NULL,
  `active` int(11) DEFAULT NULL,
  PRIMARY KEY (`trainingId`,`categoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainings`
--

LOCK TABLES `trainings` WRITE;
/*!40000 ALTER TABLE `trainings` DISABLE KEYS */;
INSERT INTO `trainings` VALUES (201,101,'An Introduction to Servlets','Understandng of Java servlets',1),(202,101,'An Introduction to JSPs','Understandng of JSP pages',1),(203,102,'Syabse database programming','Understandng of Sybase programming',1),(204,102,'An Introduction to Oracle 11g','Understandng of Oracle 11g',1),(205,103,'An Introduction to Agile','Understandng of Agile',1),(206,103,'An Introduction to Scrum','Understanding of Scrum',1),(207,104,'Fundamentals of RESTful API Design','Fundamentals of RESTful API Design',1),(208,104,'Foundation Training on Apigee','Foundation Training on Apigee',1),(209,104,'Intro to Apigee BaaS','Intro to Apigee BaaS',1),(210,104,'Masups on Apigee','Masups on Apigee',1),(211,104,'Caching in Apigee','Caching in Apigee',1),(212,104,'Building service call outs','Building service call outs',1),(213,105,'splunk Tutorial','splunk Tutorial',1),(214,105,'Using Splunk','Using Splunk (eLearning) ',1),(215,105,'Searching and Reporting with Splunk','Searching and Reporting with Splunk ',1),(216,105,'Searching and Reporting with Splunk ','Searching and Reporting with Splunk (eLearning)',1),(217,105,'Splunk Infrastructure Overview','Splunk Infrastructure Overview ',1),(218,105,'Advanced Dashboards and Visualizations ','Advanced Dashboards and Visualizations',1);
/*!40000 ALTER TABLE `trainings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `enterpriseId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1111,'Vikas','Jain','vikas.h.jain','Password1',1,'vikas.h.jain'),(1112,'Vijit','Kapoor','admin','Password1',2,'vijit.a.kapoor'),(1113,'Kunal','Aggarwal','kunal.a.aggarwal','Password1',1,'kunal.a.aggarwal'),(1114,'Karan','Arora','k.c.arora','Password1',1,'k.c.arora');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-11 12:34:28
