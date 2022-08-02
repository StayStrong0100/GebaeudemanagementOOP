package serviceLocator;

import ausstattung.*;
import buchung.DozentListe;
import datenspeicherung.*;
import verwaltung.*;

import java.io.Serializable;

public class ServiceLocator implements Serializable {

    /*
    Zugriff auf:
    HausListe
    DozentenListe
    PersistenzDB
     */

    private HausListe hl;
    private DozentListe dl;

    private BeamerTypListe bTL;
    private KameraTypListe kameraTL;
    private KreidetafelTypListe kreideTL;
    private LautsprecherTypListe lTL;
    private MikrofonTypListe mTL;
    private PCTypListe pTL;
    private SmartboardTypListe smartTL;
    private StuhlTypListe stuhlTL;
    private TischTypListe tTL;
    private WhiteboardTypListe wTL;

    private static ServiceLocator instance;

    public ServiceLocator(HausListe hl, DozentListe dl, BeamerTypListe bTL, KameraTypListe kameraTL, KreidetafelTypListe kreideTL, LautsprecherTypListe lTL, MikrofonTypListe mTL, PCTypListe pTL, SmartboardTypListe smartTL, StuhlTypListe stuhlTL, TischTypListe tTL, WhiteboardTypListe wTL) {
        this.hl = hl;
        this.dl = dl;
        this.bTL = bTL;
        this.kameraTL = kameraTL;
        this.kreideTL = kreideTL;
        this.lTL = lTL;
        this.mTL = mTL;
        this.pTL = pTL;
        this.smartTL = smartTL;
        this.stuhlTL = stuhlTL;
        this.tTL = tTL;
        this.wTL = wTL;
    }

    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator(HausListe.getInstance(), DozentListe.getInstance(), BeamerTypListe.getInstance(),KameraTypListe.getInstance(),KreidetafelTypListe.getInstance(),LautsprecherTypListe.getInstance(),MikrofonTypListe.getInstance(),PCTypListe.getInstance(),SmartboardTypListe.getInstance(),StuhlTypListe.getInstance(),TischTypListe.getInstance(),WhiteboardTypListe.getInstance());
        }
        return instance;
    }

    public static void setInstance(ServiceLocator instance) {
        ServiceLocator.instance = instance;
    }

    public HausListe getHausliste() {
        return hl;
    }

    public PersistenzIF getPersistenz(){
        return PersistenzDB.getInstance();
    }



    //TODO @Ben ist das so richtig? Oder muss hier auch irgendwie mit IFs gearbeitet werden?
    public DozentListe getDozentenListe() {      return dl;    }

    public BeamerTypListe getBeamerTypen() {
        return bTL;
    }

    public KameraTypListe getKameraTypen() {
        return kameraTL;
    }

    public KreidetafelTypListe getKreideTypen() {
        return kreideTL;
    }

    public LautsprecherTypListe getLautsprecherTypen() {
        return lTL;
    }

    public MikrofonTypListe getMikrofonTypen() {
        return mTL;
    }

    public PCTypListe getPCTypen() {
        return pTL;
    }

    public SmartboardTypListe getSmartboardTypen() {
        return smartTL;
    }

    public StuhlTypListe getStuhlTypen() {
        return stuhlTL;
    }

    public TischTypListe getTischTypen() {
        return tTL;
    }

    public WhiteboardTypListe getWhiteboardTypen() {
        return wTL;
    }
}

