package fahrzeug;

public class Programm {

    public static void main(String[] args) {
        Pkw pkw = new Pkw();
        Flugzeug flugzeug = new Flugzeug();
        Hubschrauber hubschrauber = new Hubschrauber();
        Motorad motorad = new Motorad();
        Lkw lkw = new Lkw();

        pkw.beschleunigen();
        pkw.bremsen();

        flugzeug.beschleunigen();
        flugzeug.bremsen();
        flugzeug.starten();
        flugzeug.landen();

        hubschrauber.starten();
        hubschrauber.landen();

        motorad.beschleunigen();
        motorad.bremsen();

        lkw.beschleunigen();
        lkw.bremsen();
    }
}
