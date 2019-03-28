package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactNew {

    public boolean enterNew(Contact contact) throws Exception {

        Session hs = HibUtil.getSessionFactory().openSession();

        //Adding a record in the database
        Transaction tr = hs.beginTransaction();

        hs.saveOrUpdate(contact);

/*
        Contact con = new Contact();
        con.setFirstName(firstName);
        con.setLastName(lastName);
        con.setAdd1(add1);
        con.setCity(city);
        con.setState(state);
        con.setZip(zip);
        con.setTele(tele);
        con.setEmail(email);

*/
       //hs.save(con);

        tr.commit();

        hs.close();
        tr = null;


        return true;
    }




}
