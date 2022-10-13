/package org.example;

public class Main1 {
    public static void main(String[] args) {
        //Utwórz bazę o nazwie products_ex, pamiętaj o prawidłowym kodowaniu.
        final String QUERY = "CREATE DATABASE products_ex CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;";
        //W bazie danych o nazwie products_ex stwórz następujące tabele:
        //* products: id: int, name: varchar(100),description: varchar(1000),price: decimal (2 decimal places)
        //* orders: id:int,description: varchar(1000)
        //* clients:id: int, name: varchar(100),surname: varchar(100)
        final String QUERY1 = "USE products_ex;";
        final String QUERY2 = "CREATE TABLE products(id int AUTO_INCREMENT, name VARCHAR(100), description VARCHAR(1000), price DECIMAL(5,2), PRIMARY KEY(id));";
        final String QUERY3 = "CREATE TABLE orders( id int AUTO_INCREMENT, description VARCHAR(1000), PRIMARY KEY(id));";
        final String QUERY4 = "CREATE TABLE clients( id int AUTO_INCREMENT, name VARCHAR(100), surname VARCHAR(100) PRIMARY KEY(id));";
        // napisz zapytania SQL, które wypełnią dwoma wpisami każdą tabelę w bazie danych o nazwie products_ex.
        final String QUERY5 = "INSERT INTO clients(name, surname) VALUES ('Adam','Adamski'),('Jan','Kowalski');";
        final String QUERY6 = "INSERT INTO orders(description) VALUES('Przykładowy opis zamówienia',('Lorem ipsum'));";
        final String QUERY7 = "INSERT INTO products(name, description, price) VALUES ('Lampa','Super jasna lampa','19.99'),('Szafka','Idealna szafka nieza duza nie za mala','159.99');";
        //pierwsze 10 produktów gdzie cena jest większa lub równa 50,
        //wszystkich klientów z nazwiskiem zaczynającym się na literę: J,
        //wszystkie zamówienia gdzie opis nie jest pusty,
        //liczbę wszystkich produktów, których cena jest równa 10.
        final String QUERY8 = "SELECT * FROM products WHERE price >= 50 LIMIT 10;";
        final String QUERY9 = "SELECT * FROM clients WHERE name LIKE 'J%';";
        final String QUERY10 = "SELECT * FROM orders WHERE description IS NOT NULL;";
        final String QUERY11 = "SELECT * FROM products WHERE price = 10;";
        //products_ex tworzące tabelę:
        //* client_address:
        //  * client_id: int
        //  * city: varchar(100)
        //  * street: varchar(100)
        //  * house_nr: varchar(10)
        //
        //Tabela client_address ma być połączona relacją jeden do jednego z tabelą clients.
        //Napisz 5 zapytań SQL, które wprowadzą adresy dla istniejących już użytkowników.
        final String QUERY12 = "CREATE TABLE client_address(client_id INT NOT NULL, city VARCHAR(100), street VARCHAR(100), house_nr VARCHAR(10), PRIMARY KEY(client_id),FOREIGN KEY(client_id) REFERENCES clients(id) ON DELETE CASCADE);";
        final String QUERY13 = "INSERT INTO client_address(client_id,city,street,house_nr) VALUES (1,'Poznan','Poznanska','9'),(2,'Koscian','Koscianska',8)";
        //W bazie danych o nazwie products_ex stwórz następującą tabelę:
        //
        //* opinions:
        //  * description: string
        //
        //Tabela opinions ma być połączona z tabelą products relacją jeden do wielu (produkt ma wiele opinii, opinia jest przypisana do jednego produktu).
        //Napisz po 5 zapytań, które dodadzą opinie do 3 istniejących produktów.
        final String QUERY14 = "CREATE TABLE opinions(opinion_id int AUTO_INCREMENT, product_id int NOT NULL,description VARCHAR(1000), PRIMARY KEY(opinion_id), FOREIGN KEY(product_id) REFERENCES products(id));";
        final String QUERY15 = "INSERT INTO opinions(product_id, description) VALUES (1,'FAjna lampa'),(1,'Super lampa'),(1,'Nie fajna lampa'),(2,'Super  szafka'),(2,'Slaba Szafka')";
        //W bazie danych o nazwie products_ex stwórz następujące tabele:
        //
        //* categories:
        //  * id: int
        //  * name: varchar(100)
        //* categories_sub:
        //  * id: int
        //  * main_id: int -- relacja z id głównej kategorii
        //  * name: varchar(100)
        //
        //Połącz tabele categories i categories_sub za pomocą relacji wiele do jednego (jedna kategoria może mieć wiele podkategorii, jedna podkategoria ma jedną kategorię nadrzędną).
        final String QUERY16 = "CREATE TABLE categories(id int AUTO_INCREMENT, name VARCHAR(100), PRIMARY KEY(id));";
        final String QUERY17 = "CREATE TABLE categories_sub(id int AUTO_INCREMENT, main_id int, name VARCHAR(100), PRIMARY KEY(id), FOREIGN KEY(main_id) REFERENCES categories(id));";
        final String QUERY18 = "";


    }
}