DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_gender` varchar(255) DEFAULT NULL,
  `patient_email` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`);
  
  
  INSERT INTO `patient` (`patient_id`, `patient_gender`, `patient_email`, `patient_name`) VALUES
(2, 'Female', 'veena@gmail.com', 'Veena'),
(3, 'Male', 'quest@gmail.com', 'quest');

select * from patient;