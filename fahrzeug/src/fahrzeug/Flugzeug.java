package fahrzeug;

public class Flugzeug  implements IFliegbar,IFahrbar{

    @Override
    public void starten() {
        System.out.println("Flugzeug start");
    }

    @Override
    public void landen() {
        System.out.println("Flugzeug Laden");
    }

    @Override
    public void beschleunigen() {
        System.out.println("Flugzeug fährt");
    }

    @Override
    public void bremsen() {
        System.out.println("Flugzeug Bremst");
    }
}

