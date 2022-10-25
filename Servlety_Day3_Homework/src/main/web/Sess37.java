package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Sess37", value = "/Sess37")
public class Sess37 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int randNum1 = (int) ((Math.random() * 980) + 20);
        int randNum2 = (int) ((Math.random() * 980) + 20);
        HttpSession sess = request.getSession();
        sess.setAttribute("x1", randNum1);
        sess.setAttribute("x2", randNum2);
        response.getWriter().append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>X1:" + randNum1 + "</h1>" +
                "<h1>X2:" + randNum2 + "</h1>" +
                "<form method=\"POST\" action=\"/Sess37\" >\n" +
                "    <label>\n" +
                "        Add:\n" +
                "        <input type=\"text\" name=\"add\">\n" +
                "    </label>\n" +
                "    <label>\n" +
                "        Sub:\n" +
                "        <input type=\"text\" name=\"sub\">\n" +
                "    </label>\n" +
                "    <label>\n" +
                "        Multiply:\n" +
                "        <input type=\"text\" name=\"mul\">\n" +
                "    </label>\n" +
                "<input type=\"submit\">" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int add = Integer.parseInt(request.getParameter("add"));
        int sub = Integer.parseInt(request.getParameter("sub"));
        int mul = Integer.parseInt(request.getParameter("mul"));
        HttpSession sess = request.getSession();
        int x1 = (int) sess.getAttribute("x1");
        int x2 = (int) sess.getAttribute("x2");
        Writer w = response.getWriter();
        String addResult;
        String subResult;
        String mulResult;
        addResult = (add == (x1 + x2)) ? "Correct" : "Wrong";
        subResult = (sub == (x1 - x2)) ? "Correct" : "Wrong";
        mulResult = (mul == (x1 * x2)) ? "Correct" : "Wrong";

        w.append(x1 + " + " + x2 + " = " + add + " " + addResult + "\n");
        w.append(x1 + " - " + x2 + " = " + sub + " " + subResult + "\n");
        w.append(x1 + " * " + x2 + " = " + mul + " " + mulResult);

    }
}
