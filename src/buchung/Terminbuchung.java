package buchung;

import java.util.Calendar;

public class Terminbuchung {
    private int id;
    private Zeitraum intervall;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Terminbuchung(int id, Calendar start, Calendar ende) {
        this.id = id;
        this.intervall = new Zeitraum(start, ende);

    }



    public void printBuchungDetails(){
        //TODO printBuchung implementieren
    }

}
