create table products_orders(
id int auto_increment,
product_id int not null,
order_id int not null,
primary key(id),
foreign key(product_id) references products(id),
foreign key(order_id) references orders(id));

insert into products_orders (product_id, order_id) values
(1,1), (2,2),(3,2);
use products_ex;
select * from orders
join products_orders on orders.id = products_orders.order_id
join products on products.id = products_orders.product_id;
