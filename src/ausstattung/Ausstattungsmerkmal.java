package ausstattung;

import Zustand.*;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Ausstattungsmerkmal {
    private ArrayList<Zustand> zustandsListe = new ArrayList<>();

    public Ausstattungsmerkmal() {
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

}
