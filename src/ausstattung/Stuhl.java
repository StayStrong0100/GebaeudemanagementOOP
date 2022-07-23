package ausstattung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Stuhl extends Ausstattungsmerkmal{

    private StuhlTyp exemplarTyp;

    public Stuhl(StuhlTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public StuhlTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(StuhlTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Beamer"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Stuhl.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
