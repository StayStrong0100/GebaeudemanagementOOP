/**
 * Pars Int
 *
 * @author ZanderLK
 * @version 1.0.0
 * @since 202207??
 *
 * @param
 *
 * @return

 */
package verwaltung;

import ausstattung.*;
import buchung.Terminbuchung;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

//singleton
public class HausListe implements Serializable, HauslisteIF {

    public static final long serialVersionUID = 0;
    private ArrayList<Haus> alleHaeuser = new ArrayList<>();
    private static HausListe instance;

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

    public void addHaus(Haus neuesHaus) {this.alleHaeuser.add(neuesHaus);
    }


    /**
     * Gibt die Anzahl aller Ausstattungsarten nach Zustand in der Konsole aus
     *
     * @author ZanderLK
     * @version 1.1.0
     * @since 20220725
     */


        public void inventur() {
            System.out.println("Anzahl Tische funktionstüchtig: " + this.getAnzahlAlleTischeFunktionstuechtig());
            System.out.println("Anzahl Tische defekt: " + this.getAnzahlAlleTischeDefekt());
            System.out.println("Anzahl Stühle funktionstüchtig: " + this.getAnzahlAlleStuehleFunktionstuechtig());
            System.out.println("Stühle defekt: " + this.getAnzahlAlleStuehleDefekt());
            System.out.println("Mikrofone funktionstüchtig: " + this.getAnzahlAlleMikrofoneFunktionstuechtig());
            System.out.println("Mikrofone defekt: " + this.getAnzahlAlleMikrofoneDefekt());
            System.out.println("Beamer funktionstüchtig: " + this.getAnzahlAlleBeamerFunktionstuechtig());
            System.out.println("Beamer defekt: " + this.getAnzahlAlleBeamerDefekt());
            System.out.println("PCs funktionstüchtig: " + this.getAnzahlAllePCsFunktionstuechtig());
            System.out.println("PCs defekt: " + this.getAnzahlAllePCsDefekt());
            System.out.println("Smartboards funktionstüchtig: " + this.getAnzahlAlleSmartboardsFunktionstuechtig());
            System.out.println("Smartboards defekt: " + this.getAnzahlAlleSmartboardsDefekt());
            System.out.println("Kreidetafeln funktionstüchtig: " + this.getAnzahlAlleKreidetafelnFunktionstuechtig());
            System.out.println("Kreidetafeln defekt: " + this.getAnzahlAlleKreidetafelnDefekt());
            System.out.println("Whiteboards funktionstüchtig: " + this.getAnzahlAlleWhiteboardsFunktionstuechtig());
            System.out.println("Whiteboards defekt: " + this.getAnzahlAlleWhiteboardsDefekt());
            System.out.println("Kameras funktionstüchtig: " + this.getAnzahlAlleKamerasFunktionstuechtig());
            System.out.println("Kameras defekt: " + this.getAnzahlAlleKamerasDefekt());
            System.out.println("Lautsprecher funktionstüchtig: " + this.getAnzahlAlleLautsprecherFunktionstuechtig());
            System.out.println("Lautsprecher defekt: " + this.getAnzahlAlleLautsprecherDefekt());
        }

        @Override
        public String toString() {
            String ausgabe = "";

             ausgabe +="HausListe:";
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

        public void print(){
            System.out.println(toString());
        }

        /**
         * Gibt eine ArrayList mit allen existierenden Räumen zurück
         *
         * @return alleRaueme - ArrayList<Raum>
         * @author ZanderLK
         * @version 1.0.0
         * @since 20220721
         */
    public ArrayList<Raum> getAlleRaeueme() {
        ArrayList<Raum> alleRaeume = new ArrayList<>();
        for (Haus h : HausListe.getInstance().getAlleHaeuser()
        ) {
            for (Raum r : h.getRaeume()
            ) {
                alleRaeume.add(r);
            }
        }
        return alleRaeume;
    }

    /**
     * Gibt alle Räume mit Haus- und Raumnummer in der Konsole aus
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public void druckeAlleRaeume() {
        for (Haus h : HausListe.getInstance().getAlleHaeuser()
        ) {
            for (Raum r : h.getRaeume()) {
                System.out.println("Haus: " + h.getHausnummer() + "\t" + "Raumnummer: " + r.getRaumnummer());
            }
        }
    }

    /**
     * Gibt alle Räume eines bestimmten Hauses mit Haus- und Raumnummer in der Konsole aus
     *
     * @param hausID - String
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public void druckeAlleRaeume(String hausID) {
        for (Haus h : HausListe.getInstance().getAlleHaeuser()
        ) {
            if (h.getHausnummer().equals(hausID)) {
                System.out.println("Räume im Haus " + hausID + ": ");
                for (Raum r : h.getRaeume()
                ) {
                    System.out.println("Raumnummer: " + r.getRaumnummer());
                }
            }

        }
    }

    /**
     * @deprecated
     *
     * //TODO @Ben Pars Int
     *
     * @param
     * @return
     * @author Ben
     * @version 1.0.0
     * @since 202207??
     */
    public ArrayList<Raum> wieVieleBeamer(int anzahl) {

        ArrayList<Raum> RaumListe = new ArrayList<>();
        int counter = 0;

        for (Haus h : this.getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    if (a instanceof Beamer) {
                        counter++;
                    }
                }
                if (counter >= anzahl) {
                    RaumListe.add(r);
                }
                counter = 0;
            }
        }

        return RaumListe;
    }


    /**
     * Zählt die Anzahl von funktionstüchtigen Beamern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleBeamerFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumBeamerFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Beamern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleBeamerDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r :
                    h.getRaeume()) {
                anzahl += r.getAnzahlRaumBeamerDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kameras am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKamerasFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumKamerasFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kameras am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKamerasDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumKamerasDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kreidetafeln am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKreidetafelnFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumKreidetafelnFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kreidetafeln am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleKreidetafelnDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumKreidetafelnDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Lautsprechern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleLautsprecherFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumLautsprecherFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Lautsprechern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleLautsprecherDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumLautsprecherDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Mikrofonen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleMikrofoneFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumMikrofoneFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Mikrofonen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleMikrofoneDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumMikrofoneDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen PCs am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAllePCsFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumPCsFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten PCs am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAllePCsDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumPCsDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Smartboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleSmartboardsFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumSmartboardsFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Smartboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleSmartboardsDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumSmartboardsDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Stuehlen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleStuehleFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumStuehleFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Stuehlen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleStuehleDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumStuehleDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Tischen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleTischeFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumTischeFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Tischen am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleTischeDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumTischeDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Whiteboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleWhiteboardsFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumWhiteboardsFunktionstuechtig();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Whiteboards am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleWhiteboardsDefekt() {
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumWhiteboardsDefekt();
            }
        }
        return anzahl;
    }

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
                                                     int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard) {

        ArrayList<Raum> passendeRaueme = new ArrayList<>();

        for (Haus h : this.getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                if (r.getAnzahlRaumBeamerFunktionstuechtig() >= anzahlBeamer
                        && r.getAnzahlRaumKamerasFunktionstuechtig() >= anzahlKamera
                        && r.getAnzahlRaumKreidetafelnFunktionstuechtig() >= anzahlKreidetafel
                        && r.getAnzahlRaumLautsprecherFunktionstuechtig() >= anzahlLautsprecher
                        && r.getAnzahlRaumMikrofoneFunktionstuechtig() >= anzahlMikrofon
                        && r.getAnzahlRaumPCsFunktionstuechtig() >= anzahlPC
                        && r.getAnzahlRaumSmartboardsFunktionstuechtig() >= anzahlSmartboard
                        && r.getAnzahlRaumStuehleFunktionstuechtig() >= anzahlStuhl
                        && r.getAnzahlRaumTischeFunktionstuechtig() >= anzahlTisch
                        && r.getAnzahlRaumWhiteboardsFunktionstuechtig() >= anzahlWhiteboard) {

                    passendeRaueme.add(r);
                }
            }
        }
        return passendeRaueme;
    }



    /**
     * Überprüft, ob ein Termin mit der Buchungsliste eines Raumes kollidiert
     *
     * @param 'Raum r, Calendar start, Calendar ende
     * @return boolean
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220705
     */
    public boolean terminKollidiert(Raum r, Calendar start, Calendar ende) {
        for (Terminbuchung t : r.getBuchungen()
        ) {
            if (start.after(t.getIntervall().getStart()) && start.before(t.getIntervall().getEnde())) {
                return true;
            }
            if (ende.after(t.getIntervall().getStart()) && ende.before(t.getIntervall().getEnde())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gibt alle Räume zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @param 'Calendar start, Calendar ende
     * @return freieRaueme - ArrayList<Raum>
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende) {
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : this.getAlleRaeueme()
        ) {
            if (!terminKollidiert(r, start, ende)) {
                freieRaueme.add(r);
            }
        }
        return freieRaueme;
    }

    /**
     * Gibt alle Räume einer Raumliste zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @param 'Calendar start, Calendar ende, ArrayList<Raum> raumListe
     * @return freieRaueme -  ArrayList<Raum>
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende, ArrayList<Raum> raumListe) {
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : raumListe
        ) {
            if (!terminKollidiert(r, start, ende)) {
                freieRaueme.add(r);
            }
        }
        return freieRaueme;
    }

}
