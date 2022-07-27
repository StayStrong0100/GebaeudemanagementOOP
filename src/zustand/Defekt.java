package zustand;

import java.io.Serializable;
import java.util.Calendar;

public class Defekt extends Zustand implements Serializable {

    public static final long serialVersionUID = 0;
    public Defekt(Calendar datum) {
        super(datum);
    }
}
