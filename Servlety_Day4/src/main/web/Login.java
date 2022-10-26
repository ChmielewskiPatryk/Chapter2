package main.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            HttpSession sess = request.getSession();
            sess.setAttribute("username","jakiesDane");
            response.sendRedirect("admin");
            // dodaj dane do sesji pod kluczem: username
            // przekieruj na adres /admin
        } else {
            response.getWriter().append("Wrong login/password");
        }

    }
}
