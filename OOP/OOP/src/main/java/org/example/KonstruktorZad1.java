//Utwórz klasę Burger, dodaj w niej atrybuty:
//
//size,
//price.
//Utwórz konstruktor, który przyjmie i ustawi parametry size i price.
//Utwórz konstruktor bezargumentowy.
//Utwórz klasą MainBurger a następnie w metodzie main utwórz obiekty klasy Burger korzystając z konstruktorów.
package org.example;

public class KonstruktorZad1 {
    public static void main(String[] args) {
        Burger burger1 = new Burger();
        Burger burger2 = new Burger("300g", 70);
        System.out.println(burger1.price);
        System.out.println(burger2.price);
    }
}

class Burger {
    public String size;
    public int price;

    public Burger(String _size, int _price) {
        this.size = _size;
        this.price = _price;
    }

    public Burger() {
    }
}
