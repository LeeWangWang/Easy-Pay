delete from sys_user where user_id = 1;
delete from sys_user where user_id = 2;
insert  into `sys_user`(`user_id`,`org_id`,`username`,`password`,`nickname`,`email`,`mobile`,`status`,`avatar_status`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`,`is_modify_pwd`) values (1,36,'admin','e7b9c0bb728121a095d6103a4b0a1c8a','admin','100000@qq.com','17752859653',1,0,NULL,1,'2017-08-15 21:40:39','2020-11-07 10:35:13',1);
insert  into `sys_user`(`user_id`,`org_id`,`username`,`password`,`nickname`,`email`,`mobile`,`status`,`avatar_status`,`remark`,`user_id_create`,`gmt_create`,`gmt_modified`,`is_modify_pwd`) values (2,36,'pay','b8c3b45592262ba12f0ba270c08b1d55','pay','100000@qq.com','13105423559',1,0,NULL,1,'2020-10-31 21:51:59','2020-11-07 10:59:36',NULL);



