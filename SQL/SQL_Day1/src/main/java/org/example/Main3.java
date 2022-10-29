//W pliku Main03.java znajdują się zapytania do bazy danych. Dotyczą stworzonych wcześniej baz i tabel w zadaniach z działu: 1_Tworzenie_baz_i_tabel, jednakże są niepoprawne.
//Twoim zadaniem jest znaleźć błędy, a poprawne zapytanie zapisać do przygotowanych zmiennych.
package org.example;

public class Main3 {

    public String query1 = "INSERT INTO products SET id=0, name=produkt1, description=name, price=904";
    public String query1fixed = "INSERT INTO products(name,description,price) VALUES('produkt1','name','904');";

    public String query2 = "INSERT INTO clients VALUES(\"Jan\", \"Kowalski\", 4, \"Mr.\")";
    public String query2fixed = "INSERT INTO clients(name,surname) VALUES('Jan','Kowalski');";

    public String query3 = "INSERT INTO movies(id, rating, title) VALUES(null, \"bardzo dobry\", \"Szybcy i wściekli\")";
    public String query3fixed = "INSERT INTO movies(rating, title) VALUES('bardzo dobry', 'Szybcy i wściekli';";

    public String query4 = "INSERT INTO payments SET id=90 AND VALUES(\"cash\", NOW())";
    public String query4fixed = "INSERT INTO payments(type,payment_date) VALUES('cash', NOW())";
}
