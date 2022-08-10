package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Smartboard extends Ausstattungsmerkmal {

    public static final long serialVersionUID = 0;

    private SmartboardTyp exemplarTyp;

    public Smartboard(SmartboardTyp exemplarTyp, Calendar anschaffungsdatum) {
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public SmartboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des SmartboardObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des SmartboardObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Smartboard" + "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Smartboard.super.getAnschaffungsdatum().getTime());
    }
}
