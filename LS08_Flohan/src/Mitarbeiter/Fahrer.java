package Mitarbeiter;

import Fuhrpark.Gps;
import Fuhrpark.Kfz;

public class Fahrer extends Schichtarbeiter {
    public String fuehrerscheinKlasse;

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