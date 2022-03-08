package fahrzeug;

public class Lkw implements IFahrbar{

    @Override
    public void beschleunigen() {
        System.out.println("Lkw git gas");
    }

    @Override
    public void bremsen() {
        System.out.println("Lkw bremst");
    }
}
