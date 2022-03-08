package fahrzeug;

public class Pkw implements IFahrbar{

    @Override
    public void beschleunigen() {
        System.out.println("Pkw Gibt Gas");
    }

    @Override
    public void bremsen() {
        System.out.println("Pkw Bremst");

    }
}
