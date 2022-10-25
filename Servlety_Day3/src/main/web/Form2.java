package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form2", value = "/post2")
public class Form2 extends HttpServlet {
    String[] wulgaryzmy = {"dupa", "kurwa"};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("form2.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("tekst");
        String check = request.getParameter("zgoda");
        if (check == null) {
            for (int i = 0; i < wulgaryzmy.length; i++) {
                if (text.contains(wulgaryzmy[i])) {
                    int l = wulgaryzmy[i].length();
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < l; j++) {
                        sb.append("*");
                    }
                    String toReplace = sb.toString();
                    text = text.replaceAll(wulgaryzmy[i], toReplace);
                }
            }
        }
        response.getWriter().append(text);

    }
}
