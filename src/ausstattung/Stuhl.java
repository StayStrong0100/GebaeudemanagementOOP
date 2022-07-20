package ausstattung;

public class Stuhl extends Ausstattungsmerkmal{

    private StuhlTyp exemplarTyp;

    public Stuhl(StuhlTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public StuhlTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(StuhlTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
