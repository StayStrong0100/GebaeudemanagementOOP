package zustand;

import java.io.Serializable;
import java.util.Calendar;

public abstract class Zustand implements Serializable {

    public static final long serialVersionUID = 0;
    private Calendar datum;

    public Zustand(Calendar datum) {
        this.datum = datum;
    }

}
