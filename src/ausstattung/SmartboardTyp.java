package ausstattung;

public class SmartboardTyp {

    private String marke;
    private String modell;
    private int lumen;

    public SmartboardTyp(String marke, String modell, int lumen){
        this.marke = marke;
        this.modell = modell;
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
}
