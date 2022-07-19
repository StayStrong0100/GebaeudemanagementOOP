package ausstattung;


public class Beamer extends Ausstattungsmerkmal{

    private final BeamerTyp exemplar;

    public Beamer(BeamerTyp exemplar){
        this.exemplar = new BeamerTyp(exemplar.getMarke(), exemplar.getModell(), exemplar.getLumen(), exemplar.isLautsprecher());
    }

}
