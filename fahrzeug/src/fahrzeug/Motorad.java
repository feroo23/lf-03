package fahrzeug;

public  class Motorad implements IFahrbar{


    @Override
    public void beschleunigen() {
        System.out.println("Motorad gibt gas");

    }

    @Override
    public void bremsen() {
        System.out.println("Motorad bremst");

    }
}
