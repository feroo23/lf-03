public class Person {

    public String vorname;
    public String nachname;
    public int alter;
    public String ausweisNr;

    public Person(String vorname, String nachname, int alter, String ausweisNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.ausweisNr = ausweisNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String toString() {


        return "Vorname: " + getVorname() + "\n" +
                "Nachname: " + getNachname() + "\n"+
                "Alter: " + getAlter() + "\n" +
                "AusweisNr: " + getAusweisNr();
    }
}
