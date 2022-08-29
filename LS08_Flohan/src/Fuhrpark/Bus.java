package Fuhrpark;

import Mitarbeiter.Fahrer;

public class Bus extends Personentransportfahrzeug {
    public Bus(double tankGroesse, Gps aktuellePosition, int sitze) {
        super(tankGroesse, aktuellePosition, sitze);
    }
    @Override
    public void einsteigenFahrer(Fahrer fahrer) {
        if(fahrer.fuehrerscheinKlasse.startsWith("D")) {
            super.einsteigenFahrer(fahrer);
        } else {
            throw new IllegalArgumentException("Nur ein Fahrer mit der entsprechnden Führerscheinklasse fahren darf !");
        }
    }
}
