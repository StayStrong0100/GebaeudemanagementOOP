package ausstattung;

import java.io.Serializable;
import java.rmi.ServerError;

public class StuhlTyp implements Serializable{

    public static final long serialVersionUID = 0;

    private boolean drehstuhl;
    private String modell;

    public StuhlTyp(boolean drehstuhl, String modell){
        this.drehstuhl = drehstuhl;
        this.modell = modell;
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
