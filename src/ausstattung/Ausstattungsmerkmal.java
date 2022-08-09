package ausstattung;

import zustand.*;
import java.io.Serializable;
import java.util.*;

public abstract class Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;
    private static int count=0;
    private int id;
    private Calendar anschaffungsdatum;
    private ArrayList<Zustand> zustandsListe = new ArrayList<>();

    public Ausstattungsmerkmal(Calendar anschaffungsdatum) {
        count++;
        this.id = count;
        this.anschaffungsdatum  = anschaffungsdatum;
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }

    public abstract AusstattungsTypIF getExemplarTyp();

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public Zustand getAktuellerZustand(){
        return this.zustandsListe.get(this.zustandsListe.size()-1);
    }

    public Calendar getAnschaffungsdatum() {
        return anschaffungsdatum;
    }

    public static void setCount(int count) {
        Ausstattungsmerkmal.count = count;
    }

    /**
     * Fügt der Zustandsliste neues Objekt von Typ "Defekt" mit aktuellem Datum hinzu
     *
     * @author Lukas Zander
     */
    public void gehtKaputt(){
        this.zustandsListe.add(new Defekt(Calendar.getInstance()));
    }

    /**
     * Fügt der Zustandsliste neues Objekt von Typ "Funktionstüchtig" mit aktuellem Datum hinzu
     *
     * @author Lukas Zander
     */
    public void wirdRepariert(){
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }
}
