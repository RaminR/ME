-- ---------------------------------
-- База данных и таблицы для проекта
-- ---------------------------------
-- ---------------------------------
-- ---------------------------------
-- DATABASE ministry_education
-- ---------------------------------
CREATE DATABASE `ministry_education` /*!40100 DEFAULT CHARACTER SET utf8 */;

-- --------------------------------
-- Table institution_type
-- --------------------------------
CREATE TABLE `institution_type` (
  `id_institution_type` bigint(11) NOT NULL AUTO_INCREMENT,
  `name_institution_type` varchar(45) NOT NULL,
  `description_institution_type` varchar(120) NOT NULL,
  PRIMARY KEY (`id_institution_type`),
  UNIQUE KEY `id_institution_type_UNIQUE` (`id_institution_type`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- --------------------------------
-- Table institution
-- --------------------------------
CREATE TABLE `institution` (
  `id_institution` bigint(11) NOT NULL AUTO_INCREMENT,
  `name_institution` varchar(45) NOT NULL,
  `institution_type_id` bigint(11) NOT NULL,
  PRIMARY KEY (`id_institution`),
  UNIQUE KEY `id_institution_UNIQUE` (`id_institution`),
  KEY `fk_institution_type_idx` (`institution_type_id`),
  CONSTRAINT `fk_institution_type` FOREIGN KEY (`institution_type_id`) REFERENCES `institution_type` (`id_institution_type`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

