CREATE TABLE `tester`.`users` (
  `id` BIGINT(20) NOT NULL  AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);

CREATE TABLE `tester`.`roles` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
  );

CREATE TABLE `tester`.`users_roles` (
  `user_id` BIGINT(20) NOT NULL,
  `role_id` BIGINT(20) NOT NULL,
  INDEX `fk_users_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_roles_idx` (`role_id` ASC) VISIBLE,
  CONSTRAINT `fk_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `tester`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_roles`
    FOREIGN KEY (`role_id`)
    REFERENCES `tester`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    );


INSERT INTO `tester`.`roles` (`name`) VALUES ('USER');
INSERT INTO `tester`.`roles` (`name`) VALUES ('MANAGER');
INSERT INTO `tester`.`roles` (`name`) VALUES ('ADMIN');
INSERT INTO `tester`.`users_roles` (`user_id`,`role_id`) VALUES ('1','1');

CREATE TABLE `tester`.`en_words` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `meaning` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE);


CREATE TABLE `tester`.`no_words` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `meaning` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE);


CREATE TABLE `tester`.`cards` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `en_word_id` BIGINT(20) NOT NULL,
  `no_word_id` BIGINT(20) NOT NULL,
  `rating` BIGINT(20) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk__idx` (`en_word_id` ASC) VISIBLE,
  INDEX `fk_no_word_idx` (`no_word_id` ASC) VISIBLE,
  CONSTRAINT `fk_en_word`
    FOREIGN KEY (`en_word_id`)
    REFERENCES `tester`.`en_words` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_no_word`
    FOREIGN KEY (`no_word_id`)
    REFERENCES `tester`.`no_words` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

    INSERT INTO `tester`.`en_words` (`meaning`) VALUES ('Hello');
    INSERT INTO `tester`.`no_words` (`meaning`) VALUES ('Halo');
    INSERT INTO `tester`.`cards` (`en_word_id`,`no_word_id`,`rating`) VALUES ('1','1','1');
