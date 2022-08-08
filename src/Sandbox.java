import java.util.Calendar;

public class Sandbox {
    public static void main(String[] args) {
        Calendar heute = Calendar.getInstance();

        Calendar heuteRandom = Calendar.getInstance();
        heuteRandom.set(2022,8,8,17,00);

        Calendar maximum = Calendar.getInstance();
        int anzahlWochen = 10;

        Calendar random = Calendar.getInstance();
        random.set(2022,11,5,11,50);

        System.out.println(random.getTime().toString());
        random.add(Calendar.DAY_OF_MONTH, anzahlWochen*7);
        System.out.println(random.getTime().toString());


        System.out.println(heuteRandom.get(Calendar.DAY_OF_YEAR));
        System.out.println(random.get(Calendar.DAY_OF_YEAR));


    }
}
