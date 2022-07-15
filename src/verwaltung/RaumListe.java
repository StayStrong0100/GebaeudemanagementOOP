//Diese Klasse kann gelöscht werden, dient nur noch als BackUp

package verwaltung;

import java.util.ArrayList;

//singleton
public class RaumListe {
    private ArrayList<Raum> alleRaueme = new ArrayList();
    private static RaumListe instance;

    private RaumListe(){
    }

    public static RaumListe getInstance(){
        if(instance == null) {
            instance=new RaumListe();
        }
        return instance;
    }

    public ArrayList<Raum> getAlleRaueme() {
        return alleRaueme;
    }




}
