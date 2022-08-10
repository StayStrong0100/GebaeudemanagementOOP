package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class TischTypListe implements Serializable, TischTypListeIF {
    private ArrayList<TischTyp> alleTischTypen = new ArrayList<>();
    private static TischTypListe instance;

    private TischTypListe() {
    }

    public static TischTypListe getInstance(){
        if (instance == null) {
            instance = new TischTypListe();
        }
        return instance;
    }

    public ArrayList<TischTyp> getAlleTischTypen() {
        return alleTischTypen;
    }

    /**
     * Fügt ein TischTyp der Liste von allen TischTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param tt TischTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addTischTyp(TischTyp tt){
        this.alleTischTypen.add(tt);
    }
}
