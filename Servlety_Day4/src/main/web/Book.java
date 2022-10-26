package main.web;

public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String _title, String _author, String _isbn){
        this.title = _title;
        this.author = _author;
        this.isbn = _isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
}
