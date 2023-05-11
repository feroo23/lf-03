package dao;

public class Motor {
   public String Treibstoff;
   public int PS;
   public double Hubraum;
   public int AnzZylinder;

    public Motor(String treibstoff, int PS, double hubraum, int anzZylinder) {
        Treibstoff = treibstoff;
        this.PS = PS;
        Hubraum = hubraum;
        AnzZylinder = anzZylinder;
    }

    public String getTreibstoff() {
        return Treibstoff;
    }

    public void setTreibstoff(String treibstoff) {
        Treibstoff = treibstoff;
    }



    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public double getHubraum() {
        return Hubraum;
    }

    public void setHubraum(double hubraum) {
        Hubraum = hubraum;
    }

    public int getAnzZylinder() {
        return AnzZylinder;
    }

    public void setAnzZylinder(int anzZylinder) {
        AnzZylinder = anzZylinder;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "Treibstoff='" + Treibstoff + '\'' +
                ", PS=" + PS +
                ", Hubraum=" + Hubraum +
                ", AnzZylinder=" + AnzZylinder +
                '}';
    }
}
