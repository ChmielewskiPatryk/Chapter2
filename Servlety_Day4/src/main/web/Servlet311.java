package main.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet311", value = "/Servlet311")
public class Servlet311 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");
        if (sess.isNew()) {
            getServletContext().getRequestDispatcher("/chooseLang.jsp").forward(request, response);
        } else {
            Cookie[] cookies = request.getCookies();
            String l = "pl";
            for (Cookie c : cookies) {
                if (c.getName().equals("lang")) {
                    l = c.getValue();
                }
            }
            request.setAttribute("Message", lang.get(l));
            response.getWriter().append(lang.get(l));
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
