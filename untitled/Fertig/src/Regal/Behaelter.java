package Regal;

public abstract class Behaelter {

    private String behaelterNr;
    private double gewichtBehalter;
    private double gewichtInhaltMax;
    private double gewichtInhalt;
    private double hoehe;

    public Behaelter(String behaelterNr, double grwichtBehalter, double gewichtInhaltMax, double gewichtInhalt, double hoehe) {
        this.behaelterNr = behaelterNr;
        this.gewichtBehalter = grwichtBehalter;
        this.gewichtInhaltMax = gewichtInhaltMax;
        this.gewichtInhalt = gewichtInhalt;
        this.hoehe = hoehe;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public double getGewichtBehalter() {
        return gewichtBehalter;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public void setGewichtInhalt(double gewichtInhalt) {
        this.gewichtInhalt = gewichtInhalt;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Beharlter{" +
                "behaelterNr='" + behaelterNr + '\'' +
                ", grwichtBehalter=" + gewichtBehalter +
                ", gewichtInhaltMax=" + gewichtInhaltMax +
                ", gewichtInhalt=" + gewichtInhalt +
                ", hoehe=" + hoehe +
                '}';
    }
}
