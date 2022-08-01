package datenspeicherung;

import serviceLocator.ServiceLocator;
import verwaltung.HausListe;

public interface PersistenzIF {

    public void speichern(String dateiname, ServiceLocator sl);

    public ServiceLocator lade(String dateiname);

    public void messagePopUp(String nachricht);
}
