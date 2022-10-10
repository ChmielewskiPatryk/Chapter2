package org.example;

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