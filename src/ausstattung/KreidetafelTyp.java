package ausstattung;

public class KreidetafelTyp {
    private boolean wandtafel;
    private boolean freitafel;
    private double breite;
    private double hoehe;

    public KreidetafelTyp(boolean wandtafel, boolean freitafel, double breite, double hoehe){
        this.wandtafel = wandtafel;
        this.freitafel = freitafel;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public boolean isWandtafel() {
        return wandtafel;
    }

    public void setWandtafel(boolean wandtafel) {
        this.wandtafel = wandtafel;
    }

    public boolean isFreitafel() {
        return freitafel;
    }

    public void setFreitafel(boolean freitafel) {
        this.freitafel = freitafel;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
}

