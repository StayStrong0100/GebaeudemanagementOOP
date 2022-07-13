package buchung;

import java.util.Calendar;

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
}
