package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Cookie51", value = "/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("visited", "true");
        String message = request.getParameter("msg");
        response.addCookie(cookie);
        Writer writer = response.getWriter();
        writer.append("<!DOCTYPE html>");
        writer.append("<html>");
        writer.append("  <head>");
        writer.append("  </head>");
        writer.append("  <body>");
        writer.append("<p>");
        writer.append(message);
        writer.append("</p>");
        writer.append("<a href=\"http://localhost:8080/cookie52\">Go to 52</a>");
        writer.append("  </body>");
        writer.append("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
