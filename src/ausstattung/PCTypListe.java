package ausstattung;

import java.io.Serializable;
import java.util.ArrayList;

public class PCTypListe implements Serializable, PCTypListeIF {
    private ArrayList<PCTyp> allePCTypen = new ArrayList<>();
    private static PCTypListe instance;

    private PCTypListe() {
    }

    public static PCTypListe getInstance(){
        if (instance == null) {
            instance = new PCTypListe();
        }
        return instance;
    }

    public ArrayList<PCTyp> getAllePCTypen() {
        return allePCTypen;
    }

    /**
     * Fügt ein PCTyp der Liste von allen PCTypen hinzu
     *
     * @author Lukas Zander
     *
     * @param pt PCTypObjekt, welches neu hinzugefügt werden soll
     */
    public void addPCTyp(PCTyp pt){
        this.allePCTypen.add(pt);
    }
}
