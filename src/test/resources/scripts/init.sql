CREATE TABLE IF NOT EXISTS `todos`
(
    `id`        INTEGER      NOT NULL
   ,`title`     VARCHAR(30)  NOT NULL
   ,`content`   VARCHAR(255) NOT NULL
   ,PRIMARY KEY(`id`)
);

DELETE FROM `todos`;
INSERT INTO `todos` VALUES (1,'todo1-it','content1');
INSERT INTO `todos` VALUES (2,'todo2-it','content2');
INSERT INTO `todos` VALUES (3,'todo3-it','content3');