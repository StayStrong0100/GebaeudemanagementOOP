package serviceLocator;

import datenspeicherung.*;
import verwaltung.*;

public class ServiceLocator {

    /*
    Zugriff auf:
    HausListe
    PersistenzDB
     */

    private HausListe hl;
    private static ServiceLocator instance;

    private ServiceLocator(HausListe hl) {
        this.hl = hl;
    }


    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator(HausListe.getInstance());
        }
        return instance;
    }

    public HausListe getHausliste() {
        return HausListe.getInstance();
    }

    public PersistenzIF getPersistenz(){
        return PersistenzDB.getInstance();
    }



}