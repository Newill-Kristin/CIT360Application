package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kristin Newill (aingealfire) on 3/20/2019.
 */
@WebServlet(name = "Servlet_junk", urlPatterns = {"/Servlet_junk"})
public class Servlet_junk extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter post = response.getWriter();
        response.setContentType("text/html");

        post.println("<html><head></head><body>");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String add1 = request.getParameter("add1");
        String add2 = request.getParameter("add2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String tele = request.getParameter("tele");
        String email = request.getParameter("email");
        post.println("<h1>You Entered Contact Info For:</h1>");
        post.println("<p>Name: " + firstName + "&nbsp;" + lastName + "</p>" +
                "<p>Address: " + add1 + "&nbsp;" + add2 + "</p>" +
                "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + city + ", " + state + " " + zip + "</p>" +
                "<p>Telephone: " + tele + "</p>" +
                "<p>Email: " + email + "</p>");
        post.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("This is not available right now.");

    }
}
