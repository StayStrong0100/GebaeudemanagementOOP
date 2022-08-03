package datenspeicherung;

import datenspeicherung.*;
import serviceLocator.*;
import verwaltung.*;
import ausstattung.*;
import buchung.*;
import zustand.*;

import java.util.Arrays;

public class DatenInitialisierung {

    public static void main(String[] args) {
        //Häuser definieren
        ServiceLocator.getInstance().getHausliste().addHaus(new Haus("6a",false));
        ServiceLocator.getInstance().getHausliste().addHaus(new Haus("6b",true));
        ServiceLocator.getInstance().getHausliste().addHaus(new Haus("6c",true));

        //Räume in 6a
        for (int i : new int[]{101, 102, 103, 104, 105, 201, 202, 203, 204, 205, 301, 302, 303, 304, 305}) {
            ServiceLocator.getInstance().getHausliste().getAlleHaeuser().get(0).addRaum(new Raum(i));
        }

        //Räume in 6b
        for (int i : new int[]{106, 107, 108, 109, 110, 206, 207, 208, 209, 210, 306, 307, 308, 309, 310}) {
            ServiceLocator.getInstance().getHausliste().getAlleHaeuser().get(1).addRaum(new Raum(i));
        }

        //Räume in 6c
        for (int i : new int[]{111, 112, 113, 114, 115, 211, 212, 213, 214, 215, 311, 312, 313, 314, 315}) {
            ServiceLocator.getInstance().getHausliste().getAlleHaeuser().get(2).addRaum(new Raum(i));
        }

        //Dozenten
        for (String s : Arrays.asList("Faustmann", "Drebing", "Becker", "Maeß", "Lemke", "Saucken", "Magalashvili", "Gatzer", "Ringhand", "Schlösser", "Kocmann", "Eisenbart", "Erkens")) {
            ServiceLocator.getInstance().getDozentenListe().addDozent(new Dozent(s));
        }

        //Beamertypen
        ServiceLocator.getInstance().getBeamerTypen().addBeamerTyp(new BeamerTyp("T26", "TOPVISION", 9500, true));
        ServiceLocator.getInstance().getBeamerTypen().addBeamerTyp(new BeamerTyp("P5530", "ACER", 7000, false));
        ServiceLocator.getInstance().getBeamerTypen().addBeamerTyp(new BeamerTyp("X100-4k", "ViewSonic", 2500, true));

        //Kreidetafeltypen
        ServiceLocator.getInstance().getKreideTypen().addKreidetafelTyp(new KreidetafelTyp("Kreide250",true, false, 250, 180));
        ServiceLocator.getInstance().getKreideTypen().addKreidetafelTyp(new KreidetafelTyp("Kreide220", false, true, 220, 160));
        ServiceLocator.getInstance().getKreideTypen().addKreidetafelTyp(new KreidetafelTyp("Kreide200", false, true, 200, 140));


        //Smartboardtypen
        ServiceLocator.getInstance().getSmartboardTypen().addSmartboardTyp(new SmartboardTyp("MX255 PRO", "SMARTBOARD", 3000));
        ServiceLocator.getInstance().getSmartboardTypen().addSmartboardTyp(new SmartboardTyp("Lite PRO", "iiyama", 1500));

        //Whiteboardtypen
        ServiceLocator.getInstance().getWhiteboardTypen().addWhiteboardTyp(new WhiteboardTyp("WhiteSuper",false, true, 60 , 100));
        ServiceLocator.getInstance().getWhiteboardTypen().addWhiteboardTyp(new WhiteboardTyp("WhitePro",true, false, 180 , 120));
        ServiceLocator.getInstance().getWhiteboardTypen().addWhiteboardTyp(new WhiteboardTyp("WhiteBasic",false, true, 180 , 120));

        //Tischtypen
        ServiceLocator.getInstance().getTischTypen().addTischTyp(new TischTyp("BasicTisch", 1,false, false, 80, 60));
        ServiceLocator.getInstance().getTischTypen().addTischTyp(new TischTyp("Doppeltisch",2, false, false, 160, 60));
        ServiceLocator.getInstance().getTischTypen().addTischTyp(new TischTyp("PCGroß", 2, true, false, 180, 70));
        ServiceLocator.getInstance().getTischTypen().addTischTyp(new TischTyp("PCUltraKomfort",1, true, true, 160, 80));

        //Stuhltyp
        ServiceLocator.getInstance().getStuhlTypen().addStuhlTyp(new StuhlTyp("Dynamic", true));
        ServiceLocator.getInstance().getStuhlTypen().addStuhlTyp(new StuhlTyp("Static",false));

        //KameraTypen //Pixel in mega angegeben, Brennweite in mm
        ServiceLocator.getInstance().getKameraTypen().addKameraTyp(new KameraTyp("Streamcam", "Logitech", 16, 50, false));
        ServiceLocator.getInstance().getKameraTypen().addKameraTyp(new KameraTyp("Full HD Webcam", "csl", 4, 100, true));

        //PcTyp Taktfrequenz in GHz
        ServiceLocator.getInstance().getPCTypen().addPCTyp(new PCTyp("UltraWin","Windows", 4.4, true, (short)16));
        ServiceLocator.getInstance().getPCTypen().addPCTyp(new PCTyp("Linux15","Linux", 2.2, false, (short)4));
        ServiceLocator.getInstance().getPCTypen().addPCTyp(new PCTyp("Mac4","IOS", 3.2, false, (short) 8));


        //MikrofonTyp         //Empfindlichkeit in max db
        ServiceLocator.getInstance().getMikrofonTypen().addMikrofonTyp(new MikrofonTyp("Rhode", "NT-USB", true, 80));
        ServiceLocator.getInstance().getMikrofonTypen().addMikrofonTyp(new MikrofonTyp("Tonor", "Q9", false, 50));

        //LautsprecherTyp
        ServiceLocator.getInstance().getLautsprecherTypen().addLautsprecherTyp(new LautsprecherTyp("Master200","Logitech",4,300,true));
        ServiceLocator.getInstance().getLautsprecherTypen().addLautsprecherTyp(new LautsprecherTyp("Basic100", "Logitech", 2,100,false));

        //speichern
        ServiceLocator.getInstance().getPersistenz().speichern("Grunddaten",ServiceLocator.getInstance());
    }
}

