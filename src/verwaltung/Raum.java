package verwaltung;

import ausstattung.*;
import buchung.*;
import zustand.*;

import java.io.Serializable;
import java.util.*;

public class Raum implements Serializable {

    public static final long serialVersionUID = 0;
    private int raumnummer;
    private ArrayList<Terminbuchung> buchungen = new ArrayList<>();
    private ArrayList<Ausstattungsmerkmal> ausstattung = new ArrayList<>();

    public int getRaumnummer() {
        return raumnummer;
    }

    public void setRaumnummer(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    @Override
    public String toString() {
        String ausgabe = "Raumnummer:\t"+  raumnummer;

        for(Ausstattungsmerkmal a : ausstattung){
            ausgabe += a.toString();
        }

    return ausgabe;
    }

    public String printAlleBuchungen(){
        String ausgabe = "";
        for (Terminbuchung t : this.getBuchungen()) {
            ausgabe.concat(t.printBuchungDetails());
            ausgabe.concat("\n");
        }
        return ausgabe;
    }

    public ArrayList<Ausstattungsmerkmal> getAusstattung() {
        return ausstattung;
    }

    public ArrayList<Terminbuchung> getBuchungen() {
        return buchungen;
    }

    public Raum(int raumnummer) {
        this.raumnummer = raumnummer;
    }

    public void buchen(Calendar start, Calendar ende, Dozent doz){
        buchungen.add(new Terminbuchung(start,ende,doz));
    }

    public boolean cancelOrder(int id){
        for (Terminbuchung buchung:buchungen) {
            if (buchung.getId()==id) {
                buchungen.remove(buchung);
                return true;
            }
        }
        return false;
    }
    public void addAusstattung(Ausstattungsmerkmal neu){
        this.ausstattung.add(neu);
    }

    public void addAusstattung(Ausstattungsmerkmal neu, int Anzahl){

        for(int i = 1; i <= Anzahl; i++) {
            this.ausstattung.add(neu);
        }
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Beamern im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */

    public int getAnzahlRaumBeamerFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Beamer && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }

        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Beamern im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumBeamerDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                     if (a instanceof Beamer && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kameras im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumKamerasFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                     if (a instanceof Kamera && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kameras im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumKamerasDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                         if (a instanceof Kamera && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Kreidetafeln im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumKreidetafelnFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                     if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Kreidetafeln im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumKreidetafelnDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Kreidetafel && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Lautsprechern im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumLautsprecherFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Lautsprechern im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumLautsprecherDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Lautsprecher && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Mikrofonen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumMikrofoneFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Mikrofonen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumMikrofoneDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Mikrofon && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen PCs im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumPCsFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof PC && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten PCs im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumPCsDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof PC && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Smartboards im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumSmartboardsFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Smartboards im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumSmartboardsDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Smartboard && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Stuehlen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumStuehleFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Stuehlen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumStuehleDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Stuhl && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Tischen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumTischeFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Tisch && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Tischen im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumTischeDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Tisch && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von funktionstüchtigen Whiteboards im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumWhiteboardsFunktionstuechtig(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Funktionstuechtig) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    /**
     * Zählt die Anzahl von defekten Whiteboards im Raum
     *
     * @author ZanderLK
     * @version 1.0.0
     * @since 20220725
     *
     * @return anzahl - int
     */
    public int getAnzahlRaumWhiteboardsDefekt(){
        int anzahl = 0;
        for (Ausstattungsmerkmal a : this.getAusstattung()) {
                    if (a instanceof Whiteboard && a.getAktuellerZustand() instanceof Defekt) {
                        anzahl++;
                    }
        }
        return anzahl;
    }

    public String printRaum(){
        return ("Raumnummer: " + this.getRaumnummer());
    }

}
