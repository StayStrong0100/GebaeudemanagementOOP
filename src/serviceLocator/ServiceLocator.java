package serviceLocator;

import ausstattung.*;
import buchung.*;
import datenspeicherung.*;
import verwaltung.*;
import java.io.Serializable;

public class ServiceLocator implements Serializable {
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
    private int countAusstattung;
    private int countTerminbuchung;
    private static ServiceLocator instance;

    private ServiceLocator() {
        hl = HausListe.getInstance();
        dl = DozentListe.getInstance();
        p = PersistenzDB.getInstance();
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

    public static void setInstance(ServiceLocator instance) {
        ServiceLocator.instance = instance;
    }

    public HauslisteIF getHausliste() {
        return hl;
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

    /**
     * Speichert den ServiceLocator mit allen seinen Attributen in einer Datei ab
     * Auch die Counts von Terminbuchung und Ausstattung werden übergeben, damit bei Neustart die IDs richtig weitergezählt werden
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name, die die gespeicherte Datei bekommt
     * @param sl ServiceLocator, der gespeichert werden soll
     */
    public void speicherAlleContainer(String dateiname, ServiceLocator sl){
        this.countAusstattung = Ausstattungsmerkmal.getCount();
        this.countTerminbuchung = Terminbuchung.getCount();
        p.speichern(dateiname, sl);
    }

    /**
     * Liest den ServiceLocator aus einer Datei aus
     * Auch die Counts von Terminbuchung und Ausstattung werden übergeben, damit die IDs richtig weitergezählt werden
     *
     * @author Benjamin Kostka und David Brockmeyer
     *
     * @param dateiname Name der Datei, in welcher der ServiceLocator gespeichert wurde
     *
     * @return ausgelesenen ServiceLocator
     */
    public ServiceLocator ladeAlleContainer(String dateiname) {
        ServiceLocator sl = p.lade(dateiname);
        Ausstattungsmerkmal.setCount(p.lade(dateiname).countAusstattung);
        Terminbuchung.setCount(p.lade(dateiname).countTerminbuchung);
        return sl;
    }
}

