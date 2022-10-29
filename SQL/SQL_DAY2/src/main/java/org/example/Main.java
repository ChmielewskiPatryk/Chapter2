package org.example;

public class Main {

    //Część zadań ma w poleceniu utworzenie relacji między tabelami – w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele.
//
//Zadanie 1 - rozwiązywane z wykładowcą
//Zapytania wykonuj w bazie products_ex.
//
//W pliku Main01.java dodaj stałe i napisz w nich zapytania do bazy:
//
//połącz tabele products i orders relacją wiele do wielu,
//nową tabelę nazwij products_orders,
//uzupełnij tabelę kilkoma wpisami.

    public String QUERY1 = "CREATE TABLE products_orders(id int AUTO_INCREMENT, product_id int NOT NULL, order_id int NOT NULL, PRIMARY KEY(id), FOREIGN KEY(product_id) REFERENCES products(id), FOREIGN KEY(order_id) REFERENCES orders(id));";
    public String QUERY2 = "INSERT INTO products_orders(product_id, order_id) VALUES (1,2),(1,1),(2,1),(2,1);";
    //zamówienia dla produktu o id równym 1,
//produkty dla zamówienia o id równym 1.
    public String QUERY3 = "SELECT * FROM products_orders as po JOIN products as p ON po.product_id = p.id JOIN orders as o ON po.order_id = o.id WHERE p.id = 1;";
    public String QUERY4 = "SELECT * FROM products_orders as po JOIN products as p ON po.product_id = p.id JOIN orders as o ON po.order_id = o.id WHERE o.id = 1;";
    //wszystkie produkty, które mają opinie oraz wszystkie dostępne dla nich opinie (nie powinny występować wartości null),
    //pobierz wszystkie produkty razem z opiniami, niezależnie od tego czy mają opinie (mogą występować wartości null),
    //pobierz wszystkie opinie dla produktu o id = 1, wynik ma zawierać również wszystkie dane dotyczące produktu.
    public String QUERY5 = "SELECT * FROM products as p JOIN opinions as o ON p.id = o.product_id WHERE o.description != '';";
    public String QUERY6 = "SELECT * FROM products as p JOIN opinions as o ON p.id = o.product_id;";
    public String QUERY7 = "SELECT * FROM products as p JOIN opinions as o ON p.id = o.product_id WHERE p.id = 1;";
    //wszystkie podkategorie kategorii o id = 1, pobrane za pomocą odpowiedniego złączenia,
    //id oraz nazwę kategorii, ale tylko tych kategorii, które mają podkategorie (skorzystaj z DISTINCT).
    public String QUERY8 = "WTF";
    public String QUERY9 = "WTF";
}