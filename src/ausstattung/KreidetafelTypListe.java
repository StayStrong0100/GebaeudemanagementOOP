package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class KreidetafelTypListe implements Serializable, KreidetafelTypListeIF {
    private ArrayList<KreidetafelTyp> alleKreidetafelTypen = new ArrayList<>();
    private static KreidetafelTypListe instance;

    private KreidetafelTypListe() {
    }

    public static KreidetafelTypListe getInstance(){
        if (instance == null) {
            instance = new KreidetafelTypListe();
        }
        return instance;
    }

    public ArrayList<KreidetafelTyp> getAlleKreidetafelTypen() {
        return alleKreidetafelTypen;
    }

    /**
     * Fügt ein KreidetafelTyp der Liste von allen KreidetafelTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param kt KreidetafelTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addKreidetafelTyp(KreidetafelTyp kt){
        this.alleKreidetafelTypen.add(kt);
    }
}
