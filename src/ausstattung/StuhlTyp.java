package ausstattung;

public class StuhlTyp {

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
}
