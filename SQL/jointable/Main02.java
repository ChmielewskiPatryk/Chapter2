use products_ex;

select * from orders 
join products on orders.id = products.id where orders.id = 1;

select * from orders 
join products on orders.id = products.id where products.id = 1;
