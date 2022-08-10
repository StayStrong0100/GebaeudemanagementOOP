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

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt alle Attribute des MikrofonTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des MikrofonTypObjekts als String
     */
    @Override
    public String toString() {
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nKonferenzmikro: " + konferenzMikro +
                "\nEmpfindlichkeit: " + empfindlichkeit;
    }
}
