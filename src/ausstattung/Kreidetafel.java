package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kreidetafel extends Tafel implements Serializable {
    public static final long serialVersionUID = 0;
    private KreidetafelTyp exemplarTyp;

    public Kreidetafel(KreidetafelTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public KreidetafelTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(KreidetafelTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Kreidetafel"+ "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Kreidetafel.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
