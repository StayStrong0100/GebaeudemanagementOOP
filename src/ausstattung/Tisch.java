package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tisch extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;

    private TischTyp exemplarTyp;

    public Tisch(TischTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public TischTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des TischObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des TischObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Tisch"+ "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Tisch.super.getAnschaffungsdatum().getTime());
    }
}
