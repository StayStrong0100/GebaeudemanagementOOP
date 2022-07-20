package ausstattung;


public class Beamer extends Ausstattungsmerkmal{

    public void setExemplarTyp(BeamerTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    public BeamerTyp getExemplarTyp() {
        return exemplarTyp;
    }

    private BeamerTyp exemplarTyp;

    public Beamer(BeamerTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

}
