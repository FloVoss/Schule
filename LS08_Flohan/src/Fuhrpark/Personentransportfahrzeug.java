package LS08_Flohan.src.Fuhrpark;

import java.util.ArrayList;
import java.util.List;

import LS08_Flohan.src.Mitarbeiter.Fahrer;
import LS08_Flohan.src.Mitarbeiter.Mitarbeiter;

public class Personentransportfahrzeug extends Kfz {
    private List<Mitarbeiter> passagiere;
    private int sitze;

    public List<Mitarbeiter> getPassagiere() {
        return passagiere;
    }

    private void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public int getSitze() {
        return sitze;
    }

    public Personentransportfahrzeug(double tankGroesse, Gps aktuellePosition, int sitze) {
        super(tankGroesse, aktuellePosition);
        setSitze(sitze);
        passagiere = new ArrayList<Mitarbeiter>();
    }

    public void einsteigen(Mitarbeiter passagier) {
        if (sitze > passagiere.size()) {
            passagiere.add(passagier);
        } else {
            System.out.println("Das KFZ ist voll !!!, die maximale Sitzanzahl ist: " + sitze);
        }
    }

    @Override
    public void einsteigenFahrer(Fahrer fahrer) {
        if (fahrer.fuehrerscheinKlasse.startsWith("B")) {
            super.einsteigenFahrer(fahrer);
        } else {
            System.out.println("Sie haben keinen gültigen Führerschein um Personen zu befördern");
        }
    }

    @Override
    public void parken() {
        int index = 0;
        super.parken();
        if (passagiere.size() > 0) {
            for (Mitarbeiter passagier : passagiere) {
                aussteigen(index++);
            }
        }
    }

    public Mitarbeiter aussteigen(int vonSitzplatz) {
        if (vonSitzplatz > 0 && vonSitzplatz <= passagiere.size()) {
            Mitarbeiter aussteiger = passagiere.get(vonSitzplatz - 1);
            passagiere.remove(vonSitzplatz - 1);
            return aussteiger;
        }
        System.out.println("dieser sitz ist entweder nicht belegt oder existiert nicht in dem Auto");
        return null;
    }

    public double auslastung() {
        return passagiere.size() / sitze;
    }
}
