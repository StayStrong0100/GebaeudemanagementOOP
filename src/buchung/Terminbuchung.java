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

    public Zeitraum getIntervall() {
        return intervall;
    }

    public Terminbuchung(Calendar start, Calendar ende, Dozent prof) {
        count++;
        this.id = count;
        this.intervall = new Zeitraum(start, ende);
        this.dozent = prof;
    }

    public void printBuchungDetails(){
        System.out.println("Buchungs-ID: "+ this.id);
        this.intervall.print();
        System.out.println("Dozent: " + this.dozent.getName());
    }

}
