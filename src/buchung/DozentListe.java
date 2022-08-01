package buchung;

import verwaltung.Haus;
import verwaltung.HausListe;

import java.util.ArrayList;
//singleton
public class DozentListe {

    private ArrayList<Dozent> alleDozenten = new ArrayList<>();
    private static DozentListe instance;

    private DozentListe() {
    }

    public static DozentListe getInstance() {
        if (instance == null) {
            instance = new DozentListe();
        }
        return instance;
    }

    public ArrayList<Dozent> getAlleDozenten() {
        return alleDozenten;
    }

    public void addDozent(Dozent doz){
        this.alleDozenten.add(doz);
    }
}
