package datenspeicherung;

import serviceLocator.ServiceLocator;
import java.io.*;
import javax.swing.*;

//singleton
public class PersistenzDB implements PersistenzIF, Serializable{

    private static PersistenzDB instance;

    private PersistenzDB() {
    }

    public static PersistenzDB getInstance() {
        if (instance == null) {
            instance = new PersistenzDB();
        }
        return instance;
    }

    /**
     * Speichert den Service Locator als Datei ab
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name, die die gespeicherte Datei bekommt
     * @param sl der zu speichernde ServiceLocator
     */
    public void speichern(String dateiname, ServiceLocator sl) {

        try {
            FileOutputStream fileOut = new FileOutputStream(dateiname);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sl);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage() + "\n" + "Speichern fehlgeschlagen");

        }
    }

    /**
     * Liest aus einer Datei einen ServiceLocator aus
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name der Datei, in welcher der ServiceLocator gespeichert wurde
     *
     * @return importierter (ausgelesener) ServiceLocator
     */
    public ServiceLocator lade(String dateiname) {
        try {
            FileInputStream fileIn = new FileInputStream(dateiname);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            return (ServiceLocator) in.readObject();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage() + "\n" + "File not found: Das Programm enthält nun keine Daten, bitte wiederholen Sie den Importvorgang!");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage() + "\n" + "Input / Output Problem: Das Programm enthält nun keine Daten, bitte wiederholen Sie den Importvorgang!");
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            messagePopUp(e.getMessage() + "\n" + "Class not found: Das Programm enthält nun keine Daten, bitte wiederholen Sie den Importvorgang!");
        }
        return ServiceLocator.getInstance();
    }

    /**
     * Erzeugt ein Pop-up-Fenster
     *
     * @author Lukas Zander
     *
     * @param nachricht Anzuzeigender Inhalt im Pop-up-Fenster
     */
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
