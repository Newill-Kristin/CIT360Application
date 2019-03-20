package views;

import controllers.MainFront;
import models.MainHandler;
import models.contact.Contact;
import models.contact.HibUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactSearch implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        this.runSearch();



        this.endDemo();

    }

    private void endDemo() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }


    public void runSearch() throws Exception {

        Scanner input = new Scanner(System.in);
        
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to search by?"
                + "\nF: Search by First Name"
                + "\nL: Search by Last Name"
                + "\nE: Search by Email"
                + "\nT: Search by Phone Number"
                + "\nZ: Search by Zip Code"
                + "\nR: Return to the Main Menu"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "F": {
                this.fn(); // firstName
            }
            break;
            case "L": {
                this.ln(); // lastName
            }
            break;
            case "E": {
                this.em(); // Email
            }
            break;
            case "T": {
                this.tel(); // Tele
                break;
            }
            case "Z": {
                this.zip(); // Zip
            }
            break;
            case "R": {
                this.mm(); // Main Meny
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.runSearch();
                break;
        }
    }


    private void fn() throws Exception {

        Session hs = HibUtil.getSessionFactory().openSession();

        //Call from Search
        System.out.println("What is the First Name: ");
        Scanner in = new Scanner(System.in);
        String fn1 = in.nextLine();
        String HQL = "FROM models.contact.Contact"; //where firstName='fn1'
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

    }

    private void ln() throws Exception {



        return;
    }

    private void em() throws Exception {



        return;
    }

    private void tel() throws Exception {


        return;
    }

    private void zip() throws Exception {


        return;
    }

    private void mm() throws Exception {
        this.endDemo();
    }




}
