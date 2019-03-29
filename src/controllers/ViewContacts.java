package controllers;

import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import views.ContactNew;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Kristin Newill (aingealfire) on 3/28/2019.
 */
@WebServlet(name = "ViewContacts", urlPatterns = "/ViewContacts")
public class ViewContacts extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String add1 = request.getParameter("add1");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String tele = request.getParameter("tele");
        String email = request.getParameter("email");
        Contact contact = new Contact(firstName, lastName, add1, city, state, zip, tele, email);

        try {
            out.println("<html>");
            out.println("<head><title>Entry Successful</title>" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                    "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/contact.css\"></head>");
            out.println("<body>");
            out.println("<header><!---So the header happens --></header><nav><div id=\"top\">" +
                    "<ul class=\"topnav\" id=\"topnav1\">" +
                    "<li><a href=\"index.jsp\">Main Menu</a></li>" +
                    "<li><a href=\"View.jsp\">View All Contacts</a></li>" +
                    "<li><a href=\"Enter.jsp\">Add a New Contact</a></li>" +
                    "<li class=\"dropdown\"> <a href=\"javascript:void(0)\" class=\"dropbtn\">Search for a Contact</a>" +
                    "<div class=\"dropdown-content\">" +
                    "<a href=\"SearchFN.jsp\">by First Name</a>" +
                    "<a href=\"SearchLN.jsp\">by Last Name</a>" +
                    "<a href=\"SearchZIP.jsp\">by Zip Code</a>" +
                    "<a href=\"SearchTEL.jsp\">by Telephone</a>" +
                    "<a href=\"SearchEM.jsp\">by Email</a>" +
                    "</div></li>" +
                    "<li class=\"dropdown\"> <a href=\"javascript:void(0)\" class=\"dropbtn\">Modify a Contact</a>" +
                    "<div class=\"dropdown-content\">" +
                    "<a href=\"ModifyFN.jsp\">First Name</a>" +
                    "<a href=\"ModifyLN.jsp\">Last Name</a>" +
                    "<a href=\"ModifyADD.jsp\">Address</a>" +
                    "<a href=\"ModifyCITY.jsp\">City</a>" +
                    "<a href=\"ModifySTATE.jsp\">State</a>" +
                    "<a href=\"ModifyZIP.jsp\">Zip Code</a>" +
                    "<a href=\"ModifyTEL.jsp\">Telephone</a>" +
                    "<a href=\"ModifyEM.jsp\">Email</a>" +
                    "</div></li>" +
                    "<li><a href=\"Remove.jsp\">Remove a Contact</a></li>" +
                    "</div></nav><main>");

            Session hs = HibUtil.getSessionFactory().openSession();
            String HQL = "FROM models.contact.Contact";
            Query q = hs.createQuery(HQL);

            List<Contact> list = q.list();

            if(!list.isEmpty()) {
                for (Contact con : list) {
                    out.println("<p>Name: " + con.getFirstName() + "&nbsp;" + con.getLastName() + "</p>" +
                            "<p>Address: " + con.getAdd1() + "</p>" +
                            "<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + con.getCity() + ", " + con.getState() + " " + con.getZip() + "</p>" +
                            "<p>Telephone: " + con.getTele() + "</p>" +
                            "<p>Email: " + con.getEmail() + "</p>" +
                            "<p>Record ID:" + con.getId() + "</p>" + "\n");
                }
               
                out.println("<input class=\"startReg\" type=\"button\" onclick=\"open('index.jsp')\" value=\"Return to Main Menu\">");
            }else{
                out.println("<h1>Entry Failed</h1>");
                out.println("<input class=\"startReg\" type=\"button\" onclick=\"open('index.jsp')\" value=\"Try Again\">");
            }
            out.println("</main></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.close();
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
