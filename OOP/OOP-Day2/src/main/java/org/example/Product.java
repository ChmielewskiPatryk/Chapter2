//Napisz podstawę programu obiektowego, który będzie wspomagać skanowanie produktów w sklepie.
//
//Stwórz klasę Product. Klasa ma posiadać poniższe atrybuty:
//
//id – liczba całkowita. Powinna być unikalna w całym systemie (w dalszej części zadania zostanie wyjaśnione jak to osiągnąć),
//name – typu String, jest to nazwa danego produktu,
//price – typu double, jest to cena za jeden produkt. Powinna być większa od 0.01. Sprawdź ten warunek w setterze utworzonym własnoręcznie. Jeśli warunek nie będzie spełniony – zwróć wyjątek.
//Generowanie kolejnego id dla produktu:
//W dalszej części programu będziemy chcieli identyfikować nasze produkty po ich id, dlatego musimy zagwarantować, że każdy z utworzonych produktów będzie miał unikalny numer identyfikacyjny. W tym celu powinniśmy zdefiniować zmienną klasową nextId.
//
//Zmienna ta będzie trzymała id, które zostanie nadane kolejnemu utworzonemu produktowi. Następnie w konstruktorze klasy musimy wykonać poniższe czynności:
//
//każdemu tworzonemu produktowi przypisać id trzymane w zmiennej nextId,
//zwiększyć wartość nextId o jeden.
////w konstruktorze
//this.id = nextId;
//nextId++;
//
//
//Dzięki temu żaden z naszych produktów nie będzie miał takiego samego id.

package org.example;

public class Product {
    private static int nextId = 0;
    public int id;
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;

    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price > 0.01) {
            this.price = price;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getPrice() {
        return price;
    }
}
