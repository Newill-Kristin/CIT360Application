package controllers;

import models.MainHandler;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */
public class MainControl {

    private HashMap<String, MainHandler> handlerMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data) throws Exception {
        MainHandler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, MainHandler acHandler){
        handlerMap.put(aCommand,acHandler);
    }

}
