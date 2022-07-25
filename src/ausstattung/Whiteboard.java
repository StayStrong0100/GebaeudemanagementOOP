package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Whiteboard extends Tafel implements Serializable {

    public static final long serialVersionUID = 0;

    private WhiteboardTyp exemplarTyp;

    public Whiteboard(WhiteboardTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public WhiteboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(WhiteboardTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Whiteboard"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Whiteboard.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
