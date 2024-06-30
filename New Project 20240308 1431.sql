-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema imagepassword1
--

CREATE DATABASE IF NOT EXISTS imagepassword1;
USE imagepassword1;

--
-- Definition of table `allcustomer`
--

DROP TABLE IF EXISTS `allcustomer`;
CREATE TABLE `allcustomer` (
  `Customerid` int(100) default NULL,
  `CustomerName` varchar(100) default NULL,
  `AccountNumber` varchar(100) default NULL,
  `DepositAmount` int(100) default NULL,
  `WithdrawAmount` int(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `allcustomer`
--

/*!40000 ALTER TABLE `allcustomer` DISABLE KEYS */;
INSERT INTO `allcustomer` (`Customerid`,`CustomerName`,`AccountNumber`,`DepositAmount`,`WithdrawAmount`) VALUES 
 (15,'prethusha','19241',500,100),
 (99,'ammua','34103',7600,500),
 (99,'ammua','34103',7600,500),
 (99,'ammua','34103',7600,500);
/*!40000 ALTER TABLE `allcustomer` ENABLE KEYS */;


--
-- Definition of table `atm`
--

DROP TABLE IF EXISTS `atm`;
CREATE TABLE `atm` (
  `Cid` int(50) default NULL,
  `name` varchar(100) default NULL,
  `phoneno` varchar(100) default NULL,
  `emailid` varchar(100) default NULL,
  `Accountno` int(100) default NULL,
  `Cardno` int(100) default NULL,
  `pinno` int(100) default NULL,
  `iamount` int(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `atm`
--

/*!40000 ALTER TABLE `atm` DISABLE KEYS */;
INSERT INTO `atm` (`Cid`,`name`,`phoneno`,`emailid`,`Accountno`,`Cardno`,`pinno`,`iamount`) VALUES 
 (15,'prethusha','7356756506','prethusha4u@gmail.com',19241,123456,7124,400),
 (14,'arun','7356756506','prethusha4u@gmail.com',19883,789456,209,3000),
 (99,'ammua','7356756506','prethusha4u@gmail.com',34103,789456123,9812,7600),
 (58,'asvp','9791334452','asvperumal@gmail.com',63331,1234567890,4570,5000);
/*!40000 ALTER TABLE `atm` ENABLE KEYS */;


--
-- Definition of table `deposit`
--

DROP TABLE IF EXISTS `deposit`;
CREATE TABLE `deposit` (
  `CutsomerId` int(100) default NULL,
  `CutsomerName` varchar(100) default NULL,
  `EmailId` varchar(100) default NULL,
  `AccountNumber` int(100) default NULL,
  `CardNumber` int(100) default NULL,
  `PinNumber` int(100) default NULL,
  `DepositAmount` int(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `deposit`
--

/*!40000 ALTER TABLE `deposit` DISABLE KEYS */;
INSERT INTO `deposit` (`CutsomerId`,`CutsomerName`,`EmailId`,`AccountNumber`,`CardNumber`,`PinNumber`,`DepositAmount`) VALUES 
 (99,'ammua','prethusha4u@gmail.com',34103,789456123,3387,9000),
 (99,'ammua','prethusha4u@gmail.com',34103,789456123,9812,7600);
/*!40000 ALTER TABLE `deposit` ENABLE KEYS */;


--
-- Definition of table `pass`
--

DROP TABLE IF EXISTS `pass`;
CREATE TABLE `pass` (
  `id` varchar(50) default NULL,
  `col0` varchar(50) default NULL,
  `col1` varchar(50) default NULL,
  `col2` varchar(50) default NULL,
  `col3` varchar(50) default NULL,
  `col4` varchar(50) default NULL,
  `col5` varchar(50) default NULL,
  `col6` varchar(50) default NULL,
  `col7` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pass`
--

/*!40000 ALTER TABLE `pass` DISABLE KEYS */;
INSERT INTO `pass` (`id`,`col0`,`col1`,`col2`,`col3`,`col4`,`col5`,`col6`,`col7`) VALUES 
 ('row0','5','0','5','6','2','1','7','3'),
 ('row1','6','4','6','0','4','6','4','7'),
 ('row2','6','5','4','2','6','3','7','1'),
 ('row3','5','0','2','0','4','7','6','3'),
 ('row4','4','1','4','4','3','0','5','3'),
 ('row5','3','5','3','1','1','1','3','5'),
 ('row6','3','4','5','4','6','3','5','0'),
 ('row7','2','7','6','4','1','4','1','4');
/*!40000 ALTER TABLE `pass` ENABLE KEYS */;


--
-- Definition of table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `id` int(100) default NULL,
  `username` varchar(100) default NULL,
  `password` varchar(100) default NULL,
  `confpass` varchar(100) default NULL,
  `scretque` varchar(100) default NULL,
  `answer` varchar(100) default NULL,
  `phoneno` varchar(100) default NULL,
  `mailid` varchar(100) default NULL,
  `image` varchar(100) default NULL,
  `imagepixelx` int(100) default NULL,
  `imagepixely` int(100) default NULL,
  `slidercount` varchar(100) default NULL,
  `pinnumber` varchar(100) default NULL,
  `grid` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` (`id`,`username`,`password`,`confpass`,`scretque`,`answer`,`phoneno`,`mailid`,`image`,`imagepixelx`,`imagepixely`,`slidercount`,`pinnumber`,`grid`) VALUES 
 (47,'prethu','prethu','prethu','What is your favorite color?','black','7356756506','prethusha4u@gmail.com','7',289,182,'350','1','25'),
 (70,'anu','anu','anu','What is your pet name?','dog','7356756506','prethusha4u@gmail.com','7',288,181,'150','49','PS'),
 (44,'ammu','ammu','ammu','What is your pet name?','pug','7356756506','prethusha4u@gmail.com','7',288,181,'150','282','EPJS'),
 (57,'prethyu','prethyu','prethyu','What is your favorite color?','black','7356756506','prethusha4u@gmail.com','7',288,181,'450','780','A2G'),
 (99,'ammua','ammu1','ammu1','What is your favorite color?','black','7356756506','prethusha4u@gmail.com','7',288,186,'350','9812','2P6'),
 (58,'asvp','asvp','asvp','What is your pet name?','asvp','9791334452','asvperumal@gmail.com','2',176,140,'501','4570','WZOA9'),
 (10,'hari','hari','hari','What is your pet name?','hari','9791334452','karpalagar@gmail.com','7',295,184,'400','628','4');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
