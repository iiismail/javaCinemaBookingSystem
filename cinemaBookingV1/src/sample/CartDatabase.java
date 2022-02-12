package sample;

import java.util.ArrayList;

/**
 * Created by u1857977 on 20/03/2019.
 */
public class CartDatabase {

    private ArrayList<Session> sessionCartDatabase = new ArrayList<>();

    private ArrayList<Consumables> consumablesCartDatabase = new ArrayList<>();

    public void addSessionCartDatabase(Session newSession) {
        sessionCartDatabase.add(newSession);
    }


    public void addConsumableCartDatabase(Consumables newConsumable) {
        System.out.println("ADD" + newConsumable);

        //consumablesCartDatabase.add(newConsumable);
    }

    public ArrayList<Session> getSessionCartDatabase() {
        return sessionCartDatabase;
    }

    public void setSessionCartDatabase(ArrayList<Session> sessionCartDatabase) {
        this.sessionCartDatabase = sessionCartDatabase;
    }

    public ArrayList<Consumables> getConsumablesCartDatabase() {
        return consumablesCartDatabase;
    }

    public void setConsumablesCartDatabase(ArrayList<Consumables> consumablesCartDatabase) {
        this.consumablesCartDatabase = consumablesCartDatabase;
    }
}
