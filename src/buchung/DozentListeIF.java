package buchung;

import java.util.ArrayList;

public interface DozentListeIF {

    ArrayList<Dozent> getAlleDozenten();

    /**
     * Fügt einen Dozenten hinzu
     *
     * @author Lukas Zander
     *
     * @param doz Dozent, der hinzugefügt werden soll
     */
    void addDozent(Dozent doz);

    /**
     * Entfernt einen Dozenten und gleichzeitig alle seine Terminbuchungen aus den jeweiligen Räumen
     *
     * @author Lukas Zander
     *
     * @param doz Dozent, der gelöscht werden soll
     */
    void removeDozent(Dozent doz);
}
