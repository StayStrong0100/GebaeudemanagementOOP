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

import java.util.ArrayList;
import java.util.Calendar;

//singleton
public class HausListe {
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

    public void addHaus(Haus neuesHaus) {
        this.alleHaeuser.add(neuesHaus);
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
    /**
     * Gibt eine ArrayList mit allen existierenden Räumen zurück
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     *
     * @return alleRaueme - ArrayList<Raum>
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220721
     *
     * @param hausID - String
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
     * //TODO @Ben Pars Int
     *
     * @author Ben
     * @version 1.0.0
     * @since 202207??
     *
     * @param
     *
     * @return
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
     * //TODO @Ben Pars Int
     *
     * @author Ben
     * @version 1.0.0
     * @since 202207??
     *
     * @param
     *
     * @return
     */
    public ArrayList<Raum> wieVieleKamera(int anzahl) {

        ArrayList<Raum> RaumListe = new ArrayList<>();
        int counter = 0;

        for (Haus h : this.getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    if (a instanceof Kamera) {
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
     * //TODO @Ben Pars Int
     *
     * @author Ben
     * @version 1.0.0
     * @since 202207??
     *
     * @param
     *
     * @return
     */
    public ArrayList<Raum> wieVieleKreidetafel(int anzahl) {

        ArrayList<Raum> RaumListe = new ArrayList<>();
        int counter = 0;

        for (Haus h : this.getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    if (a instanceof Kreidetafel) {
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleBeamerFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleBeamerDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleKamerasFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleKamerasDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumKamerasDefekt();
            }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen kreidetafeln am Campus
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleKreidetafelnFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleKreidetafelnDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleLautsprecherFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleLautsprecherDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleMikrofoneFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleMikrofoneDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAllePCsFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAllePCsDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleSmartboardsFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleSmartboardsDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleStuehleFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleStuehleDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleTischeFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleTischeDefekt(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleWhiteboardsFunktionstuechtig(){
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlAlleWhiteboardsDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                anzahl += r.getAnzahlRaumWhiteboardsDefekt();
            }
        }
        return anzahl;
    }

    /**
     * //TODO @Ben Pars Int
     *
     * @author Ben
     * @version 1.0.0
     * @since 20220725
     *
     * @return passendeRaueme - ArrayList<Raum>
     */
    public ArrayList<Raum> filtereRaeuemeAusstattung() {
        ArrayList<Raum> passendeRaueme = new ArrayList<>();
        //TODO @Ben Filter nach Ausstattung bauen auf Basis der neuen ZählMethoden
        return passendeRaueme;
    }
    /**
     * Überprüft, ob ein Termin mit der Buchungsliste eines Raumes kollidiert
     *
     * @author ZanderLK
     * @since 20220705
     * @version 1.0.0
     *
     * @param 'Raum r, Calendar start, Calendar ende
     *
     * @return boolean
     */
    public boolean terminKollidiert(Raum r, Calendar start, Calendar ende){
        for (Terminbuchung t : r.getBuchungen()
                ) { if (start.after(t.getIntervall().getStart()) && start.before(t.getIntervall().getEnde())) {
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
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @param 'Calendar start, Calendar ende
     *
     * @return freieRaueme - ArrayList<Raum>
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende) {
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : this.getAlleRaeueme()
             ) {if(!terminKollidiert(r,start,ende)){
                 freieRaueme.add(r);
                }
        }
        return freieRaueme;
    }

    /**
     * Gibt alle Räume einer Raumliste zurück, die im angegebenem Zeitraum verfügbar sind
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @param 'Calendar start, Calendar ende, ArrayList<Raum> raumListe
     *
     * @return freieRaueme -  ArrayList<Raum>
     */
    public ArrayList<Raum> filtereRaeuemeVerfuegbar(Calendar start, Calendar ende, ArrayList<Raum> raumListe) {
        ArrayList<Raum> freieRaueme = new ArrayList<>();
        for (Raum r : raumListe
        ) {if(!terminKollidiert(r,start,ende)){
            freieRaueme.add(r);
        }
        }
        return freieRaueme;
    }



}
