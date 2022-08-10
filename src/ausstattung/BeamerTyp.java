package ausstattung;

import java.io.Serializable;

public class BeamerTyp implements Serializable, AusstattungsTypIF {
    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private int lumen;
    private boolean lautsprecher;

    public BeamerTyp(String modell, String marke, int lumen, boolean lautsprecher) {
        this.modell = modell;
        this.marke = marke;
        this.lumen = lumen;
        this.lautsprecher = lautsprecher;
    }
    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt alle Attribute des BeamerTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des BeamerTypObjekts als String
     */

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nLumen: " + lumen +
                "\nLautsprecher: " + lautsprecher;
    }
}
