package buchung;

import java.util.ArrayList;

public interface DozentListeIF {

    public ArrayList<Dozent> getAlleDozenten();

    public void addDozent(Dozent doz);
}
