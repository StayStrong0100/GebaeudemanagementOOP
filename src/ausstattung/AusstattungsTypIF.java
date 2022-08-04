package ausstattung;

import zustand.Defekt;
import zustand.Funktionstuechtig;
import zustand.Zustand;

import java.util.ArrayList;
import java.util.Calendar;

public interface AusstattungsTypIF {

    public int getId();

    public void setId(int id);

    public ArrayList<Zustand> getZustandsListe();

    public void gehtKaputt();

    public void wirdRepariert();

    public Zustand getAktuellerZustand();

    public Calendar getAnschaffungsdatum();

    public void setAnschaffungsdatum(Calendar anschaffungsdatum);

}
