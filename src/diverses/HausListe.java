package diverses;

public class HausListe {
    private HausListe(){
    }
    private static HausListe instance;
    public static HausListe getInstance(){
        if(instance == null) {
            instance=new HausListe();
        }
        return instance;
    }



}
