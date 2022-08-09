package buchung;

import java.io.Serializable;
import java.util.Calendar;

public class Terminbuchung implements Serializable {

    public static final long serialVersionUID = 0;
    private static int count=0;
    private int id;
    private Zeitraum intervall;
    private Dozent dozent;

    public Terminbuchung(Calendar start, Calendar ende, Dozent prof) {
        count++;
        this.id = count;
        this.intervall = new Zeitraum(start, ende);
        this.dozent = prof;
        prof.addBuchung(this);
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public Dozent getDozent() {
        return dozent;
    }

    public Zeitraum getIntervall() {
        return intervall;
    }

    public static void setCount(int count) {
        Terminbuchung.count = count;
    }


}
