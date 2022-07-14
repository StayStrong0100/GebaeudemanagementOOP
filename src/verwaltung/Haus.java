package verwaltung;

import java.util.ArrayList;

public class Haus {
    private String hausnummer;
    private boolean barrierefrei;
    private ArrayList<Raum> raeume = new ArrayList<>();


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

    public void printRaumuebersicht(){
        //TODO noch zu implementieren
    }

    public Haus(String hausnummer, boolean barrierefrei) {
        this.hausnummer = hausnummer;
        this.barrierefrei = barrierefrei;
        HausListe.getInstance().addHaus(this);
    }

}
