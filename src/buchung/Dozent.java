package buchung;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

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

    /**
     * Gibt alle Buchungen ab heute bis zur angegebenen Dauer als String zurück
     *
     * @return
     */
    public String aktuelleBuchungenToString(){
        ArrayList<Terminbuchung> aktuelleBuchungen = new ArrayList<>();
        String ausgabe = "Aktuelle Terminbuchungen für " + this.getName() + ": \n";
        ausgabe += "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n";
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

        //Gruppiert nach dem Datum, werden die Terminbuchungen dem String hinzugefügt
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
                    ausgabe += "-Buchungs-ID: " + t.getId() + "\t Start: " + nurUhrzeit.format(t.getIntervall().getStart().getTime()) + "\t Ende: " + nurUhrzeit.format(t.getIntervall().getEnde().getTime());
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

        /*
        for(Terminbuchung t : aktuelleBuchungen){
            ausgabe += t.printBuchungDetails() + "\n";
        }

         */

        return ausgabe;

    }
}
