package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet34", value = "/Servlet34")
public class Servlet34 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean visited = false;
        for(Cookie c: cookies){
            if(c.getName().equals("visits")){
                int visitedTimes = Integer.parseInt(c.getValue()) +1;
                Cookie cookie = new Cookie("visits", String.valueOf(visitedTimes));
                response.addCookie(cookie);
                response.getWriter().append("Witaj "+visitedTimes+" raz na naszej stronie.");
                visited = true;
            }
        }
        if(visited ==false){
            Cookie cookie = new Cookie("visits", "1");
            cookie.setMaxAge(365*24*3600);
            response.addCookie(cookie);
            response.getWriter().append("Witaj pierwszy raz na naszej stronie.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
