/**
 * Pars Int
 *
 * @author ZanderLK
 * @version 1.0.0
 * @param
 * @return
 * @since 202207??
 */
package verwaltung;

import ausstattung.Ausstattungsmerkmal;
import ausstattung.*;
import buchung.Terminbuchung;
import zustand.Defekt;
import zustand.Funktionstuechtig;
import zustand.Zustand;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

//singleton
public class HausListe implements Serializable, HauslisteIF {

    public static final long serialVersionUID = 0;
    private static HausListe instance;
    private final ArrayList<Haus> alleHaeuser = new ArrayList<>();

    private HausListe() {
    }

    public static HausListe getInstance() {
        if (instance == null) {
            instance = new HausListe();
        }
        return instance;
    }

    public ArrayList<Haus> getAlleHaeuser() {
        return alleHaeuser;
    }

    /**
     * Fügt ein Haus der Hausliste hinzu
     *
     * @author Lukas Zander
     *
     * @param neuesHaus Hausobjekt, welches neu hinzugefügt werden soll
     */
    public void addHaus(Haus neuesHaus) {
        this.alleHaeuser.add(neuesHaus);
    }

    /**
     * Entfernt ein Haus aus der Hausliste
     *
     * @author Lukas Zander
     *
     * @param altesHaus Hausobjekt, welches entfernt werden soll
     */
    public void removeHaus(Haus altesHaus){
        this.alleHaeuser.remove(altesHaus);
    }

    /**
     *Zählt die Anzahl von Ausstattungsmerkmalen in allen Räumen, abhängig des angegebenen Typs und Zustands
     *
    * @author Lukas Zander
     *
     * @param typKlasse Typklasse des Ausstattungsmerkmales, nach dem gefiltert werden soll
     * @param zustandKlasse Zustandsklasse des Ausstattungsmerkmales, nach dem gefiltert werden soll
     * @return Anzahl der vorhandenen Ausstattungsmerkmale in allen Räumen, abhängig des angegebenen Typs und Zustands
     */
    public <T extends Ausstattungsmerkmal, Z extends Zustand> int getAnzahlAlleMerkmale(Class<T> typKlasse, Class<Z> zustandKlasse){
        int anzahl = 0;
        for(Raum r : this.getAlleRaeueme()){
            anzahl += r.getAnzahlMerkmale(typKlasse,zustandKlasse);
        }
        return anzahl;
    }


    /**
     * Gibt eine Übersicht über alle Ausstattungsarten und deren Zustände als String zurück
     *
     * @author Lukas Zander

     * @return mehrzeiliger String bestehend aus der Anzahl von Ausstattungsarten
     */
    public String inventur() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventur: \n");
        sb.append("Anzahl Tische funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Tisch.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Anzahl Tische defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Tisch.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Anzahl Stühle funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Stuhl.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Stühle defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Stuhl.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Mikrofone funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Mikrofon.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Mikrofone defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Mikrofon.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Beamer funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Beamer.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Beamer defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Beamer.class, Defekt.class));
        sb.append("\n\n");
        sb.append("PCs funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(PC.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("PCs defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(PC.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Smartboards funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Smartboard.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Smartboards defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Smartboard.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Kreidetafeln funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Kreidetafel.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Kreidetafeln defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Kreidetafel.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Whiteboards funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Whiteboard.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Whiteboards defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Whiteboard.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Kameras funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Kamera.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Kameras defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Kamera.class, Defekt.class));
        sb.append("\n\n");
        sb.append("Lautsprecher funktionstüchtig: ");
        sb.append(this.getAnzahlAlleMerkmale(Lautsprecher.class, Funktionstuechtig.class));
        sb.append("\n");
        sb.append("Lautsprecher defekt: ");
        sb.append(this.getAnzahlAlleMerkmale(Lautsprecher.class, Defekt.class));
        sb.append("\n\n");
        return sb.toString();
    }

    /**
     * Gibt alle Häuser mit ihren Räumen in einem String zusammen aus
     *
     * @author Lukas Zander
     *
     * @return alle Häuser mit Räumen als String
     */
    @Override
    public String toString() {
        String ausgabe = "";

        ausgabe += "HausListe:";
        for (Haus h : this.getAlleHaeuser()) {
            ausgabe += "\n";
            ausgabe += h.toString();
            ausgabe += "\n";
            for (Raum r : h.getRaeume()) {
                ausgabe += r.toString();
                ausgabe += "\n";
            }
        }

        return ausgabe;
    }

    /**
     * Gibt eine ArrayList mit allen Räumen am Campus zurück
     *
     * @author Lukas Zander
     *
     * @return alle existierende Räume als ArrayList
     */
    public ArrayList<Raum> getAlleRaeueme() {
        ArrayList<Raum> alleRaeume = new ArrayList<>();
        for (Haus h : this.getAlleHaeuser()
        ) {
            for (Raum r : h.getRaeume()
            ) {
                alleRaeume.add(r);
            }
        }
        return alleRaeume;
    }

    /**
     * Filter alle Räume nach Anzahl verschiedener Ausstattungsmerkmale
     * und gibt eine ArrayList mit passenden Räumen zurück
     *
     * @author Benjamin Konstka
     *
     * @param anzahlBeamer Mindestanzahl von erforderlichen funktionstüchtigen Beamern
     * @param anzahlKamera Mindestanzahl von erforderlichen funktionstüchtigen Kameras
     * @param anzahlKreidetafel Mindestanzahl von erforderlichen funktionstüchtigen Kreidetafeln
     * @param anzahlLautsprecher Mindestanzahl von erforderlichen funktionstüchtigen Lautsprechern
     * @param anzahlMikrofon Mindestanzahl von erforderlichen funktionstüchtigen Mikrofonen
     * @param anzahlPC Mindestanzahl von erforderlichen funktionstüchtigen PCs
     * @param anzahlSmartboard Mindestanzahl von erforderlichen funktionstüchtigen Smartboards
     * @param anzahlStuhl Mindestanzahl von erforderlichen funktionstüchtigen Stühlen
     * @param anzahlTisch Mindestanzahl von erforderlichen funktionstüchtigen Tischen
     * @param anzahlWhiteboard Mindestanzahl von erforderlichen funktionstüchtigen Whiteboards
     *
     * @return alle passenden Räume als ArrayList
     */
    public ArrayList<Raum> filtereRaeuemeAusstattung(int anzahlBeamer, int anzahlKamera, int anzahlKreidetafel, int anzahlLautsprecher,
                                                     int anzahlMikrofon, int anzahlPC, int anzahlSmartboard, int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard) {

        return filtereRaeuemeAusstattung(this.getAlleRaeueme(), anzahlBeamer, anzahlKamera, anzahlKreidetafel,  anzahlLautsprecher, anzahlMikrofon,  anzahlPC,  anzahlSmartboard, anzahlStuhl,  anzahlTisch,  anzahlWhiteboard);

    }

    /**
     * Filter alle Räume nach Anzahl verschiedener Ausstattungsmerkmale
     * und gibt eine ArrayList mit passenden Räumen zurück
     * NUR aus einer Array List von verfügbaren Räumen
     *
     * @author Benjamin Konstka
     *
     * @param freieRaeume Verfügbare Räume, aus denen nach Ausstattung gefiltert werden soll
     * @param anzahlBeamer Mindestanzahl von erforderlichen funktionstüchtigen Beamern
     * @param anzahlKamera Mindestanzahl von erforderlichen funktionstüchtigen Kameras
     * @param anzahlKreidetafel Mindestanzahl von erforderlichen funktionstüchtigen Kreidetafeln
     * @param anzahlLautsprecher Mindestanzahl von erforderlichen funktionstüchtigen Lautsprechern
     * @param anzahlMikrofon Mindestanzahl von erforderlichen funktionstüchtigen Mikrofonen
     * @param anzahlPC Mindestanzahl von erforderlichen funktionstüchtigen PCs
     * @param anzahlSmartboard Mindestanzahl von erforderlichen funktionstüchtigen Smartboards
     * @param anzahlStuhl Mindestanzahl von erforderlichen funktionstüchtigen Stühlen
     * @param anzahlTisch Mindestanzahl von erforderlichen funktionstüchtigen Tischen
     * @param anzahlWhiteboard Mindestanzahl von erforderlichen funktionstüchtigen Whiteboards
     * @return
     */
    public ArrayList<Raum> filtereRaeuemeAusstattung(ArrayList<Raum> freieRaeume, int anzahlBeamer, int anzahlKamera, int anzahlKreidetafel, int anzahlLautsprecher,
                                                     int anzahlMikrofon, int anzahlPC, int anzahlSmartboard, int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard) {

        ArrayList<Raum> passendeRaueme = new ArrayList<>();

        for (Raum r : freieRaeume) {
            if (r.getAnzahlMerkmale(Beamer.class, Funktionstuechtig.class) >= anzahlBeamer
                    && r.getAnzahlMerkmale(Kamera.class, Funktionstuechtig.class) >= anzahlKamera
                    && r.getAnzahlMerkmale(Kreidetafel.class, Funktionstuechtig.class) >= anzahlKreidetafel
                    && r.getAnzahlMerkmale(Lautsprecher.class, Funktionstuechtig.class) >= anzahlLautsprecher
                    && r.getAnzahlMerkmale(Mikrofon.class, Funktionstuechtig.class) >= anzahlMikrofon
                    && r.getAnzahlMerkmale(PC.class, Funktionstuechtig.class) >= anzahlPC
                    && r.getAnzahlMerkmale(Smartboard.class, Funktionstuechtig.class) >= anzahlSmartboard
                    && r.getAnzahlMerkmale(Stuhl.class, Funktionstuechtig.class) >= anzahlStuhl
                    && r.getAnzahlMerkmale(Tisch.class, Funktionstuechtig.class) >= anzahlTisch
                    && r.getAnzahlMerkmale(Whiteboard.class, Funktionstuechtig.class) >= anzahlWhiteboard) {

                passendeRaueme.add(r);
            }
        }

        return passendeRaueme;
    }

    /**
     * Überprüft, ob ein Termin mit der Buchungsliste eines Raumes kollidiert
     *
     * @author Lukas Zander
     * @param r Raum in dem gebucht werden soll
     * @param start Beginn der geplanten Terminbuchung
     * @param ende Ende der geplanten Terminbuchung
     * @return ob Raum dort frei ist oder nicht als boolean
     */
    public boolean terminKollidiert(Raum r, Calendar start, Calendar ende) {
        for (Terminbuchung t : r.getBuchungen()
        ) {
            Calendar geblockterStart = t.getIntervall().getStart();
            Calendar geblocktesEnde = t.getIntervall().getEnde();

            //Wenn Anfrage-Start zwischen in einem bereits gebuchten Intervall liegt (dazwischen, gleich Start oder Ende ist)
            if (start.after(geblockterStart) && start.before(geblocktesEnde) || start.equals(geblockterStart) || start.equals(geblocktesEnde)) {
                return true;
            }
            //Wenn Anfrage-Ende zwischen in einem bereits gebuchten Intervall liegt
            if (ende.after(geblockterStart) && ende.before(geblocktesEnde) || ende.equals(geblockterStart) || ende.equals(geblocktesEnde)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * Gibt alle Räume zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @author Lukas Zander
     *
     * @param start Beginn der geplanten Terminbuchung
     * @param ende Ende der geplanten Terminbuchung
     * @return alle freien Räume zu angegebener Zeit als ArrayList
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende) {
        return filtereRaeuemeVerfuegbar(start,ende,this.getAlleRaeueme());
    }

    /**
     *
     * Gibt alle Räume zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @author Lukas Zander
     *
     * @param raumListe zur Verfügung stehende Räume, die gefiltert werden sollen
     * @param start Beginn der geplanten Terminbuchung
     * @param ende Ende der geplanten Terminbuchung
     *
     * @return alle freien Räume zu angegebener Zeit als ArrayList
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende, ArrayList<Raum> raumListe) {
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : raumListe) {
            if (!this.terminKollidiert(r, start, ende)) {
                freieRaueme.add(r);
            }
        }
        return freieRaueme;
    }

    /**
     * Überprüft, ob eine neue Raumnummer bereits vergeben ist
     *
     * @author Lukas Zander
     *
     * @param neueNummer neue Raumnummer, die vergeben werden soll
     *
     * @return ob die Nummer kollidiert oder nicht als boolean
     */
    public boolean raumnummerKollidiert(int neueNummer) {
        for (Raum r : this.getAlleRaeueme()) {
            if (r.getRaumnummer() == neueNummer) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gibt alle Ausstattungsmerkmale zurück
     *
     * @author Lukas Zander
     *
     * @return alle Ausstattungsmerkmale am Campus als ArrayList
     */
    public ArrayList<Ausstattungsmerkmal> getAlleAusstattungen() {
        ArrayList<Ausstattungsmerkmal> alleAusstattungen = new ArrayList<>();

        for (Haus h : this.getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                alleAusstattungen.addAll(r.getAusstattung());
            }
        }

        return alleAusstattungen;
    }

}

