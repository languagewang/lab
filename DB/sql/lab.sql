/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50536
Source Host           : 127.0.0.1:3306
Source Database       : lab

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-11-08 20:46:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `username` varchar(255) COLLATE utf8_romanian_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_romanian_ci DEFAULT NULL,
  `id` varchar(255) COLLATE utf8_romanian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_romanian_ci;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('admin', 'admin', '1');
