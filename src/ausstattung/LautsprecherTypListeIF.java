package ausstattung;

import java.util.ArrayList;

public interface LautsprecherTypListeIF {

    ArrayList<LautsprecherTyp> getAlleLautsprecherTypen();

    /**
     * Fügt ein LautsprecherTyp der Liste von allen LautsprecherTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param lt LautsprecherTypObjekt, welches neu hinzugefügt werden soll
     */
    void addLautsprecherTyp(LautsprecherTyp lt);
}
