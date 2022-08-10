package ausstattung;

import java.util.ArrayList;

public interface StuhlTypListeIF {

    ArrayList<StuhlTyp> getAlleStuhlTypen();

    /**
     * Fügt ein StuhlTyp der Liste von allen StuhlTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param st StuhlTypObjekt, welches neu hinzugefügt werden soll
     */
    void addStuhlTyp(StuhlTyp st);
}
