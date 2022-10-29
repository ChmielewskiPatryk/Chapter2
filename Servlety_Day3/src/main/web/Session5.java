package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Session5", value = "/Session5")
public class Session5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);
        response.getWriter().append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"Session5\" method=\"post\">\n" +
                "  <label>\n" +
                "    Name:\n" +
                "    <input type=\"text\" name=\"name\">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Surname:\n" +
                "  <input type=\"text\" name=\"surname\">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Email:\n" +
                "  <input type=\"text\" name=\"email\">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Type sum " + num1 + " + " + num2 +":\n" +
                "    <input type=\"number\" name=\"captcha\">\n" +
                "  </label>\n" +
                "\n" +
                "  <button type=\"submit\">Submit</button>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
        HttpSession sess = request.getSession();
        sess.setAttribute("captcha", num1+num2);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        int num = (int)sess.getAttribute("captcha");
        int cap = Integer.parseInt(request.getParameter("captcha"));
        if(num == cap){
            response.getWriter().append("Captcha OK");
        }else{
            response.getWriter().append("Captcha NOT OK");
        }
    }
}
