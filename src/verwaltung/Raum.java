package verwaltung;

import buchung.Dozent;
import buchung.Terminbuchung;

import java.util.ArrayList;
import java.util.Calendar;

public class Raum {
    private int raumnummer;
    private ArrayList<Terminbuchung> buchungen = new ArrayList<>();

    public int getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public Raum(int raumnummer) {
        this.raumnummer = raumnummer;
        RaumListe.getInstance().addRaum(this);
    }

    public void buchen(Calendar start, Calendar ende, Dozent doz){
        buchungen.add(new Terminbuchung(0,start,ende,doz));
        //Todo Buchungs ID wird automatisch hochgezählt
        //vllt via Terminbuchungs Konstruktor
    }

    public boolean cancelOrder(int id){
        for (Terminbuchung buchung:buchungen) {
            if (buchung.getId()==id) {
                buchungen.remove(buchung);
                return true;
            }
        }
        return false;
    }
}
