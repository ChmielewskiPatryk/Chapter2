package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session3Add", value = "/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("session3.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");
        HttpSession sess = request.getSession();
        sess.setAttribute(key, value);
        List<String> keys = new ArrayList<>();
        if (sess.getAttribute("keys") != null) {
            keys = (List<String>) sess.getAttribute("keys");
        }
        keys.add(key);
        sess.setAttribute("keys", keys);

        response.sendRedirect("session3.html");
    }
}
