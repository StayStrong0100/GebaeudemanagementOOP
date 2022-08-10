package ausstattung;

import java.util.ArrayList;

public interface PCTypListeIF {

    ArrayList<PCTyp> getAllePCTypen();

    /**
     * Fügt ein PCTyp der Liste von allen PCTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param pt PCTypObjekt, welches neu hinzugefügt werden soll
     */
    void addPCTyp(PCTyp pt);
}
