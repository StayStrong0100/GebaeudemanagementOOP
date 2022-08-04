import serviceLocator.*;

public class Main {
    public static void main(String[] args) {
        //Daten laden
        ServiceLocator.setInstance(ServiceLocator.getInstance().getPersistenz().lade("Grunddaten"));

        //GUI starten
        new GUI();
    }
}