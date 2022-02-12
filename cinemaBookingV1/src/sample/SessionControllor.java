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
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * Created by u1857977 on 07/03/2019.
 */
public class SessionControllor implements Initializable {

    @FXML
    private Label filmTitle;

    @FXML
    private ImageView image;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ListView sessionList;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (Film film : Main.getFilmDatabase().getFilms()) {
            if (Main.getCurrentFilm() == film) {
                filmTitle.setText(film.getTitle());
                Image poster = new Image(film.getURL(),5000,5000,true,true);
                image.setImage(poster);

//                datePicker.setDayCellFactory(picker -> new DateCell() {
//                    public void updateItem(LocalDate date, boolean empty) {
//                        LocalDate today = LocalDate.now();
//                        System.out.println(date.getDayOfMonth());
//
//                        setDisable(empty || date.compareTo(today) < 0 || date.getDayOfWeek() != DayOfWeek.SATURDAY );
//                }
//                });
            }

            showItemsAfter();
        }


    }

    public void showItemsAfter() {


        ObservableList<String> sessions = FXCollections.observableArrayList();
        for (Session session : Main.getSessionDatabase().getSessionsTimeByFilmTitle(Main.getCurrentFilm().getTitle())) {
            //System.out.println();
            sessions.add(session.getSessionID() + ' ' + session.getTime() + ' ' + session.getTheatreID() + ' ' + session.getShowingDate());
            //sessions.add(session.getTheatreID());
            //sessions.add(session.getShowingDate());

        }
        System.out.println(sessions);
        sessionList.setItems(sessions);

    }

    public void setSession(ActionEvent actionEvent)throws IOException {
        try {
            String session =sessionList.getSelectionModel().getSelectedItem().toString();
            String currentSessionId = new String();
            for (char ch : session.toCharArray()){
                if (ch != ' ') {
                    currentSessionId += ch;
                }

                else {
                    break;
                }
            }
            Main.setCurrentSession(Main.getSessionDatabase().getSessionsBySessionID(currentSessionId));
            changeSceneToCart(actionEvent);

        } catch (Exception e) {
            System.out.println("Error, Please select item");
        }



    }

    public void changeSceneToCart(ActionEvent actionEvent) throws IOException {
        Parent changeScene = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Scene changeScene2 = new Scene(changeScene);

        Stage movieStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        movieStage.setScene((changeScene2));
        movieStage.show();
    }
}

