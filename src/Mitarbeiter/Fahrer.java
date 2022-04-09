package src.Mitarbeiter;

import src.Fuhrpark.Gps;
import src.Fuhrpark.Kfz;

public class Fahrer extends Schichtarbeiter {
    private String fuehrerscheinKlasse;

    private void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
        this.fuehrerscheinKlasse = fuehrerscheinKlasse;
    }

    public String getFuehrerscheinKlasse() {
        return fuehrerscheinKlasse;
    }

    public Fahrer(int id, String name, String fuehrerscheinKlasse) {
        super(id, name);
        this.setFuehrerscheinKlasse(fuehrerscheinKlasse);
    }

    public void fahrenZu(Kfz fahrzeug, Gps ziel) {
        fahrzeug.fahrenZu(ziel);
    }
}