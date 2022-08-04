import datenspeicherung.*;
import serviceLocator.*;
import verwaltung.*;
import ausstattung.*;
import buchung.*;
//import images.*;
import zustand.*;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        ServiceLocator.setInstance(ServiceLocator.getInstance().getPersistenz().lade("Grunddaten"));
        /*
        System.out.println(ServiceLocator.getInstance().getHausliste().getAlleHaeuser().toString());

        System.out.println(ServiceLocator.getInstance().getHausliste().getAlleRaeueme().size()+"");
        System.out.println(ServiceLocator.getInstance().getHausliste().getAlleHaeuser().size()+"");

        for (Haus h : ServiceLocator.getInstance().getHausliste().getAlleHaeuser()) {
            System.out.println(h.getRaeume().size());
        }

         */

        //GUI starten
        new GUI();


        ServiceLocator.getInstance().getDozentenListe();
    }


}