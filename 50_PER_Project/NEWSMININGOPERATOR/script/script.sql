DROP DATABASE IF EXISTS db_mining; 
CREATE DATABASE  db_mining; --'db_mining.tbl_mining' 
use  db_mining;

CREATE TABLE tbl_newsmining(
    id INT primary key auto_increment,
    title varchar(255),
    category TEXT,
    filePath TEXT,
    token1 varchar(255),
    token2 varchar(255),
    token3 varchar(255),
    token4 varchar(255),
    token5 varchar(255),
    token6 varchar(255),    
    token7 varchar(255),
    token8 varchar(255),
    totalWeight varchar(255),
    byUser varchar(255),
    entryDate varchar(255),
    txtSearchText TEXT,
    isActive varchar(1)
);
CREATE TABLE tbl_mining(
    id INT primary key auto_increment,
    title varchar(255),
    category TEXT,
    filePath TEXT,
    token1 varchar(255),
    token2 varchar(255),
    token3 varchar(255),
    token4 varchar(255),
    token5 varchar(255),
    token6 varchar(255),    
    token7 varchar(255),
    token8 varchar(255),
    totalWeight varchar(255),
    byUser varchar(255),
    entryDate varchar(255),
    txtSearchText TEXT,
    isActive varchar(1)
);

CREATE TABLE tbl_user(
    id INT primary key auto_increment,
    userType varchar(255),
    userName varchar(255),
    password varchar(255),
    entryDate varchar(255),
    isActive varchar(1)
);

INSERT INTO tbl_user(`userType`,`userName`,`password`,`entryDate`) VALUES ('admin','admin','admin@123','01/01/2013');    
CREATE TABLE tbl_operator(
    id INT primary key auto_increment,
    codeNumber varchar(255),
    fullName varchar(255),
    contatNo varchar(255),
    emailId varchar(255),
    userName varchar(255),
    password varchar(255),
    entryDate varchar(255),
    isActive varchar(1)
);


CREATE TABLE tbl_tokanizing(
    id INT primary key auto_increment,
    txtToken varchar(100),
    txtWeight int(5)
);

CREATE TABLE tbl_category(
    id INT primary key auto_increment,
    txtCategory varchar(100),
    txtWeight int(5)
);