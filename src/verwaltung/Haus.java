package verwaltung;

import java.io.Serializable;
import java.util.ArrayList;

public class Haus implements Serializable {

    public static final long serialVersionUID = 0;
    private String hausnummer;
    private boolean barrierefrei;
    private ArrayList<Raum> raeume = new ArrayList<>();

    public Haus(String hausnummer, boolean barrierefrei) {
        this.hausnummer = hausnummer;
        this.barrierefrei = barrierefrei;
    }

    public ArrayList<Raum> getRaeume() {
        return raeume;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setBarrierefrei(boolean barrierefrei) {
        this.barrierefrei = barrierefrei;
    }

    /**
     * Fügt dem Haus einen neuen Raum hinzu
     *
     * @author Lukas Zander
     *
     * @param neuerRaum Raum, der hinzugefügt werden soll
     */
    public void addRaum(Raum neuerRaum) {
        this.raeume.add(neuerRaum);
    }

    /**
     * Entfernt aus dem Haus einen Raum
     *
     * @author Lukas Zander
     *
     * @param alterRaum Raum, der entfernt werden soll
     */
    public void removeRaum(Raum alterRaum) {
        this.raeume.remove(alterRaum);
    }

    /**
     * Gibt das Haus mit allen Räume als String zurück
     *
     * @author Benjamin Kostka
     *
     * @return String mit Hausnummer und allen Raumnummern
     */
    @Override
    public String toString() {
        String ausgabe = "Hausnummer:\t" + hausnummer +
                "\nBarrierefrei:\t" + barrierefrei + "\n\n";
        for (Raum r : getRaeume()) {
            ausgabe += (r.toString() + "\n");
        }
        return ausgabe;
    }
}
