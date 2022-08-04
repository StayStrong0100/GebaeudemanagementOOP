package ausstattung;

import java.util.ArrayList;

public interface TischTypListeIF {

    public ArrayList<TischTyp> getAlleTischTypen();

    public void addTischTyp(TischTyp tt);
}
