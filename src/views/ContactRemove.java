package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactRemove implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        System.out.println("\n Enter contact Record ID to delete:");
        Scanner in = new Scanner(System.in);
        int id = Integer.parseInt(in.nextLine());

        Session hs = HibUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();

        Contact con = hs.load(Contact.class, id);
        if (con != null) {
            hs.delete(con);
        }

        tr.commit();

        System.out.println("\n Record deleted! \n");

        hs.close();
        tr = null;
        this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }

}
