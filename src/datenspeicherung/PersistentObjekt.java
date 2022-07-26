package datenspeicherung;

import verwaltung.*;
import java.io.*;

public class PersistentObjekt {

    private PersistentObjekt(){
    }
    private static PersistentObjekt instance;

    public static PersistentObjekt getInstance() {
        if (instance == null) {
            instance = new PersistentObjekt();
        }
        return instance;
    }

    public void speichern(String dateiname, HausListe hausListe) {

        try {
            FileOutputStream fileOut = new FileOutputStream(dateiname);

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(hausListe);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HausListe lade(String dateiname){
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
