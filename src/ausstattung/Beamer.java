package ausstattung;


public class Beamer extends Ausstattungsmerkmal{

    public void setExemplar(BeamerTyp exemplar) {
        this.exemplar = exemplar;
    }

    public BeamerTyp getExemplar() {
        return exemplar;
    }

    private BeamerTyp exemplar;

    public Beamer(BeamerTyp exemplar){
        this.exemplar = exemplar;
    }

}
