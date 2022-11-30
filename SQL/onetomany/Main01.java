use products_ex;
create table opinions(
opinions_id int not null auto_increment,
product_id int not null,
description varchar(1000),
primary key(opinions_id),
foreign key(product_id)
references products(id));

insert into opinions(product_id, description) values
(1, 'Monitor dobrej jakości'),
(2, 'Jak na windowsa całkiem dobry laptop'),
(3, 'Najlepszy ekran w laptopie'),
(2, 'Cena adekwatna do urządzenia'),
(3, 'Produkt zdecydowanie za drogi');

select * from products join opinions
on products.id = opinions.product_id;
