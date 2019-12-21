/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : teacher

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-12-21 15:34:55
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
INSERT INTO `department` VALUES ('4', '1', 'fda', '1');
INSERT INTO `department` VALUES ('5', '1', 'f', '1');
INSERT INTO `department` VALUES ('6', '4', 'ef', '1');
INSERT INTO `department` VALUES ('7', '1', 'fda', '1');
INSERT INTO `department` VALUES ('8', '1', 'fda', '1');
INSERT INTO `department` VALUES ('9', '1', 'fda', '1');
INSERT INTO `department` VALUES ('10', '1', 'fe', '1');
INSERT INTO `department` VALUES ('11', '1', 'fda', '1');
INSERT INTO `department` VALUES ('12', '1', 'fe', '1');
INSERT INTO `department` VALUES ('13', '1', 'fe', '1');
INSERT INTO `department` VALUES ('14', '1', 'fe', '1');
INSERT INTO `department` VALUES ('15', '1', 'fe', '1');
INSERT INTO `department` VALUES ('16', '1', 'fe', '1');
INSERT INTO `department` VALUES ('17', '1', 'fe', '1');
INSERT INTO `department` VALUES ('18', '1', 'fe', '1');
INSERT INTO `department` VALUES ('19', '1', 'fe', '1');
INSERT INTO `department` VALUES ('20', '1', 'fe', '1');
INSERT INTO `department` VALUES ('21', '1', 'fe', '1');
INSERT INTO `department` VALUES ('22', '1', 'fe', '1');
INSERT INTO `department` VALUES ('23', '1', 'fe', '1');
INSERT INTO `department` VALUES ('24', '1', 'fe', '1');
INSERT INTO `department` VALUES ('25', '1', 'fe', '1');
INSERT INTO `department` VALUES ('26', '1', 'fe', '1');
INSERT INTO `department` VALUES ('27', '1', 'ef', '1');
INSERT INTO `department` VALUES ('28', '1', 'fe', '1');
INSERT INTO `department` VALUES ('29', '1', 'fda', '1');
INSERT INTO `department` VALUES ('30', '1', 'fe', '1');
INSERT INTO `department` VALUES ('31', '1', 'e', '1');
INSERT INTO `department` VALUES ('32', '1', 'd', '1');
INSERT INTO `department` VALUES ('33', '1', 'd', '1');
INSERT INTO `department` VALUES ('34', '1', 'd', '1');
INSERT INTO `department` VALUES ('35', '1', 'd', '1');
INSERT INTO `department` VALUES ('36', '1', 'fe', '1');
INSERT INTO `department` VALUES ('37', '1', 'fe', '1');
INSERT INTO `department` VALUES ('38', '1', 'fe', '1');
INSERT INTO `department` VALUES ('39', '1', 'fe', '4');
INSERT INTO `department` VALUES ('40', '1', '校长', '6');
INSERT INTO `department` VALUES ('41', '1', '校长', '7');

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
  `password` varchar(20) NOT NULL COMMENT '登录密码',
  `number` int(11) NOT NULL COMMENT '教师工号',
  `title` varchar(255) NOT NULL COMMENT '教师职称',
  `phone` varchar(255) default NULL COMMENT '手机号',
  `assessor` int(11) NOT NULL default '0' COMMENT '是否具备审核资格(0为false)',
  `tenure` varchar(255) NOT NULL default '在职' COMMENT '任职情况',
  PRIMARY KEY  (`id`),
  KEY `number` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '张老师', '123', '1', '正高级教师', '1399546584', '1', '');
INSERT INTO `teacher` VALUES ('2', '王老师', '1234', '2', '三级教师', '1564864154', '0', '');
INSERT INTO `teacher` VALUES ('3', '李老师', '12345', '3', '正高级教师', '156464815', '2', '');
INSERT INTO `teacher` VALUES ('4', 'admin', 'gr', '1', 'ee', '', '1', 'grs');
INSERT INTO `teacher` VALUES ('5', 'admin', 'fda', '1', 'ee', '', '1', '');
INSERT INTO `teacher` VALUES ('6', 'd', 'd', '1', 'd', '', '1', '');
INSERT INTO `teacher` VALUES ('7', 'fe', 'ef', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('8', 'admin', 'fea', '1', 'ee', '', '1', '');
INSERT INTO `teacher` VALUES ('9', 'd', 'd', '1', 'f', '', '1', '');
INSERT INTO `teacher` VALUES ('10', 'd', 'd', '1', 'f', '', '1', '');
INSERT INTO `teacher` VALUES ('11', 'd', 'fe', '1', 'f', '', '1', '');
INSERT INTO `teacher` VALUES ('12', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('13', 'admin', 'fd', '1', 'ee', '', '2', '');
INSERT INTO `teacher` VALUES ('14', 'admin', 'fd', '1', 'fd', '', '1', '');
INSERT INTO `teacher` VALUES ('15', 'admin', 'fe', '1', 'fe', '', '0', '');
INSERT INTO `teacher` VALUES ('16', 'admin', 'fe', '1', 'fe', '', '0', '');
INSERT INTO `teacher` VALUES ('17', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('18', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('19', 'admin', 'fd', '1', 'fd', '', '1', '');
INSERT INTO `teacher` VALUES ('20', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('21', 'admin', 'fd', '1', 'fd', '', '1', '');
INSERT INTO `teacher` VALUES ('22', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('23', 'admin', 'f', '1', 'f', '', '1', '');
INSERT INTO `teacher` VALUES ('24', 'admin', 'fd', '1', 'fd', '', '1', '');
INSERT INTO `teacher` VALUES ('25', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('26', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('27', 'fe', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('28', 'fe', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('29', 'admin', 'fa', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('30', 'fe', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('31', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('32', 'admin', 'e', '1', 'e', '', '1', '');
INSERT INTO `teacher` VALUES ('33', 'admin', 'e', '1', 'e', '', '1', '');
INSERT INTO `teacher` VALUES ('34', 'admin', 'd', '1', 'd', '', '1', '');
INSERT INTO `teacher` VALUES ('35', 'admin', 'd', '1', 'd', '', '1', '');
INSERT INTO `teacher` VALUES ('36', 'admin', 'd', '1', 'd', '', '1', '');
INSERT INTO `teacher` VALUES ('37', 'admin', 'd', '1', 'd', '', '1', '');
INSERT INTO `teacher` VALUES ('38', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('39', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('40', 'admin', 'fe', '1', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('41', 'admin', 'df', '4', 'fe', '', '1', '');
INSERT INTO `teacher` VALUES ('42', 'req', 're', '6', '正高级教师', '+86', '0', '在职');
INSERT INTO `teacher` VALUES ('43', 'admin', 'fe', '7', '正高级教师', '+86', '0', '在职');
