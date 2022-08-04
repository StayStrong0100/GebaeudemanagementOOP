package ausstattung;

import java.util.ArrayList;

public interface LautsprecherTypListeIF {

    public ArrayList<LautsprecherTyp> getAlleLautsprecherTypen();

    public void addLautsprecherTyp(LautsprecherTyp lt);
}
