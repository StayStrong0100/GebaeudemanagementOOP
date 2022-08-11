package ausstattung;

import java.util.ArrayList;

public interface BeamerTypListeIF {

    ArrayList<BeamerTyp> getAlleBeamerTypen();

    /**
     * Fügt ein BeamerTyp der Liste von allen BeamerTypen hinzu
     *
     * @author Benjamin Kostka
     *
     * @param bt BeamerTypObjekt, welches neu hinzugefügt werden soll
     */
    void addBeamerTyp(BeamerTyp bt);
}
