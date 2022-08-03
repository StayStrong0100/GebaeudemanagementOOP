package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class KreidetafelTypListe implements Serializable{
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

    public void addKreidetafelTyp(KreidetafelTyp kt){
        this.alleKreidetafelTypen.add(kt);
    }
}
