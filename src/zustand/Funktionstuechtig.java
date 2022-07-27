package zustand;

import java.io.Serializable;
import java.util.Calendar;

public class Funktionstuechtig extends Zustand implements Serializable {

    public static final long serialVersionUID = 0;

    public Funktionstuechtig(Calendar datum) {
        super(datum);
    }


}
