import ausstattung.*;
import buchung.Dozent;
import buchung.Terminbuchung;
import verwaltung.Haus;
import verwaltung.HausListe;
import verwaltung.Raum;
import datenspeicherung.*;
import java.util.ArrayList;
import java.util.Calendar;

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



        }

    }


}
