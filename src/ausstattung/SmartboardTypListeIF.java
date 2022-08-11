package ausstattung;

import java.util.ArrayList;

public interface SmartboardTypListeIF {

    ArrayList<SmartboardTyp> getAlleSmartboardTypen();

    /**
     * Fügt ein SmartboardTyp der Liste von allen SmartboardTypen hinzu
     *
     * @author Benjamin Kostka
     *
     * @param st SmartboardTypObjekt, welches neu hinzugefügt werden soll
     */
    void addSmartboardTyp(SmartboardTyp st);
}
