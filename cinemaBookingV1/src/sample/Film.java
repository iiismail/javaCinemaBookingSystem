package sample;

/**
 * Created by u1857977 on 11/03/2019.
 */
public class Film {
    private String title;
    private double price;
    private String ageRating;
    private int runTime;
    private String URL;
    private String description;

    public Film(String title, double price, String ageRating, int runTime,String URL, String description) {
        this.title = title;
        this.price = price;
        this.ageRating = ageRating;
        this.runTime = runTime;
        this.URL = URL;
        this.description = description;
    }

    public Film(){
        this.title = "";
        this.price = 0;
        this.ageRating = "";
        this.runTime = 0;
        this.URL="";
        this.description = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }
}
