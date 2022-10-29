//zad1. Stwórz klasę Dog.

//zad2. Stwórz klasę Cat.

//zad3.utwórz obiekt klasy Cat i przypisz do zmiennej cat,
//utwórz obiekt klasy Dog i przypisz do zmiennej dog,
//spróbuj porównać oba te obiekty za pomocą instrukcji if, zaobserwuj jaki wystąpi błąd.

package org.example;

public class PierwszaKlasa {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        if(cat==dog){}
    }
}

class Dog {
    int age;
    String name;
}

class Cat {
    int age;
    String name;

}