use cinemas_ex;
update cinemas set address = "Stadion Narodowy" where address like "%z";
delete from payments where payment < date_sub(now(), interval 3 day);
update movies set rating = 6.3 where length(description) > 40;
update tickets set price = 0.5 * price;