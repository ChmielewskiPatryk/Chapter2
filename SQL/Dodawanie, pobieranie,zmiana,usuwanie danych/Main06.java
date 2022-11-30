use cinemas_ex;
select sum(quantity) from tickets;
select type, count(*) from payments group by type;
select * from payments limit 5 offset 2;
select *, count(*) from payments group by type having type > 2;
select sum(quantity) from tickets group by price having price > 23.15;