package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet35", value = "/Servlet35")
public class Servlet35 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameterValues("num") == null) {
            response.sendRedirect("servlet35.html");
        } else {
            String[] nums = request.getParameterValues("num");
            Writer w = response.getWriter();
            w.append("Liczby: \n");
            w.append(" - " + nums[0] + "\n");
            w.append(" - " + nums[1] + "\n");
            w.append(" - " + nums[2] + "\n");
            w.append(" - " + nums[3] + "\n");
            w.append("Srednia: " + ((Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]) + Integer.parseInt(nums[3])) / 4) + "\n");
            w.append("Suma: " + (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]) + Integer.parseInt(nums[3])) + "\n");
            w.append("Iloczyn: " + Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]) * Integer.parseInt(nums[2]) * Integer.parseInt(nums[3]) + "\n");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
