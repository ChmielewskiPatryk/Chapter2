use products_ex;
update products set id = 0, name = 'produkt1', description = name, price = 904 where id = 0;
INSERT INTO clients VALUES(4, "MR. JAN",  "Kowalski");

use cinemas_ex;
INSERT INTO movies(title, rating) VALUES("Szybcy i wściekli", 9.0);
INSERT INTO payments(id, type, payment) values (90, "cash", now());
