package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet33", value = "/Servlet33")
public class Servlet33 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        String text1 = (String)sess.getAttribute("text1");
        String text2 = (String)sess.getAttribute("text2");
        String text3 = (String)sess.getAttribute("text3");
        String text4 = (String)sess.getAttribute("text4");
        String text5 = (String)sess.getAttribute("text5");
        if(text1 == null){text1 = "";}
        if(text2 == null){text2 = "";}
        if(text3 == null){text3 = "";}
        if(text4 == null){text4 = "";}
        if(text5 == null){text5 = "";}


        Writer w = response.getWriter();
        w.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form method=\"POST\" action=\"Servlet33\">\n" +
                "  <label>\n" +
                "    Input1:\n" +
                "    <input type=\"text\" name=\"text1\" value="+text1+">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Input2:\n" +
                "    <input type=\"text\" name=\"text2\"value="+text2+">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Input3:\n" +
                "    <input type=\"text\" name=\"text3\"value="+text3+">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Input4:\n" +
                "    <input type=\"text\" name=\"text4\"value="+text4+">\n" +
                "  </label>\n" +
                "  <label>\n" +
                "    Input5:\n" +
                "    <input type=\"text\" name=\"text5\"value="+text5+">\n" +
                "  </label>\n" +
                "<input type=\"submit\">" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text1 = request.getParameter("text1");
        String text2 = request.getParameter("text2");
        String text3 = request.getParameter("text3");
        String text4 = request.getParameter("text4");
        String text5 = request.getParameter("text5");
        HttpSession sess = request.getSession();
        sess.setAttribute("text1", text1);
        sess.setAttribute("text2", text2);
        sess.setAttribute("text3", text3);
        sess.setAttribute("text4", text4);
        sess.setAttribute("text5", text5);

    }
}
