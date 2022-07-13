package diverses;

import buchung.Terminbuchung;

import java.util.ArrayList;

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

    }

}
