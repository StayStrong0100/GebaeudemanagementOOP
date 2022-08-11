package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PC extends Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;
    private PCTyp exemplarTyp;

    public PC(PCTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public PCTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des PCObjekts in einem String zusammen aus
     *
     * @author Benjamin Kostka
     *
     * @return alle Attribute des PCObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: PC"+ "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(PC.super.getAnschaffungsdatum().getTime());
    }
}
