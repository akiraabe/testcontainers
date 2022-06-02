CREATE TABLE IF NOT EXISTS `todos`
(
    `id`        INTEGER      NOT NULL
   ,`title`     VARCHAR(30)  NOT NULL
   ,`content`   VARCHAR(255) NOT NULL
   ,PRIMARY KEY(`id`)
);