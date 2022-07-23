package ausstattung;

public class BeamerTyp {
    private String marke;
    private String modell;
    private int lumen;
    private boolean lautsprecher;

    public BeamerTyp(String marke, String modell, int lumen, boolean lautsprecher){

        this.marke = marke;
        this.modell = modell;
        this.lumen = lumen;
        this.lautsprecher = lautsprecher;

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

    public boolean isLautsprecher() {
        return lautsprecher;
    }

    public void setLautsprecher(boolean lautsprecher) {
        this.lautsprecher = lautsprecher;
    }

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nLumen: " + lumen +
                "\nLautsprecher: " + lautsprecher;
    }
}
