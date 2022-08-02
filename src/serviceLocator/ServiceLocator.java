package serviceLocator;

import buchung.DozentListe;
import datenspeicherung.*;
import verwaltung.*;

public class ServiceLocator {

    /*
    Zugriff auf:
    HausListe
    DozentenListe
    PersistenzDB
     */

    private HausListe hl;
    private DozentListe dl;
    private static ServiceLocator instance;

    private ServiceLocator(HausListe hl, DozentListe dl){
        this.hl = hl;
        this.dl = dl;
    }


    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator(HausListe.getInstance(), DozentListe.getInstance());
        }
        return instance;
    }

    public HausListe getHausliste() {
        return hl;
    }

    public DozentListe getDozentenListe() {
        return dl;
    }

    public PersistenzIF getPersistenz(){
        return PersistenzDB.getInstance();
    }



}