package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet(name = "Servlet32", value = "/Servlet32")
public class Servlet32 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("servlet32.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("binary");
        boolean match = Pattern.matches("[01]+",num);
        if(match == true){
         char[] ch = num.toCharArray();
         int dec = 0;
         response.getWriter().append("Lenght: "+ch.length + " decvalue : "+dec +"\n");
         for (int i =0; i<ch.length;i++){
             dec += Integer.parseInt(String.valueOf(ch[i])) * Math.pow(2,ch.length-i-1);
             response.getWriter().append("Iteration: "+i + " decvalue : "+dec +"\n");
         }
         response.getWriter().append("Decimal value: "+dec);

        }else{
            response.sendRedirect("servlet32.html");
        }
    }
}
