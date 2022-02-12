package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by u1857977 on 13/03/2019.
 */
public class HomePageControllor {
    public Button button1;
    public Button snacksButton;

    @FXML
    public void changeToScene3(ActionEvent actionEvent) throws IOException {
        try{
        Parent changeScene = FXMLLoader.load(getClass().getResource("MovieSelectioPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();

        System.out.println(Main.getFilmDatabase().getFilms().get(0).getTitle());


    }catch (Exception e){
            System.out.println("no");}
    }

    public void openSnacks(ActionEvent actionEvent)  throws IOException {
        Parent changeScene = FXMLLoader.load(getClass().getResource("ConsumablesPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();


    }


    // System.out.println(Main.getFilmDatabase().getFilms().get(0).getTitle());

    }
