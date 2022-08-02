package ausstattung;

import java.io.Serializable;

public class TischTyp implements Serializable {

    public static final long serialVersionUID = 0;

    private String modell;
    private int anzahlPlaetze;
    private boolean computertisch;
    private boolean hoehenverstellbar;
    private double breite;
    private double laenge;

    public TischTyp(String modell, int anzahlPlaetze, boolean computertisch, boolean hoehenverstellbar, double breite, double laenge) {
        this.modell = modell;
        this.anzahlPlaetze = anzahlPlaetze;
        this.computertisch = computertisch;
        this.hoehenverstellbar = hoehenverstellbar;
        this.breite = breite;
        this.laenge = laenge;
    }

    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    public void setAnzahlPlaetze(int anzahlPlaetze) {
        this.anzahlPlaetze = anzahlPlaetze;
    }

    public boolean isComputertisch() {
        return computertisch;
    }

    public void setComputertisch(boolean computertisch) {
        this.computertisch = computertisch;
    }

    public boolean isHoehenverstellbar() {
        return hoehenverstellbar;
    }

    public void setHoehenverstellbar(boolean hoehenverstellbar) {
        this.hoehenverstellbar = hoehenverstellbar;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public String toString() {
        return "Anzahlplaetze: " + anzahlPlaetze +
                "\nComputertisch: " + computertisch +
                "\nHoehenverstellbar: " + hoehenverstellbar +
                "\nBreite: " + breite +
                "\nLaenge: " + laenge;
    }
}
