//Praca domowa opiera się na modyfikacji zadań z dnia poprzedniego, poprzednie rozwiązania nie powinny być modyfikowane, zawartość klas możesz skopiować.
//
//Stwórz klasę Person, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut ten powinien trzymać numer identyfikacyjny,
//firstName - atrybut określający imię autora,
//lastName - atrybut określający nazwisko autora,
//Zdefiniuj odpowiednie dziedziczenie między klasą Author a klasą Person.
//Zdefiniuj odpowiednie dziedziczenie między klasą User a klasą Person.
//Usuń nadmiarowe parametry oraz metody.

//Zad4
//Dodaj metodę returnBook(Book book) przyjmującą obiekt klasy Book, która oznaczy książką jako dostępną do wypożyczenia, przez zmianę atrybutu available na wartość true, usunie z tablicy books obiektu User obiekt Book.
//Dodaj metodę returnAllBooks(), która dokona zwrotu wszystkich posiadanych książek.
package org.example;

import java.util.Arrays;

public class User extends Person {
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        book.borrowBook();
    }

    public void returnBook(Book book) {
        Book[] booksCopy = books;
        books = Arrays.copyOf(books, books.length - 1);

        for (int i = 0, k = 0; i < booksCopy.length; i++) {
            if (booksCopy[i].equals(book)) {
                continue;
            }
            books[k] = booksCopy[i];
            k++;
        }
        book.setAvailable(true);
    }

    public void returnAllBooks() {
        for (Book book : books){
            book.setAvailable(true);
        }
    }

}
