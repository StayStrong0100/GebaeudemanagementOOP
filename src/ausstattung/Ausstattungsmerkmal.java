package ausstattung;

import zustand.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;

    private static int count=0;
    private int id;
    private Calendar anschaffungsdatum;
    private ArrayList<Zustand> zustandsListe = new ArrayList<>();

    public abstract AusstattungsTypIF getExemplarTyp();

    public Ausstattungsmerkmal(Calendar anschaffungsdatum) {
        count++;
        this.id = count;
        this.anschaffungsdatum  = anschaffungsdatum;
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ausstattungsmerkmal.count = count;
    }

    public Calendar getAnschaffungsdatum() {
        return anschaffungsdatum;
    }

    public void setAnschaffungsdatum(Calendar anschaffungsdatum) {
        this.anschaffungsdatum = anschaffungsdatum;
    }

    /**
     * Fügt den Zustand Kaputt an letzter Stelle dem Zustands Array des Objekts hinzu
     *
     * @author Lukas Zander
     */

    public void gehtKaputt(){
        this.zustandsListe.add(new Defekt(Calendar.getInstance()));
    }

    /**
     * Fügt den Zustand Funktionstuechtig an letzter Stelle dem Zustands Array des Objekts hinzu
     *
     * @author Lukas Zander
     */
    public void wirdRepariert(){
        this.zustandsListe.add(new Funktionstuechtig(Calendar.getInstance()));
    }

    /**
     * Liefert den aktuellen/ letzten Zustand eines Objektes
     *
     * @author Lukas Zander
     *
     * @return Liefert den aktuellen/ letzten Zustand eines Objektes aus der Zustandsliste
     */

    public Zustand getAktuellerZustand(){
        return this.zustandsListe.get(this.zustandsListe.size()-1);
    }
}
