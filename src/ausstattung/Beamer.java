package ausstattung;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Beamer extends Ausstattungsmerkmal implements Serializable{
    public static final long serialVersionUID = 0;
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
        return "Ausstattungsmerkmal: Beamer"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Beamer.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
