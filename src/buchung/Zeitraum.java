package buchung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Zeitraum implements Serializable {

    public static final long serialVersionUID = 0;
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

    public String print() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return (("Start: " + df.format(start.getTime())+" Uhr") + "\t" + ("Ende: " + df.format(ende.getTime())+" Uhr"));
    }
}
