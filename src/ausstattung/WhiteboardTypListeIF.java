package ausstattung;

import java.util.ArrayList;

public interface WhiteboardTypListeIF {

    ArrayList<WhiteboardTyp> getAlleWhiteboardTypen();

    /**
     * Fügt ein WhiteboardTyp der Liste von allen WhiteboardTypen hinzu
     *
     * @author Ben Kostka
     *
     * @param wt WhiteboardTypObjekt, welches neu hinzugefügt werden soll
     */
    void addWhiteboardTyp(WhiteboardTyp wt);
}
