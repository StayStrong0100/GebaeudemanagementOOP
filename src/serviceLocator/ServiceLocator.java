package serviceLocator;

import ausstattung.*;
import buchung.DozentListe;
import buchung.DozentListeIF;
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

    private ServiceLocator(HausListe hl, DozentListe dl, BeamerTypListe bTL, KameraTypListe kameraTL, KreidetafelTypListe kreideTL, LautsprecherTypListe lTL, MikrofonTypListe mTL, PCTypListe pTL, SmartboardTypListe smartTL, StuhlTypListe stuhlTL, TischTypListe tTL, WhiteboardTypListe wTL) {
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
            instance = new ServiceLocator(HausListe.getInstance(), DozentListe.getInstance(), BeamerTypListe.getInstance(), KameraTypListe.getInstance(), KreidetafelTypListe.getInstance(), LautsprecherTypListe.getInstance(), MikrofonTypListe.getInstance(), PCTypListe.getInstance(), SmartboardTypListe.getInstance(), StuhlTypListe.getInstance(), TischTypListe.getInstance(), WhiteboardTypListe.getInstance());
        }
        return instance;
    }

    public static void setInstance(ServiceLocator instance) {
        ServiceLocator.instance = instance;
    }

    public HauslisteIF getHausliste() {
        return hl;
    }

    public PersistenzIF getPersistenz() {
        return PersistenzDB.getInstance();
    }

    public DozentListeIF getDozentenListe() {
        return dl;
    }

    public BeamerTypListeIF getBeamerTypen() {
        return bTL;
    }

    public KameraTypListeIF getKameraTypen() {
        return kameraTL;
    }

    public KreidetafelTypListeIF getKreideTypen() {
        return kreideTL;
    }

    public LautsprecherTypListeIF getLautsprecherTypen() {
        return lTL;
    }

    public MikrofonTypListeIF getMikrofonTypen() {
        return mTL;
    }

    public PCTypListeIF getPCTypen() {
        return pTL;
    }

    public SmartboardTypListeIF getSmartboardTypen() {
        return smartTL;
    }

    public StuhlTypListeIF getStuhlTypen() {
        return stuhlTL;
    }

    public TischTypListeIF getTischTypen() {
        return tTL;
    }

    public WhiteboardTypListeIF getWhiteboardTypen() {
        return wTL;
    }
}

