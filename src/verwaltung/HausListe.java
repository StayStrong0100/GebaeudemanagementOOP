package verwaltung;

import java.util.ArrayList;

//singleton
public class HausListe {
    private ArrayList<Haus> alleHaeuser = new ArrayList<>();
    private static HausListe instance;

    private HausListe(){
    }

    public static HausListe getInstance(){
        if(instance == null) {
            instance=new HausListe();
        }
        return instance;
    }

    public ArrayList<Haus> getAlleHaeuser() {
        return alleHaeuser;
    }

    public void addHaus(Haus neuesHaus) {
        this.alleHaeuser.add(neuesHaus);
    }

    public void findeRaum(){
        //TODO Raum Filter implementieren
    }


}
