select * from products 
join opinions on products.id = opinions.product_id 
where opinions.description is not null;

select * from products 
join opinions on products.id = opinions.product_id;

select * from products 
join opinions on products.id = opinions.product_id 
where products.id = 1;