package Regal;

public class Kiste extends Behaelter {

    private double laenge;
    private double breite;

    public Kiste(String behaelterNr, double grwichtBehalter, double gewichtInhaltMax, double gewichtInhalt, double hoehe, double laenge, double breite) {
        super(behaelterNr, grwichtBehalter, gewichtInhaltMax, gewichtInhalt, hoehe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        String text = "Kiste" +
        return "Kiste{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                '}';
    }
}
