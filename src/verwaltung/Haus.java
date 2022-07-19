package verwaltung;

import java.util.ArrayList;

public class Haus {
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

    public void printRaumuebersicht(){
        //TODO Raumübersicht implementieren
    }

    public Haus(String hausnummer, boolean barrierefrei) {
        this.hausnummer = hausnummer;
        this.barrierefrei = barrierefrei;
        HausListe.getInstance().addHaus(this);
    }

    public void addRaum(Raum neuerRaum){
        this.raeume.add(neuerRaum);
    }

}
