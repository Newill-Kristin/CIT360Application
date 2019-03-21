package views;

import controllers.MainFront;
import models.MainHandler;
import views.modify.*;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class ContactModify implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        this.runSearch();

    }

    public void runSearch() throws Exception {

        Scanner input = new Scanner(System.in);

        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to modify?"
                + "\nF: First Name"
                + "\nL: Last Name"
                + "\nA: Street Address / PO Box"
                + "\nC: City"
                + "\nS: State"
                + "\nZ: Zip Code"
                + "\nT: Phone Number"
                + "\nE: Email"
                + "\n"
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
            
            case "A": {
                this.add(); // Zip
            }
            break;
            case "C": {
                this.city(); // Zip
            }
            break;
            case "S": {
                this.state(); // Zip
            }
            break;
            case "Z": {
                this.zip(); // Zip
            }
            break;
            case "T": {
                this.tel(); // Tele
            }
            break;
            case "E": {
                this.em(); // Email
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

        ConModFN fn = new ConModFN();
        fn.conMod();

    }

    private void ln() throws Exception {

        ConModLN ln = new ConModLN();
        ln.conMod();

    }

    private void add() throws Exception {

        ConModADD add = new ConModADD();
        add.conMod();

    }

    private void city() throws Exception {

        ConModCITY city = new ConModCITY();
        city.conMod();

    }

    private void state() throws Exception {

        ConModSTATE state = new ConModSTATE();
        state.conMod();

    }

    private void zip() throws Exception {

        ConModZIP zip = new ConModZIP();
        zip.conMod();

    }

    private void tel() throws Exception {

        ConModTEL tel = new ConModTEL();
        tel.conMod();

    }

    private void em() throws Exception {

        ConModEM em = new ConModEM();
        em.conMod();

    }

    private void mm() throws Exception {

        MainFront mf = new MainFront();
        mf.mainFront();
    }
    
}
