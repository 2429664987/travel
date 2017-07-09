/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50527
Source Host           : 127.0.0.1:3306
Source Database       : traveling

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-05-14 12:32:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `banner`
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imgsrc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES ('1', 'http://192.168.43.246:8080/travel/imgs/banners/banner1.jpg');
INSERT INTO `banner` VALUES ('2', 'http://192.168.43.246:8080/travel/imgs/banners/banner2.jpg');
INSERT INTO `banner` VALUES ('3', 'http://192.168.43.246:8080/travel/imgs/banners/banner3.jpg');
INSERT INTO `banner` VALUES ('4', 'http://192.168.43.246:8080/travel/imgs/banners/banner4.jpg');

-- ----------------------------
-- Table structure for `txintroduction`
-- ----------------------------
DROP TABLE IF EXISTS `txintroduction`;
CREATE TABLE `txintroduction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `txsrc` varchar(225) DEFAULT NULL,
  `content` varchar(225) DEFAULT NULL,
  `theme` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of txintroduction
-- ----------------------------
INSERT INTO `txintroduction` VALUES ('1', 'http://192.168.43.246:8080/travel/imgs/mapt.png', '邯郸龙湖公园', '龙湖');
INSERT INTO `txintroduction` VALUES ('2', 'http://192.168.43.246:8080/travel/imgs/ktv.png', '滏阳公园', '滏阳');
