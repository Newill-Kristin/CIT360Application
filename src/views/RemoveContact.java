package views;

import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
@WebServlet(name = "RemoveContact", urlPatterns = "/RemoveContact")
public class RemoveContact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Integer id = Integer.valueOf(request.getParameter("id"));

        try {

            Session hs = HibUtil.getSessionFactory().openSession();
            Transaction tr = hs.beginTransaction();

            Contact con = hs.load(Contact.class, id);
            if (con != null) {
                hs.delete(con);
            }

            tr.commit();

            hs.close();
            tr = null;

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
                    "</div></nav><main>"+ "\n Record deleted! \n");
            out.println("<input class=\"startReg\" type=\"button\" onclick=\"window.location='index.jsp';\" value=\"Return to Main Menu\">");
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
