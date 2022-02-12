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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1857977 on 15/03/2019.
 */
public class MovieControllor implements Initializable{

//    @FXML
//    private StackPane stack;
    @FXML
    private ImageView imageView;
    @FXML
    private Label movieLabel;

    @FXML
    private Label descriptionLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (Film film:Main.getFilmDatabase().getFilms()) {
            if (Main.getCurrentFilm() == film) {
                //FILL IN YOUR TEXT FIELDS & IMAGES
                Image poster = new Image(film.getURL(), 5000, 5000, true, true);
                imageView.setImage(poster);
                movieLabel.setText(film.getTitle());
                descriptionLabel.setText(film.getDescription());
            }
        }

        ObservableList<Session> observableSessions = FXCollections.observableArrayList(Main.getCurrentSessions());

    }


    public void openBooking(ActionEvent actionEvent) throws IOException {

        Parent changeScene = FXMLLoader.load(getClass().getResource("SessionPage.fxml"));
        Scene changeScene2 = new Scene(changeScene);
        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        movieStage.setScene((changeScene2));
        movieStage.show();
        Main.getSessionDatabase().getSessionsTimeByFilmTitle(Main.getCurrentFilm().getTitle());
    }
}
