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

    public void addSmartboardTyp(SmartboardTyp st){
        this.alleSmartboardTypen.add(st);
    }
}
