package controllers;

import views.*;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class MainFront {

    private MainControl mainControl = new MainControl();

    public void mainFront() throws Exception {

        mainControl.mapCommand("V", new ContactView());
        mainControl.mapCommand("S", new ContactSearch());
        mainControl.mapCommand("E", new ContactEntry());
        mainControl.mapCommand("M", new ContactModify());
        mainControl.mapCommand("R", new ContactRemove());

        HashMap mainMap = new HashMap();

        Scanner input = new Scanner(System.in);
        System.out.println("Please Select what you would like to see: \n"
                + "V - To View all Contacts \n"
                + "S - To Search for a Contact \n"
                + "E - To Enter a new Contact \n"
                + "M - To Modify an Existing Contact \n"
                + "R - To Remove a contact \n"
                + "X - Exit \n");

        String choice = input.next();
        choice = choice.toUpperCase();

        mainControl.handleRequest(choice, mainMap);

    }

}
