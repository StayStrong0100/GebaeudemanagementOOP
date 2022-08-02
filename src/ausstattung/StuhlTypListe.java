package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class StuhlTypListe implements Serializable, AusstattungsTypIF {
    private ArrayList<StuhlTyp> alleStuhlTypen = new ArrayList<>();
    private static StuhlTypListe instance;

    private StuhlTypListe() {
    }

    public static StuhlTypListe getInstance(){
        if (instance == null) {
            instance = new StuhlTypListe();
        }
        return instance;
    }

    public ArrayList<StuhlTyp> getAlleStuhlTypen() {
        return alleStuhlTypen;
    }

    public void addStuhlTyp(StuhlTyp st){
        this.alleStuhlTypen.add(st);
    }
}
