
DROP TABLE IF EXISTS `app_order`;

CREATE TABLE `app_order` (
                             `id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `body` varchar(255) DEFAULT NULL,
                             `order_no` varchar(200) DEFAULT NULL,
                             `product_id` bigint(20) DEFAULT NULL,
                             `total_Fee` decimal(18,2) DEFAULT NULL,
                             `gmt_create` datetime DEFAULT NULL,
                             `gmt_modified` datetime DEFAULT NULL,
                             `status` smallint(6) DEFAULT NULL,
                             `type` smallint(6) DEFAULT NULL,
                             `user_create` bigint(20) DEFAULT NULL,
                             `mobile` varchar(255) DEFAULT NULL,
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `app_order` */

insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (1,'胡丽娜精美手办','1322887102932848640',1,'1.00','2020-11-01 21:04:00','2020-11-01 21:04:00',0,NULL,NULL,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (2,'胡丽娜精美手办','1323225559995650048',1,'1.00','2020-11-02 19:28:54','2020-11-02 19:28:54',0,1,NULL,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (3,'胡丽娜精美手办','1323233000502202368',1,'1.00','2020-11-02 19:58:29','2020-11-02 19:58:29',0,0,NULL,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (4,'胡丽娜精美手办','1323233048577314816',1,'1.00','2020-11-02 19:58:39','2020-11-02 19:58:39',0,1,NULL,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (5,'个人支付管理系统','1324921045622329344',NULL,'1.00','2020-11-07 11:46:09','2020-11-07 11:46:09',0,0,-1,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (6,'个人支付管理系统','1324922042620973056',NULL,'1.00','2020-11-07 11:50:06','2020-11-07 11:50:06',0,0,-1,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (7,'个人支付管理系统','1324922085251878912',NULL,'1.00','2020-11-07 11:50:16','2020-11-07 11:50:16',0,0,-1,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (8,'个人支付管理系统','1324922183109185536',NULL,'1.00','2020-11-07 11:50:40','2020-11-07 11:50:40',0,0,-1,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (9,'胡丽娜精美手办','1324922838943141888',1,'1.00','2020-11-07 11:53:16','2020-11-07 11:53:16',0,0,1,NULL);
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (10,'邀请码','1325267109705551872',NULL,'49.00','2020-11-08 10:41:17','2020-11-08 10:41:17',0,0,-1,'');
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (11,'邀请码','1325267466972172288',NULL,'49.00','2020-11-08 10:42:42','2020-11-08 10:42:42',0,0,-1,'17762018584');
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (12,'邀请码','1325267936302206976',NULL,'49.00','2020-11-08 10:44:34','2020-11-08 10:44:34',0,0,-1,'17762018584');
insert  into `app_order`(`id`,`body`,`order_no`,`product_id`,`total_Fee`,`gmt_create`,`gmt_modified`,`status`,`type`,`user_create`,`mobile`) values (13,'邀请码','1325270512917680128',NULL,'49.00','2020-11-08 10:54:48','2020-11-08 10:54:48',0,0,-1,'17762018584');

/*Table structure for table `sys_area` */

DROP TABLE IF EXISTS `sys_area`;

CREATE TABLE `sys_area` (
                            `area_id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `area_code` varchar(50) NOT NULL,
                            `gmt_create` datetime DEFAULT NULL,
                            `gmt_modified` datetime DEFAULT NULL,
                            `layer` int(11) DEFAULT NULL,
                            `name` varchar(20) DEFAULT NULL,
                            `order_num` int(11) DEFAULT NULL,
                            `parent_code` varchar(50) NOT NULL,
                            `remark` varchar(50) DEFAULT NULL,
                            `status` smallint(6) DEFAULT NULL,
                            PRIMARY KEY (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_area` */

/*Table structure for table `sys_config` */

DROP TABLE IF EXISTS `sys_config`;

CREATE TABLE `sys_config` (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
                              `config_key` varchar(200) NOT NULL COMMENT '唯一标识',
                              `config_value` varchar(500) NOT NULL COMMENT '值',
                              `config_remark` varchar(1000) NOT NULL COMMENT '备注',
                              `user_id_create` bigint(20) NOT NULL COMMENT '创建人',
                              `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
                              `gmt_modified` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
                              `status` tinyint(4) NOT NULL COMMENT '状态 0 禁用 1 可用',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='基础配置';

/*Data for the table `sys_config` */

insert  into `sys_config`(`id`,`config_key`,`config_value`,`config_remark`,`user_id_create`,`gmt_create`,`gmt_modified`,`status`) values (3,'邀请码','49','邀请码',1,'2020-11-08 10:53:27','2020-11-08 10:53:27',1);

/*Table structure for table `sys_landing_records` */

DROP TABLE IF EXISTS `sys_landing_records`;

CREATE TABLE `sys_landing_records` (
                                       `id` int(11) NOT NULL AUTO_INCREMENT,
                                       `ip` varchar(15) NOT NULL,
                                       `login_date` datetime NOT NULL,
                                       `login_way` varchar(10) NOT NULL,
                                       `place` varchar(10) NOT NULL,
                                       `user_id` bigint(20) NOT NULL,
                                       PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_landing_records` */

/*Table structure for table `sys_log` */

DROP TABLE IF EXISTS `sys_log`;

CREATE TABLE `sys_log` (
                           `id` bigint(20) NOT NULL AUTO_INCREMENT,
                           `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
                           `username` varchar(50) DEFAULT NULL COMMENT '用户名',
                           `operation` varchar(50) DEFAULT NULL COMMENT '用户操作',
                           `time` int(11) DEFAULT NULL COMMENT '响应时间',
                           `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
                           `params` text COMMENT '请求参数',
                           `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
                           `device_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '访问方式 0:PC 1:手机 2:未知',
                           `log_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '类型 0: 一般日志记录 1: 异常错误日志',
                           `exception_detail` text COMMENT '异常详细信息',
                           `gmt_create` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85129 DEFAULT CHARSET=utf8 COMMENT='系统日志';

/*Data for the table `sys_log` */

insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85118,1,'admin','清空日志',78,'com.acts.market.common.controller.SysLogController.batchRemoveAll()',NULL,'0:0:0:0:0:0:0:1',0,0,NULL,'2018-12-26 17:02:07');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85119,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 00:26:32');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85120,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 00:27:59');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85121,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 09:42:26');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85122,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 09:57:41');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85123,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:00:04');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85124,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:04:12');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85125,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:06:14');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85126,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:28:59');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85127,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:44:39');
insert  into `sys_log`(`id`,`user_id`,`username`,`operation`,`time`,`method`,`params`,`ip`,`device_type`,`log_type`,`exception_detail`,`gmt_create`) values (85128,1,'admin','登录',10,'','','127.0.0.1',0,0,'','2020-11-08 10:51:32');

/*Table structure for table `sys_macro` */

DROP TABLE IF EXISTS `sys_macro`;

CREATE TABLE `sys_macro` (
                             `macro_id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `gmt_create` datetime DEFAULT NULL,
                             `gmt_modified` datetime DEFAULT NULL,
                             `name` varchar(50) DEFAULT NULL,
                             `order_num` int(11) DEFAULT NULL,
                             `remark` varchar(500) DEFAULT NULL,
                             `status` smallint(6) DEFAULT NULL,
                             `type` smallint(6) DEFAULT NULL,
                             `type_id` bigint(20) DEFAULT NULL,
                             `value` varchar(2000) DEFAULT NULL,
                             PRIMARY KEY (`macro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_macro` */

/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
                            `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
                            `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
                            `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
                            `url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
                            `perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
                            `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
                            `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
                            `order_num` int(11) DEFAULT NULL COMMENT '排序',
                            `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                            `gmt_modified` timestamp NULL DEFAULT NULL COMMENT '修改时间',
                            PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=284 DEFAULT CHARSET=utf8 COMMENT='菜单管理';

/*Data for the table `sys_menu` */

insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (1,0,'系统管理',NULL,'',0,'layui-icon layui-icon-template-1',0,'2017-08-09 22:49:47','2017-09-11 17:25:22');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (2,1,'系统菜单','sys/menu/list.html',NULL,1,'layui-icon layui-icon-spread-left',10,'2017-08-09 22:55:15','2017-08-17 10:00:12');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (6,1,'用户管理','sys/user/list.html','',1,'layui-icon layui-icon-username',2,'2017-08-10 14:12:11','2017-09-05 12:57:42');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (7,1,'角色管理','sys/role/list.html','',1,'layui-icon layui-icon-tree',1,'2017-08-10 14:13:19','2017-09-05 12:57:30');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (11,6,'刷新','/sys/user/list','sys:user:list',2,NULL,0,'2017-08-14 10:51:05','2017-09-05 12:47:23');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (12,6,'新增','/sys/user/save','sys:user:save',2,NULL,0,'2017-08-14 10:51:35','2017-09-05 12:47:34');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (13,6,'编辑','/sys/user/update','sys:user:edit',2,NULL,0,'2017-08-14 10:52:06','2017-09-05 12:47:46');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (14,6,'删除','/sys/user/remove','sys:user:remove',2,NULL,0,'2017-08-14 10:52:24','2017-09-05 12:48:03');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (15,7,'刷新','/sys/role/list','sys:role:list',2,NULL,0,'2017-08-14 10:56:37','2017-09-05 12:44:04');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (16,7,'新增','/sys/role/save','sys:role:save',2,NULL,0,'2017-08-14 10:57:02','2017-09-05 12:44:23');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (17,7,'编辑','/sys/role/update','sys:role:edit',2,NULL,0,'2017-08-14 10:57:31','2017-09-05 12:44:48');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (18,7,'删除','/sys/role/remove','sys:role:remove',2,NULL,0,'2017-08-14 10:57:50','2017-09-05 12:45:02');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (19,7,'操作权限','/sys/role/authorize/opt','sys:role:authorizeOpt',2,NULL,0,'2017-08-14 10:58:55','2017-09-05 12:45:29');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (20,2,'刷新','/sys/menu/list','sys:menu:list',2,NULL,0,'2017-08-14 10:59:32','2017-09-05 13:06:24');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (21,2,'新增','/sys/menu/save','sys:menu:save',2,NULL,0,'2017-08-14 10:59:56','2017-09-05 13:06:35');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (22,2,'编辑','/sys/menu/update','sys:menu:edit',2,NULL,0,'2017-08-14 11:00:26','2017-09-05 13:06:48');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (23,2,'删除','/sys/menu/remove','sys:menu:remove',2,NULL,0,'2017-08-14 11:00:58','2017-09-05 13:07:00');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (24,6,'启用','/sys/user/enable','sys:user:enable',2,NULL,0,'2017-08-14 17:27:18','2017-09-05 12:48:30');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (25,6,'停用','/sys/user/disable','sys:user:disable',2,NULL,0,'2017-08-14 17:27:43','2017-09-05 12:48:49');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (26,6,'重置密码','/sys/user/rest','sys:user:resetPassword',2,NULL,0,'2017-08-14 17:28:34','2017-09-05 12:49:17');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (27,267,'系统日志','sys/log/list.html',NULL,1,'fa fa-warning',3,'2017-08-14 22:11:53','2017-08-17 09:55:19');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (28,27,'刷新','/sys/log/list','sys:log:list',2,NULL,0,'2017-08-14 22:30:22','2017-09-05 13:05:24');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (29,27,'删除','/sys/log/remove','sys:log:remove',2,NULL,0,'2017-08-14 22:30:43','2017-09-05 13:05:37');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (30,27,'清空','/sys/log/clear','sys:log:clear',2,NULL,0,'2017-08-14 22:31:02','2017-09-05 13:05:53');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (42,261,'刷新','/sys/org/list','sys:org:list',2,NULL,0,'2017-08-17 10:03:36','2017-09-05 11:47:37');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (43,261,'新增','/sys/org/save','sys:org:save',2,NULL,0,'2017-08-17 10:03:54','2017-09-05 12:40:55');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (44,261,'编辑','/sys/org/update','sys:org:edit',2,NULL,0,'2017-08-17 10:04:11','2017-09-05 12:43:06');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (45,261,'删除','/sys/org/remove','sys:org:remove',2,NULL,0,'2017-08-17 10:04:30','2017-09-05 12:42:19');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (46,7,'数据权限','/sys/role/authorize/data','sys:role:authorizeData',2,NULL,0,'2017-08-17 13:48:11','2017-09-05 12:45:54');
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (261,1,'机构管理','/sys/org/list.html',NULL,1,'layui-icon layui-icon-group',3,NULL,NULL);
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (264,1,'全局配置','sys/config/list.html',NULL,1,'layui-icon layui-icon-templeate-1',40,NULL,NULL);
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (267,0,'系统监控',NULL,NULL,0,'layui-icon layui-icon-camera',3,NULL,NULL);
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (279,0,'支付管理',NULL,NULL,0,'layui-icon layui-icon-cellphone',3,NULL,NULL);
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (280,279,'在线支付','pay/list.html',NULL,1,'layui-icon layui-icon-login-wechat',1,NULL,NULL);
insert  into `sys_menu`(`menu_id`,`parent_id`,`name`,`url`,`perms`,`type`,`icon`,`order_num`,`gmt_create`,`gmt_modified`) values (281,279,'订单管理','pay/order.html',NULL,1,'layui-icon layui-icon-cart-simple',1,NULL,NULL);

/*Table structure for table `sys_org` */

DROP TABLE IF EXISTS `sys_org`;

CREATE TABLE `sys_org` (
                           `org_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '机构id',
                           `parent_id` bigint(20) DEFAULT NULL COMMENT '上级机构ID，一级机构为0',
                           `code` varchar(100) DEFAULT NULL COMMENT '机构编码',
                           `name` varchar(100) DEFAULT NULL COMMENT '机构名称',
                           `full_name` varchar(100) DEFAULT NULL COMMENT '机构名称(全称)',
                           `director` varchar(100) DEFAULT NULL COMMENT '机构负责人',
                           `email` varchar(100) DEFAULT NULL COMMENT '联系邮箱',
                           `phone` varchar(100) DEFAULT NULL COMMENT '联系电话',
                           `address` varchar(200) DEFAULT NULL COMMENT '地址',
                           `order_num` int(11) DEFAULT NULL COMMENT '排序',
                           `status` tinyint(4) DEFAULT '1' COMMENT '可用标识  1：可用  0：不可用',
                           `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                           `gmt_modified` timestamp NULL DEFAULT NULL COMMENT '修改时间',
                           PRIMARY KEY (`org_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='机构管理';

/*Data for the table `sys_org` */

insert  into `sys_org`(`org_id`,`parent_id`,`code`,`name`,`full_name`,`director`,`email`,`phone`,`address`,`order_num`,`status`,`gmt_create`,`gmt_modified`) values (36,0,'00006','青岛海信','青岛海信','海信',NULL,NULL,NULL,NULL,1,'2020-05-08 22:06:58','2020-05-08 22:07:03');
insert  into `sys_org`(`org_id`,`parent_id`,`code`,`name`,`full_name`,`director`,`email`,`phone`,`address`,`order_num`,`status`,`gmt_create`,`gmt_modified`) values (38,0,'00005','青岛海尔','青岛海尔',NULL,NULL,NULL,NULL,NULL,1,'2020-05-08 22:17:32','2020-11-07 10:44:25');

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
                            `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
                            `org_id` bigint(255) DEFAULT NULL COMMENT '所属机构',
                            `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
                            `role_sign` varchar(100) DEFAULT NULL COMMENT '角色标识',
                            `remark` varchar(100) DEFAULT NULL COMMENT '备注',
                            `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
                            `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                            `gmt_modified` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                            PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='系统角色';

/*Data for the table `sys_role` */

insert  into `sys_role`(`role_id`,`org_id`,`role_name`,`role_sign`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`) values (1,17,'超级管理员','admin','【系统内置】',2,'2017-08-12 00:43:52','2017-11-21 10:19:08');
insert  into `sys_role`(`role_id`,`org_id`,`role_name`,`role_sign`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`) values (3,-1,'支付','支付','支付',1,'2020-10-31 21:50:54','2020-11-07 10:31:32');

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录id',
                                 `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
                                 `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14311 DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';

/*Data for the table `sys_role_menu` */

insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14274,3,279);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14275,3,280);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14276,1,267);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14277,1,27);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14278,1,28);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14279,1,29);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14280,1,30);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14281,1,279);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14282,1,280);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14283,1,281);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14284,1,282);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14285,1,283);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14286,1,1);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14287,1,264);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14288,1,2);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14289,1,20);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14290,1,21);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14291,1,22);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14292,1,23);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14293,1,261);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14294,1,42);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14295,1,43);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14296,1,44);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14297,1,45);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14298,1,6);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14299,1,11);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14300,1,14);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14301,1,24);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14302,1,25);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14303,1,26);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14304,1,7);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14305,1,15);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14306,1,16);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14307,1,17);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14308,1,18);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14309,1,19);
insert  into `sys_role_menu`(`id`,`role_id`,`menu_id`) values (14310,1,46);

/*Table structure for table `sys_role_org` */

DROP TABLE IF EXISTS `sys_role_org`;

CREATE TABLE `sys_role_org` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录id',
                                `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
                                `org_id` bigint(20) DEFAULT NULL COMMENT '机构ID',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='角色与机构对应关系';

/*Data for the table `sys_role_org` */

insert  into `sys_role_org`(`id`,`role_id`,`org_id`) values (17,1,17);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
                            `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
                            `org_id` bigint(20) NOT NULL COMMENT '所属机构',
                            `username` varchar(50) NOT NULL COMMENT '用户名',
                            `password` varchar(50) NOT NULL COMMENT '密码',
                            `nickname` varchar(50) DEFAULT NULL COMMENT '姓名(昵称)',
                            `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
                            `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
                            `status` tinyint(4) DEFAULT NULL COMMENT '状态 0:禁用，1:正常',
                            `avatar_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '头像上传 0:未上传 1:上传',
                            `remark` varchar(500) DEFAULT NULL COMMENT '备注',
                            `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
                            `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
                            `gmt_modified` timestamp NULL DEFAULT NULL COMMENT '修改时间',
                            `is_modify_pwd` tinyint(4) DEFAULT '0' COMMENT '是否修改过初始密码',
                            PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='系统用户';

/*Data for the table `sys_user` */

insert  into `sys_user`(`user_id`,`org_id`,`username`,`password`,`nickname`,`email`,`mobile`,`status`,`avatar_status`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`,`is_modify_pwd`) values (1,36,'admin','admin','admin','100000@qq.com','17752859653',1,0,NULL,1,'2017-08-15 21:40:39','2020-11-07 10:35:13',1);
insert  into `sys_user`(`user_id`,`org_id`,`username`,`password`,`nickname`,`email`,`mobile`,`status`,`avatar_status`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`,`is_modify_pwd`) values (2,36,'pay','admin','爪洼笔记','100000@qq.com','13105423559',1,0,NULL,1,'2020-10-31 21:51:59','2020-11-07 10:59:36',NULL);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '记录id',
                                 `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
                                 `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=259 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='用户与角色对应关系';

/*Data for the table `sys_user_role` */

insert  into `sys_user_role`(`id`,`user_id`,`role_id`) values (255,1,1);
insert  into `sys_user_role`(`id`,`user_id`,`role_id`) values (258,2,3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
