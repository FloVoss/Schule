package src.Fuhrpark;

import java.util.List;

import src.Mitarbeiter.Fahrer;
import src.Mitarbeiter.Mitarbeiter;

public class Personentransportfahrzeug extends Kfz{
    private List<Mitarbeiter> passagiere;
    private int sitze;
    
    private void setSitze(int sitze) {
        this.sitze = sitze; 
    }

    public int getSitze() {
        return sitze;
    }

    public Personentransportfahrzeug(double tankGroesse, Gps aktuellePosition, int sitze) {
        super(tankGroesse, aktuellePosition);
        setSitze(sitze);
    }

    public void einsteigen(Mitarbeiter passagier) {
        if (sitze <= 20) {
            passagiere.add(passagier);
        } else {
            System.out.println("Das KFZ ist voll !!!, die maximale Sitzanzahl ist: " + sitze);
        }
    }

    @Override
    public void einsteigenFahrer(Fahrer fahrer) {
        super.einsteigenFahrer(fahrer);
    }

    public void parken() {
        passagiere = null;
    }

    public Mitarbeiter aussteigen(int vonSitzplatz, Mitarbeiter person) {
        if (vonSitzplatz > 0 && vonSitzplatz <= sitze) {
            passagiere.remove(person);
        }
        return person;
    }

    public double auslastung() {
        return getSitze() / 100; 
    }
}
