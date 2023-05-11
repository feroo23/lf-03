package strategy;

public class IchBinEinzigartig {
    private static IchBinEinzigartig instance;
    private double speicherort;
    private IchBinEinzigartig(){};

    public static IchBinEinzigartig getInstance() {
        if (instance == null){
            instance = new IchBinEinzigartig();
        }
        return instance;
    }

    public double getSpeicherort() {
        return speicherort;
    }

    public void setSpeicherort(double speicherort) {
        this.speicherort = speicherort;
    }
}
