package Regal;

public class Tonne extends Behaelter {

    private double durchmesser;

    public Tonne(String behaelterNr, double grwichtBehalter, double gewichtInhaltMax, double gewichtInhalt, double hoehe, double durchmesser) {
        super(behaelterNr, grwichtBehalter, gewichtInhaltMax, gewichtInhalt, hoehe);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "Tonne{" +
                "durchmesser=" + durchmesser +
                '}';
    }
}
