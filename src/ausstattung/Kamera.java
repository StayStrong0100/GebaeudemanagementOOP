package ausstattung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kamera extends Ausstattungsmerkmal {
    public static final long serialVersionUID = 0;
    private KameraTyp exemplarTyp;

    public Kamera(KameraTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public void setExemplarTyp(KameraTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    public KameraTyp getExemplarTyp() {
        return exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Kamera"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Kamera.super.getAnschaffungsdatum().getTime());
    }

        public void print() {
            System.out.println(toString());
        }
}
