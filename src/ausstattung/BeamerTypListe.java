package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class BeamerTypListe implements Serializable, BeamerTypListeIF {
    private ArrayList<BeamerTyp> alleBeamerTypen = new ArrayList<>();
    private static BeamerTypListe instance;

    private BeamerTypListe() {
    }

    public static BeamerTypListe getInstance() {
        if (instance == null) {
            instance = new BeamerTypListe();
        }
        return instance;
    }

    public ArrayList<BeamerTyp> getAlleBeamerTypen() {
        return alleBeamerTypen;
    }

    /**
     * Fügt ein BeamerTyp der Liste von allen BeamerTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param bt BeamerTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addBeamerTyp(BeamerTyp bt) {
        this.alleBeamerTypen.add(bt);
    }
}
