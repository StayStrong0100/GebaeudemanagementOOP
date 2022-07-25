package ausstattung;

import java.io.Serializable;
import java.util.Calendar;

public abstract class Tafel extends Ausstattungsmerkmal implements Serializable{

    public static final long serialVersionUID = 0;
    public Tafel(Calendar anschaffungsdatum) {
        super(anschaffungsdatum);
    }
}
