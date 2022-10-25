package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Cookie4Show", value = "/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Writer writer = response.getWriter();
        writer.append("<!DOCTYPE html>");
        writer.append("<html>");
        writer.append("  <head>");
        writer.append("  </head>");
        writer.append("  <body>");
        for (Cookie c : cookies) {
            writer.append("<p>");
            writer.append(c.getName());
            writer.append("</p>");
            writer.append("<a href=\"http://localhost:8080/removeCookie?cookieToDel=");
            writer.append(c.getName());
            writer.append("\">Del cookie</a>");
        }
        writer.append("  </body>");
        writer.append("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
