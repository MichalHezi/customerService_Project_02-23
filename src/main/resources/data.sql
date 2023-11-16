DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL DEFAULT '',
    address varchar(255) NOT NULL DEFAULT '',
    joining_date varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);