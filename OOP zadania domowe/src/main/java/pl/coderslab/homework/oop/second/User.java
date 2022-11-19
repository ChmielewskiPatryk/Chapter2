import java.util.Arrays;

public class User extends Person {
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        book.setAvailable(false);
        this.books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }

    public boolean returnBook(Book book) {
        Book[] books1 = new Book[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                book.setAvailable(true);
            } else {
                books1 = Arrays.copyOf(books1, books1.length + 1);
                books1[books1.length - 1] = books[i];
            }
        }
        books = books1;
        return book.getAvailable();
    }

    public void returnAllBooks() {
        for( int i = 0; i < books.length; i++){
            books[i].setAvailable(true);
        }
        books = new Book[0];
        System.out.println("Lista wypożyczonych książek jest pusta");
    }

    public void printAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }


    public static void main(String[] args) {
        Book book1 = new Book(1, "Harry Potter");
        Book book2 = new Book(2, "Harry Potter");
        Book book3 = new Book(3, "Kroniki Jakuba Wędrowycza");
        Book book4 = new Book(4, "Kroniki Jakuba Wędrowycza 2");
        User kacper = new User(1, "Kacper", "Chmielewski");
        User patryk = new User(2, "Patryk", "Chmielewski");
        kacper.addBook(book1);
        kacper.addBook(book2);
        patryk.addBook(book3);
        patryk.addBook(book4);
        System.out.println(book1.getAvailable());
        System.out.println(book2.getAvailable());
        System.out.println(book3.getAvailable());
        System.out.println(book4.getAvailable());
        kacper.printAllBooks();
        patryk.printAllBooks();
        kacper.returnAllBooks();
        patryk.returnAllBooks();
        System.out.println(book1.getAvailable());
        System.out.println(book2.getAvailable());
        System.out.println(book3.getAvailable());
        System.out.println(book4.getAvailable());
        kacper.printAllBooks();
        patryk.printAllBooks();
    }
}

