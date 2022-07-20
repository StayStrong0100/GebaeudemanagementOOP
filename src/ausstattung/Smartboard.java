package ausstattung;

public class Smartboard extends Tafel{

    private SmartboardTyp exemplarTyp;

    public Smartboard(SmartboardTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public SmartboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(SmartboardTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
