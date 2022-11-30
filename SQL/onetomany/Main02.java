use products_ex;
create table categories(
categories_id int auto_increment,
name varchar(100),
primary key(categories_id));

create table categories_sub(
categories_sub_id int not null auto_increment,
main_id int not null,
name varchar(100),
primary key(categories_sub_id),
foreign key(main_id)
references categories(categories_id));