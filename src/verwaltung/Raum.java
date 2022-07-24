package verwaltung;

import ausstattung.*;
import buchung.*;
import Zustand.*;
import java.util.*;

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

    public void addAusstattung(Ausstattungsmerkmal neu){
        this.ausstattung.add(neu);
    }
}
