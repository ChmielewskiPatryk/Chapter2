use products_ex;
insert into clients(name, surname) values
('Kacper', 'Chmielewski'), 
('Patryk', 'Chmielewski');

insert into orders(description) values('Monitor'), ('Laptop');

insert into products(name, description, price) values
('Dell', 'Monitor', 2000),
('ZenBook', 'Laptop', 5000),
('MacBook', 'Laptop', 7200);