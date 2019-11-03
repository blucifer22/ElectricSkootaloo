# Creating schema for holding scooters
create database scooterDB;

# Setting scooterDB as default schema
use scooterDB;

# Creating table for storing scooter information
create table scooter(
    id int NOT NULL auto_increment,
    brand varchar(50) NOT NULL,
    latitude double NOT NULL,
    longitude double NOT NULL,
    lastUsed timestamp NOT NULL,
    charge double NOT NULL,
    PRIMARY KEY (id)
);