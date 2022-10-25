package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet31", value = "/Servlet31")
public class Servlet31 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.sendRedirect("servlet31.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String conversionType = request.getParameter("currency");
        double result = 0.0;
        switch (conversionType){
            case "eurusd":
                result = quantity * 0.98;
                break;
            case "usdeur":
                result = quantity * 1.02;
                break;
            case "eurpln":
                result = quantity * 4.7;
                break;
            case "plneur":
                result = quantity * 0.22;
                break;
            case "usdpln":
                result = quantity * 4.9;
                break;
            case "plnusd":
                result = quantity * 0.21;
                break;
        }
        response.getWriter().append("amount: "+ result);
    }
}
