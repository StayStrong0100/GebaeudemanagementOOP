package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kamera extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;
    private KameraTyp exemplarTyp;

    public Kamera(KameraTyp exemplarTyp, Calendar anschaffungsdatum) {
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public KameraTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des KameraObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des KameraObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Kamera" + "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Kamera.super.getAnschaffungsdatum().getTime());
    }
}
