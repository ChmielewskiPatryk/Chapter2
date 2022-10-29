package main.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Mvc14", value = "/Mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Tytul1", "Author1","Isbn1");
        Book book2 = new Book("Tytul2", "Author2","Isbn2");
        Book book3 = new Book("Tytul3", "Author3","Isbn3");
        Book book4 = new Book("Tytul4", "Author4","Isbn4");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        request.setAttribute("books",books);
        getServletContext().getRequestDispatcher("/resultList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
