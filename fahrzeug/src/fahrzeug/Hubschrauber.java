package fahrzeug;

public class Hubschrauber implements IFliegbar {

    @Override
    public void starten() {
        System.out.println("Hubschrauber Start");
    }

    @Override
    public void landen() {
        System.out.println("Hubschrauber ladnen");
    }
}
