use cinemas_ex;
alter table payments add column ticket_id int;
alter table payments add constraint fk_ticket_payment foreign key(ticket_id) references tickets(id);
insert into payments(type, payment, ticket_id) values
("cash", now(), 1),
("card", now(), 2),
("cash", now(), 3),
("transfer", "2022-11-18", 4);
use products_ex;
select * from products;