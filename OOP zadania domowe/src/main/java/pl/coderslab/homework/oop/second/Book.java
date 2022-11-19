import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int id;
    private  String title;
    private boolean  available;
    private Author author;
    private Author[] additionalAuthors;
    private  int popularity;

    public Book(int id, String title){
        this.id = id;
        this.title = title;
        this.available = true;
    }
    public Book(int id, String title, Author author){
        this.id = id;
        this.title = title;
        this.author = author;
        popularity++;
    }
    public Book(int id, String title, Author author, Author[] additionalAuthors ){
        this.id = id;
        this.title = title;
        this.author = author;
        popularity++;
    }
    public String toString(){
        return getId() + " " + getTitle();
    }

    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public  void setAvailable(boolean available){
        this.available = available;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setAdditionalAuthors(Author[] additionalAuthors){
        this.additionalAuthors = additionalAuthors;
    }
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public boolean getAvailable(){
        return this.available;
    }
    public Author getAuthor(){
        return this.author;
    }
    public Author[] getAdditionalAuthors(){
        return this.additionalAuthors;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void increasePopularity() {
        this.popularity++;
    }
    public boolean equals (Book book){
        return this.id == book.id;
    }
}

