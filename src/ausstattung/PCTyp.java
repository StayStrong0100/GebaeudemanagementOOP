package ausstattung;

import java.io.Serializable;

public class PCTyp implements Serializable, AusstattungsTypIF{

    public static final long serialVersionUID = 0;

    private String modell;
    private String betriebssystem;
    private double taktfrequenz;
    private boolean grafikkarte;
    private short ram;

    public PCTyp(String modell, String betriebssystem, double taktfrequenz, boolean grafikkarte, short ram) {
        this.modell = modell;
        this.betriebssystem = betriebssystem;
        this.taktfrequenz = taktfrequenz;
        this.grafikkarte = grafikkarte;
        this.ram = ram;
    }
    public String getModell() {
        return this.modell;
    }

    /**
     * Gibt alle Attribute des PCTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des PCTypObjekts als String
     */
    @Override
    public String toString() {
        return "Betriebssystem: " + betriebssystem +
                "\nTaktfrequenz: " + taktfrequenz +
                "\nGrafikkarte: " + grafikkarte +
                "\nRAM: " + ram;
    }
}