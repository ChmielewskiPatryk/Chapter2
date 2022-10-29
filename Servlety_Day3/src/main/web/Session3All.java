package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session3All", value = "/showAllSessions")
public class Session3All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        List<String> keys = (List<String>)sess.getAttribute("keys");
        Writer w = response.getWriter();
        w.append("<!DOCTYPE html>");
        w.append("<head>");
        w.append("</head>");
        w.append("<body>");
        w.append("<table>");
        w.append("<tr>");
        w.append("<th>");
        w.append("key");
        w.append("</th>");
        w.append("<th>");
        w.append("value");
        w.append("</th>");
        w.append("</tr>");

        for(String key : keys){
            String value = (String)sess.getAttribute(key);
            w.append("<tr>");
            w.append("<th>");
            w.append(key);
            w.append("</th>");
            w.append("<th>");
            w.append(value);
            w.append("</th>");
            w.append("</tr>");

        }
        w.append("</table>");
        w.append("</body>");
        w.append("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
