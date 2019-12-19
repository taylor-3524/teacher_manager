/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : teacher

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-12-19 11:32:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `college`
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `id` int(11) NOT NULL auto_increment,
  `dep_name` varchar(255) NOT NULL COMMENT '部门名称',
  `dep_num` int(11) NOT NULL COMMENT '部门编号',
  PRIMARY KEY  (`id`),
  KEY `col` (`dep_num`),
  CONSTRAINT `col` FOREIGN KEY (`dep_num`) REFERENCES `department` (`tea_dep_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES ('1', '信数学院', '1');
INSERT INTO `college` VALUES ('2', '化工学院', '2');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL auto_increment,
  `tea_dep_num` int(11) NOT NULL COMMENT '教师所属部门编号',
  `tea_job` varchar(255) NOT NULL COMMENT '教师职务',
  `tea_num` int(11) NOT NULL COMMENT '教师工号',
  PRIMARY KEY  (`id`),
  KEY `dep_fk_1` (`tea_num`),
  KEY `tea_dep_num` (`tea_dep_num`),
  CONSTRAINT `dep_fk_1` FOREIGN KEY (`tea_num`) REFERENCES `teacher` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '1', '学院院长', '1');
INSERT INTO `department` VALUES ('2', '1', '普通教师', '2');
INSERT INTO `department` VALUES ('3', '2', '学院院长', '3');

-- ----------------------------
-- Table structure for `project`
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(11) NOT NULL,
  `pro_name` varchar(255) NOT NULL COMMENT '科研项目名',
  `declarer_teacher_num` int(11) NOT NULL COMMENT '申报人工号',
  `pass_flag` varchar(255) NOT NULL default '未验收' COMMENT '验收标志',
  `remark` text COMMENT '备注（原因）',
  PRIMARY KEY  (`id`),
  KEY `pro_fk_1` (`declarer_teacher_num`),
  CONSTRAINT `pro_fk_1` FOREIGN KEY (`declarer_teacher_num`) REFERENCES `teacher` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', 'ssm中的高并发的实现', '2', '未验收', null);

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL COMMENT '教师名',
  `number` int(11) NOT NULL COMMENT '教师工号',
  `title` varchar(255) NOT NULL COMMENT '教师职称',
  `phone` varchar(255) default NULL COMMENT '手机号',
  `assessor` int(11) NOT NULL default '0' COMMENT '是否具备审核资格(0为false)',
  PRIMARY KEY  (`id`),
  KEY `number` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '张老师', '1', '正高级教师', '1399546584', '1');
INSERT INTO `teacher` VALUES ('2', '王老师', '2', '三级教师', '1564864154', '0');
INSERT INTO `teacher` VALUES ('3', '李老师', '3', '正高级教师', '156464815', '2');
