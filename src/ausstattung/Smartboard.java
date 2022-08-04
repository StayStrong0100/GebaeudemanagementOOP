package ausstattung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Smartboard extends Tafel{

    public static final long serialVersionUID = 0;

    private SmartboardTyp exemplarTyp;

    public Smartboard(SmartboardTyp exemplarTyp, Calendar anschaffungsdatum){
        super(anschaffungsdatum);
        this.exemplarTyp = exemplarTyp;
    }

    public SmartboardTyp getExemplarTyp() {
        return exemplarTyp;
    }

    public void setExemplarTyp(SmartboardTyp exemplarTyp) {
        this.exemplarTyp = exemplarTyp;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return "Ausstattungsmerkmal: Smartboard"+ "\nEXEMPLARTYP\n" + exemplarTyp
                + "\nAnschaffungsdatum: " + df.format(Smartboard.super.getAnschaffungsdatum().getTime());
    }

    public void print() {
        System.out.println(toString());
    }
}
