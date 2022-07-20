package ausstattung;

public class Tisch extends Ausstattungsmerkmal{

    private TischTyp exemplarTyp;

    public Tisch(TischTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public TischTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(TischTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
