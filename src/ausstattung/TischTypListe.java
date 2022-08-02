package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class TischTypListe implements Serializable, AusstattungsTypIF {
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

    public void addTischTyp(TischTyp tt){
        this.alleTischTypen.add(tt);
    }
}
