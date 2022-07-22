package verwaltung;

import ausstattung.*;
import Zustand.*;
import java.util.ArrayList;

//singleton
public class HausListe {
    private ArrayList<Haus> alleHaeuser = new ArrayList<>();
    private static HausListe instance;

    private HausListe(){
    }

    public static HausListe getInstance(){
        if(instance == null) {
            instance=new HausListe();
        }
        return instance;
    }

    public ArrayList<Haus> getAlleHaeuser() {
        return alleHaeuser;
    }

    public void addHaus(Haus neuesHaus) {
        this.alleHaeuser.add(neuesHaus);
    }

    public void findeRaum(){
        //TODO Raum Filter implementieren
    }

    /**
     * Pars Int
     *
     * @author ZanderLK
     * @version 1.0.0
     *
     *
     * @param
     *
     * @return
     */

    public void inventur(){
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


        for (Haus h: HausListe.getInstance().getAlleHaeuser() ) {
            for (Raum r:h.getRaeume() ) {
                for (Ausstattungsmerkmal a:r.getAusstattung()) {
                    //sortiert nach der Wahrscheinlichkeit der Übereinstimmung

                    if(a instanceof Stuhl){
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlStuehle++;
                        } else {
                            anzahlStuehleDefekt++;
                        }

                    }

                    else if (a instanceof Tisch) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlTische++;
                        } else {
                            anzahlTischeDefekt++;
                        }
                    }

                    else if (a instanceof PC) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlPCs++;
                        } else {
                            anzahlPCsDefekt++;
                        }
                    }

                    else if (a instanceof Beamer) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlBeamer++;
                        } else {
                            anzahlBeamerDefekt++;
                        }
                        anzahlBeamer ++;
                    }

                    else if (a instanceof Mikrofon) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlMikrofone++;
                        } else {
                            anzahlMikrofoneDefekt++;
                        }
                    }

                    else if (a instanceof Kamera) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlKameras++;
                        } else {
                            anzahlKamerasDefekt++;
                        }
                    }

                    else if (a instanceof Lautsprecher) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlLautsprecher++;
                        } else {
                            anzahlLautsprecherDefekt++;
                        }
                    }

                    else if (a instanceof Whiteboard) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlWhiteboards++;
                        } else {
                            anzahlWhiteboardsDefekt++;
                        }
                    }

                    else if (a instanceof Smartboard) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlSmartboards++;
                        } else {
                            anzahlSmartboardsDefekt++;
                        }
                    }

                    else if (a instanceof Kreidetafel) {
                        if (a.getAktuellerZustand() instanceof Funktionstuechtig){
                            anzahlKreidetafeln++;
                        } else {
                            anzahlKreidetafelnDefekt++;
                        }
                    }
                }
            }
        }

        System.out.println("Anzahl Tische funktionstüchtig: " + anzahlTische);
        System.out.println("Anzahl Tische defekt: " + anzahlTischeDefekt );
        System.out.println("Anzahl Stühle funktionstüchtig: "+anzahlStuehle );
        System.out.println("Stühle defekt: " + anzahlStuehleDefekt );
        System.out.println("Mikrofone funktionstüchtig: " + anzahlMikrofone );
        System.out.println("Mikrofone defekt: " + anzahlMikrofoneDefekt );
        System.out.println("Beamer funktionstüchtig: " + anzahlBeamer );
        System.out.println("Beamer defekt: " + anzahlBeamerDefekt );
        System.out.println("PCs funktionstüchtig: " + anzahlPCs );
        System.out.println("PCs defekt: " + anzahlPCsDefekt );
        System.out.println("Smartboards funktionstüchtig: " + anzahlSmartboards );
        System.out.println("Smartboards defekt: " + anzahlSmartboardsDefekt );
        System.out.println("Kreidetafeln funktionstüchtig: " + anzahlKreidetafeln );
        System.out.println("Kreidetafeln defekt: " + anzahlKreidetafelnDefekt );
        System.out.println("Whiteboards funktionstüchtig: " + anzahlWhiteboards );
        System.out.println("Whiteboards defekt: " + anzahlWhiteboardsDefekt );
        System.out.println("Kameras funktionstüchtig: " + anzahlKameras );
        System.out.println("Kameras defekt: " + anzahlKamerasDefekt );
        System.out.println("Lautsprecher funktionstüchtig: " + anzahlLautsprecher );
        System.out.println("Lautsprecher defekt: " + anzahlLautsprecherDefekt );
    }

    public ArrayList<Raum> alleRaeueme(){
        ArrayList<Raum> alleRaeume = new ArrayList<>();
        for (Haus h: HausListe.getInstance().getAlleHaeuser()
        ) {
            for (Raum r: h.getRaeume()
            ) {
                alleRaeume.add(r);
            }
        }
        return alleRaeume;
    }

    public void druckeAlleRaeume(){
        for (Haus h: HausListe.getInstance().getAlleHaeuser()
             ) {
            for (Raum r: h.getRaeume()
                 ) {
                System.out.println("Haus: " + h.getHausnummer() + "\t" + "Raumnummer: " + r.getRaumnummer());
            }
        }
        //return alleRaeume
    }

    //Überladung, wenn Hausparameter vorhanden
    public void druckeAlleRaeume(String hausID){
        for (Haus h: HausListe.getInstance().getAlleHaeuser()
        ) {
            if (h.getHausnummer().equals(hausID)){
                System.out.println("Räume im Haus " + hausID + ": ");
                for (Raum r: h.getRaeume()
                ) {
                    System.out.println("Raumnummer: " + r.getRaumnummer());
                }
            }

        }
    }




}
