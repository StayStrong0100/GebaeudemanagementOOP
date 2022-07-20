package ausstattung;

public class PC extends Ausstattungsmerkmal{

    private PCTyp exemplarTyp;

    public PC(PCTyp exemplarTyp){
        this.exemplarTyp = exemplarTyp;
    }

    public PCTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(PCTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }
}
