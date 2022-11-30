create database products_ex;
SHOW databases;
create table products (
id int auto_increment,
name varchar(100),
description varchar(1000),
price decimal(10,2),
primary key(id));

create table orders (
id int auto_increment,
description varchar(1000),
primary key(id));

create table clients (
id int auto_increment,
name varchar(100),
surname varchar(1000),
primary key(id));