package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class WhiteboardTypListe implements Serializable, WhiteboardTypListeIF {
    private ArrayList<WhiteboardTyp> alleWhiteboardTypen = new ArrayList<>();
    private static WhiteboardTypListe instance;

    private WhiteboardTypListe() {
    }

    public static WhiteboardTypListe getInstance(){
        if (instance == null) {
            instance = new WhiteboardTypListe();
        }
        return instance;
    }

    public ArrayList<WhiteboardTyp> getAlleWhiteboardTypen() {
        return alleWhiteboardTypen;
    }

    /**
     * Fügt ein WhiteboardTyp der Liste von allen WhiteboardTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param wt WhiteboardTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addWhiteboardTyp(WhiteboardTyp wt){
        this.alleWhiteboardTypen.add(wt);
    }
}
