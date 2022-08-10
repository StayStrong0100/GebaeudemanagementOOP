package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class SmartboardTypListe implements Serializable, SmartboardTypListeIF {
    private ArrayList<SmartboardTyp> alleSmartboardTypen = new ArrayList<>();
    private static SmartboardTypListe instance;

    private SmartboardTypListe() {
    }

    public static SmartboardTypListe getInstance(){
        if (instance == null) {
            instance = new SmartboardTypListe();
        }
        return instance;
    }

    public ArrayList<SmartboardTyp> getAlleSmartboardTypen() {
        return alleSmartboardTypen;
    }

    /**
     * Fügt ein SmartboardTyp der Liste von allen SmartboardTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param st SmartboardTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addSmartboardTyp(SmartboardTyp st){
        this.alleSmartboardTypen.add(st);
    }
}
