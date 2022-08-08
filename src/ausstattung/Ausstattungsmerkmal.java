package ausstattung;

import zustand.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;

    private int id;
    private static int count=0;
    private Calendar anschaffungsdatum;
    private ArrayList<Zustand> zustandsListe = new ArrayList<>();

    public abstract AusstattungsTypIF getExemplarTyp();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ausstattungsmerkmal.count = count;
    }

    public Ausstattungsmerkmal(Calendar anschaffungsdatum) {
        count++;
        this.id = count;
        this.anschaffungsdatum  = anschaffungsdatum;
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }

    public ArrayList<Zustand> getZustandsListe() {
        return zustandsListe;
    }

    public void gehtKaputt(){
        this.zustandsListe.add(new Defekt(Calendar.getInstance()));
    }

    public void wirdRepariert(){
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }

    public Zustand getAktuellerZustand(){
        return this.zustandsListe.get(this.zustandsListe.size()-1);
    }

    public Calendar getAnschaffungsdatum() {
        return anschaffungsdatum;
    }

    public void setAnschaffungsdatum(Calendar anschaffungsdatum) {
        this.anschaffungsdatum = anschaffungsdatum;
    }
}
