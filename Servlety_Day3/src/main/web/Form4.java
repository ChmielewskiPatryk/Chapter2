package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form4", value = "/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("form4.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));
        double delta = (Math.pow(b,2) - 4*a*c);
        if(delta<0.0){
            response.getWriter().append("Delta mniejsza od zera");
        }else{
            double x1 = (-b - Math.sqrt(delta))/2*a;
            double x2 = (-b + Math.sqrt(delta))/2*a;
            response.getWriter().append("Rozwiązania równania: \n"+" x1:" +x1 + " x2:" +x2);
        }
    }
}
