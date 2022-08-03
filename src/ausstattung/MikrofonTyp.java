package ausstattung;

import java.io.Serializable;

public class MikrofonTyp implements Serializable, AusstattungsTypIF {

    public static final long serialVersionUID = 0;
    private String modell;
    private String marke;
    private boolean konferenzMikro;
    private int empfindlichkeit;

    public MikrofonTyp(String modell, String marke, boolean konferenzMikro, int empfindlichkeit) {
        this.modell = modell;
        this.marke = marke;
        this.konferenzMikro = konferenzMikro;
        this.empfindlichkeit = empfindlichkeit;
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

    public boolean isKonferenzMikro() {
        return konferenzMikro;
    }

    public void setKonferenzMikro(boolean konferenzMikro) {
        this.konferenzMikro = konferenzMikro;
    }

    public int getEmpfindlichkeit() {
        return empfindlichkeit;
    }

    public void setEmpfindlichkeit(int empfindlichkeit) {
        this.empfindlichkeit = empfindlichkeit;
    }

    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nKonferenzmikro: " + konferenzMikro +
                "\nEmpfindlichkeit: " + empfindlichkeit;
    }
}
