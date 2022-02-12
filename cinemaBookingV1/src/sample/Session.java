package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by u1857977 on 07/03/2019.
 */
public class Session {
    private String sessionID;
    private String time;
    private String theatreID;
    // private ArrayList<Seat> seat;
    private Film film;
    private LocalDate showingDate;
    private double price;



    public Session(String time, String theatreID, Film film, LocalDate showingDate, String sessionID, double price) {
        this.time = time;
        this.theatreID = theatreID;
        this.film = film;
        this.showingDate = showingDate;
        this.sessionID = sessionID;
        this.price = price;
    }

//    public Session() {
//        this.time = "";
//        this.theatreID = "";
//        this.film = film;
//    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTheatreID() {
        return theatreID;
    }

    public void setTheatreID(String theatreID) {
        this.theatreID = theatreID;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDate getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(LocalDate showingDate) {
        this.showingDate = showingDate;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Session{" +
                "time='" + time + '\'' +
                ", theatreID='" + theatreID + '\'' +
                ", film=" + film +
                ", showingDate=" + showingDate +
                '}';
    }
}
