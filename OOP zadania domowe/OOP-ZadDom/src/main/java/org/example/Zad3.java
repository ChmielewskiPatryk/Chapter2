//Stwórz klasę Book, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut typu int ten powinien trzymać numer identyfikacyjny książki,
//title - atrybut typu String określający tytuł książki,
//available - atrybut typu boolean określający czy książka jest możliwa do wypożyczenia, z domyślną wartością ustawioną na true, książka może być wypożyczona, lub np. w renowacji - ma wtedy atrybut określony na false.
//author - atrybut typu Author,
//additionalAuthors - tablica obiektów klasy Author.
//Posiadać konstruktor przyjmujący id, title.
//Posiadać konstruktor przyjmujący id, title, obiekt klasy Author.
//Posiadać konstruktor przyjmujący id, title, obiekt klasy Author, tablicę obiektów klasy Author.
//Posiadać gettery do wszystkich pól.
//Posiadać settery do wszystkich pól.
package org.example;

public class Zad3 {
    public static void main(String[] args) {

    }
}

class Book {
    private int id;
    private String title;
    private boolean available;
    private Author author;
    private Author[] additionalAuthors;

    public Book(int _id, String _title) {
        this.available = true;
        this.id = _id;
        this.title = _title;
    }

    public Book(int _id, String _title, Author _author) {
        this.available = true;
        this.id = _id;
        this.title = _title;
        this.author = _author;
    }

    public Book(int _id, String _title, Author _author, Author[] _additionalAuthors) {
        this.available = true;
        this.id = _id;
        this.title = _title;
        this.author = _author;
        this.additionalAuthors = _additionalAuthors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }
}