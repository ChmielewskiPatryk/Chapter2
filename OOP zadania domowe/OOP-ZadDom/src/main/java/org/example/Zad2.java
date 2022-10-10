//Stwórz klasę Author, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut ten powinien trzymać numer identyfikacyjny,
//firstName - atrybut określający imię autora,
//lastName - atrybut określający nazwisko autora,
//pseudonym - atrybut określający pseudonim autora,
//Posiadać konstruktor przyjmujący id, imię, nazwisko, pseudonim.
package org.example;

public class Zad2 {
    public static void main(String[] args) {

    }
}

class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public Author(int _id, String _firstName, String _lastName, String _pseudonym) {
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.pseudonym = _pseudonym;
    }
}