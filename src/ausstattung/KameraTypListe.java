package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class KameraTypListe implements Serializable, KameraTypListeIF {
    private ArrayList<KameraTyp> alleKameraTypen = new ArrayList<>();
    private static KameraTypListe instance;

    private KameraTypListe() {
    }

    public static KameraTypListe getInstance(){
        if (instance == null) {
            instance = new KameraTypListe();
        }
        return instance;
    }

    public ArrayList<KameraTyp> getAlleKameraTypen() {
        return alleKameraTypen;
    }

    /**
     * Fügt ein KameraTyp der Liste von allen KameraTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param kt KameraTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addKameraTyp(KameraTyp kt){
        this.alleKameraTypen.add(kt);
    }
}
