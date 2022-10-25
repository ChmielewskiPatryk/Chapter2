package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session4", value = "/Session4")
public class Session4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("session4.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        List<CartItem> items = new ArrayList<>();
        CartItem item = new CartItem(name, quantity, price);
        HttpSession sess = request.getSession();
        if (sess.getAttribute("items") != null) {
            items = (List<CartItem>) sess.getAttribute("items");
        }
        items.add(item);
        sess.setAttribute("items", items);
        response.setCharacterEncoding("UTF-8");
        double sum = 0.0;
        for (int i = 0; i < items.size(); i++) {
            sum += (items.get(i).quantity * items.get(i).price);
            response.getWriter().append(items.get(i).name + " " + (i + 1) + " - " + items.get(i).quantity + " x "
                    + items.get(i).price + "zł" + " = " + (items.get(i).quantity * items.get(i).price) + "zł");
        }
        response.getWriter().append("\nSUMA: " + sum);
    }
}
