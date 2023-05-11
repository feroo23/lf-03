package Regal;

import java.util.ArrayList;

public class Regal {
    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> behaelterListe;

    public Regal(Lagerhalle lagerhalle) {
        this.lagerhalle = lagerhalle;
    }


    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }
    public void addBehaelter(Behaelter beharlter){
        behaelterListe.add(beharlter);
    }

    public void removeBehaelter(Behaelter beharlter){
        behaelterListe.remove(beharlter);
    }

    public ArrayList<Behaelter> getBehaelterListe() {
        return behaelterListe;
    }

    public int getAnzahlBehaelter(){
        return behaelterListe.size();
    }

    public double getGewichtGesamt() {
        double x = 0;
        for (Behaelter b:behaelterListe) {
            x += b.getGewichtInhalt() + b.getGewichtBehalter();
        }
        return x;
    }


    @Override
    public String toString() {
        String text ="";
        return text;
    }
}
