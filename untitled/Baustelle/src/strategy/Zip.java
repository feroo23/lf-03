package strategy;

public class Zip implements IEntpacken{
    @Override
    public String entpacken(String data) {
        String i = data;
        return i;
    }

    @Override
    public String packen(String data) {
        String i = data +".zip";
        return i;
    }

}
