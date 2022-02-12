package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Month;

public class Main extends Application {

    private static Film currentFilm;
    private static FilmDatabase filmDatabase;
    private static Session currentSession;
    private static SessionDatabase sessionDatabase;
    public static ArrayList<Session> currentSessions = new ArrayList<>();
    public static CartDatabase sessionCartDatabase;
    private static CartDatabase consumablesCartDatabase;
    public static ConsumablesDatabase consumablesDatabase ;

    public static ArrayList<Consumables> cart = new ArrayList<>(0);


    public static Film getCurrentFilm() {
        return currentFilm;
    }

    public static void setCurrentFilm(Film currentFilm) {
        Main.currentFilm = currentFilm;
    }

    public static FilmDatabase getFilmDatabase() {
        return filmDatabase;
    }

    public static void setFilmDatabase(FilmDatabase filmDatabase) { Main.filmDatabase = filmDatabase;
    }

    public static Session getCurrentSession() {
        return currentSession;
    }

    public static void setCurrentSession(Session currentSession) {
        Main.currentSession = currentSession;
    }

    public static SessionDatabase getSessionDatabase() {
        return sessionDatabase;

    }

    public static ConsumablesDatabase getConsumablesDatabase() {
        return consumablesDatabase;
    }

    public static void setConsumablesDatabase(ConsumablesDatabase consumablesDatabase) {
        Main.consumablesDatabase = consumablesDatabase;
    }

    public static CartDatabase getSessionCartDatabase() {
        return sessionCartDatabase;
    }

    public static void setSessionCartDatabase(CartDatabase sessionCartDatabase) {
        Main.sessionCartDatabase = sessionCartDatabase;
    }

    public static CartDatabase getConsumablesCartDatabase() {
        return consumablesCartDatabase;
    }

    public static void setConsumablesCartDatabase(CartDatabase consumablesCartDatabase) {
        Main.consumablesCartDatabase = consumablesCartDatabase;
    }

    public static ArrayList getCurrentSessions() {
        return currentSessions;
    }

    public static void setCurrentSessions(ArrayList currentSessions) {
        Main.currentSessions = currentSessions;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1000, 2000));
        primaryStage.show();


    }

    static FilmDatabase films;

    public static void main(String[] args) {
        filmDatabase = new FilmDatabase();
        Film film1 = new Film("The Matrix (1999)", 10, "PG", 90,
                "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                "A computer hacker learns from mysterious rebels about\n " + "the true nature of his reality and his role in the war against\n" + " its controllers.\n" +
                "Directors: Lana Wachowski (as The Wachowski Brothers), Lilly Wachowski (as The Wachowski Brothers)\n" +
                "Writers: Lilly Wachowski (as The Wachowski Brothers), Lana Wachowski (as The Wachowski Brothers)\n" +
                "Stars: Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss");
        Film film2 = new Film("Avatar (2009)", 10, "PG", 90,
                "https://m.media-amazon.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
                "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.\n" +
                "Director: James Cameron\n" +
                "Writer: James Cameron\n" +
                "Stars: Sam Worthington, Zoe Saldana, Sigourney Weaver");
        Film film3 = new Film("Captain Marvel (2019)", 10, "PG", 90,
                "https://m.media-amazon.com/images/M/MV5BMTE0YWFmOTMtYTU2ZS00ZTIxLWE3OTEtYTNiYzBkZjViZThiXkEyXkFqcGdeQXVyODMzMzQ4OTI@._V1_SX300.jpg",
                "Carol Danvers becomes one of the universe's most powerful heroes when Earth is caught in the middle of a galactic war between two alien races.\n" +
                "Directors: Anna Boden, Ryan Fleck\n" + "Stars: Brie Larson, Samuel L. Jackson, Ben Mendelsohn ");
        Film film4 = new Film("Aquaman (2018)", 10, "PG", 90,
                "https://m.media-amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_SX300.jpg&quot;,&quot;Ratings&quot;:[{&quot;Source&quot;:&quot;Internet Movie Database&quot;,&quot;Value&quot;:&quot;7.4/10",
                "");
        Film film5 = new Film("Hellboy (2019)", 10, "PG", 90,
                "https://m.media-amazon.com/images/M/MV5BYTMyYjg0MTItYTcyZS00MmRiLWIxNWQtYTRiZjRkYWMxZGNkXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_SX300.jpg",
                "");

        filmDatabase.addFilm(film1);
        filmDatabase.addFilm(film2);
        filmDatabase.addFilm(film3);
        filmDatabase.addFilm(film4);
        filmDatabase.addFilm(film5);

       // System.out.println(filmDatabase.getFilmByTitle("`").getURL());

        sessionDatabase = new SessionDatabase();
        Session session1 = new Session("10:00 - 12:00", "Theatre 1",film1, LocalDate.of(2019, 03, 30), "01", 1.50);
        Session session2 = new Session("10:30 - 12:30", "Theatre 2", film1, LocalDate.of(2014, 03, 30), "02", 3.00);
        Session session3 = new Session("13:00 - 14:30", "Theatre 3",film2, LocalDate.of(2014, 03, 30), "03",3.00);

        sessionDatabase.addSession(session1);
        sessionDatabase.addSession(session2);
        sessionDatabase.addSession(session3);


        consumablesDatabase = new ConsumablesDatabase();
        Consumables consumables1 = new Consumables("Pepsi", 1.50,0);
        Consumables consumables2 = new Consumables("Popcorn", 2.00,0);
        Consumables consumables3 = new Consumables("Nachos", 3.50,0);
        Consumables consumables4 = new Consumables("Haribos", 1.50,0);
        Consumables consumables5 = new Consumables("Water", 1.00,0);
        consumablesDatabase.addConsumable(consumables1);
        consumablesDatabase.addConsumable(consumables2);
        consumablesDatabase.addConsumable(consumables3);
        consumablesDatabase.addConsumable(consumables4);
        consumablesDatabase.addConsumable(consumables5);
//        if(film1.getTitle().equals("The Matrix (1999)")) {
//            System.out.println("hello");
//        };
//
//  System.out.println(sessionDatabase.getSessionsTimeByFilmTitle(getCurrentFilm().getTitle()));
        sessionCartDatabase = new CartDatabase();


        launch(args);
    }



}
