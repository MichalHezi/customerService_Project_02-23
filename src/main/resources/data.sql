DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address varchar(255) NOT NULL DEFAULT '',
    joining_date DATE NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO users (first_name,last_name,email,age,address,joining_date)
VALUES ('Michal','Hezi','michalhezi2@gmail.com',27,'berdichevski 9','2023-11-18'),
        ('Moshe','Choen','moshecohen@gmail.com',22,'meir gershon 9','2023-11-18'),
        ('Adi','Levi','adilevi@gmail.com',25,'moshe dayan 10','2023-11-18'),
        ('Shirel','Hadar','shirel123@gmail.com',30,'rina nikova 8','2023-11-18'),
        ('Lihi','Perezt','lilosh1@gmail.com',32,'shaul hamelech 55','2023-11-18');