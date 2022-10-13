package org.example;

public class Main2 {
    // BAZA DANYCH JEST INNA DLATEGO NIEKTORE LICZBY/DATY ITP SĄ ZMIENIONE W QUERY
    //Stwórz nową bazę danych o nazwie cinemas_ex. Pamiętaj, że zapytanie się nie uda, jeżeli baza już istnieje.
    final String QUERY = "CREATE DATABASE cinemas_ex CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;";
    //w bazie danych o nazwie cinemas_ex stwórz następujące tabele (jeżeli tabela już istnieje, to nie da się jej stworzyć – SQL zwróci błąd):
    //* cinemas: id: int, name: varchar(100), address: varchar(200)
    //* movies: id: int, title: varchar(100),description: varchar(1000), rating: decimal (2 decimal places)
    //* tickets: id: int, quantity: int, price: decimal (2 decimal places), status: int (1 - opłacony, 0 - nie opłacony
    //* payments: id: int, type: char(10) (Zakładamy, że są trzy typy płatności: `cash`, `transfer` lub `card`), payment_date: date
    //
    //Pamiętaj o:zakładaniu odpowiednich atrybutów na pola (np. każde id powinno być kluczem głównym, automatycznie numerowanym),
    //używaniu odpowiednich typów danych dla każdej kolumny w bazie,dokładnym czytaniu kodów błędów zwracanych przez MySQL.
    final String QUERY1 = "CREATE TABLE cinemas(id INT AUTO_INCREMENT, name VARCHAR(100), address VARCHAR(200), PRIMARY KEY(id));";
    final String QUERY2 = "CREATE TABLE movies(id INT AUTO_INCREMENT, title VARCHAR(100), description VARCHAR(100), rating DECIMAL(5,2), PRIMARY KEY(id));"
    final String QUERY3 = "CREATE TABLE tickets(id INT AUTO_INCREMENT, quantity INT, price DECIMAL(5,2), status INT, PRIMARY KEY(id));"
    final String QUERY4 = "CREATE TABLE payments(id INT AUTO_INCREMENT, type CHAR(10), payment_date DATE, PRIMARY KEY(id));"
    //Dodaj do tabeli tickets kolumnę priceUSD, przechowującą cenę biletu w USD.
    //Dodaj do tabeli movies kolumnę director typ char(80), przechowującą imię i nazwisko reżysera.
    //Zmień w tabeli movies kolumnę director na typ varchar(50).
    //Usuń kolumnę priceUSD z tabeli tickets.
    final String QUERY5 = "ALTER TABLE tickets ADD priceUSD DECIMAL(5,2);";
    final String QUERY6 = "ALTER TABLE movies ADD director CHAR(80);";
    final String QUERY7 = "ALTER TABLE movies MODIFY COLUMN director VARCHAR(50);";
    final String QUERY8 = "ALTER TABLE tickets DROP COLUMN priceUSD;";
    //Dodające do tabeli movies kolumnę watchCount, przechowującą ilość wyświetleń filmu.
    //Dodające do tabeli movies kolumnę isTop, przechowującą wartość tinyint (domyślnie wartość 0) o tym czy film jest hitem.
    //Dodające do tabeli cinemas kolumnę openTime, przechowującą godzinę otwarcia.
    //Dodające do tabeli cinemas kolumnę closeTime, przechowującą godzinę zamknięcia.
    final String QUERY9 = "ALTER TABLE movies ADD watchCount INT;";
    final String QUERY10 = "ALTER TABLE movies ADD isTop tinyint DEFAULT 0;";
    final String QUERY11 = "ALTER TABLE cinemas ADD openTime TIME;";
    final String QUERY12 = "ALTER TABLE cinemas ADD closeTime TIME;";
    //Napisz zapytania SQL, żeby wypełnić pięcioma wpisami każdą tabelę w bazie danych o nazwie cinemas_ex.
    final String QUERY13 = "INSERT INTO cinemas(name, address, openTime, closeTime) VALUES ('KINO1','ULICA1','07:00:00','21:00:00'),('KINO2','ULICA2','07:00:00','21:00:00'),('KINO3','ULICA3','09:00:00','23:00:00'),('KINO4','ULICA5','08:00:00','22:00:00'),('KINO5','ULICA5','07:00:00','21:00:00');";
    final String QUERY14 = "INSERT INTO movies(title,description,rating,director,watchCount,isTop) VALUES ('Tytul1','Opis1','9.2','Jakiś typ1','10','0'),('InnyTytul2','Opis2','7.2','Jakiś typ2','99','1'),('Tytul3','Opis3','9.6','Jakiś typ3','76','0'),('Tytul4','Opis4','7.2','Jakiś typ4','110','0'),('Tytul5','Opis5','9.7','Jakiś typ5','1','0');";
    final String QUERY15 = "INSERT INTO payments(type, payment_date) VALUES ('card','2022-06-11'),('cash','2022-06-07'),('card','2022-06-17'),('cash','2022-06-13'),('cash','2022-06-14');";
    final String QUERY16 = "INSERT INTO tickets(quantity, price, status) VALUES ('5','99.99','0'),('3','59.99','1'),('1','19.99','1'),('2','39.99','1'),('1','19.99','1');";
    //wszystkie filmy na literę W,
    //wszystkie bilety, których cena jest większa niż 15.30,
    //wszystkie bilety, których liczba jest większa niż 3,
    //wszystkie filmy, które mają rating większy niż 6.5,
    //film z największą wartością rating (wykorzystaj ORDER BY oraz LIMIT).
    final String QUERY17 = "SELECT * FROM movies WHERE title LIKE 'T%';";
    final String QUERY18 = "SELECT * FROM tickets WHERE price > 25.30;";
    final String QUERY19 = "SELECT * FROM tickets WHERE quantity > 3; ";
    final String QUERY20 = "SELECT * FROM movies WHERE rating > 8.5;";
    final String QUERY21 = "SELECT * FROM movies ORDER BY rating DESC LIMIT 1;";
    //liczbę wszystkich biletów,
    //liczbę wszystkich płatności, grupując je po kolumnie type,
    //średnią cenę biletu,
    //pięć ostatnich płatności, zaczynając od drugiej,
    //listę wszystkich płatności (pogrupowanych po kolumnie type), których liczba będzie większa niż 2,
    //sumę ilości SUM(quantity) wszystkich biletów, których cena jest większa niż 23,15.
    final String QUERY22 = "SELECT SUM(quantity) FROM tickets;";
    final String QUERY23 = "SELECT COUNT(type) FROM payments GROUP BY type;";
    final String QUERY24 = "SELECT AVG(price) FROM tickets;";
    final String QUERY25 = "SELECT * FROM payments LIMIT 1,5;";
    final String QUERY26 = "SELECT COUNT(type) FROM payments GROUP BY type HAVING COUNT(type)>2;";
    final String QUERY27 = "SELECT SUM(quantity) FROM tickets WHERE price>23.15";
    //usuną wiersz z tabeli filmów o id = 4,
    //usuną wiersze z tabeli kin gdzie nazwa to helios,
    //ustawią dla wszystkich biletów ilość na 10,
    //usuną wszystkie płatności, których data jest wcześniejsza niż 2019-01-01.
    final String QUERY28 = "DELETE FROM movies WHERE id=4;";
    final String QUERY29 = "DELETE FROM cinemas WHERE address = 'ULICA5'";
    final String QUERY30 = "UPDATE tickets SET quantity = 10";
    final String QUERY31 = "DELETE FROM payments WHERE payment_date < '2022-06-11';";
    //zmieniające adres na Stadion Narodowy dla kin, których nazwa kończy się na z,
    //usuwające płatności, których data jest starsza niż 4 dni od aktualnego czasu. Wybierz i wykorzystaj w tym celu odpowiednie funkcje MySQL. Zestawienie dostępnych funkcji: Date and Time Functions
    //zmieniające rating filmu na 5.4 dla filmów, których opis jest dłuższy niż 40 znaków – poszukaj funkcji MySQL, która sprawdza liczbę znaków,
    //zmniejszające cenę biletu o 50%, jeśli ich liczba jest większa niż 10, zapisz je jako pojedyncze zapytanie SQL.
    final String QUERY32 = "UPDATE cinemas SET address = 'Stadion narodowy' WHERE address LIKE '%2';";
    final String QUERY33 = "DELETE FROM payments WHERE DATE(payment_date) < NOW() - INTERVAL 120 DAY  ;";
    final String QUERY34 = "UPDATE movies SET rating=5.4 WHERE LENGTH(description) > 40;";
    final String QUERY35 = "UPDATE tickets SET price = 0.5*price WHERE quantity > 9;";
    //Tabela payments z tabelą tickets ma być powiązana relacją jeden do jednego.
    //Relacja między biletem a płatnością jest następująca:
    //
    //płatność musi być przypisana do biletu (dodaj klucz obcy do tabeli payments)
    //
    //Uzupełnij tabelę payments kilkoma wpisami. Przyjmujemy trzy typy płatności: cash, transfer i card.
    final String QUERY36 = "ALTER TABLE payments ADD COLUMN ticket_id INT;";
    final String QUERY37 = "ALTER TABLE payments ADD CONSTRAINT FT_ticket_payment FOREIGN KEY(ticket_id) references tickets(id);";
    final String QUERY38 = "INSERT INTO payments(type,payment_date,ticket_id) VALUES ('transfer','2022-07-05','2'),('cash','2022-07-07','1'),('card','2022-07-07','4');";
    final String QUERY39 = "";
    final String QUERY40 = "";


}
}
