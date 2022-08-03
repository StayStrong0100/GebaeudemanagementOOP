package ausstattung;

import java.io.Serializable;

public class KreidetafelTyp implements Serializable, AusstattungsTypIF {

    public static final long serialVersionUID = 0;
    private String modell;
    private boolean wandtafel;
    private boolean freitafel;
    private double breite;
    private double hoehe;

    public KreidetafelTyp(String modell, boolean wandtafel, boolean freitafel, double breite, double hoehe) {
        this.modell = modell;
        this.wandtafel = wandtafel;
        this.freitafel = freitafel;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public boolean isWandtafel() {
        return wandtafel;
    }

    public void setWandtafel(boolean wandtafel) {
        this.wandtafel = wandtafel;
    }

    public boolean isFreitafel() {
        return freitafel;
    }

    public void setFreitafel(boolean freitafel) {
        this.freitafel = freitafel;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public String getModell() {
        return this.modell;
    }

    @Override
    public String toString() {
        return "Wandtafel: " + wandtafel +
                "\nFreitafel: " + freitafel +
                "\nBreite: " + breite +
                "\nHoehe:" + hoehe;
    }
}

