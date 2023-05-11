package Regal;

public class RegalNichtGefundenExeption extends Exception {

    private String behaelterNr;

    public RegalNichtGefundenExeption(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public RegalNichtGefundenExeption(String message, String behaelterNr) {
        super(message);
        this.behaelterNr = behaelterNr;
    }
}
