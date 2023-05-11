package dao;

public class Multimediagerät {

   public String Hersteller;
   public double Aufpreis;
   public boolean USB;

    public Multimediagerät(String hersteller, double aufpreis, boolean USB) {
        Hersteller = hersteller;
        Aufpreis = aufpreis;
        this.USB = USB;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public double getAufpreis() {
        return Aufpreis;
    }

    public void setAufpreis(double aufpreis) {
        Aufpreis = aufpreis;
    }

    public boolean isUSB() {
        return USB;
    }

    public void setUSB(boolean USB) {
        this.USB = USB;
    }

    @Override
    public String toString() {
        return "Multimediagerät{" +
                "Hersteller='" + Hersteller + '\'' +
                ", Aufpreis=" + Aufpreis +
                ", USB=" + USB +
                '}';
    }
}
