package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie36", value = "/rememberMe")
public class Cookie36 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        boolean userFound = false;
        for (Cookie c : cookies) {
            if (c.getName().equals("name")) {
                response.getWriter().append("Cześć " + c.getValue() + ". Twoje dane zostały wczytanie z ciasteczka");
                userFound = true;
            }
        }
        if (userFound == false) {
            response.getWriter().append("<!DOCTYPE html>\n" +
                    "<html lang=\"pl\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<form action=\"rememberMe\" method=\"post\">\n" +
                    "  <input type=\"text\" name=\"name\">\n" +
                    "  <label>\n" +
                    "    Zapamietaj mnie\n" +
                    "    <input type=\"checkbox\" name=\"remember\">\n" +
                    "  </label>\n" +
                    "</form>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String remember = request.getParameter("remember");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("Cześć: " + name);
        if (remember != null) {
            Cookie cookie = new Cookie("name", name);
            response.addCookie(cookie);
        }
    }
}
