package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactModify implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        Scanner input = new Scanner(System.in);

        Session hs = HibUtil.getSessionFactory().openSession();

        //Updating a record in the database
        System.out.println("\n Updating a contact:");
        Transaction tr = hs.beginTransaction();

        Contact con = hs.load(Contact.class, 2);
        con.setFirstName("Bubba");

        hs.update(con);
        tr.commit();

        System.out.println("\n Update Successful... \n");

        System.out.println("\n" + "Name: " + con.getFirstName() + " " + con.getLastName()
                            + "\n" + "Address: " + con.getAdd1()
                            + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
                            + "\n" + "Telephone: " + con.getTele() + "\n" + "Email: " + con.getEmail() + "\n" + "Record ID: " + con.getId() + "\n");

        hs.close();
        tr = null;

        this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();

    }
}
