package ausstattung;

public class Lautsprecher extends Ausstattungsmerkmal {
    private LautsprecherTyp exemplarTyp;

    public Lautsprecher(LautsprecherTyp exemplarTyp){
        this.exemplarTyp =exemplarTyp;
    }

    public LautsprecherTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(LautsprecherTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
