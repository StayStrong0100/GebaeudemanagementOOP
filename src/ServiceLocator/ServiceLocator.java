package ServiceLocator;

import verwaltung.*;

public class ServiceLocator {

    private verwaltung.HausListe hausliste;

    public HauslisteIF getHausliste() {
        return hausliste;
    }

    public void setHausliste(verwaltung.HausListe hausliste) {
        this.hausliste = hausliste;
    }
}