//Stwórz klasę SoundBook, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//duration - atrybut ten powinien przechowywać długość nagrań,
//numberOfCarriers - atrybut określający liczbę nośników (płyt CD, kaset) które są zawarte w ramach jednej książki.
//Zdefiniuj odpowiednie dziedziczenie między klasą SoundBook a klasą Book.
package org.example;

public class SoundBook extends Book {
    private double duration;
    private int numberOfCarriers;
    public SoundBook(int id, String title,double duration, int numberOfCarriers){
        super(id,title);
        this.duration =duration;
        this.numberOfCarriers =numberOfCarriers;
    }
    public SoundBook(int id, String title, Author author,double duration, int numberOfCarriers){
        super(id,title,author);
        this.duration =duration;
        this.numberOfCarriers =numberOfCarriers;
    }
    public SoundBook(int id, String title, Author author, Author[] additionalAuthors,double duration, int numberOfCarriers){
        super(id,title,author,additionalAuthors);
        this.duration =duration;
        this.numberOfCarriers =numberOfCarriers;
    }
}
