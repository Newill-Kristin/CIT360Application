package views;

import controllers.MainFront;
import views.search.ConSearchEM;
import views.search.ConSearchLN;
import views.search.ConSearchTEL;
import views.search.ConSearchZIP;
import models.MainHandler;
import views.search.*;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactSearch implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        this.runSearch();

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

        ConSearchFN fn = new ConSearchFN();
        fn.conSearch();

    }

    private void ln() throws Exception {

        ConSearchLN ln = new ConSearchLN();
        ln.conSearch();

    }

    private void em() throws Exception {

        ConSearchEM em = new ConSearchEM();
        em.conSearch();

    }

    private void tel() throws Exception {

        ConSearchTEL tel = new ConSearchTEL();
        tel.conSearch();

    }

    private void zip() throws Exception {

        ConSearchZIP zip = new ConSearchZIP();
        zip.conSearch();

    }

    private void mm() throws Exception {

            MainFront mf = new MainFront();
            mf.mainFront();
    }




}
