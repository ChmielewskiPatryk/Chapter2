package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2", value = "/Session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("formSession2.html");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        int mark = Integer.parseInt(request.getParameter("mark"));
        List<Integer> marks = new ArrayList<>();
        if (sess.getAttribute("marks") == null) {
            marks.add(mark);
        } else {
            marks = (List<Integer>) sess.getAttribute("marks");
            marks.add(mark);
        }
        sess.setAttribute("marks", marks);

        int counter = 0;
        int sum = 0;
        for (int i = 0; i < marks.size(); i++) {
            response.getWriter().append((marks.get(i)) + " ");
            counter++;
            sum += marks.get(i);
        }
        double avg = (double) sum / (double) counter;
        sess.setAttribute("avg", avg);
        response.getWriter().append("Avg: " + avg);
    }

}
