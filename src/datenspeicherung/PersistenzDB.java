package datenspeicherung;

import verwaltung.HausListe;
import java.io.*;

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
            throw new RuntimeException(e);
        }
    }

    public HausListe lade(String dateiname) {
        try {
            FileInputStream fileIn = new FileInputStream(dateiname);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            return (HausListe) in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
