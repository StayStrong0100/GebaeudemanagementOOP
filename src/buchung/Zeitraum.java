package buchung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Zeitraum {
    private Calendar start;
    private Calendar ende;

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnde() {
        return ende;
    }

    public void setEnde(Calendar ende) {
        this.ende = ende;
    }

    public Zeitraum(Calendar start, Calendar ende) {
        this.start = start;
        this.ende = ende;
    }

    public void print() {
        DateFormat df = new SimpleDateFormat("dd.MM.YYYY HH:mm");
        System.out.println("Start: " + df.format(start.getTime())+" Uhr");
        System.out.println("Ende: " + df.format(ende.getTime())+" Uhr");

    }
}
