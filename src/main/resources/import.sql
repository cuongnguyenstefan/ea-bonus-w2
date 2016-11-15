
INSERT INTO `user` VALUES (1000,'John Doe','admin');
INSERT INTO `user_roles` VALUES (1000,'ADMINISTRATOR');
INSERT INTO `user_roles` VALUES (1000,'VOLUNTEER');
INSERT INTO `user` VALUES (1001,'Hilary Clinton', 'user');
INSERT INTO `user_roles` VALUES (1001,'VOLUNTEER');
INSERT INTO `user` VALUES (1002,'Mary Jane Holland', 'admin');
INSERT INTO `user_roles` VALUES (1002,'ADMINISTRATOR');
INSERT INTO `user_roles` VALUES (1002,'VOLUNTEER');


INSERT INTO `project` VALUES (2000,'This is my project 1','2016-11-06','Fairfield','2016-12-06','PENDING');
INSERT INTO `project` VALUES (2001,'This is my project 2','2016-11-06','Fairfield','2016-12-06','PENDING');
INSERT INTO `project` VALUES (2002,'This is my project 3','2016-11-06','Fairfield','2016-12-06','STARTED');
INSERT INTO `project` VALUES (2003,'This is my project 4','2016-11-06','Fairfield','2016-12-06','STARTED');



INSERT INTO `task` VALUES (3000,'Task 1','2016-11-01','2016-11-06',2000);
INSERT INTO `task` VALUES (3001,'Task 2','2016-11-02','2016-11-06',2000);
INSERT INTO `task` VALUES (3002,'Task 3','2016-11-03','2016-11-06',2000);
INSERT INTO `task` VALUES (3003,'Task 4','2016-11-04','2016-11-06',2000);
INSERT INTO `task` VALUES (3004,'Task 5','2016-11-05','2016-11-06',2000);
INSERT INTO `task` VALUES (3005,'Task 6','2016-11-06','2016-11-06',2000);
INSERT INTO `task` VALUES (3006,'Task 7','2016-11-07','2016-11-06',2000);

INSERT INTO `task` VALUES (3007,'Task 1','2016-11-16','2016-11-06',2001);
INSERT INTO `task` VALUES (3008,'Task 2','2016-11-12','2016-11-06',2001);
INSERT INTO `task` VALUES (3009,'Task 3','2016-11-05','2016-11-06',2001);
INSERT INTO `task` VALUES (3010,'Task 4','2016-11-07','2016-11-06',2001);
INSERT INTO `task` VALUES (3011,'Task 5','2016-11-03','2016-11-06',2001);
INSERT INTO `task` VALUES (3012,'Task 6','2016-11-06','2016-11-06',2001);
INSERT INTO `task` VALUES (3013,'Task 7','2016-11-06','2016-11-06',2001);

INSERT INTO `task` VALUES (3014,'Task 1','2016-11-16','2016-11-06',2002);
INSERT INTO `task` VALUES (3015,'Task 2','2016-11-26','2016-11-06',2002);
INSERT INTO `task` VALUES (3016,'Task 3','2016-11-16','2016-11-06',2002);
INSERT INTO `task` VALUES (3017,'Task 4','2016-11-15','2016-11-06',2002);
INSERT INTO `task` VALUES (3018,'Task 5','2016-11-14','2016-11-06',2002);
INSERT INTO `task` VALUES (3019,'Task 6','2016-11-12','2016-11-06',2002);
INSERT INTO `task` VALUES (3020,'Task 7','2016-11-06','2016-11-06',2002);


INSERT INTO `service` VALUES (4000,'USer 1 on Task 3','2016-11-06',3000,1000);
INSERT INTO `service` VALUES (4001,'USer 1 on Task 3','2016-11-06',3014,1000);
INSERT INTO `service` VALUES (4002,'USer 1 on Task 3','2016-11-06',3020,1000);

INSERT INTO `service` VALUES (4003,'USer 1 on Task 3','2016-11-06',3001,1001);
INSERT INTO `service` VALUES (4004,'USer 1 on Task 3','2016-11-06',3015,1001);
INSERT INTO `service` VALUES (4005,'USer 1 on Task 3','2016-11-06',3008,1001);

INSERT INTO `service` VALUES (4006,'USer 1 on Task 3','2016-11-06',3009,1002);
INSERT INTO `service` VALUES (4007,'USer 1 on Task 3','2016-11-06',3018,1002);
INSERT INTO `service` VALUES (4008,'USer 1 on Task 3','2016-11-06',3003,1002);



INSERT INTO `resource` VALUES (5000,'my resource',3000);
INSERT INTO `resource` VALUES (5001,'my resource',3014);
INSERT INTO `resource` VALUES (5002,'my resource',3020);

INSERT INTO `resource` VALUES (5003,'my resource',3001);
INSERT INTO `resource` VALUES (5004,'my resource',3015);
INSERT INTO `resource` VALUES (5005,'my resource',3008);

INSERT INTO `resource` VALUES (5006,'my resource',3009);
INSERT INTO `resource` VALUES (5007,'my resource',3018);
INSERT INTO `resource` VALUES (5008,'my resource',3003);