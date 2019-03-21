package views.search;

import controllers.MainFront;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/20/2019.
 */
public class ConSearchZIP {

    Scanner input = new Scanner(System.in);

    public void conSearch() throws Exception {

        Session hs = HibUtil.getSessionFactory().openSession();

        //Call from Search
        System.out.println("What Zipcode are you looking for? ");
        Scanner in = new Scanner(System.in);
        String in1 = in.nextLine();
        String HQL = "FROM models.contact.Contact where zip = :in1";
        Query q = hs.createQuery(HQL);
        q.setParameter("in1", in1);

        List<Contact> list = q.list();

        for (Contact con : list) {
        System.out.println("\n" + "Name: " + con.getFirstName() + " " + con.getLastName()
        + "\n" + "Address: " + con.getAdd1()
        + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
        + "\n" + "Telephone: " + con.getTele() + "\n" + "Email: " + con.getEmail() + "\n" + "Record ID: " + con.getId() + "\n");
        }

        hs.close();

        this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }

}
