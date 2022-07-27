
import ServiceLocator.ServiceLocator;
import ausstattung.Beamer;
import ausstattung.BeamerTyp;
import verwaltung.Haus;
import verwaltung.HausListe;
import verwaltung.Raum;

import java.util.Calendar;

import datenspeicherung.*;

public class Main {


    public static void main(String[] args) {
        /*
        Calendar start = Calendar.getInstance();
        Calendar ende = Calendar.getInstance();
        Dozent fausti = new Dozent("Faustmann");

        start.set(2020, 05, 04, 11, 50);
        ende.set(2020, 05, 04, 13, 20);

        Terminbuchung ostern = new Terminbuchung(start, ende, fausti);

        ostern.printBuchungDetails();

        HausListe lichtenberg = HausListe.getInstance();
        lichtenberg.inventur();

        lichtenberg.addHaus(new Haus("6A", true));
        lichtenberg.getAlleHaeuser().get(0).addRaum(new Raum(120));
  //Variante 1
        BeamerTyp Phiillips10 = new BeamerTyp("Phillips", "10", 1000, true);
        Beamer neu = new Beamer(Phiillips10, Calendar.getInstance());
       // neu.print();

        //Variante 2
        Beamer neu1  = new Beamer( new BeamerTyp("Phillips", "10", 1000, true), Calendar.getInstance());
        neu1.print();*/

        Calendar start = Calendar.getInstance();
        Calendar ende = Calendar.getInstance();

        start.set(2020, 05, 04, 14, 50);
        ende.set(2020, 05, 04, 13, 20);

        if (start.before(ende)) {
            System.out.println("Hi");
        }
        HausListe lichtenberg = HausListe.getInstance();
        // System.out.println(lichtenberg.getAlleHaeuser().size());
        lichtenberg.addHaus(new Haus("6A", true));
        lichtenberg.getAlleHaeuser().get(0).getRaeume().add(new Raum(1));
        lichtenberg.getAlleHaeuser().get(0).getRaeume().get(0).
                addAusstattung(new Beamer(new BeamerTyp("Philips", "X3", 3000, true), Calendar.getInstance()), 2);
        //  System.out.println(lichtenberg.getAlleHaeuser().size());
        lichtenberg.addHaus(new Haus("6B", true));
        //  System.out.println(lichtenberg.getAlleHaeuser().size());
        PersistenzDB datenbank = PersistenzDB.getInstance();
        datenbank.speichern("datenbank.dat", lichtenberg);

        HausListe neu = datenbank.lade("datenbank.dat");
        neu.print();

        //HausListe b = datenbank.lade("datenbank.dat");

        
        new ServiceLocator(HausListe.getInstance());



    }


}
