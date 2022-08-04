package buchung;

import java.io.Serializable;
import java.util.Calendar;

public class Terminbuchung implements Serializable {

    public static final long serialVersionUID = 0;
    private int id;
    private static int count=0;
    private Zeitraum intervall;
    private Dozent dozent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public Dozent getDozent() {
        return dozent;
    }

    public Zeitraum getIntervall() {
        return intervall;
    }

    public Terminbuchung(Calendar start, Calendar ende, Dozent prof) {
        count++;
        this.id = count;
        this.intervall = new Zeitraum(start, ende);
        this.dozent = prof;
        prof.addBuchung(this);
    }

    public String printBuchungDetails(){
        return (("Buchungs-ID: "+ this.id) + "\t" + this.intervall.toString() + "\t" + this.dozent.getName());
    }



}
