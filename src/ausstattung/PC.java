package ausstattung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PC extends Ausstattungsmerkmal{

    private PCTyp exemplarTyp;

    public PC(PCTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public PCTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(PCTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Beamer"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(PC.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
