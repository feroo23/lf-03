package Regal;

public class Test {

    public static void main(String[] args) {
    Kiste k1 = new Kiste("001",50,1000,567,80.8,120.50,90.5);
    Kiste k2 = new Kiste("002",45,1500,450,1.20,3.50,6.5);
    Adresse a1 = new Adresse("Satler-Meta-str","23-35","Bremen","Bremen");
    Lagerhalle l1 = new Lagerhalle("Effos",a1);
    Regal r1 = new Regal(l1);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(a1);
        System.out.println(l1);
        System.out.println(r1);
    }
}
