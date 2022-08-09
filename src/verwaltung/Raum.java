package verwaltung;

import ausstattung.*;
import buchung.*;
import zustand.*;

import java.io.Serializable;
import java.util.*;

public class Raum implements Serializable {

    public static final long serialVersionUID = 0;
    private int raumnummer;
    private ArrayList<Terminbuchung> buchungen = new ArrayList<>();
    private ArrayList<Ausstattungsmerkmal> ausstattung = new ArrayList<>();

    public Raum(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    public ArrayList<Ausstattungsmerkmal> getAusstattung() {
        return this.ausstattung;
    }

    public ArrayList<Terminbuchung> getBuchungen() {
        return this.buchungen;
    }

    /**
     * Gibt die gesamte Ausstattung eines Raumes als String zurück
     *
     * @author Benjamin Kostka
     *
     * @return Ausstattung eines Raumes als String
     */
    @Override
    public String toString() {
        String ausgabe = "Raumnummer:\t" + raumnummer + "\n\n";

        for (Ausstattungsmerkmal a : ausstattung) {
            ausgabe += a.toString() + "\n\n";
        }

        return ausgabe;
    }

    /**
     * Fügt dem Raum eine Terminbuchung hinzu
     *
     * @author Lukas Zander
     *
     * @param start Beginn der Terminbuchung
     * @param ende Ende der Terminbuchung
     * @param doz Dozent, der den Raum buchen möchte
     */
    public void buchen(Calendar start, Calendar ende, Dozent doz) {
        this.buchungen.add(new Terminbuchung(start, ende, doz));
    }

    /**
     * Entfernt eine Terminbuchung aus dem Raum und aus der Terminliste des betroffenen Dozenten
     *
     * @author Lukas Zander
     *
     * @param id ID der Terminbuchung
     */
    public void cancelOrder(int id) {
        for (Terminbuchung buchung : this.getBuchungen()) {
            if (buchung.getId() == id) {
                buchung.getDozent().removeBuchung(buchung);
                buchungen.remove(buchung);
                return;
            }
        }
    }

    /**
     * Fügt dem Raum ein neues Ausstattungsmerkmal hinzu
     *
     * @author Lukas Zander
     *
     * @param neu Ausstattungsmerkmal, dass hinzugefügt werden soll
     */
    public void addAusstattung(Ausstattungsmerkmal neu) {
        this.ausstattung.add(neu);
    }

    /**
     * Entfernt aus dem Raum ein Ausstattungsmerkmal
     *
     * @author Lukas Zander
     *
     * @param alt Ausstattungsmerkmal, dass entfernt werden soll
     */
    public void removeAusstattung(Ausstattungsmerkmal alt) {this.ausstattung.remove(alt);}

    /**
     * Zählt die Anzahl von einer bestimmten Ausstattung und einem bestimmten Zustand
     *
     * @author Lukas Zander
     *
     * @return die vorhandene Anzahl des entsprechenden Ausstattungsmerkmals in dem Raum
     */
    public <T extends Ausstattungsmerkmal, Z extends Zustand> int getAnzahlMerkmale(Class<T> typKlasse, Class<Z> zustandKlasse){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a.getClass() == typKlasse && a.getAktuellerZustand().getClass() == zustandKlasse) {
                anzahl++;
            }
        }
        return anzahl;
    }

}
