package ausstattung;

public class LautsprecherTyp {

    private String marke;
    private String modell;
    private int anzahl;
    private int maxLautstaerke;
    private boolean sourroundSound;

    public LautsprecherTyp(String marke, String modell, int anzahl, int maxLautstaerke, boolean sourroundSound) {
        this.marke = marke;
        this.modell = modell;
        this.anzahl = anzahl;
        this.maxLautstaerke = maxLautstaerke;
        this.sourroundSound = sourroundSound;
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

    public boolean isSourroundSound() {
        return sourroundSound;
    }

    public void setSourroundSound(boolean sourroundSound) {
        this.sourroundSound = sourroundSound;
    }
}
