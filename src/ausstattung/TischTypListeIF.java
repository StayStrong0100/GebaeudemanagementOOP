package ausstattung;

import java.util.ArrayList;

public interface TischTypListeIF {

    ArrayList<TischTyp> getAlleTischTypen();

    /**
     * Fügt ein TischTyp der Liste von allen TischTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param tt TischTypObjekt, welches neu hinzugefügt werden soll
     */
    void addTischTyp(TischTyp tt);
}
