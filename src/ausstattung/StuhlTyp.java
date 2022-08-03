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

    public boolean isDrehstuhl() {
        return drehstuhl;
    }

    public void setDrehstuhl(boolean drehstuhl) {
        this.drehstuhl = drehstuhl;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    @Override
    public String toString() {
        return "Drehstuhl: " + drehstuhl +
                "\nModell: " + modell;
    }
}
