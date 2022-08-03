import datenspeicherung.*;
import serviceLocator.*;
import verwaltung.*;
import ausstattung.*;
import buchung.*;
//import images.*;
import zustand.*;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        ServiceLocator.setInstance(ServiceLocator.getInstance().getPersistenz().lade("Grunddaten"));

        //GUI starten
        new GUI();


    }


}