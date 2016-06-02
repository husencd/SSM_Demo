DROP DATABASE IF EXISTS `ssmdemo`;
CREATE DATABASE ssmdemo;
use ssmdemo;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `user` VALUES (1, 'root', 'root');
INSERT INTO `user` VALUES (2,'shihusen', 'shihusen');