package ausstattung;

import java.util.ArrayList;

public interface KreidetafelTypListeIF {

    ArrayList<KreidetafelTyp> getAlleKreidetafelTypen();

    /**
     * Fügt ein KreidetafelTyp der Liste von allen KreidetafelTypen hinzu
     *
     * @author Benjamin Kostka
     *
     * @param kt KreidetafelTypObjekt, welches neu hinzugefügt werden soll
     */
    void addKreidetafelTyp(KreidetafelTyp kt);
}
