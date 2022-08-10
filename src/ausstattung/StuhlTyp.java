package ausstattung;

import java.io.Serializable;
import java.rmi.ServerError;

public class StuhlTyp implements Serializable, AusstattungsTypIF{

    public static final long serialVersionUID = 0;

    private String modell;
    private boolean drehstuhl;

    public StuhlTyp(String modell, boolean drehstuhl) {
        this.modell = modell;
        this.drehstuhl = drehstuhl;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    /**
     * Gibt alle Attribute des StuhlTypObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des StuhlTypObjekts als String
     */
    @Override
    public String toString() {
        return "Drehstuhl: " + drehstuhl +
                "\nModell: " + modell;
    }
}
