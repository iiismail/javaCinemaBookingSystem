package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by u1857977 on 11/03/2019.
 */
public class ConsumablesControllor implements Initializable {


    public ConsumablesControllor()  {


    }

    @FXML
    private TextField pepsiTF;
    @FXML
    private TextField popcornTF;
    @FXML
    private TextField nachosTF;
    @FXML
    private TextField waterTF;
    @FXML
    private TextField haribosTF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pepsiTF.setText("0");
        popcornTF.setText("0");
        nachosTF.setText("0");
        waterTF.setText("0");
        haribosTF.setText("0");
    }


    public void setPepsiQuantity(ActionEvent actionEvent) {
        try {
            Integer value1 = Integer.valueOf(pepsiTF.getText());
            Integer value2 = Integer.valueOf(popcornTF.getText());
            Integer value3 = Integer.valueOf(nachosTF.getText());
            Integer value4 = Integer.valueOf(waterTF.getText());
            Integer value5 = Integer.valueOf(haribosTF.getText());


            ArrayList<Consumables> consumablesDB = Main.getConsumablesDatabase().getConsumablesDatabase();
            for (Consumables consumable : consumablesDB) {
                System.out.println(Main.getConsumablesCartDatabase());
                if (consumable.getName() == "Pepsi") {
                    consumable.setQuantity(value1);
                    if (consumable.getQuantity() != 0) {
                        //CartDatabase DB = Main.getConsumablesCartDatabase();
                        Main.cart.add(consumable);

                    /*ArrayList<Consumables> test = DB.getConsumablesCartDatabase();
                    System.out.println(test);*/
                        //Main.getConsumablesCartDatabase().addConsumableCartDatabase(consumable);
                    }
                    System.out.println("q");
                } else if (consumable.getName() == "Popcorn") {
                    consumable.setQuantity(value2);
                    if (consumable.getQuantity() != 0) {
                        Main.cart.add(consumable);
                    }
                    System.out.println("q");
                } else if (consumable.getName() == "Nachos") {
                    consumable.setQuantity(value3);
                    if (consumable.getQuantity() != 0) {
                        Main.cart.add(consumable);
                    }
                    System.out.println("q");
                } else if (consumable.getName() == "Water") {
                    consumable.setQuantity(value4);
                    if (consumable.getQuantity() != 0) {
                        Main.cart.add(consumable);
                    }
                    System.out.println("q");
                } else if (consumable.getName() == "Haribos") {
                    consumable.setQuantity(value5);
                    if (consumable.getQuantity() != 0) {
                        Main.cart.add(consumable);
                    }
                    System.out.println("q");
                }
            }

        } catch (Exception e) {
            System.out.println("Please enter an integer");

        }
    }


    public void changeToCart(ActionEvent actionEvent) throws IOException {

        Parent changeScene = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();
    }
}


