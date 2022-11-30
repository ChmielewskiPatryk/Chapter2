create table image(
id int not null auto_increment primary key,
offer_id int unsigned,
scr varchar(100),
dimension varchar(10));

create table users_companies(
id int unsigned auto_increment primary key,
user_id int unsigned unique,
name varchar(30),
nip int,
street varchar(50),
street_nr mediumint,
phone char(9),
post_code char(6),
capital decimal(7,2),
rate decimal(5,4),
created_at datetime);