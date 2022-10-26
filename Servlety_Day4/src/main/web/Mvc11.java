package main.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc11", value = "/Mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        if (role != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ROLE_");
            sb.append(role.toUpperCase());
            request.setAttribute("userRole", sb.toString());
        }
        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
