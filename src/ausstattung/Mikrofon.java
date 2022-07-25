package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mikrofon extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;
    private MikrofonTyp exemplarTyp;

    public Mikrofon(MikrofonTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public MikrofonTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(MikrofonTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Microfon"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Mikrofon.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
