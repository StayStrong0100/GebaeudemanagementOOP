package Datenspeicherung;

import ausstattung.Beamer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialisierung {

        public void speicherStuhl(String datei){
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(datei));
            out.writeObject(Beamer)
        }

}
