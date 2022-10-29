package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie1Get", value = "/showCookie")
public class Cookie1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieValue = null;
        for (Cookie c : cookies) {
            if ("User".equals(c.getName())) {
                cookieValue = c.getValue();
            }
        }
        if (cookieValue == null) {
            response.getWriter().append("BRAK");
        } else {
            response.getWriter().append(cookieValue);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
