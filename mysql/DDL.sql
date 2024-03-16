-- testdb.exploration_phases definition

CREATE TABLE `exploration_phases` (
  `id` int NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- testdb.exploration_property definition

CREATE TABLE `exploration_property` (
  `property_id` int NOT NULL,
  `property_question` varchar(255) DEFAULT NULL,
  `property_answer` varchar(255) DEFAULT NULL,
  `next_property_id` int DEFAULT NULL,
  `property_sub_question` varchar(255) DEFAULT NULL,
  `property_sub_answer_yes` varchar(255) DEFAULT NULL,
  `property_sub_answer_no` varchar(255) DEFAULT NULL,
  `next_context` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`property_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- testdb.phase definition

CREATE TABLE `phase` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phase_id` int DEFAULT NULL,
  `phase_title` varchar(255) DEFAULT NULL,
  `phase_type` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- testdb.sub_phases definition

CREATE TABLE `sub_phases` (
  `sub_phase_id` int NOT NULL,
  `sub_phase_name` varchar(255) DEFAULT NULL,
  `next_property_id` int DEFAULT NULL,
  `type` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`sub_phase_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- testdb.user_info definition

CREATE TABLE `user_info` (
  `userId` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- testdb.user_responses definition

CREATE TABLE `user_responses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `registration_date` date DEFAULT NULL,
  `last_answer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

