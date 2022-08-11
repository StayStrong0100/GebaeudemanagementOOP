package ausstattung;

import java.io.Serializable;

public class LautsprecherTyp implements Serializable, AusstattungsTypIF {

    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private int anzahl;
    private int maxLautstaerke;
    private boolean surroundSound;


    public LautsprecherTyp(String modell, String marke, int anzahl, int maxLautstaerke, boolean surroundSound) {
        this.modell = modell;
        this.marke = marke;
        this.anzahl = anzahl;
        this.maxLautstaerke = maxLautstaerke;
        this.surroundSound = surroundSound;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt alle Attribute des LautsprecherTypObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des LautsprecherTypObjekts als String
     */
    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nAnzahl: " + anzahl +
                "\nMaxLautstaerke: " + maxLautstaerke +
                "\nSurroundSound: " + surroundSound;
    }
}
