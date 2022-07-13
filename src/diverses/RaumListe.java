package diverses;

public class RaumListe {
    private RaumListe(){
    }
    private static RaumListe instance;
    public static RaumListe getInstance(){
        if(instance == null) {
            instance=new RaumListe();
        }
        return instance;
    }

}
