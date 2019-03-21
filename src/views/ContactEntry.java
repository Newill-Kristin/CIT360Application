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

        System.out.println("Enter the Contact information");

        System.out.println("\n First Name: ");
        Scanner in1 = new Scanner(System.in);
        String fn = in1.nextLine();

        System.out.println("\n Last Name: ");
        Scanner in2 = new Scanner(System.in);
        String ln = in2.nextLine();

        System.out.println("\n Street Address / PO Box: ");
        Scanner in3 = new Scanner(System.in);
        String add = in3.nextLine();

        System.out.println("\n City: ");
        Scanner in4 = new Scanner(System.in);
        String city = in4.nextLine();

        System.out.println("\n State: ");
        Scanner in5 = new Scanner(System.in);
        String state = in5.nextLine();

        System.out.println("\n Zip Code: ");
        Scanner in6 = new Scanner(System.in);
        String zip = in6.nextLine();

        System.out.println("\n Telephone Number (no Spaces or Dashes): ");
        Scanner in7 = new Scanner(System.in);
        String tele = in7.nextLine();

        System.out.println("\n Email Address: ");
        Scanner in8 = new Scanner(System.in);
        String email = in8.nextLine();


        Session hs = HibUtil.getSessionFactory().openSession();

        //Adding a record in the database
        Transaction tr = hs.beginTransaction();

        Contact con = new Contact();
        con.setFirstName(fn);
        con.setLastName(ln);
        con.setAdd1(add);
        con.setCity(city);
        con.setState(state);
        con.setZip(zip);
        con.setTele(tele);
        con.setEmail(email);

        hs.save(con);

        tr.commit();

        System.out.println("\n You Created an entry for: "
                            + "\n" + "Name: " + con.getFirstName() + " " + con.getLastName()
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
