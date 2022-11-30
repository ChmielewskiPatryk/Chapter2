use products_ex;
create table client_address(
client_id int not NULL,
city varchar(100),
street varchar(100),
house_nr varchar(100),
primary key(client_id),
foreign key(client_id) references clients(id)
on delete cascade
);
insert into client_address(client_id, city, street, house_nr) values
(1, "Kościan", "Surzyńśkiego", "4/5"),
(2, "Skórzewo", "os.Grafitowe", "8/9"),
(4, "Leszno", "ul. Wyzwolenia", "3");

