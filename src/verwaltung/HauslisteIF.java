package verwaltung;

import ausstattung.*;
import zustand.Zustand;
import java.util.ArrayList;
import java.util.Calendar;

public interface HauslisteIF{

    ArrayList<Haus> getAlleHaeuser();

    /**
     * Fügt ein Haus der Hausliste hinzu
     *
     * @author Lukas Zander
     *
     * @param neuesHaus Hausobjekt, welches neu hinzugefügt werden soll
     */
    void addHaus(Haus neuesHaus);

    /**
     * Entfernt ein Haus aus der Hausliste
     *
     * @author Lukas Zander
     *
     * @param altesHaus Hausobjekt, welches entfernt werden soll
     */
    void removeHaus(Haus altesHaus);

    /**
     *Zählt die Anzahl von Ausstattungsmerkmalen in allen Räumen, abhängig des angegebenen Typs und Zustands
     *
     * @author Lukas Zander
     *
     * @param typKlasse Typklasse des Ausstattungsmerkmales, nach dem gefiltert werden soll
     * @param zustandKlasse Zustandsklasse des Ausstattungsmerkmales, nach dem gefiltert werden soll
     * @return Anzahl der vorhandenen Ausstattungsmerkmale in allen Räumen, abhängig des angegebenen Typs und Zustands
     */
    <T extends Ausstattungsmerkmal, Z extends Zustand> int getAnzahlAlleMerkmale(Class<T> typKlasse, Class<Z> zustandKlasse);


    /**
     * Gibt eine Übersicht über alle Ausstattungsarten und deren Zustände als String zurück
     *
     * @author Lukas Zander

     * @return mehrzeiliger String bestehend aus der Anzahl von Ausstattungsarten
     */
    String inventur();

    /**
     * Gibt alle Häuser mit ihren Räumen in einem String zusammen aus
     *
     * @author Lukas Zander
     *
     * @return alle Häuser mit Räumen als String
     */
    @Override
    String toString();

    /**
     * Gibt eine ArrayList mit allen Räumen am Campus zurück
     *
     * @author Lukas Zander
     *
     * @return alle existierende Räume als ArrayList
     */
    ArrayList<Raum> getAlleRaeume();

    /**
     * Filter alle Räume nach Anzahl verschiedener Ausstattungsmerkmale
     * und gibt eine ArrayList mit passenden Räumen zurück
     * NUR aus einer ArrayList von verfügbaren Räumen
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
     *
     * @return alle passenden Räume als ArrayList
     */
    ArrayList<Raum> filtereRaeumeAusstattung(ArrayList<Raum> freieRaeume, int anzahlBeamer, int anzahlKamera, int anzahlKreidetafel, int anzahlLautsprecher,
                                             int anzahlMikrofon, int anzahlPC, int anzahlSmartboard, int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard);

    /**
     * Überprüft, ob ein Termin mit der Buchungsliste eines Raumes kollidiert
     *
     * @author Lukas Zander
     * @param r Raum in dem gebucht werden soll
     * @param start Beginn der geplanten Terminbuchung
     * @param ende Ende der geplanten Terminbuchung
     * @return ob Raum dort frei ist oder nicht als boolean
     */
    boolean terminKollidiert(Raum r, Calendar start, Calendar ende) ;

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
    ArrayList<Raum> filtereRaeumeVerfuegbar(Calendar start, Calendar ende);

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
    ArrayList<Raum> filtereRaeumeVerfuegbar(Calendar start, Calendar ende, ArrayList<Raum> raumListe);

    /**
     * Überprüft, ob eine neue Raumnummer bereits vergeben ist
     *
     * @author Lukas Zander
     *
     * @param neueNummer neue Raumnummer, die vergeben werden soll
     *
     * @return ob die Nummer kollidiert oder nicht als boolean
     */
    boolean raumnummerKollidiert(int neueNummer);

    /**
     * Gibt alle Ausstattungsmerkmale zurück
     *
     * @author Lukas Zander
     *
     * @return alle Ausstattungsmerkmale am Campus als ArrayList
     */
    ArrayList<Ausstattungsmerkmal> getAlleAusstattungen();
}
