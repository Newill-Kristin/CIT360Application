package views;

import models.MainHandler;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class Exit implements MainHandler {
    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        System.exit(0);

    }
}
