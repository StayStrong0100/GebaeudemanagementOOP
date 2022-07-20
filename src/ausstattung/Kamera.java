package ausstattung;

public class Kamera extends Ausstattungsmerkmal {

    private KameraTyp exemplar;

    public Kamera(KameraTyp exemplar){
        this.exemplar = exemplar;
    }

    public void setExemplar(KameraTyp exemplar) {
        this.exemplar = exemplar;
    }

    public KameraTyp getExemplar() {
        return exemplar;
    }
}
