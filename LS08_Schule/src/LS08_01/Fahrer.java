package LS08_01;

public class Fahrer extends SchichtArbeiter {
    private String fuehrerscheinKlasse = 'B';
    private Gas_position gps_position_aktuell;
    private Gas_position gps_position_ziel;

    public int getFuehrerscheinKlasse() {
        return fuehrerscheinKlasse;
    }

    public void setFuehrerscheinKlasse(String klasse) {
        this.fuehrerscheinKlasse = klasse;
    }
}
