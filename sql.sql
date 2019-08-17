create database gehealthdb;

use gehealthdb;

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_gender` varchar(255) DEFAULT NULL,
  `patient_email` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `patient_dob` date DEFAULT null,
  PRIMARY KEY (`patient_id`));

 INSERT INTO `patient` (`patient_id`, `patient_gender`, `patient_email`, `patient_name`,`patient_dob`) VALUES
(1, 'Female', 'veena@gmail.com', 'Veena','2019-01-01'),
(2, 'Female', 'dolly@gmail.com', 'Dolly','1991-01-23'),
(3, 'Male', 'sonoo@gmail.com', 'sonoo','1981-12-25'),
(2, 'Male', 'quest@gmail.com', 'quest','2001-09-09');

select * from patient;

