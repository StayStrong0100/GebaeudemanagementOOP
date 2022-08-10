package ausstattung;

import java.io.Serializable;

public class TischTyp implements Serializable, AusstattungsTypIF {

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
    public String getModell() {
        return this.modell;
    }

    /**
     * Gibt alle Attribute des TischTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des TischTypObjekts als String
     */
    @Override
    public String toString() {
        return "Anzahlplaetze: " + anzahlPlaetze +
                "\nComputertisch: " + computertisch +
                "\nHoehenverstellbar: " + hoehenverstellbar +
                "\nBreite: " + breite +
                "\nLaenge: " + laenge;
    }
}
