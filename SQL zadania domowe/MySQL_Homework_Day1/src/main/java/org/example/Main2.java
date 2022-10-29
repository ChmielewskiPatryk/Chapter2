package org.example;
//zapisz do odpowiednich zmiennych zapytania tworzące tabele.
//
//W bazie danych stwórz następujące tabele:
//
//* images:
//  * id: int unsigned auto_increment primary key
//  * offer_id: int unsigned
//  * src: varchar(100) (link do zdjęcia)
//  * dimension: varchar(10) (np. 400x832)
//* users_companies:
//  * id: int unsigned auto_increment primary key
//  * user_id: int unsigned unique
//  * name: varchar(30)
//  * nip: int
//  * street: varchar(50)
//  * street_nr: mediumint
//  * phone: char(9)
//  * post_code: char(6)
//  * capital: decimal(7,2)
//  * rate: decimal(5,4)
//  * created_at: datetime

//W pliku Main03.java napisz zapytania dodające po 5 rekordów do każdej z tabel, utworzonych w poprzednim zadaniu.

public class Main2 {
    public String QUERY1 = "CREATE TABLE images(id int AUTO_INCREMENT, offer_id int unsigned, src varchar(100), dimension varchar(100), PRIMARY KEY(id));";
    public String QUERY2 = "CREATE TABLE users_companies(id int AUTO_INCREMENT,user_id int unsigned unique, name varchar(30),nip int,street varchar(50),street_nr mediumint, phone char(9),post_code char(6),capital decimal(7,2),rate decimal(5,4), created_at datetime, primary key(id))";

    public String QUERY3 = "INSERT INTO images(offer_id,src,dimension) VALUES (2,'https://dlsakjdlaksdjas.pl','30x30');";
    public String QUERY4 = "INSERT INTO users_companies VALUES(null,1,'duap','231231','dsadasd 12','2','123456789','123456',12.42,2.1234,now());";
}