package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactView implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        Scanner input = new Scanner(System.in);

        Session hs = HibUtil.getSessionFactory().openSession();

        //Call all Records
        System.out.println("Displaying all records in table: \n");
        String HQL = "FROM models.contact.Contact";
        Query q = hs.createQuery(HQL);

        List<Contact> list = q.list();

        for (Contact con : list) {
            System.out.println("\n" + "Name: " + con.getFirstName() + " " + con.getLastName()
                                + "\n" + "Address: " + con.getAdd1()
                                + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
                                + "\n" + "Telephone: " + con.getTele() + "\n" + "Email: " + con.getEmail() + "\n" + "Record ID: " + con.getId() + "\n");
        }


        hs.close();

        return;

        //this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }
}
