package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session1Get", value = "/Session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession sess = request.getSession();

        if (sess.getAttribute("counter") == null) {
            response.getWriter().append("EMPTY");
        } else {
            int counter = (int) sess.getAttribute("counter") + 1;
            sess.setAttribute("counter", counter);
            response.getWriter().append(String.valueOf(counter));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
