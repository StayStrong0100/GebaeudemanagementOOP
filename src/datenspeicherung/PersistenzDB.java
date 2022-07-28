package datenspeicherung;

import verwaltung.HausListe;
import java.io.*;
import javax.swing.*;

//singleton
public class PersistenzDB implements PersistenzIF{

    private PersistenzDB() {
    }

    private static PersistenzDB instance;

    public static PersistenzDB getInstance() {
        if (instance == null) {
            instance = new PersistenzDB();
        }
        return instance;
    }

    public void speichern(String dateiname, HausListe sl) {

        try {
            FileOutputStream fileOut = new FileOutputStream(dateiname);

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sl);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage());
        }
    }

    public HausListe lade(String dateiname) {
        try {
            FileInputStream fileIn = new FileInputStream(dateiname);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            return (HausListe) in.readObject();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage());
            messagePopUp("File not found: Hausliste ist nun leer, bitte wiederholen Sie den Importvorgang!");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage());
            messagePopUp("Input / Output Problem: Hausliste ist nun leer, bitte wiederholen Sie den Importvorgang!");
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage());
            messagePopUp("Class not found: Hausliste ist nun leer, bitte wiederholen Sie den Importvorgang!");
        }
        return HausListe.getInstance();
    }

    public void messagePopUp(String nachricht){
        // Erzeugung eines neuen JDialogs mit Titel und fixer Größe
        JDialog fehlermeldung = new JDialog();
        fehlermeldung.setTitle("Fehler");
        fehlermeldung.setSize(200,200);
        fehlermeldung.setModal(true);
        // Hinzufügen der Fehlernachricht aus der Exception
        fehlermeldung.add(new JLabel(nachricht));
        //Popup anzeigen lassen
        fehlermeldung.setVisible(true);
    }

}
