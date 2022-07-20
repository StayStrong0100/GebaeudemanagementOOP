package ausstattung;

public class Kreidetafel extends Ausstattungsmerkmal{

    private KreidetafelTyp exemplar;

    public Kreidetafel(KreidetafelTyp exemplar){
        this.exemplar = exemplar;
    }

    public KreidetafelTyp getExemplar() {
        return exemplar;
    }

    public void setExemplar(KreidetafelTyp exemplar) {
        this.exemplar = exemplar;
    }
}
