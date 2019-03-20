import controllers.MainControl;
import controllers.MainFront;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        //Start ACP
        MainFront mf = new MainFront();

        //Run ACP
        mf.mainFront();

    }


}