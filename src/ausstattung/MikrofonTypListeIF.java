package ausstattung;

import java.util.ArrayList;

public interface MikrofonTypListeIF {

    public ArrayList<MikrofonTyp> getAlleMikrofonTypen();

    public void addMikrofonTyp(MikrofonTyp mt);
}
