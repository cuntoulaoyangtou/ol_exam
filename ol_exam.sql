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

 Date: 03/04/2020 10:20:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for c_test_and_clazz
-- ----------------------------
DROP TABLE IF EXISTS `c_test_and_clazz`;
CREATE TABLE `c_test_and_clazz`  (
  `tc_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '\'试卷班级关系ID\'',
  `t_id` int(11) NULL DEFAULT NULL COMMENT '\'试卷ID\'',
  `c_id` int(11) NULL DEFAULT NULL COMMENT '\'班级ID\'',
  PRIMARY KEY (`tc_id`) USING BTREE,
  INDEX `FK_TEST_CLAZZ_TID`(`t_id`) USING BTREE,
  INDEX `FK_TEST_CLAZZ_CID`(`c_id`) USING BTREE,
  CONSTRAINT `FK_TEST_CLAZZ_TID` FOREIGN KEY (`t_id`) REFERENCES `e_test` (`t_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_TEST_CLAZZ_CID` FOREIGN KEY (`c_id`) REFERENCES `u_clazz` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for c_test_and_question
-- ----------------------------
DROP TABLE IF EXISTS `c_test_and_question`;
CREATE TABLE `c_test_and_question`  (
  `tq_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '\'试卷试题关系ID\'',
  `t_id` int(11) NULL DEFAULT NULL COMMENT '\'试卷ID\'',
  `q_id` int(11) NULL DEFAULT NULL COMMENT '\'试题ID\'',
  PRIMARY KEY (`tq_id`) USING BTREE,
  INDEX `FK_TEST_QUESTION_TID`(`t_id`) USING BTREE,
  INDEX `FK_TEST_QUESTION_QID`(`q_id`) USING BTREE,
  CONSTRAINT `FK_TEST_QUESTION_TID` FOREIGN KEY (`t_id`) REFERENCES `e_test` (`t_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_TEST_QUESTION_QID` FOREIGN KEY (`q_id`) REFERENCES `e_question` (`q_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for e_chapter
-- ----------------------------
DROP TABLE IF EXISTS `e_chapter`;
CREATE TABLE `e_chapter`  (
  `ec_id` int(11) NOT NULL AUTO_INCREMENT,
  `ec_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ec_priority` int(11) NULL DEFAULT NULL,
  `cum_id` int(11) NOT NULL,
  PRIMARY KEY (`ec_id`) USING BTREE,
  UNIQUE INDEX `UN_CHAPTER_ECNAME`(`ec_name`) USING BTREE,
  INDEX `FK_CHAPTER_CUMID`(`cum_id`) USING BTREE,
  CONSTRAINT `FK_CHAPTER_CUMID` FOREIGN KEY (`cum_id`) REFERENCES `e_curriculum` (`cum_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of e_chapter
-- ----------------------------
INSERT INTO `e_chapter` VALUES (1, '初始java', NULL, 3);
INSERT INTO `e_chapter` VALUES (4, 'Java变量与基础类型', NULL, 3);

-- ----------------------------
-- Table structure for e_curriculum
-- ----------------------------
DROP TABLE IF EXISTS `e_curriculum`;
CREATE TABLE `e_curriculum`  (
  `cum_id` int(11) NOT NULL AUTO_INCREMENT,
  `cum_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cum_priority` int(11) NULL DEFAULT NULL,
  `m_id` int(11) NOT NULL,
  PRIMARY KEY (`cum_id`) USING BTREE,
  UNIQUE INDEX `UN_CURRICULUM_CUMNAME`(`cum_name`) USING BTREE,
  INDEX `FK_CURRICULUM_MID`(`m_id`) USING BTREE,
  CONSTRAINT `FK_CURRICULUM_MID` FOREIGN KEY (`m_id`) REFERENCES `u_major` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of e_curriculum
-- ----------------------------
INSERT INTO `e_curriculum` VALUES (1, '计算机基础', NULL, 1);
INSERT INTO `e_curriculum` VALUES (3, 'Java基础', NULL, 1);
INSERT INTO `e_curriculum` VALUES (5, 'Java高级', NULL, 1);

-- ----------------------------
-- Table structure for e_option
-- ----------------------------
DROP TABLE IF EXISTS `e_option`;
CREATE TABLE `e_option`  (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_no` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_content` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_flag` tinyint(1) NULL DEFAULT NULL,
  `q_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`o_id`) USING BTREE,
  INDEX `FK_OPTION_QID`(`q_id`) USING BTREE,
  CONSTRAINT `FK_OPTION_QID` FOREIGN KEY (`q_id`) REFERENCES `e_question` (`q_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of e_option
-- ----------------------------
INSERT INTO `e_option` VALUES (5, '2967', 'aaaaaaaaa', 0, 9);
INSERT INTO `e_option` VALUES (6, '5803', 'ssssss', 0, 9);
INSERT INTO `e_option` VALUES (7, '5528', 'ddddddddddd', 1, 9);
INSERT INTO `e_option` VALUES (8, '4577', 'wwwwwwwwwwwwww', 0, 9);
INSERT INTO `e_option` VALUES (49, '1513', '第三方都是', 0, 15);
INSERT INTO `e_option` VALUES (50, '9349', '第三方代发', 1, 15);
INSERT INTO `e_option` VALUES (51, '1952', '大幅度发', 0, 15);
INSERT INTO `e_option` VALUES (52, '6605', '的范德萨发', 0, 15);
INSERT INTO `e_option` VALUES (53, '9853', '对对对', 0, 16);
INSERT INTO `e_option` VALUES (54, '762', '电放费', 1, 16);
INSERT INTO `e_option` VALUES (55, '4142', '斯蒂芬', 1, 16);
INSERT INTO `e_option` VALUES (56, '8889', '大幅度发', 1, 16);
INSERT INTO `e_option` VALUES (57, '7527', '1', 1, 18);
INSERT INTO `e_option` VALUES (58, '4208', '[\"ddd\",\"ffff\"]', 1, 19);
INSERT INTO `e_option` VALUES (59, '9105', '顶顶顶顶', 1, 20);
INSERT INTO `e_option` VALUES (60, '2634', '0', 1, 21);
INSERT INTO `e_option` VALUES (61, '9596', '0', 1, 22);

-- ----------------------------
-- Table structure for e_question
-- ----------------------------
DROP TABLE IF EXISTS `e_question`;
CREATE TABLE `e_question`  (
  `q_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '\'试题ID\'',
  `q_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '\'试题内容\'',
  `q_create_time` datetime NOT NULL COMMENT '\'创建时间\'',
  `q_update_time` datetime NULL DEFAULT NULL COMMENT '\'修改时间\'',
  `q_create_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'创建用户\'',
  `q_parse` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'解析\'',
  `q_ability` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'知识点\'',
  `qt_id` int(11) NOT NULL COMMENT '\'试题类型\'',
  `ec_id` int(11) NOT NULL COMMENT '\'试题分类\'',
  `q_difficulty` int(11) NULL DEFAULT NULL COMMENT '\'难易度\'',
  PRIMARY KEY (`q_id`) USING BTREE,
  INDEX `FK_QUESTION_CID`(`ec_id`) USING BTREE,
  INDEX `FK_QUESTION_QTID`(`qt_id`) USING BTREE,
  CONSTRAINT `FK_QUESTION_CID` FOREIGN KEY (`ec_id`) REFERENCES `e_chapter` (`ec_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_QUESTION_QTID` FOREIGN KEY (`qt_id`) REFERENCES `e_question_type` (`qt_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of e_question
-- ----------------------------
INSERT INTO `e_question` VALUES (9, '<p>aaaaaaaa</p>', '2020-03-17 08:40:39', NULL, '杨盼', 'ssss', 'wwww', 1, 1, 1);
INSERT INTO `e_question` VALUES (15, '<p>大幅度减肥的时间放假</p>', '2020-04-02 20:18:13', NULL, '杨盼', '的范德萨发', '湖广会馆', 1, 1, 1);
INSERT INTO `e_question` VALUES (16, '<p>多选</p>', '2020-04-02 20:50:43', '2020-04-03 00:51:45', '杨盼', '', '', 2, 1, 1);
INSERT INTO `e_question` VALUES (18, '<p>判断题</p>', '2020-04-02 21:20:06', '2020-04-03 00:43:28', '杨盼', '对对对', '', 3, 1, 1);
INSERT INTO `e_question` VALUES (19, '<p>填空提____hhh___</p>', '2020-04-02 21:29:14', NULL, '杨盼', NULL, NULL, 4, 1, 1);
INSERT INTO `e_question` VALUES (20, '<p>绝地反击登记方法等级积分</p>', '2020-04-02 21:32:26', NULL, '杨盼', '第三方第三方', NULL, 5, 4, 1);
INSERT INTO `e_question` VALUES (21, '<p>判断题二</p>', '2020-04-03 00:44:48', '2020-04-03 00:45:20', '杨盼', '对对对方法', '', 3, 1, 1);
INSERT INTO `e_question` VALUES (22, '<p>判断3</p>', '2020-04-03 00:50:46', '2020-04-03 00:50:55', '杨盼', '大幅度发', '多个', 3, 4, 1);

-- ----------------------------
-- Table structure for e_question_type
-- ----------------------------
DROP TABLE IF EXISTS `e_question_type`;
CREATE TABLE `e_question_type`  (
  `qt_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '\'试题类型ID\'',
  `qt_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '\'试题类型名\'',
  `qt_priority` int(11) NULL DEFAULT NULL COMMENT '\'试题类型优先级\'',
  PRIMARY KEY (`qt_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of e_question_type
-- ----------------------------
INSERT INTO `e_question_type` VALUES (1, '单选题', 9);
INSERT INTO `e_question_type` VALUES (2, '多选题', 8);
INSERT INTO `e_question_type` VALUES (3, '判断题', 7);
INSERT INTO `e_question_type` VALUES (4, '填空题', 6);
INSERT INTO `e_question_type` VALUES (5, '面试题', 5);

-- ----------------------------
-- Table structure for e_test
-- ----------------------------
DROP TABLE IF EXISTS `e_test`;
CREATE TABLE `e_test`  (
  `t_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '\'试题ID\'',
  `type_id` int(11) NOT NULL COMMENT '\'类型ID\'',
  `t_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'试题名\'',
  `t_summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\'摘要\'',
  `create_time` datetime NOT NULL COMMENT '\'创建时间\'',
  `update_time` datetime NULL DEFAULT NULL COMMENT '\'修改时间\'',
  `start_time` datetime NOT NULL COMMENT '\'开始时间\'',
  `end_time` datetime NOT NULL COMMENT '\'结束时间\'',
  `u_id` int(11) NULL DEFAULT NULL COMMENT '\'创建用户\'',
  `total` int(3) NULL DEFAULT NULL COMMENT '\'总分\'',
  `visibility` tinyint(1) NULL DEFAULT NULL COMMENT '\'是否可见\'',
  `single_val` int(2) NULL DEFAULT 2 COMMENT '\'单选分数\'',
  `multiple_val` int(2) NULL DEFAULT 2 COMMENT '\'多选分数\'',
  `judge_val` int(2) NULL DEFAULT 2 COMMENT '\'判断分数\'',
  `filling_val` int(2) NULL DEFAULT 2 COMMENT '\'填空分数\'',
  `short_val` int(2) NULL DEFAULT 2 COMMENT '\'简答分数\'',
  PRIMARY KEY (`t_id`) USING BTREE,
  INDEX `FK_TEST_UID`(`u_id`) USING BTREE,
  CONSTRAINT `FK_TEST_UID` FOREIGN KEY (`u_id`) REFERENCES `u_user` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
  CONSTRAINT `FK_CLAZZ_GID` FOREIGN KEY (`g_id`) REFERENCES `u_grade` (`g_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_CLAZZ_MID` FOREIGN KEY (`m_id`) REFERENCES `u_major` (`m_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_clazz
-- ----------------------------
INSERT INTO `u_clazz` VALUES (5, '网销1班', 1021801, 4, 2);
INSERT INTO `u_clazz` VALUES (6, '开发2班', 1011902, 3, 1);
INSERT INTO `u_clazz` VALUES (7, '开发1班', 1011801, 4, 1);
INSERT INTO `u_clazz` VALUES (8, '开发1班', 1011901, 3, 1);
INSERT INTO `u_clazz` VALUES (10, '开发2班', 1011802, 4, 1);
INSERT INTO `u_clazz` VALUES (11, '开发老师', 9999999, 6, 1);
INSERT INTO `u_clazz` VALUES (12, '开发3班', 1011803, 4, 1);
INSERT INTO `u_clazz` VALUES (13, '开发4班', 1011804, 4, 1);

-- ----------------------------
-- Table structure for u_clazz_manage
-- ----------------------------
DROP TABLE IF EXISTS `u_clazz_manage`;
CREATE TABLE `u_clazz_manage`  (
  `cm_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  PRIMARY KEY (`cm_id`) USING BTREE,
  INDEX `FK_CLAZZ_MANAGE_CID`(`c_id`) USING BTREE,
  UNIQUE INDEX `UN_CLAZZ_MANAGE_UID_AND_CID`(`u_id`, `c_id`) USING BTREE,
  CONSTRAINT `FK_CLAZZ_MANAGE_CID` FOREIGN KEY (`c_id`) REFERENCES `u_clazz` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_CLAZZ_MANAGE_UID` FOREIGN KEY (`u_id`) REFERENCES `u_user` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_clazz_manage
-- ----------------------------
INSERT INTO `u_clazz_manage` VALUES (35, 1, 5);
INSERT INTO `u_clazz_manage` VALUES (36, 1, 7);
INSERT INTO `u_clazz_manage` VALUES (37, 1, 10);
INSERT INTO `u_clazz_manage` VALUES (38, 1, 12);
INSERT INTO `u_clazz_manage` VALUES (39, 1, 13);

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
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_grade
-- ----------------------------
INSERT INTO `u_grade` VALUES (2, '2017级', 2, 2);
INSERT INTO `u_grade` VALUES (3, '2019级', 5, 2);
INSERT INTO `u_grade` VALUES (4, '2018级', NULL, 2);
INSERT INTO `u_grade` VALUES (5, '2019级', 5, 4);
INSERT INTO `u_grade` VALUES (6, '所有', NULL, 5);

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
INSERT INTO `u_major` VALUES (1, '开发', '介绍', 1);
INSERT INTO `u_major` VALUES (2, '网销', '介绍', NULL);
INSERT INTO `u_major` VALUES (3, '前端', '好', 2);

-- ----------------------------
-- Table structure for u_role
-- ----------------------------
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role`  (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `r_comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_shool
-- ----------------------------
INSERT INTO `u_shool` VALUES (2, '平顶山校区', '4', '');
INSERT INTO `u_shool` VALUES (4, '漯河校区', '', '');
INSERT INTO `u_shool` VALUES (5, '教师', '', '');

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
  `c_id` int(11) NOT NULL,
  `r_id` int(11) NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE,
  UNIQUE INDEX `UN_USER_PHONE`(`phone`) USING BTREE,
  UNIQUE INDEX `UN_USER_USERNAME`(`username`) USING BTREE,
  INDEX `FK_USER_CID`(`c_id`) USING BTREE,
  INDEX `FK_USER_RID`(`r_id`) USING BTREE,
  CONSTRAINT `FK_USER_CID` FOREIGN KEY (`c_id`) REFERENCES `u_clazz` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USER_RID` FOREIGN KEY (`r_id`) REFERENCES `u_role` (`r_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of u_user
-- ----------------------------
INSERT INTO `u_user` VALUES (1, '村头老杨头', '18567192712', '25d55ad283aa400af464c76d713c07ad', '杨盼', 'http://ctlyt.yunypan.cn/avatar', 0, 11, 6);
INSERT INTO `u_user` VALUES (5, '村头老', '18567878724', '25d55ad283aa400af464c76d713c07ad', 'test', NULL, 0, 5, 1);
INSERT INTO `u_user` VALUES (12, 'admin', '18567876871', '25d55ad283aa400af464c76d713c07ad', '杨盼', '', NULL, 7, 7);

-- ----------------------------
-- View structure for u_clazz_view
-- ----------------------------
DROP VIEW IF EXISTS `u_clazz_view`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `u_clazz_view` AS select `c`.`c_id` AS `c_id`,concat(`s`.`s_name`,'-',`g`.`g_name`,'-',`c`.`c_name`) AS `c_name`,`c`.`c_priority` AS `c_priority`,`c`.`g_id` AS `g_id`,`c`.`m_id` AS `m_id` from ((`u_shool` `s` join `u_grade` `g`) join `u_clazz` `c`) where ((`s`.`s_id` = `g`.`s_id`) and (`g`.`g_id` = `c`.`g_id`));

SET FOREIGN_KEY_CHECKS = 1;
