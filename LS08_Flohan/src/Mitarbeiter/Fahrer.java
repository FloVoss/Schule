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

    public Fahrer(int id, String name, String fuehrerscheinKlasse, double stundenSatz, int stunden) {
        super(id, name, stundenSatz, stunden);
        this.setFuehrerscheinKlasse(fuehrerscheinKlasse);
    }

    public Fahrer(int id, String name, String fuerhrerscheinKlasse, double stundenSatz) {
        super(id, name, stundenSatz);
    }

    public void fahrenZu(Kfz fahrzeug, Gps ziel) {
        fahrzeug.fahrenZu(ziel);
    }
}