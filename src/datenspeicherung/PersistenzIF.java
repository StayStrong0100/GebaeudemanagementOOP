package datenspeicherung;

import serviceLocator.ServiceLocator;

public interface PersistenzIF {

    /**
     * Speichert den Service Locator als Datei ab
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name, die die gespeicherte Datei bekommt
     * @param sl der zu speichernde ServiceLocator
     */
    void speichern(String dateiname, ServiceLocator sl);

    /**
     * Liest aus einer Datei einen ServiceLocator aus
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name der Datei, in welcher der ServiceLocator gespeichert wurde
     *
     * @return importierter (ausgelesener) ServiceLocator
     */
    ServiceLocator lade(String dateiname);

    /**
     * Erzeugt ein Pop-up-Fenster
     *
     * @author Lukas Zander
     *
     * @param nachricht Anzuzeigender Inhalt im Pop-up-Fenster
     */
    void messagePopUp(String nachricht);
}
