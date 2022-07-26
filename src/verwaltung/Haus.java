package verwaltung;

import java.io.Serializable;
import java.util.ArrayList;

public class Haus implements Serializable {

    public static final long serialVersionUID = 0;
    private String hausnummer;
    private boolean barrierefrei;
    private ArrayList<Raum> raeume = new ArrayList<>();

    public ArrayList<Raum> getRaeume() {
        return raeume;
    }


    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public boolean isBarrierefrei() {
        return barrierefrei;
    }

    public void setBarrierefrei(boolean barrierefrei) {
        this.barrierefrei = barrierefrei;
    }

    public void printRaumuebersicht() {
        //TODO Raumübersicht implementieren
    }
//TODO: Mit der addHaus methode werden 2 hauser in alleHaeser gespeichert
    public Haus(String hausnummer, boolean barrierefrei) {
        this.hausnummer = hausnummer;
        this.barrierefrei = barrierefrei;
       //HausListe.getInstance().addHaus(this);
    }

    public void addRaum(Raum neuerRaum) {
        this.raeume.add(neuerRaum);
    }

    @Override
    public String toString() {
        String ausgabe = "Hausnummer:\t" + hausnummer +
                "\nBarrierefrei:\t" + barrierefrei + "\n\n";

        for (Raum r : getRaeume()) {
            ausgabe += r.toString() + "\n";
        }

        return ausgabe;
    }
}
