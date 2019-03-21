package views.modify;

import controllers.MainFront;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/20/2019.
 */
public class ConModZIP {

    Scanner input = new Scanner(System.in);

    public void conMod() throws Exception {

        System.out.println("\n Enter contact Record ID to update:");
        Scanner in = new Scanner(System.in);
        int id = Integer.parseInt(in.nextLine());

        Session hs = HibUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();

        Contact con = hs.load(Contact.class, id);

        System.out.println("What do you want the new Zip Code to be? \n");
        Scanner in2 = new Scanner(System.in);
        String new1 = in2.nextLine();
        con.setZip(new1);

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
