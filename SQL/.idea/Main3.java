use cinemas_ex;
create table cinemas(
id int auto_increment,
name varchar(100),
address varchar(200) unique,
primary key(id));

create table movies(
id int auto_increment,
title varchar(100),
description varchar(1000),
rating decimal(4,2),
primary key(id));

create table tickets(
id int auto_increment,
quantity int,
price decimal(4,2),
status int,
primary key(id));

create table payments(
id int auto_increment,
type char(10),
payment date,
primary key(id));
