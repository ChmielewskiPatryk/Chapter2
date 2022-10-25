package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form5", value = "/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("form5.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double degree = Double.parseDouble(request.getParameter("degrees"));
        String conversionType = request.getParameter("conversionType");
        switch (conversionType) {
            case "celcToFahr":
                response.getWriter().append(String.valueOf(32.0 + (9.0 / 5.0 * degree)));
                break;
            case "FahrToCelc":
                response.getWriter().append(String.valueOf(5.0 / 9.0 * (degree - 32.0)));
                break;
        }
    }
}
