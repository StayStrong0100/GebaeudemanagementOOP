package ausstattung;

import java.io.Serializable;

public class LautsprecherTyp implements Serializable {

    public static final long serialVersionUID = 0;
    private String marke;
    private String modell;
    private int anzahl;
    private int maxLautstaerke;
    private boolean surroundSound;

    public LautsprecherTyp(String marke, String modell, int anzahl, int maxLautstaerke, boolean surroundSound) {
        this.marke = marke;
        this.modell = modell;
        this.anzahl = anzahl;
        this.maxLautstaerke = maxLautstaerke;
        this.surroundSound = surroundSound;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public int getMaxLautstaerke() {
        return maxLautstaerke;
    }

    public void setMaxLautstaerke(int maxLautstaerke) {
        this.maxLautstaerke = maxLautstaerke;
    }

    public boolean isSurroundSound() {
        return surroundSound;
    }

    public void setSorroundSound(boolean surroundSound) {
        this.surroundSound = surroundSound;
    }

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nAnzahl: " + anzahl +
                "\nMaxLautstaerke: " + maxLautstaerke +
                "\nSurroundSound: " + surroundSound;
    }
}
