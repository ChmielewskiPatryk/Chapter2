package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form3", value = "/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("page") != null){
            int input = Integer.parseInt(request.getParameter("page"));
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    sb.append(i + ",");
                }
            }
            response.getWriter().append("Dzielniki: " + sb.substring(0,sb.length()-1));
        }else{
            response.sendRedirect("form3.html");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
