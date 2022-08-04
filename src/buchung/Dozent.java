package buchung;

import java.io.Serializable;
import java.util.ArrayList;

public class Dozent implements Serializable {

    public static final long serialVersionUID = 0;
    private String name;
    private ArrayList<Terminbuchung> meineBuchungen = new ArrayList<>();

    public ArrayList<Terminbuchung> getMeineBuchungen() {
        return meineBuchungen;
    }

    public void addBuchung(Terminbuchung neuerTermin){
        this.meineBuchungen.add(neuerTermin);
    }

    public void removeBuchung(Terminbuchung abgesagterTermin){
        this.meineBuchungen.remove(abgesagterTermin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dozent(String name) {
        this.name = name;
    }
}
