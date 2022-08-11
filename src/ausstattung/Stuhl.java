package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Stuhl extends Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;
    private StuhlTyp exemplarTyp;

    public Stuhl(StuhlTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public StuhlTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des StuhlObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des StuhlObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Stuhl"+ "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Stuhl.super.getAnschaffungsdatum().getTime());
    }
}
