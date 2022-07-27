package serviceLocator;

import verwaltung.*;

public class ServiceLocator {

    private verwaltung.HausListe hausliste;

    public ServiceLocator(HausListe hausliste) {
        this.hausliste = hausliste;
    }

    public HauslisteIF getHausliste() {
        return hausliste;
    }

    public void setHausliste(verwaltung.HausListe hausliste) {
        this.hausliste = hausliste;
    }
}