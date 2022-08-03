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

    public String getBetriebssystem() {
        return betriebssystem;
    }

    public void setBetriebssystem(String betriebssystem) {
        this.betriebssystem = betriebssystem;
    }

    public double getTaktfrequenz() {
        return taktfrequenz;
    }

    public void setTaktfrequenz(double taktfrequenz) {
        this.taktfrequenz = taktfrequenz;
    }

    public boolean isGrafikkarte() {
        return grafikkarte;
    }

    public void setGrafikkarte(boolean grafikkarte) {
        this.grafikkarte = grafikkarte;
    }

    public short getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public String getModell() {
        return this.modell;
    }

    @Override
    public String toString() {
        return "Betriebssystem: " + betriebssystem +
                "\nTaktfrequenz: " + taktfrequenz +
                "\nGrafikkarte: " + grafikkarte +
                "\nRAM: " + ram;
    }
}