import buchung.Terminbuchung;

import java.util.Calendar;

public class Main {


    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        Calendar ende = Calendar.getInstance();

        start.set(2020, 05, 04,11,50);
        ende.set(2020,05,04,13,20);

        Terminbuchung ostern = new Terminbuchung(01, start,ende);




    }
}
