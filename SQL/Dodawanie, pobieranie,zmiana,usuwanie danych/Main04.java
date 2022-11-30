use cinemas_ex;
insert into cinemas(name, address, openTime, closeTime) values
("Multikino1", "Poznań", "10:00", "23:00" ), 
("Multikino2", "Leszno", "10:00", "23:00"), 
("Multikino3", "Kraków", "10:00", "23:00"), 
("Multikino4", "Gdańsk", "10:00", "23:00"), 
("Multikino5", "Warszawa", "10:00", "23:00");

insert into movies(title, description, rating, director, watchCount, isTop) values
("Harry Potter","Przygody młodego czarodzieja", 9.5, "Chris Columbus", 10000, 10), 
("Harry Potter 2 ","Przygody młodego czarodzieja 2", 9.5, "Chris Columbus", 10000, 9), 
("Harry Potter 3","Przygody młodego czarodzieja 3", 9.0, "Chris Columbus", 10000, 6), 
("Harry Potter 4","Przygody młodego czarodzieja 4", 9.6, "Chris Columbus", 10000, 8), 
("Harry Potter 5","Przygody młodego czarodzieja 5", 9.2, "Chris Columbus", 10000, 7);

insert into payments(type, payment) values
("cash", now()), ("cash", now()), 
("cash", now()), ("cash", now()), 
("cash", now());

insert into tickets(quantity, price,status) values
(100, 19.99, 1), 
(200, 19.99, 1), 
(50, 19.99, 1), 
(150, 19.99, 1), 
(180, 19.99, 1);
