package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class LautsprecherTypListe implements Serializable, LautsprecherTypListeIF {
    private ArrayList<LautsprecherTyp> alleLautsprecherTypen = new ArrayList<>();
    private static LautsprecherTypListe instance;

    private LautsprecherTypListe() {
    }

    public static LautsprecherTypListe getInstance(){
        if (instance == null) {
            instance = new LautsprecherTypListe();
        }
        return instance;
    }

    public ArrayList<LautsprecherTyp> getAlleLautsprecherTypen() {
        return alleLautsprecherTypen;
    }

    /**
     * Fügt ein LautsprecherTyp der Liste von allen LautsprecherTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param lt LautsprecherTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addLautsprecherTyp(LautsprecherTyp lt){
        this.alleLautsprecherTypen.add(lt);
    }
}
