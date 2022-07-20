package ausstattung;

public class Kamera extends Ausstattungsmerkmal {

    private KameraTyp exemplarTyp;

    public Kamera(KameraTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public void setExemplarTyp(KameraTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    public KameraTyp getExemplarTyp() {
        return exemplarTyp;
    }
}
