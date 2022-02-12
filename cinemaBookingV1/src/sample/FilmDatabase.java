package sample;
import java.util.*;
/**
 * Created by u1857977 on 07/03/2019.
 */
public class FilmDatabase {

    private ArrayList<Film> filmDatabase = new ArrayList<>();


    public void addFilm(Film newFilm) {
        filmDatabase.add(newFilm);
    }

    public void printFilmTitles() {
        for (Film film : filmDatabase) {
            System.out.println(film.getTitle());

        }
    }

    public ArrayList<Film> getFilms() {
       return filmDatabase;
    }

    public Film getFilmByTitle(String title) {
        for (Film film:filmDatabase) {
            if(film.getTitle().toLowerCase().contains(title.toLowerCase())){
                return film;
            }
        }
        return null;
    }

}

