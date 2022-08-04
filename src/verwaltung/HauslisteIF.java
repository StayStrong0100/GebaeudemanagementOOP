package verwaltung;

import ausstattung.Ausstattungsmerkmal;
import ausstattung.Beamer;
import buchung.Terminbuchung;

import java.util.ArrayList;
import java.util.Calendar;

public interface HauslisteIF{

    public ArrayList<Haus> getAlleHaeuser();

    public void addHaus(Haus neuesHaus);


    /**
     * Gibt die Anzahl aller Ausstattungsarten nach Zustand in der Konsole aus
     *
     * @author ZanderLK
     * @version 1.1.0
     * @since 20220725
     */


    public String inventur();

    @Override
    public String toString();

    public void print();

    /**
     * Gibt eine ArrayList mit allen existierenden Räumen zurück
     *
     * @return alleRaueme - ArrayList<Raum>
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public ArrayList<Raum> getAlleRaeueme();

    /**
     * Gibt alle Räume mit Haus- und Raumnummer in der Konsole aus
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public void druckeAlleRaeume();

    /**
     * Gibt alle Räume eines bestimmten Hauses mit Haus- und Raumnummer in der Konsole aus
     *
     * @param hausID - String
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public void druckeAlleRaeume(String hausID);


    /**
     * Zählt die Anzahl von funktionstüchtigen Beamern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleBeamerFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Beamern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleBeamerDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Kameras am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKamerasFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Kameras am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKamerasDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Kreidetafeln am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKreidetafelnFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Kreidetafeln am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKreidetafelnDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Lautsprechern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleLautsprecherFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Lautsprechern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleLautsprecherDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Mikrofonen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleMikrofoneFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Mikrofonen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleMikrofoneDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen PCs am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAllePCsFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten PCs am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAllePCsDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Smartboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleSmartboardsFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Smartboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleSmartboardsDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Stuehlen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleStuehleFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Stuehlen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleStuehleDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Tischen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleTischeFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Tischen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleTischeDefekt();

    /**
     * Zählt die Anzahl von funktionstüchtigen Whiteboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleWhiteboardsFunktionstuechtig();

    /**
     * Zählt die Anzahl von defekten Whiteboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleWhiteboardsDefekt();

    /**
     * Filter alle Räume nach Anzahl verschiedener Ausstattungsmerkmale
     * und gibt eine ArrayList mit passenden Räumen zurück
     *
     *
     * @author Ben
     * @version 1.0.0
     * @since 20220725
     *
     * @param anzahlBeamer - int
     *        anzahlKamera - int
     *        anzahlKreidetafel - int
     *        anzahlLautsprecher - int
     *        anzahlMikrofon, int
     *        anzahlPC - int
     *        anzahlSmartboard - int
     *        anzahlStuhl - int
     *        anzahlTisch - int
     *        anzahlWhiteboard - int
     *
     * @return passendeRaueme - ArrayList<Raum>
     */
    public ArrayList<Raum> filtereRaeuemeAusstattung(int anzahlBeamer, int anzahlKamera,
                                                     int anzahlKreidetafel, int anzahlLautsprecher,
                                                     int anzahlMikrofon, int anzahlPC, int anzahlSmartboard,
                                                     int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard);


    /**
     * Filter alle Räume nach Anzahl verschiedener Ausstattungsmerkmale
     * und gibt eine ArrayList mit passenden Räumen zurück
     * NUR aus einer Array List von verfügbaren Räumen
     *
     *
     * @author Ben
     * @version 1.0.0
     * @since 20220725
     *
     * @param anzahlBeamer - int
     *        anzahlKamera - int
     *        anzahlKreidetafel - int
     *        anzahlLautsprecher - int
     *        anzahlMikrofon, int
     *        anzahlPC - int
     *        anzahlSmartboard - int
     *        anzahlStuhl - int
     *        anzahlTisch - int
     *        anzahlWhiteboard - int
     *
     * @return passendeRaueme - ArrayList<Raum>
     */
    public ArrayList<Raum> filtereRaeuemeAusstattung(ArrayList<Raum> freieRaeume, int anzahlBeamer, int anzahlKamera,
                                                     int anzahlKreidetafel, int anzahlLautsprecher,
                                                     int anzahlMikrofon, int anzahlPC, int anzahlSmartboard,
                                                     int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard);



    /**
     * Überprüft, ob ein Termin mit der Buchungsliste eines Raumes kollidiert
     *
     * @param 'Raum r, Calendar start, Calendar ende
     * @return boolean
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220705
     */
    public boolean terminKollidiert(Raum r, Calendar start, Calendar ende);

    /**
     * Gibt alle Räume zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @param 'Calendar start, Calendar ende
     * @return freieRaueme - ArrayList<Raum>
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende);

    /**
     * Gibt alle Räume einer Raumliste zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @param 'Calendar start, Calendar ende, ArrayList<Raum> raumListe
     * @return freieRaueme -  ArrayList<Raum>
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende, ArrayList<Raum> raumListe);

    /**
     * Überprüft, ob eine neue Raumnummer bereits vergeben ist
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220728
     *
     * @param neueNummer
     * @return boolean
     */
    public boolean raumnummerKollidiert(int neueNummer);

    /**
     * Gibt alle Ausstattungsmerkmale zurück
     *
     * @author ZanderLK
     * @since 20220803
     * @version 1.0.0
     *
     * @return alleAusstattungen - ArrayList<Ausstatungsmerkmal>
     */
    public ArrayList<Ausstattungsmerkmal> getAlleAusstattungen();
}
