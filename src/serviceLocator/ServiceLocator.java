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

    private HauslisteIF hl;
    private DozentListeIF dl;

    private PersistenzIF p;

    private BeamerTypListeIF bTL;
    private KameraTypListeIF kameraTL;
    private KreidetafelTypListeIF kreideTL;
    private LautsprecherTypListeIF lTL;
    private MikrofonTypListeIF mTL;
    private PCTypListeIF pTL;
    private SmartboardTypListeIF smartTL;
    private StuhlTypListeIF stuhlTL;
    private TischTypListeIF tTL;
    private WhiteboardTypListeIF wTL;

    private static ServiceLocator instance;

    private ServiceLocator() {
        p = PersistenzDB.getInstance();
        hl = HausListe.getInstance();
        dl = DozentListe.getInstance();
        bTL = BeamerTypListe.getInstance();
        kameraTL = KameraTypListe.getInstance();
        kreideTL = KreidetafelTypListe.getInstance();
        lTL = LautsprecherTypListe.getInstance();
        mTL = MikrofonTypListe.getInstance();
        pTL = PCTypListe.getInstance();
        smartTL = SmartboardTypListe.getInstance();
        stuhlTL = StuhlTypListe.getInstance();
        tTL = TischTypListe.getInstance();
        wTL = WhiteboardTypListe.getInstance();
    }

    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }


    public HauslisteIF getHausliste() {
        return hl;
    }

    public void speicherAlleContainer(String dateiname, ServiceLocator sl) {
        p.speichern(dateiname, sl);
    }

    public ServiceLocator ladeAlleContainer(String dateiname) {
        ServiceLocator sl = p.lade(dateiname);
        return sl;
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

