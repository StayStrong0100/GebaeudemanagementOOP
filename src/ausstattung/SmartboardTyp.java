package ausstattung;

import java.io.Serializable;

public class SmartboardTyp implements Serializable {

    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private int lumen;

    public SmartboardTyp(String modell, String marke, int lumen) {
        this.modell = modell;
        this.marke = marke;
        this.lumen = lumen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nLumen: " + lumen;
    }
}
