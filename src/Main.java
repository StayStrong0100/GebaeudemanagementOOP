import ausstattung.*;
import buchung.Dozent;
import buchung.Terminbuchung;
import verwaltung.Haus;
import verwaltung.HausListe;
import verwaltung.Raum;

import java.util.ArrayList;
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

        if (start.before(ende)){
            System.out.println("Hi");
        }

        PersistentObjekt datenbank = new PersistentObjekt();
        datenbank.speichern("datenbank.dat", new Haus("6A", true));

        Haus b = datenbank.lade("datenbank.dat");
        System.out.println(b.getRaeume());

    }


}
