package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kristin Newill (aingealfire) on 3/27/2019.
 */
//@WebServlet(name = "MainMenuServlet", urlPatterns = {"/MainMenuServlet"})
public class MainMenuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String choice = request.getParameter("choice");

        MainFront mf = new MainFront();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}





/*


    String userId = request.getParameter("userId");
    String password = request.getParameter("password");
    LoginService loginService = new LoginService();
    boolean result = loginService.authenticateUser(userId, password);
    User user = loginService.getUserByUserId(userId);
     if(result == true){
             request.getSession().setAttribute("user", user);
             response.sendRedirect("home.jsp");
             }
             else{
             response.sendRedirect("error.jsp");
             }


*/