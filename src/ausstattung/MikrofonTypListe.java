package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class MikrofonTypListe implements Serializable, MikrofonTypListeIF {
    private ArrayList<MikrofonTyp> alleMikrofonTypen = new ArrayList<>();
    private static MikrofonTypListe instance;

    private MikrofonTypListe() {
    }

    public static MikrofonTypListe getInstance(){
        if (instance == null) {
            instance = new MikrofonTypListe();
        }
        return instance;
    }

    public ArrayList<MikrofonTyp> getAlleMikrofonTypen() {
        return alleMikrofonTypen;
    }

    public void addMikrofonTyp(MikrofonTyp mt){
        this.alleMikrofonTypen.add(mt);
    }
}
