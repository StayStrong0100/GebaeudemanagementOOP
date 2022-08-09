package buchung;

import java.io.Serializable;
import java.text.*;
import java.util.Calendar;

public class Zeitraum implements Serializable {

    public static final long serialVersionUID = 0;
    private Calendar start;
    private Calendar ende;

    public Zeitraum(Calendar start, Calendar ende) {
        this.start = start;
        this.ende = ende;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnde() {
        return ende;
    }

    /**
     * Gibt den Zeitraum als String zurück
     *
     * @author Benjamin Kostka
     *
     * @return Start und Ende als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return (("Start: " + df.format(start.getTime())+" Uhr") + " | " + ("Ende: " + df.format(ende.getTime())+" Uhr"));
    }
}
