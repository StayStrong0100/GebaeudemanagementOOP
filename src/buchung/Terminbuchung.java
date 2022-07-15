package buchung;

import java.util.Calendar;

public class Terminbuchung {
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
