package ausstattung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Whiteboard extends Tafel{

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
        return "Ausstattungsmerkmal: Beamer"+ "\nExemplartyp:\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Whiteboard.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
