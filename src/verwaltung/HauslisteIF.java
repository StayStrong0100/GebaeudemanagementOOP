package verwaltung;

import ausstattung.Ausstattungsmerkmal;
import ausstattung.Beamer;
import buchung.Terminbuchung;
import zustand.Zustand;

import java.util.ArrayList;
import java.util.Calendar;

public interface HauslisteIF{

    public ArrayList<Haus> getAlleHaeuser();

    public void addHaus(Haus neuesHaus);

    public void removeHaus(Haus altesHAus);

    public String inventur();

    @Override
    public String toString();

    public ArrayList<Raum> getAlleRaeueme();

    public <T extends Ausstattungsmerkmal, Z extends Zustand> int getAnzahlAlleMerkmale(Class<T> typKlasse, Class<Z> zustandKlasse);

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
