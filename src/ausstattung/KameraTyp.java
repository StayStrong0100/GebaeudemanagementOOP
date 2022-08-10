package ausstattung;

import java.io.Serializable;

public class KameraTyp implements Serializable, AusstattungsTypIF {

    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private int pixel;
    private int brennweite;
    private boolean flexibel;

    public KameraTyp(String modell, String marke, int pixel, int brennweite, boolean flexibel) {
        this.modell = modell;
        this.marke = marke;
        this.pixel = pixel;
        this.brennweite = brennweite;
        this.flexibel = flexibel;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getModell() {
        return modell;
    }

    /**
     * Gibt alle Attribute des KameraTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des KameraTypObjekts als String
     */
    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nPixel: " + pixel +
                "\nBrennweite: " + brennweite +
                "\nFlexibel: " + flexibel;
    }
}
