package ausstattung;

public class KameraTyp {
    private String marke;
    private String modell;
    private int pixel;
    private int brennweite;
    private boolean flexibel;

 public KameraTyp(String marke, String modell, int pixel, int brennweite, boolean flexibel){
     this.marke = marke;
     this.modell = modell;
     this.pixel = pixel;
     this.brennweite = brennweite;
     this.flexibel = flexibel;
 }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public void setFlexibel(boolean flexibel) {
        this.flexibel = flexibel;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getPixel() {
        return pixel;
    }

    public int getBrennweite() {
        return brennweite;
    }

    public boolean isFlexibel() {
        return flexibel;
    }

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nPixel: " + pixel +
                "\nBrennweite: " + brennweite +
                "\nFlexibel: " + flexibel;
    }
}
