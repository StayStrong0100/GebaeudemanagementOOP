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


        public String inventur() {
/*
            //Ausstattungs-Daten auslesen, wenn kein Wert eingeben wurde: Anzahl = 0
            int minKameras = (raumsucheKamerasInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKamerasInput.getText());
            int minBeamer = (raumsucheBeamerInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheBeamerInput.getText());
            int minLautsprecher =  (raumsucheLautsprecherInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheLautsprecherInput.getText());
            int minMikrofone =  (raumsucheMikrofoneInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheMikrofoneInput.getText());
            int minPCs = (raumsuchePCInput.getText().equals("")) ? 0 : Integer.valueOf(raumsuchePCInput.getText());
            int minTische =  (raumsucheTischeInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheTischeInput.getText());
            int minStuehle =  (raumsucheStuehleInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheStuehleInput.getText());
            int minSmartboards =  (raumsucheSmartboardInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheSmartboardInput.getText());
            int minWhiteboards =  (raumsucheWhiteboardsInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheWhiteboardsInput.getText());
            int minKreidetafeln =  (raumsucheKreidetafelnInput.getText().equals("")) ? 0 : Integer.valueOf(raumsucheKreidetafelnInput.getText());


 */

            String ausgabe = "Inventur: \n";
            ausgabe += ("Anzahl Tische funktionstüchtig: " + this.getAnzahlAlleTischeFunktionstuechtig()) + "\n";
            ausgabe += (("Anzahl Tische defekt: " + this.getAnzahlAlleTischeDefekt()) + "\n\n");
            ausgabe += (("Anzahl Stühle funktionstüchtig: " + this.getAnzahlAlleStuehleFunktionstuechtig()) + "\n");
            ausgabe += (("Stühle defekt: " + this.getAnzahlAlleStuehleDefekt()) + "\n\n");
            ausgabe += (("Mikrofone funktionstüchtig: " + this.getAnzahlAlleMikrofoneFunktionstuechtig()) + "\n");
            ausgabe += (("Mikrofone defekt: " + this.getAnzahlAlleMikrofoneDefekt()) + "\n\n");
            ausgabe += (("Beamer funktionstüchtig: " + this.getAnzahlAlleBeamerFunktionstuechtig()) + "\n");
            ausgabe += (("Beamer defekt: " + this.getAnzahlAlleBeamerDefekt()) + "\n\n");
            ausgabe += (("PCs funktionstüchtig: " + this.getAnzahlAllePCsFunktionstuechtig()) + "\n");
            ausgabe += (("PCs defekt: " + this.getAnzahlAllePCsDefekt()) + "\n\n");
            ausgabe += (("Smartboards funktionstüchtig: " + this.getAnzahlAlleSmartboardsFunktionstuechtig()) + "\n");
            ausgabe += (("Smartboards defekt: " + this.getAnzahlAlleSmartboardsDefekt()) + "\n\n");
            ausgabe += (("Kreidetafeln funktionstüchtig: " + this.getAnzahlAlleKreidetafelnFunktionstuechtig()) + "\n");
            ausgabe += (("Kreidetafeln defekt: " + this.getAnzahlAlleKreidetafelnDefekt()) + "\n\n");
            ausgabe += (("Whiteboards funktionstüchtig: " + this.getAnzahlAlleWhiteboardsFunktionstuechtig()) + "\n");
            ausgabe += (("Whiteboards defekt: " + this.getAnzahlAlleWhiteboardsDefekt()) + "\n\n");
            ausgabe += (("Kameras funktionstüchtig: " + this.getAnzahlAlleKamerasFunktionstuechtig()) + "\n");
            ausgabe += (("Kameras defekt: " + this.getAnzahlAlleKamerasDefekt()) + "\n\n");
            ausgabe += (("Lautsprecher funktionstüchtig: " + this.getAnzahlAlleLautsprecherFunktionstuechtig()) + "\n");
            ausgabe += (("Lautsprecher defekt: " + this.getAnzahlAlleLautsprecherDefekt()) + "\n");
            return ausgabe;
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
     * Gibt alle Räume mit Haus- und Raumnummer in der Konsole aus
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     */
    public void druckeAlleRaeume() {
        for (Haus h : this.getAlleHaeuser()
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
        for (Haus h : this.getAlleHaeuser()
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
     * Zählt die Anzahl von funktionstüchtigen Beamern am Campus
     *
     * @return anzahl - int
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     */
    public int getAnzahlAlleBeamerFunktionstuechtig() {
        int anzahl = 0;
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
        for (Haus h : this.getAlleHaeuser()) {
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
                                                     int anzahlStuhl, int anzahlTisch, int anzahlWhiteboard) {

        ArrayList<Raum> passendeRaueme = new ArrayList<>();

            for (Raum r : freieRaeume) {
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
        //TODO @Lukas Filter funktioniert nicht: es werdem alle Räume zurückgegeben
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : this.getAlleRaeueme()
        ) {
            if (!this.terminKollidiert(r, start, ende)) {
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220728
     *
     * @param neueNummer
     * @return boolean
     */
    public boolean raumnummerKollidiert(int neueNummer){
        for (Raum r:this.getAlleRaeueme()) {
            if (r.getRaumnummer() == neueNummer){
                return true;
            }
        }
        return false;
    }

    /**
     * Gibt alle Ausstattungsmerkmale zurück
     *
     * @author ZanderLK
     * @since 20220803
     * @version 1.0.0
     *
     * @return alleAusstattungen - ArrayList<Ausstatungsmerkmal>
     */
    public ArrayList<Ausstattungsmerkmal> getAlleAusstattungen(){
        ArrayList<Ausstattungsmerkmal> alleAusstattungen = new ArrayList<>();

        for (Haus h : this.getAlleHaeuser()){
            for (Raum r : h.getRaeume()){
                alleAusstattungen.addAll(r.getAusstattung());
            }
        }

        return alleAusstattungen;
    }

}
