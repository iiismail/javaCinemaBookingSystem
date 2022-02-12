package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by u1857977 on 20/03/2019.
 */
public class RecieptPageControllor implements Initializable {

    @FXML
    private ListView recieptView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ArrayList<Session> sessionAL = Main.getSessionCartDatabase().getSessionCartDatabase();

        ObservableList<String> sessionOL = FXCollections.observableArrayList();

        try {
            for (Session session : sessionAL) {

                sessionOL.add("ID:  " + session.getSessionID() +
                        session.getTheatreID() + "  Date:  " +  session.getShowingDate() + "  Time:  " +  session.getTime() );
            }
        } catch (Exception e) {}
        try {
            //ArrayList<Consumables> consumablesAL = Main.Cart();
            for (Consumables consumable : Main.cart) {

                sessionOL.add("Name:  " + consumable.getName() + "  Price:  " + consumable.getPrice() + "   quantity:  " + consumable.getQuantity());
            }
        } catch (Exception e ) {
            System.out.println("Hello");

        }
//        System.out.println(Main.getConsumablesCartDatabase().getConsumablesCartDatabase().get(0));
        recieptView.setItems(sessionOL);


    }


}
