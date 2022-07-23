package ausstattung;

public class TischTyp {

    private int anzahlPlaetze;
    private boolean computertisch;
    private boolean hoehenverstellbar;
    private double breite;
    private double laenge;

    public TischTyp(int anzahlPlaetze, boolean computertisch, boolean hoehenverstellbar, double breite, double laenge){
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
