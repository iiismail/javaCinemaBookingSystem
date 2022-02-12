package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

/**
 * Created by u1857977 on 20/03/2019.
 */
public class PaymentPageControllor {

//    @FXML
//    private TextField payButton;

    public void openReciept(ActionEvent actionEvent) throws IOException {
//        try{
//            String email = payButton.getText();
//        }catch (Exception e){
//            System.out.println("Please enter a valid email");
//        }
        Parent changeScene = FXMLLoader.load(getClass().getResource("RecieptPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();
    }
}
