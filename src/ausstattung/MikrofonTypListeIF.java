package ausstattung;

import java.util.ArrayList;

public interface MikrofonTypListeIF {

    ArrayList<MikrofonTyp> getAlleMikrofonTypen();

    /**
     * Fügt ein MikrofonTyp der Liste von allen MikrofonTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param mt MikrofonTypObjekt, welches neu hinzugefügt werden soll
     */
    void addMikrofonTyp(MikrofonTyp mt);
}
