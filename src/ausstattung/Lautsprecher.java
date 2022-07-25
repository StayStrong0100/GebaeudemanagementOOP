package ausstattung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lautsprecher extends Ausstattungsmerkmal {

    public static final long serialVersionUID = 0;
    private LautsprecherTyp exemplarTyp;

    public Lautsprecher(LautsprecherTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp =exemplarTyp;
    }

    public LautsprecherTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(LautsprecherTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Lautsprecher"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Lautsprecher.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
