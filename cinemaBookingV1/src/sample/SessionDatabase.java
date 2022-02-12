package sample;

import java.util.ArrayList;

/**
 * Created by U1857977 on 16/03/2019.
 */
public class SessionDatabase {

    private ArrayList<Session>  sessionDatabase = new ArrayList<>();

    public void addSession(Session newSession) {
        sessionDatabase.add(newSession);
    }

    public void printSessionTime() {
        for (Session session : sessionDatabase) {
            System.out.println(session.getTime());

        }
    }

    public ArrayList<Session> getSession() {
        return sessionDatabase;
    }

    public ArrayList<Session> getSessionsTimeByFilmTitle(String title) {
        ArrayList<Session> sessions = new ArrayList<>();
        for (Session session:sessionDatabase) {
            if(session.getFilm().getTitle().toLowerCase().contains(title.toLowerCase())){
                sessions.add(session);
            }
        }
        return sessions;
    }

    public Session getSessionsBySessionID(String sessionID) {
        // ArrayList<Session> sessions = new ArrayList<>();
        for (Session session : sessionDatabase) {
            if (session.getSessionID().contains(sessionID)) {
                return session;
            }
        }
        return null;

    }
}

