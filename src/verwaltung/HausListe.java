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
import Zustand.*;
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





    public void inventur() {
        System.out.println("Anzahl Tische funktionstüchtig: " + this.getAnzahlTischeFunktionstuechtig());
        System.out.println("Anzahl Tische defekt: " + this.getAnzahlTischeDefekt());
        System.out.println("Anzahl Stühle funktionstüchtig: " + this.getAnzahlStuehleFunktionstuechtig());
        System.out.println("Stühle defekt: " + this.getAnzahlStuehleDefekt());
        System.out.println("Mikrofone funktionstüchtig: " + this.getAnzahlMikrofoneFunktionstuechtig());
        System.out.println("Mikrofone defekt: " + this.getAnzahlMikrofoneDefekt());
        System.out.println("Beamer funktionstüchtig: " + this.getAnzahlBeamerFunktionstuechtig());
        System.out.println("Beamer defekt: " + this.getAnzahlBeamerDefekt());
        System.out.println("PCs funktionstüchtig: " + this.getAnzahlPCsFunktionstuechtig());
        System.out.println("PCs defekt: " + this.getAnzahlPCsDefekt());
        System.out.println("Smartboards funktionstüchtig: " + this.getAnzahlSmartboardsFunktionstuechtig());
        System.out.println("Smartboards defekt: " + this.getAnzahlSmartboardsDefekt());
        System.out.println("Kreidetafeln funktionstüchtig: " + this.getAnzahlKreidetafelnFunktionstuechtig());
        System.out.println("Kreidetafeln defekt: " + this.getAnzahlKreidetafelnDefekt());
        System.out.println("Whiteboards funktionstüchtig: " + this.getAnzahlWhiteboardsFunktionstuechtig());
        System.out.println("Whiteboards defekt: " + this.getAnzahlWhiteboardsDefekt());
        System.out.println("Kameras funktionstüchtig: " + this.getAnzahlKamerasFunktionstuechtig());
        System.out.println("Kameras defekt: " + this.getAnzahlKamerasDefekt());
        System.out.println("Lautsprecher funktionstüchtig: " + this.getAnzahlLautsprecherFunktionstuechtig());
        System.out.println("Lautsprecher defekt: " + this.getAnzahlLautsprecherDefekt());
        /*
        int anzahlTische = 0;
        int anzahlStuehle = 0;
        int anzahlMikrofone = 0;
        int anzahlBeamer = 0;
        int anzahlPCs = 0;
        int anzahlSmartboards = 0;
        int anzahlKreidetafeln = 0;
        int anzahlWhiteboards = 0;
        int anzahlKameras = 0;
        int anzahlTischeDefekt = 0;
        int anzahlStuehleDefekt = 0;
        int anzahlMikrofoneDefekt = 0;
        int anzahlBeamerDefekt = 0;
        int anzahlPCsDefekt = 0;
        int anzahlSmartboardsDefekt = 0;
        int anzahlKreidetafelnDefekt = 0;
        int anzahlWhiteboardsDefekt = 0;
        int anzahlKamerasDefekt = 0;
        int anzahlLautsprecher = 0;
        int anzahlLautsprecherDefekt = 0;


        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung

                    if (a instanceof Stuhl) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlStuehle++;
                        } else {
                            anzahlStuehleDefekt++;
                        }

                    } else if (a instanceof Tisch) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlTische++;
                        } else {
                            anzahlTischeDefekt++;
                        }
                    } else if (a instanceof PC) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlPCs++;
                        } else {
                            anzahlPCsDefekt++;
                        }
                    } else if (a instanceof Beamer) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlBeamer++;
                        } else {
                            anzahlBeamerDefekt++;
                        }
                        anzahlBeamer++;
                    } else if (a instanceof Mikrofon) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlMikrofone++;
                        } else {
                            anzahlMikrofoneDefekt++;
                        }
                    } else if (a instanceof Kamera) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlKameras++;
                        } else {
                            anzahlKamerasDefekt++;
                        }
                    } else if (a instanceof Lautsprecher) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlLautsprecher++;
                        } else {
                            anzahlLautsprecherDefekt++;
                        }
                    } else if (a instanceof Whiteboard) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlWhiteboards++;
                        } else {
                            anzahlWhiteboardsDefekt++;
                        }
                    } else if (a instanceof Smartboard) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlSmartboards++;
                        } else {
                            anzahlSmartboardsDefekt++;
                        }
                    } else if (a instanceof Kreidetafel) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahlKreidetafeln++;
                        } else {
                            anzahlKreidetafelnDefekt++;
                        }
                    }
                }
            }*/
    }

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

    public void druckeAlleRaeume() {
        for (Haus h : HausListe.getInstance().getAlleHaeuser()
        ) {
            for (Raum r : h.getRaeume()
            ) {
                System.out.println("Haus: " + h.getHausnummer() + "\t" + "Raumnummer: " + r.getRaumnummer());
            }
        }
        //return alleRaeume
    }

    //Überladung, wenn Hausparameter vorhanden
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

    public int getAnzahlBeamerFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Beamer && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                            anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlBeamerDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Beamer && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlKamerasFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Kamera && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlKamerasDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Kamera && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlKreidetafelnFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlKreidetafelnDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlLautsprecherFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlLautsprecherDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlMikrofoneFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlMikrofoneDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlPCsFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof PC && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlPCsDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof PC && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlSmartboardsFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlSmartboardsDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlStuehleFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlStuehleDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlTischeFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Tisch && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlTischeDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Tisch && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlWhiteboardsFunktionstuechtig(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

    public int getAnzahlWhiteboardsDefekt(){
        int anzahl = 0;
        for (Haus h : HausListe.getInstance().getAlleHaeuser()) {
            for (Raum r : h.getRaeume()) {
                for (Ausstattungsmerkmal a : r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung
                    if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
                }
            }
        }
        return anzahl;
    }

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
     * @return ArrayList<Raum> freieRaume
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
     * @return ArrayList<Raum> freieRaume
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
