-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: grp
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `grp_article_board`
--

DROP TABLE IF EXISTS `grp_article_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_article_board` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `division` char(1) DEFAULT NULL,
  `subject` varchar(255) NOT NULL,
  `writer` varchar(20) NOT NULL,
  `content` text,
  `regdate` datetime DEFAULT NULL,
  `hit` int DEFAULT '0',
  `fileName` varchar(300) DEFAULT NULL,
  `fileOriName` varchar(300) DEFAULT NULL,
  `fileUrl` varchar(300) DEFAULT NULL,
  `ref` int DEFAULT NULL,
  `re_step` int DEFAULT NULL,
  `re_level` int DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_article_board`
--

LOCK TABLES `grp_article_board` WRITE;
/*!40000 ALTER TABLE `grp_article_board` DISABLE KEYS */;
INSERT INTO `grp_article_board` VALUES (1,'Y','1111','2222','<p>3333</p>\r\n','2020-11-06 10:59:02',2,'QLtV6TxjJkWTSiwfFxbtFIO12xLDs8WA.pdf','ahjobsupport03_001.pdf','C://upload//article//',1,0,0),(2,'Y','adfadsf','dsaf','<p>assdfadsf</p>\r\n','2020-11-06 11:01:14',1,NULL,NULL,NULL,2,0,0),(3,'N','adfadf','adf','<p>adfsasdfasdf</p>\r\n','2020-11-06 11:02:43',1,NULL,NULL,NULL,3,0,0),(4,'N','adsfadsf','관리자','<p>asdfsafsf</p>\r\n','2020-11-06 11:50:59',0,NULL,NULL,NULL,4,0,0),(5,'N','adsfadsfasdf','관리자','<p>sadfadsfadsfasdf</p>\r\n','2020-11-06 12:08:16',1,'DBAP89ThBNHhlfpO4yGV1rXYjPuvAJmm.jpg','20201012_135133.jpg','C://upload//article//',5,0,0),(6,'N','8888888888888888888888','관리자','<p>8888888888888888</p>\r\n','2020-11-06 12:08:28',0,NULL,NULL,NULL,6,0,0),(7,'N','adsf','관리자','<p>adsfadsf</p>\r\n','2020-11-06 12:11:14',0,NULL,NULL,NULL,7,0,0),(8,'N','sadf','관리자','<p>asdfsadf</p>\r\n','2020-11-06 12:11:17',0,NULL,NULL,NULL,8,0,0),(9,'N','sadfsf','관리자','<p>adsfadfs</p>\r\n','2020-11-06 12:11:20',0,NULL,NULL,NULL,9,0,0),(10,'N','adsf','관리자','<p>asdfasfsaf</p>\r\n','2020-11-06 12:11:25',0,NULL,NULL,NULL,10,0,0),(11,'N','trt','관리자','<p>rtrtrt</p>\r\n','2020-11-06 12:11:28',0,NULL,NULL,NULL,11,0,0),(12,'N','asdf','관리자','<p>asdfadsf</p>\r\n','2020-11-06 12:13:24',0,NULL,NULL,NULL,12,0,0),(13,'N','asdf','관리자','<p>sadf</p>\r\n','2020-11-06 12:13:28',0,NULL,NULL,NULL,13,0,0),(14,'N','ert','관리자','<p>rtrtr</p>\r\n','2020-11-06 12:13:30',0,NULL,NULL,NULL,14,0,0),(15,'N','ewtr','관리자','<p>etert</p>\r\n','2020-11-06 12:13:34',0,NULL,NULL,NULL,15,0,0),(16,'N','ert','관리자','<p>ert</p>\r\n','2020-11-06 12:13:38',0,NULL,NULL,NULL,16,0,0),(17,'N','888','관리자','<p>888</p>\r\n','2020-11-06 12:13:42',0,NULL,NULL,NULL,17,0,0),(18,'N','99','관리자','<p>999</p>\r\n','2020-11-06 12:13:45',0,NULL,NULL,NULL,18,0,0),(19,'N','000','관리자','<p>00</p>\r\n','2020-11-06 12:13:48',0,NULL,NULL,NULL,19,0,0),(20,'N','6666','관리자','<p>6666</p>\r\n','2020-11-06 12:13:56',0,NULL,NULL,NULL,20,0,0),(21,'N','dfg','관리자','<p>sdfgsfgdfsg</p>\r\n','2020-11-06 12:14:00',73,NULL,NULL,NULL,21,0,0),(22,'N','영업부 답변형 게시판','관리자','<p>영업부 답변형 게시판</p>\r\n','2020-11-06 14:29:36',62,'Y65TzpVoIM8dNdBWPf0VAM1XpX4eNWth.jpg','20201012_135133.jpg','C://upload//article//',22,0,0),(23,'N','ㅁㄴㅇㄻ','관리자','<p>ㅇㄻㄴㅇㄻㄴㅇㄹ</p>\r\n','2020-11-06 14:44:28',2,'kOgmIOY5Tr6NW3XVjltIqdGT73RjVtfQ.pdf','ahjobsupport03_001.pdf','C://upload//article//',23,0,0),(24,'Y','ㅁㅇㄴㄹ','관리자','<p>ㅁㄴㅇㄻㅇㄴㄻㅇㄹㄴ</p>\r\n','2020-11-06 14:58:54',1,'oWRnKRFvf5coIHRwJ4JpSLMUDuESXHlB.jpg','20201012_135126.jpg','C://upload//article//',24,0,0),(25,'N','ㄴㅁㅇㄹ','관리자','<p>ㅁㄴㅇㄻㅇㄹㄴㅁ</p>\r\n','2020-11-06 15:14:53',0,'YwDLR1E9uIs0QlJFD7N4yKWhoa3kkX7l.hwp','2020년 기사 제3, 4ȸ 시행계획 변경 및 수시검정 시행 공고문.hwp','C://upload//article//',25,0,0),(26,'N','ㅁㄴㅇㄹ','관리자','<p>ㅁㅇㄴㄻㄴㅇㄹ</p>\r\n','2020-11-06 15:15:30',5,'AIk38GKfWIMpzFCyB3vWQTGIqqYbYnAS.xlsx','함수시험 문제 (1).xlsx','C://upload//article//',26,0,0),(27,'N','[답글] 영업부 답변형 게시판','관리자','<p>adsfffffffffffffffffasdfadsf</p>\r\n','2020-11-06 17:05:08',0,'yeCivEtU6JNFccEkU2TitIV6WBbBKNCo.jpg','20201012_135133.jpg','C://upload//article//',0,1,1),(28,'N','[답글] ㅁㄴㅇㄹ','관리자','<p>asdfadsf</p>\r\n','2020-11-06 17:12:14',0,NULL,NULL,NULL,0,1,1),(29,'N','[답글] ㅁㄴㅇㄹasdfasdfsdf','관리자','<p>adsfadsf</p>\r\n','2020-11-06 17:17:59',2,NULL,NULL,NULL,26,1,1),(30,'N','[답글] [답글] ㅁㄴㅇㄹasdfasdfsdf','관리자','<p>asdfasdfsdf</p>\r\n','2020-11-06 17:18:09',0,NULL,NULL,NULL,26,2,2);
/*!40000 ALTER TABLE `grp_article_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_article_notice`
--

DROP TABLE IF EXISTS `grp_article_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_article_notice` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `division` char(1) DEFAULT NULL,
  `subject` varchar(255) NOT NULL,
  `writer` varchar(20) NOT NULL,
  `content` text,
  `regdate` datetime DEFAULT NULL,
  `hit` int DEFAULT '0',
  `fileName` varchar(300) DEFAULT NULL,
  `fileOriName` varchar(300) DEFAULT NULL,
  `fileUrl` varchar(300) DEFAULT NULL,
  `ref` int DEFAULT NULL,
  `re_step` int DEFAULT NULL,
  `re_level` int DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_article_notice`
--

LOCK TABLES `grp_article_notice` WRITE;
/*!40000 ALTER TABLE `grp_article_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `grp_article_notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_board`
--

DROP TABLE IF EXISTS `grp_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_board` (
  `bid` int NOT NULL AUTO_INCREMENT,
  `boardGrp` varchar(5) DEFAULT NULL,
  `boardCode` varchar(20) NOT NULL,
  `boardColor` varchar(20) DEFAULT NULL,
  `boardMaker` varchar(20) DEFAULT NULL,
  `boardTitle` varchar(255) NOT NULL,
  `boardType` char(1) DEFAULT NULL,
  `boardRead` char(1) DEFAULT NULL,
  `boardWrite` char(1) DEFAULT NULL,
  `boardReply` char(1) DEFAULT NULL,
  `boardDownload` char(1) DEFAULT NULL,
  `boardRegdate` date DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_board`
--

LOCK TABLES `grp_board` WRITE;
/*!40000 ALTER TABLE `grp_board` DISABLE KEYS */;
INSERT INTO `grp_board` VALUES (50,'400','board','#FE5E71','관리자','영업부 답변형 게시판','1','0','0','0','0','2020-11-06'),(51,'500','notice','#6F809A','관리자','aaaa','1','0','0','0','0','2020-11-06');
/*!40000 ALTER TABLE `grp_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_buseo`
--

DROP TABLE IF EXISTS `grp_buseo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_buseo` (
  `buseo_id` varchar(5) NOT NULL,
  `buseo_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_buseo`
--

LOCK TABLES `grp_buseo` WRITE;
/*!40000 ALTER TABLE `grp_buseo` DISABLE KEYS */;
INSERT INTO `grp_buseo` VALUES ('100','관리부'),('200','기획부'),('300','인사부'),('400','영업부'),('500','생산부'),('600','자재부');
/*!40000 ALTER TABLE `grp_buseo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_comment_board`
--

DROP TABLE IF EXISTS `grp_comment_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_comment_board` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `aid` int NOT NULL,
  `comment` text,
  `who` varchar(20) DEFAULT NULL,
  `regdate` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_comment_board`
--

LOCK TABLES `grp_comment_board` WRITE;
/*!40000 ALTER TABLE `grp_comment_board` DISABLE KEYS */;
/*!40000 ALTER TABLE `grp_comment_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_comment_notice`
--

DROP TABLE IF EXISTS `grp_comment_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_comment_notice` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `aid` int NOT NULL,
  `comment` text,
  `who` varchar(20) DEFAULT NULL,
  `regdate` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_comment_notice`
--

LOCK TABLES `grp_comment_notice` WRITE;
/*!40000 ALTER TABLE `grp_comment_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `grp_comment_notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_company`
--

DROP TABLE IF EXISTS `grp_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_company` (
  `com_name` varchar(100) NOT NULL,
  `com_sub_name` varchar(100) NOT NULL,
  `com_ceo` varchar(10) NOT NULL,
  `com_tel` varchar(15) NOT NULL,
  `com_url` varchar(50) NOT NULL,
  `com_copy` varchar(200) NOT NULL,
  `com_auth` int DEFAULT '2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_company`
--

LOCK TABLES `grp_company` WRITE;
/*!40000 ALTER TABLE `grp_company` DISABLE KEYS */;
INSERT INTO `grp_company` VALUES ('GREEN ACADEMY','Enterprise Groupware System','김그린','051-0000-0000','busan.greenart.co.kr','greenart alright reserved',2);
/*!40000 ALTER TABLE `grp_company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_employee`
--

DROP TABLE IF EXISTS `grp_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_employee` (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `emp_buseo` varchar(10) NOT NULL,
  `emp_grade` varchar(20) NOT NULL,
  `emp_num` varchar(20) NOT NULL,
  `emp_enter` date DEFAULT NULL,
  `emp_name` varchar(10) NOT NULL,
  `emp_pwd` varchar(12) NOT NULL,
  `emp_regdate` date DEFAULT NULL,
  `emp_head` char(1) DEFAULT 'N',
  `emp_step` int DEFAULT '1',
  `emp_auth` int DEFAULT '1',
  `emp_confirm` char(1) DEFAULT 'N',
  `emp_photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_employee`
--

LOCK TABLES `grp_employee` WRITE;
/*!40000 ALTER TABLE `grp_employee` DISABLE KEYS */;
INSERT INTO `grp_employee` VALUES (6,'','','admin',NULL,'관리자','1234',NULL,'N',1,10,'Y',NULL),(26,'100','6','202010067','2020-11-03','김부장','1234','2020-11-02','N',1,1,'N',NULL),(27,'400','4','2020400427','2020-11-04','박과장','222','2020-11-02','N',1,1,'N',NULL);
/*!40000 ALTER TABLE `grp_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_employee_others`
--

DROP TABLE IF EXISTS `grp_employee_others`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_employee_others` (
  `emp_oid` int NOT NULL AUTO_INCREMENT,
  `emp_gender` char(1) DEFAULT NULL,
  `emp_birth` char(10) DEFAULT NULL,
  `emp_cp` char(14) DEFAULT NULL,
  `emp_in` char(14) DEFAULT NULL,
  `emp_tel` char(14) DEFAULT NULL,
  `emp_recruit` char(10) DEFAULT NULL,
  `emp_hope` varchar(30) DEFAULT NULL,
  `emp_height` char(3) DEFAULT NULL,
  `emp_weight` char(3) DEFAULT NULL,
  `emp_service` char(5) DEFAULT NULL,
  `emp_religion` char(10) DEFAULT NULL,
  `emp_hobby` varchar(20) DEFAULT NULL,
  `emp_speciality` varchar(20) DEFAULT NULL,
  `emp_disability` char(3) DEFAULT NULL,
  `emp_reward` char(3) DEFAULT NULL,
  `emp_married` char(2) DEFAULT NULL,
  `emp_license1` varchar(20) DEFAULT NULL,
  `emp_license2` varchar(20) DEFAULT NULL,
  `emp_license3` varchar(20) DEFAULT NULL,
  `emp_license4` varchar(20) DEFAULT NULL,
  `emp_license5` varchar(20) DEFAULT NULL,
  `emp_lang1` varchar(20) DEFAULT NULL,
  `emp_lang2` varchar(20) DEFAULT NULL,
  `emp_lang3` varchar(20) DEFAULT NULL,
  `emp_lang4` varchar(20) DEFAULT NULL,
  `emp_lang5` varchar(20) DEFAULT NULL,
  `emp_rnp1` varchar(20) DEFAULT NULL,
  `emp_rnp2` varchar(20) DEFAULT NULL,
  `emp_rnp3` varchar(20) DEFAULT NULL,
  `emp_rnp4` varchar(20) DEFAULT NULL,
  `emp_rnp5` varchar(20) DEFAULT NULL,
  `emp_comment` text,
  `emp_id_fk` int DEFAULT NULL,
  PRIMARY KEY (`emp_oid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_employee_others`
--

LOCK TABLES `grp_employee_others` WRITE;
/*!40000 ALTER TABLE `grp_employee_others` DISABLE KEYS */;
INSERT INTO `grp_employee_others` VALUES (3,'남','','','','','공개채용','','','','병역필','무교','','','비장애','비대상','미혼','','','','','','','','','','','','','','','','',0),(4,'남','','','','','공개채용','','','','병역필','무교','','','비장애','비대상','미혼','','','','','','','','','','','','','','','','',0),(5,'남','','','','','공개채용','','','','병역필','무교','','','비장애','비대상','미혼','','','','','','','','','','','','','','','','',0),(6,'남','','','','','공개채용','','','','병역필','무교','','','비장애','비대상','미혼','','','','','','','','','','','','','','','','',25),(7,'남','','','','','공개채용','','','','병역필','무교','','','비장애','비대상','미혼','','','','','','','','','','','','','','','','',25);
/*!40000 ALTER TABLE `grp_employee_others` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grp_grade`
--

DROP TABLE IF EXISTS `grp_grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grp_grade` (
  `grade_id` varchar(2) NOT NULL,
  `grade_name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grp_grade`
--

LOCK TABLES `grp_grade` WRITE;
/*!40000 ALTER TABLE `grp_grade` DISABLE KEYS */;
INSERT INTO `grp_grade` VALUES ('6','부장'),('5','팀장'),('4','과장'),('3','대리'),('2','주임'),('1','사원');
/*!40000 ALTER TABLE `grp_grade` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-14 12:39:59
