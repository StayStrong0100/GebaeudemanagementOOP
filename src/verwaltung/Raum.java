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

    /**
     * Zählt die Anzahl von funktionstüchtigen Beamern im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */

    public int getAnzahlRaumBeamerFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Beamer && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }

        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Beamern im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumBeamerDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Beamer && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kameras im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumKamerasFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Kamera && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kameras im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumKamerasDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Kamera && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kreidetafeln im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumKreidetafelnFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kreidetafeln im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumKreidetafelnDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Lautsprechern im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumLautsprecherFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Lautsprechern im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumLautsprecherDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Mikrofonen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumMikrofoneFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Mikrofonen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumMikrofoneDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen PCs im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumPCsFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof PC && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten PCs im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumPCsDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof PC && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Smartboards im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumSmartboardsFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Smartboards im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumSmartboardsDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Stuehlen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumStuehleFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Stuehlen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumStuehleDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Tischen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumTischeFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Tisch && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Tischen im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumTischeDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Tisch && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Whiteboards im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumWhiteboardsFunktionstuechtig() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Whiteboards im Raum
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlRaumWhiteboardsDefekt() {
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
            if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Defekt) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public String printRaum() {
        return ("Raumnummer: " + this.getRaumnummer());
    }

}
