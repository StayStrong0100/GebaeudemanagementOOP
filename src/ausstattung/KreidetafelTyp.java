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

    public String getModell() {
        return this.modell;
    }

    /**
     * Gibt alle Attribute des WandtafelTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des WandtafelTypObjekts als String
     */
    @Override
    public String toString() {
        return "Wandtafel: " + wandtafel +
                "\nFreitafel: " + freitafel +
                "\nBreite: " + breite +
                "\nHoehe:" + hoehe;
    }
}

