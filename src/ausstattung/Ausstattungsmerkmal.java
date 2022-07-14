package ausstattung;

import Zustand.*;

import java.util.ArrayList;

public abstract class Ausstattungsmerkmal {
    private Zustand zustand;

    public Ausstattungsmerkmal() {
        zustand = new Funktionstuechtig();
    }

    public void gehtKaputt(){
        this.zustand = new Defekt();
    }

    public void wirdRepariert(){
        this.zustand = new Funktionstuechtig();
    }

    /*
    Dies ist die Lösung, wie es Fausti in seiner Version gemacht hat. Allerdings gibt es auch eine simplere Variante, die auch sinnvoll ist

    private ArrayList<Zustand> zustandsListe = new ArrayList<>();

    public Ausstattungsmerkmal() {
        this.zustandsListe.add(new Funktionstuechtig());
    }

    public ArrayList<Zustand> getZustandsListe() {
        return zustandsListe;
    }

    public void gehtKaputt(){
        this.zustandsListe.clear();
        this.zustandsListe.add(new Defekt());
    }

    public void wirdRepariert(){
        this.zustandsListe.clear();
        this.zustandsListe.add(new Funktionstuechtig());
    }
    */
}
