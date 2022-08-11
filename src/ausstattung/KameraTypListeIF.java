package ausstattung;

import java.util.ArrayList;

public interface KameraTypListeIF {

    ArrayList<KameraTyp> getAlleKameraTypen();

    /**
     * Fügt ein KameraTyp der Liste von allen KameraTypen hinzu
     *
     * @author Benjamin Kostka
     *
     * @param kt KameraTypObjekt, welches neu hinzugefügt werden soll
     */
    void addKameraTyp(KameraTyp kt);
}
