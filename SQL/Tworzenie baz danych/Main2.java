CREATE DATABASE products_ex;
SHOW databases;
create table products (
id int auto_increment,
name varchar(100),
description varchar(1000),
price decimal(1000,2));
create table orders (
id int auto_increment,
description varchar(1000));
create table clients (
id int auto_increment,
name varchar(100),
surname varchar(1000));