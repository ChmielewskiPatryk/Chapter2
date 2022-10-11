package org.example;
//Stwórz klasę User, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut ten powinien trzymać numer identyfikacyjny,
//firstName - atrybut określający imię,
//lastName - atrybut określający nazwisko,
//books - tablica obiektów klasy Book.
//Posiadać konstruktor przyjmujący id, imię, nazwisko.
//Dodaj metodę addBook(Book book), która doda nową książkę do tablicy książek danego użytkownika.
//Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {

    }
}

class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int _id, String _firstName, String _lastName) {
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
}