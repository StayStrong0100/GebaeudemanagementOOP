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

    public int getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    @Override
    public String toString() {
        String ausgabe = "Raumnummer:\t" + raumnummer + "\n\n";

        for (Ausstattungsmerkmal a : ausstattung) {
            ausgabe += a.toString() + "\n\n";
        }

        return ausgabe;
    }

    public String printAlleBuchungen() {
        String ausgabe = "";
        for (Terminbuchung t : this.getBuchungen()) {
            ausgabe.concat(t.printBuchungDetails());
            ausgabe.concat("\n");
        }
        return ausgabe;
    }

    public ArrayList<Ausstattungsmerkmal> getAusstattung() {
        return this.ausstattung;
    }

    public ArrayList<Terminbuchung> getBuchungen() {
        return this.buchungen;
    }

    public Raum(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public void buchen(Calendar start, Calendar ende, Dozent doz) {
        this.buchungen.add(new Terminbuchung(start, ende, doz));
    }

    public void cancelOrder(int id) {
        for (Terminbuchung buchung : this.getBuchungen()) {
            if (buchung.getId() == id) {
                buchung.getDozent().removeBuchung(buchung);
                buchungen.remove(buchung);
                return;
            }
        }
    }

    public void addAusstattung(Ausstattungsmerkmal neu) {
        this.ausstattung.add(neu);
    }

    public void addAusstattung(Ausstattungsmerkmal neu, int anzahl) {

        for (int i = 1; i <= anzahl; i++) {
            this.ausstattung.add(neu);
        }
    }

    public void removeAusstattung(Ausstattungsmerkmal alt) {this.ausstattung.remove(alt);}

    /**
     * Zählt die Anzahl von funktionstüchtigen Beamern im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */

    /**
     * Zählt die Anzahl von einer bestimmten Ausstattung und einem bestimmten Zustand
     *
     * @author Lukas Zander
     *
     * @return
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

    public String printRaum() {
        return ("Raumnummer: " + this.getRaumnummer());
    }

}
