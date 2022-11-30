create table categories_categoris_sub(
id int auto_increment,
categorie_id int not null,
categorie_sub_id int not null,
primary key(id),
foreign key(categorie_sub_id) references categories_sub(categories_sub_id),
foreign key(categorie_id) references categories(categories_id));
alter table categories_categoris_sub add name varchar(100);
insert into categories(name) values
('Komputery i Laptopy'),('Smartfony'), ('TV, Audio i RTV'), ('AGD');

insert into categories_categoris_sub(categorie_id,categorie_sub_id, name) values
(1,1, 'Laptopy'), (1,2, 'Laptopy gamingowe'),(1,3, 'Monitory'),(2,4,'Wszystkie smartfony'),
(2,5, 'Samsung'),(2,6,'Apple');
select * from categories_categoris_sub;
select * from categories_categoris_sub where categorie_id = 1;
select * from categories join 
categories_sub on categories.categories_id = categories_sub.categories_sub_id where main_id = 1;
/// próbowałem to jakoś połączyć