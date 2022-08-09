package buchung;

import serviceLocator.ServiceLocator;
import verwaltung.Haus;
import verwaltung.HausListe;
import verwaltung.Raum;

import java.io.Serializable;
import java.util.ArrayList;
//singleton
public class DozentListe implements Serializable, DozentListeIF {

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
        return this.alleDozenten;
    }

    public void addDozent(Dozent doz){
        this.alleDozenten.add(doz);
    }

    /**
     * Entfernt einen Dozenten und gleichzeitig alle seine Terminbuchungen aus den jeweiligen Räumen
     *
     * @author Lukas Zander
     *
     * @param doz Dozent, der gelöscht werden soll
     */
    public void removeDozent(Dozent doz){
        for(Terminbuchung t : doz.getMeineBuchungen()){
            for(Raum r : ServiceLocator.getInstance().getHausliste().getAlleRaeueme()){
                if(r.getBuchungen().contains(t)){
                    r.getBuchungen().remove(t);
                    break;
                }
            }
        }
        this.alleDozenten.remove(doz);
    }
}
