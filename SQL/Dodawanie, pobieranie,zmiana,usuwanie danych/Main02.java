use products_ex;
select price from products where price <= 50;
select name from clients where name like 'J%';
select description from orders where not null;
select price, count(*) from products group by price having price = 10;