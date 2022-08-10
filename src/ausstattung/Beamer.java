package ausstattung;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Beamer extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;
    private BeamerTyp exemplarTyp;

    public Beamer(BeamerTyp exemplarTyp, Calendar anschaffungsdatum) {
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public BeamerTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des BeamerObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des BeamerObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Beamer" + "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Beamer.super.getAnschaffungsdatum().getTime());
    }
}
