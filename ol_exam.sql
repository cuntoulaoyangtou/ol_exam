/*
 Navicat Premium Data Transfer

 Source Server         : 本地连接
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : localhost:3306
 Source Schema         : ol_exam

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 20/02/2020 00:57:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for u_clazz
-- ----------------------------
DROP TABLE IF EXISTS `u_clazz`;
CREATE TABLE `u_clazz`  (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_priority` int(5) NULL DEFAULT 0,
  `g_id` int(11) NULL DEFAULT NULL,
  `m_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`c_id`) USING BTREE,
  INDEX `FK_CLAZZ_GID`(`g_id`) USING BTREE,
  INDEX `FK_CLAZZ_MID`(`m_id`) USING BTREE,
  CONSTRAINT `FK_CLAZZ_MID` FOREIGN KEY (`m_id`) REFERENCES `u_major` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_CLAZZ_GID` FOREIGN KEY (`g_id`) REFERENCES `u_grade` (`g_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_clazz
-- ----------------------------
INSERT INTO `u_clazz` VALUES (5, '开发2班', NULL, 2, NULL);

-- ----------------------------
-- Table structure for u_grade
-- ----------------------------
DROP TABLE IF EXISTS `u_grade`;
CREATE TABLE `u_grade`  (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `g_priority` int(5) UNSIGNED NULL DEFAULT 0,
  `s_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`g_id`) USING BTREE,
  INDEX `FK_GRADE_SID`(`s_id`) USING BTREE,
  CONSTRAINT `FK_GRADE_SID` FOREIGN KEY (`s_id`) REFERENCES `u_shool` (`s_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_grade
-- ----------------------------
INSERT INTO `u_grade` VALUES (2, '平顶山', NULL, NULL);
INSERT INTO `u_grade` VALUES (3, '2019级', NULL, 2);

-- ----------------------------
-- Table structure for u_major
-- ----------------------------
DROP TABLE IF EXISTS `u_major`;
CREATE TABLE `u_major`  (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `m_intro` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_priority` int(255) NULL DEFAULT NULL COMMENT '\'优先级\'',
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_major
-- ----------------------------
INSERT INTO `u_major` VALUES (1, '开发', '介绍', NULL);
INSERT INTO `u_major` VALUES (2, '网销', '介绍', NULL);

-- ----------------------------
-- Table structure for u_role
-- ----------------------------
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role`  (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `r_comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_role
-- ----------------------------
INSERT INTO `u_role` VALUES (1, '学员', 'student');
INSERT INTO `u_role` VALUES (2, '组长', 'groupLeader ');
INSERT INTO `u_role` VALUES (3, '副组长', 'osow');
INSERT INTO `u_role` VALUES (4, '学习委员', 'learningCommittee');
INSERT INTO `u_role` VALUES (5, '班主任', 'classTeacher');
INSERT INTO `u_role` VALUES (6, '讲师', 'lecturer');
INSERT INTO `u_role` VALUES (7, '主管', 'managers');

-- ----------------------------
-- Table structure for u_shool
-- ----------------------------
DROP TABLE IF EXISTS `u_shool`;
CREATE TABLE `u_shool`  (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_longitude` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'经度\'',
  `s_latitude` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'纬度\'',
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_shool
-- ----------------------------
INSERT INTO `u_shool` VALUES (2, '平顶山校区', '', '');
INSERT INTO `u_shool` VALUES (3, '平顶山', '', '');

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `real_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `avatar` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `integral` int(11) NULL DEFAULT 0,
  `c_id` int(11) NULL DEFAULT NULL,
  `r_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE,
  UNIQUE INDEX `UN_USER_PHONE`(`phone`) USING BTREE,
  UNIQUE INDEX `UN_USER_USERNAME`(`username`) USING BTREE,
  INDEX `FK_USER_CID`(`c_id`) USING BTREE,
  INDEX `FK_USER_RID`(`r_id`) USING BTREE,
  CONSTRAINT `FK_USER_CID` FOREIGN KEY (`c_id`) REFERENCES `u_clazz` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USER_RID` FOREIGN KEY (`r_id`) REFERENCES `u_role` (`r_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_user
-- ----------------------------
INSERT INTO `u_user` VALUES (1, '村头老杨头', '18567192712', '25d55ad283aa400af464c76d713c07ad', '杨盼', NULL, 0, 5, 1);
INSERT INTO `u_user` VALUES (5, '村头老', '18567878724', '25d55ad283aa400af464c76d713c07ad', 'test', NULL, 0, 5, 1);
INSERT INTO `u_user` VALUES (11, '村头老7', '18567878728', '25d55ad283aa400af464c76d713c07ad', 'test', NULL, 0, 5, 1);

SET FOREIGN_KEY_CHECKS = 1;
