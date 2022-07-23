package ausstattung;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Beamer extends Ausstattungsmerkmal{

    public void setExemplarTyp(BeamerTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    public BeamerTyp getExemplarTyp() {
        return exemplarTyp;
    }

    private BeamerTyp exemplarTyp;

    public Beamer(BeamerTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Start: " + df.format(Beamer.super.getAnschaffungsdatum().getTime()));
        return "Ausstattungsmerkmal: Beamer"+ "\nexemplarTyp:" + exemplarTyp;
    }

    public void print() {
        System.out.println(toString());
    }
}
