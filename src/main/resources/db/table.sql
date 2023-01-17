CREATE TABLE product(
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar not null unique,
    price int not null,
    qty int not null,
    createdAt TIMESTAMP not null
);