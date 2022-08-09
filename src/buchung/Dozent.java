package buchung;

import java.io.Serializable;
import java.text.*;
import java.util.*;

public class Dozent implements Serializable {

    public static final long serialVersionUID = 0;
    private String name;
    private ArrayList<Terminbuchung> meineBuchungen = new ArrayList<>();
    public ArrayList<Terminbuchung> getMeineBuchungen() {
        return meineBuchungen;
    }

    public Dozent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gibt alle Buchungen ab heute bis zur angegebenen Dauer als String zurück
     * dabei wird nach jedem Tag ein Extraabsatz gemacht
     *
     * @author Lukas Zander
     *
     * @return alle aktuellen Buchungen als String
     */
    public String aktuelleBuchungenToString(){
        ArrayList<Terminbuchung> aktuelleBuchungen = new ArrayList<>();
        String ausgabe = "Aktuelle Terminbuchungen für " + this.getName() + ": \n" + "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n";

        Calendar ende = Calendar.getInstance();
        ende.add(Calendar.DAY_OF_MONTH, 28);

        //Alle Terminbuchungen, die von heute innerhalb 28 Tage liegen
        for(Terminbuchung t : this.meineBuchungen){
            if(t.getIntervall().getStart().after(Calendar.getInstance()) && t.getIntervall().getStart().before(ende)){
                aktuelleBuchungen.add(t);
            }
        }

        //Die Terminbuchungen werden anhand ihrer Startzeit sortiert
        aktuelleBuchungen.sort(new Comparator<Terminbuchung>() {
            @Override
            //Definierung des compare-Parameters (Sortierregel)
            public int compare(Terminbuchung o1, Terminbuchung o2) {
                if(o1.getIntervall().getStart().equals(o2.getIntervall().getStart())){
                    return 0;
                }
                if(o1.getIntervall().getStart().before(o2.getIntervall().getStart())){
                    return -1;
                }
                else {
                    return 1;
                }

            }
        });

        //Gruppiert nach dem Datum (= 1 Extra Absatz), werden die Terminbuchungen dem String hinzugefügt
        DateFormat tagLang = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat nurUhrzeit = new SimpleDateFormat("HH:mm");

        for(int i=0; i<28; i++){
            Calendar aktuell = Calendar.getInstance();
            aktuell.add(Calendar.DAY_OF_MONTH, i);
            ausgabe += "Buchungen am " + tagLang.format(aktuell.getTime()) + ":\n";
            //Boolean wird benötigt, damit wenn es keine Buchung an Tag x gibt, dort eine Meldung kommt
            boolean buchungVorhanden = false;

            for(Terminbuchung t: aktuelleBuchungen){
                if(t.getIntervall().getStart().get(Calendar.DAY_OF_YEAR) == aktuell.get(Calendar.DAY_OF_YEAR) && t.getIntervall().getStart().get(Calendar.YEAR) == aktuell.get(Calendar.YEAR)){
                    ausgabe += "-Buchung-ID: " + t.getId() + "\t Start: " + nurUhrzeit.format(t.getIntervall().getStart().getTime()) + "\t Ende: " + nurUhrzeit.format(t.getIntervall().getEnde().getTime());
                    //ausgabe += t.printBuchungDetails() + "\n";
                    buchungVorhanden = true;
                }
            }

            //Wenn keine Buchung an Tag x
            if(!buchungVorhanden){
                ausgabe += "-keine Buchungen";
            }
            ausgabe += "\n\n";
        }

        return ausgabe;

    }

    /**
     * Fügt der Buchungsliste eine neue Buchung hinzu
     *
     * @author Lukas Zander
     *
     * @param neuerTermin Buchung, die hinzugefügt werden soll
     */
    public void addBuchung(Terminbuchung neuerTermin){
        this.meineBuchungen.add(neuerTermin);
    }

    /**
     * Entfernt aus der Buchungsliste eine Buchung
     *
     * @author Lukas Zander
     *
     * @param abgesagterTermin Buchung, die entfernt werden soll
     */
    public void removeBuchung(Terminbuchung abgesagterTermin){
        this.meineBuchungen.remove(abgesagterTermin);
    }
}
