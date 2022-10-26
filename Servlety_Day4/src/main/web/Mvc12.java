package main.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc12", value = "/Mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("start") != null && request.getParameter("end") != null) {
            int start = Integer.parseInt(request.getParameter("start")) + 10;
            int end = Integer.parseInt(request.getParameter("end")) + 10;
            request.setAttribute("start", start);
            request.setAttribute("end", end);
        }
        getServletContext().getRequestDispatcher("/jsp2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
