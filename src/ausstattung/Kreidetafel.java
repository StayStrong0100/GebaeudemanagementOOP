package ausstattung;

public class Kreidetafel extends Tafel{

    private KreidetafelTyp exemplarTyp;

    public Kreidetafel(KreidetafelTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public KreidetafelTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(KreidetafelTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
