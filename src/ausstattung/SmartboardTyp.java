package ausstattung;

import java.io.Serializable;

public class SmartboardTyp implements Serializable, AusstattungsTypIF {

    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private int lumen;

    public SmartboardTyp(String modell, String marke, int lumen) {
        this.modell = modell;
        this.marke = marke;
        this.lumen = lumen;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt alle Attribute des SmartboardTypObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des SmartboardTypObjekts als String
     */
    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nLumen: " + lumen;
    }
}
