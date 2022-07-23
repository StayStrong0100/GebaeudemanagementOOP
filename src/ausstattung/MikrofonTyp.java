package ausstattung;

public class MikrofonTyp {

    private String marke;
    private String modell;
    private boolean konferenzMikro;
    private int empfindlichkeit;

    public MikrofonTyp(String marke, String modell, boolean konferenzMikro, int empfindlichkeit){
        this.marke = marke;
        this.modell = modell;
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
