package verwaltung;

import ausstattung.Ausstattungsmerkmal;
import buchung.Dozent;
import buchung.Terminbuchung;

import java.util.ArrayList;
import java.util.Calendar;

public class Raum {
    private int raumnummer;
    private ArrayList<Terminbuchung> buchungen = new ArrayList<>();
    private ArrayList<Ausstattungsmerkmal> ausstattung = new ArrayList<>();

    public int getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public ArrayList<Ausstattungsmerkmal> getAusstattung() {
        return ausstattung;
    }

    public ArrayList<Terminbuchung> getBuchungen() {
        return buchungen;
    }

    public Raum(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public void buchen(Calendar start, Calendar ende, Dozent doz){
        buchungen.add(new Terminbuchung(start,ende,doz));
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

    private void addAusstattung(Ausstattungsmerkmal neu){
        this.ausstattung.add(neu);
    }
}
