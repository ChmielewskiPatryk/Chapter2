package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Sess38", value = "/Sess38")
public class Sess38 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[][] Countries = {{"Niemcy", "Berlin"}, {"Czechy", "Praga"}, {"Słowacja", "Bratyslawa"}, {"Ukraina", "Kijow"}, {"Białorus", "Minsk"}, {"Litwa", "Wilno"}, {"Rosja", "Moskwa"}};
        HttpSession sess = request.getSession();

        if (sess.getAttribute("counter") == null) {
            sess.setAttribute("counter", 0);
            sess.setAttribute("points", 0);
        } else {
            String answer = request.getParameter("answer");
            int points = (int) sess.getAttribute("points");
            int counter = (int) sess.getAttribute("counter");
            if (answer.equals(Countries[counter][1])) {
                points++;
                sess.setAttribute("points", points);
            }
            sess.setAttribute("counter", counter + 1);
        }
        if ((int)sess.getAttribute("counter") < 7) {
            String country = Countries[(int)sess.getAttribute("counter")][0];
            response.getWriter().append("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<form action=\"Sess38\" method=\"get\">\n" +
                    "  <h1>Podaj stolice dla panstwa:" + country + " </h1>\n" +
                    "  <input type=\"text\" name=\"answer\">\n" +
                    "  <input type=\"submit\">\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>");
        } else {

            response.getWriter().append("Poprawnych odpowidzi: " + sess.getAttribute("points"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
