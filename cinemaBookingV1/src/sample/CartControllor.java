package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.CatchNode;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


/**
 * Created by u1857977 on 07/03/2019.
 */
public class CartControllor implements Initializable {

    @FXML  private ListView cartView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        Main.sessionCartDatabase.addSessionCartDatabase(Main.getCurrentSession());
        ArrayList<Session> sessionAL = Main.getSessionCartDatabase().getSessionCartDatabase();

         ObservableList<String> sessionOL = FXCollections.observableArrayList();

        try {
            for (Session session : sessionAL) {

                sessionOL.add("ID:  " + session.getSessionID() +
                        session.getTheatreID() + "  Date:  " +  session.getShowingDate() + "  Time:  " +  session.getTime() );
            }
        } catch (Exception e) {}
        try {
//            ArrayList<Consumables> consumablesAL = Main.Cart();
            for (Consumables consumable : Main.cart) {

                sessionOL.add("Name:  " + consumable.getName() + "  Price:  " + consumable.getPrice() + "   quantity:  " + consumable.getQuantity());
            }
        } catch (Exception e ) {
            System.out.println("Hello");

        }
        //System.out.println(Main.getConsumablesCartDatabase().getConsumablesCartDatabase().get(0));
        cartView.setItems(sessionOL);


    }

    public void changeToSnacks(ActionEvent actionEvent) throws IOException {

        Parent changeScene = FXMLLoader.load(getClass().getResource("ConsumablesPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();
    }

    public void changeToFilms(ActionEvent actionEvent) throws IOException {

        Parent changeScene = FXMLLoader.load(getClass().getResource("MovieSelectioPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();
    }

    public void changeToPaymentPage(ActionEvent actionEvent) throws IOException {
        Parent changeScene = FXMLLoader.load(getClass().getResource("PaymentPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();

    }
}
