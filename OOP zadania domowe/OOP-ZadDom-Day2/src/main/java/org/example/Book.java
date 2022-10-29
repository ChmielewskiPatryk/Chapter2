//Zmodyfikuj klasę Book:
//
//Dodaj prywatny atrybut popularity który będzie przechowywał ilość wypożyczeń, ilość ta powinna się zwiększać o 1 z każdym wypożyczeniem.
//Zdefiniuj metodę equals(Book book), która na podstawie atrybutu id zwróci informacje czy obiekty są równe, tzn. czy obiekt podany jako argument jest taki sam jak ten, na rzecz którego metoda equals została wywołana.
//Przykład dla podpunktu 2:
//
//Book b1 = new Book();
//// dowonle operacje na b1
//Book b1 = new Book();
//// dowonle operacje na b2
//b1.equals(b2);
//
//w przykładzie sprawdzamy, czy obiekty b1 oraz b2 są równe.
package org.example;

public class Book {
    private int id;
    private String title;
    private boolean available;
    private Author author;
    private Author[] additionalAuthors;
    private int popularity;

    public Book(int id, String title) {
        this.available = true;
        this.id = id;
        this.title = title;
        this.popularity = 0;
    }

    public Book(int id, String title, Author author) {
        this.available = true;
        this.id = id;
        this.title = title;
        this.author = author;
        this.popularity = 0;
    }

    public Book(int id, String title, Author author, Author[] additionalAuthors) {
        this.available = true;
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
        this.popularity = 0;
    }

    public void borrowBook(){
        this.popularity++;
        setAvailable(false);
    }

    public boolean equals(Book book){
       if (this.getId() == book.getId()){
           return true;
       }else {
           return false;
       }
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
