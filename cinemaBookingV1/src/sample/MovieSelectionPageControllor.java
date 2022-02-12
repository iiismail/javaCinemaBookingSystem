package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.event.Event;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1857977 on 13/03/2019.
 */
public class MovieSelectionPageControllor  {

    @FXML
    private ImageView matrixImage;
    @FXML
    private ImageView avatarImage;
    @FXML
    private ImageView marvelImage;
    @FXML
    private ImageView aquamanImage;
    @FXML
    private ImageView hellboyImage;



//    public void openMovie1(MouseEvent mouseEvent) {
//        System.out.println("run...");
//    }

    @FXML
    public void openMatrix(MouseEvent event) throws IOException {

        if(event.getSource()==matrixImage){
            Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("Matrix"));
        }
        if(event.getSource()==avatarImage){
            Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("Avatar"));
        }
        if(event.getSource()==marvelImage){
            Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("Marvel"));
        }
        if(event.getSource()==aquamanImage){
            Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("Aquaman"));
        }
        if(event.getSource()==hellboyImage){
            Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("Hellboy"));
        }



        // Main.setCurrentFilm(Main.getFilmDatabase().getFilmByTitle("matrix"));


        System.out.println("clicked");
        // Stage stage = (Stage) matrixImage.getScene().getWindow();

            Parent changeScene = FXMLLoader.load(getClass().getResource("MatrixFilm.fxml"));
            Scene changeScene2 = new Scene(changeScene);

            // Stage movieStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage movieStage = new Stage();
            movieStage.setScene((changeScene2));
            movieStage.show();

    }


//    public void start(Stage Stage) throws Exception {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("MatrixFilm.fxml"));
//        /*
//         * if "fx:controller" is not set in fxml
//         * fxmlLoader.setController(NewWindowController);
//         */
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage stage = new Stage();
//        stage.setTitle("New Window");
//        stage.setScene(scene);
//        stage.show();
//
//    }
}













