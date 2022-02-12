package sample;

import java.util.ArrayList;

/**
 * Created by u1857977 on 11/03/2019.
 */
public class ConsumablesDatabase {

    private ArrayList<Consumables> consumablesDatabase = new ArrayList<>();

    public void addConsumable(Consumables newConsumable){
        consumablesDatabase.add(newConsumable);
    }


    public ArrayList<Consumables> getConsumablesDatabase() {
        System.out.println("FROM METHOD: " + consumablesDatabase);
        return consumablesDatabase;
    }

    public void setConsumablesDatabase(ArrayList<Consumables> consumablesDatabase) {
        this.consumablesDatabase = consumablesDatabase;
    }
}
