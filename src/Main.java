import serviceLocator.*;

public class Main {
    public static void main(String[] args) {
        //Daten laden
        ServiceLocator.getInstance().ladeAlleContainer("Grunddaten");

        //GUI starten
        new GUI();
    }
}