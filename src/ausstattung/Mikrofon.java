package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mikrofon extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;
    private MikrofonTyp exemplarTyp;

    public Mikrofon(MikrofonTyp exemplarTyp, Calendar anschaffungsdatum) {
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public MikrofonTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des MicrofonObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des MicrofonObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Microfon" + "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Mikrofon.super.getAnschaffungsdatum().getTime());
    }
}
