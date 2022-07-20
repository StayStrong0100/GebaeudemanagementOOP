package ausstattung;

public class Mikrofon extends Ausstattungsmerkmal{

    private MikrofonTyp exemplarTyp;

    public Mikrofon(MikrofonTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public MikrofonTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(MikrofonTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
