package strategy;

public class test {
    public static void main(String[] args) {
        IEntpacken enpacken = new Rar(); // new Zip()         new Pdf()

        //Packen
        System.out.println(enpacken.packen("Packen"));

        //Entpacken
        System.out.println(enpacken.entpacken("Entpacken"));

        IchBinEinzigartig.getInstance().setSpeicherort(2.5);

        IchBinEinzigartig.getInstance().getSpeicherort();
    }
}

