package ausstattung;

import java.util.ArrayList;

public interface KameraTypListeIF {

    public ArrayList<KameraTyp> getAlleKameraTypen();

    public void addKameraTyp(KameraTyp kt);
}
