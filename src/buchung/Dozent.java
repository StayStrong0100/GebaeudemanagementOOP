package buchung;

import java.io.Serializable;

public class Dozent implements Serializable {

    public static final long serialVersionUID = 0;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dozent(String name) {
        this.name = name;
    }
}
