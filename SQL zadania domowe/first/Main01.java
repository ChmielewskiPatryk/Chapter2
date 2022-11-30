use products_ex;
Select name from users where name like 'Julia%';
select * from users order by email desc limit 5;
select * from users where email like '%yahoo.com' and name like'L%';

select id, title from offers where price > 500000;
select id, price from offers where activation_token is null and price between 2000 and 400000;
SELECT title, price, phone FROM offers WHERE status = '1' AND DATE_ADD(expire, INTERVAL 10 DAY) > CURRENT_TIMESTAMP();
select * from offers where description like '%like%' and phone like '%2%' and price > 5000;
select * from offers where promoted = 0 and price < 300000 and title like '%PLC';
select * from offers where 2 * price < 50000 and promoted = 1;
select count(*) as sum_active from offers where expire > current_timestamp() and status = 1;
select owner, count(*) as sum_user from offers where  expire > current_timestamp() and status = 1 group by owner;
select status, count(*) as counter from offers where status != 0 group by status order by status asc;
select sum(price) as sum_nonactive_nopromoted from offers where promoted = 0 and status = 1 and expire < current_timestamp(); 
SELECT ROUND(AVG(price),2) as avg_price FROM offers WHERE  expire > CURRENT_TIMESTAMP() AND promoted = 1 and price > 44645.04;
select round(avg(price),2) as avg_price from offers where expire > current_timestamp() and promoted = 1 and price ? 44645.04;