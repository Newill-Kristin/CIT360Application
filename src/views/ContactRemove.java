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

        //Deleting a record in the database
        Session hs = HibUtil.getSessionFactory().openSession();
        Transaction tr = hs.beginTransaction();

        Contact con = hs.load(Contact.class, 2);
        if (con != null) {
            hs.delete(con);
        }

        tr.commit();

        System.out.println("\n Record deleted!");

        hs.close();
        tr = null;


    }

}
