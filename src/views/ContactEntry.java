package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactEntry implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        Scanner input = new Scanner(System.in);

        Session hs = HibUtil.getSessionFactory().openSession();

        //Adding a record in the database
        Transaction tr = hs.beginTransaction();

        Contact con = new Contact();
        con.setFirstName("Lorelei");
        con.setLastName("Aisling");
        con.setAdd1("123 Main St");
        con.setCity("Stormwind");
        con.setState("Azeroth");
        con.setZip("54321");
        con.setTele("9876543210");
        con.setEmail("iamtouble@gmail.com");

        hs.save(con);

        tr.commit();

        System.out.println("\n" + con.getFirstName() + " " + con.getLastName()
                            + "\n " + con.getAdd1()
                            + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
                            + "\n" + con.getTele() + "\n" + con.getEmail() + "\n" + "Record ID: " + con.getId() + "\n");

        hs.close();
        tr = null;

        this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }


}
