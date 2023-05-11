package strategy;

public class Rar implements IEntpacken {
    @Override
    public String entpacken(String data) {
        String i = data;
        return i;
    }

    @Override
    public String packen(String data) {
        String i = data +".rar";
        return i;
    }
}
