package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Whiteboard extends Ausstattungsmerkmal implements Serializable {

    public static final long serialVersionUID = 0;

    private WhiteboardTyp exemplarTyp;

    public Whiteboard(WhiteboardTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public WhiteboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    /**
     * Gibt alle Attribute des WhiteboardObjekts in einem String zusammen aus
     *
     * @author Ben Kostka
     *
     * @return alle Attribute des WhiteboardObjekts als String
     */
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Whiteboard"+ "\nEXEMPLARTYP:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Whiteboard.super.getAnschaffungsdatum().getTime());
    }
}
