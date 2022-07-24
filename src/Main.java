import ausstattung.*;
import buchung.Dozent;
import buchung.Terminbuchung;
import verwaltung.Haus;
import verwaltung.HausListe;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {


    public static void main(String[] args) {

        Calendar start = Calendar.getInstance();
        Calendar ende = Calendar.getInstance();
        Dozent fausti = new Dozent("Faustmann");

        start.set(2020, 05, 04, 11, 50);
        ende.set(2020, 05, 04, 13, 20);

        Terminbuchung ostern = new Terminbuchung(start, ende, fausti);

        ostern.printBuchungDetails();

        HausListe lichtenberg = HausListe.getInstance();
        lichtenberg.inventur();

        HausListe schoeneberg = HausListe.getInstance();
        schoeneberg.inventur();

        lichtenberg.addHaus(new Haus("6A", true));
        lichtenberg.getAlleHaeuser().get(0).addRaum(120);
        lichtenberg.getAlleHaeuser().get(0).getRaeume().get(0).addAusstattung
  //Variante 1
        BeamerTyp Phiillips10 = new BeamerTyp("Phillips", "10", 1000, true);
        Beamer neu = new Beamer(Phiillips10, Calendar.getInstance());
       // neu.print();

        //Variante 2
        Beamer neu1  = new Beamer( new BeamerTyp("Phillips", "10", 1000, true), Calendar.getInstance());
        neu1.print();
    }
}
