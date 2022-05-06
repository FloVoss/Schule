package LS08_Flohan.src.Fuhrpark;

import LS08_Flohan.src.Mitarbeiter.Fahrer;

import java.util.List;

public class Lkw extends Kfz implements Comparable<Lkw> {
    private double ladeFlaeche;
    private double ladung;

    private void setLadeFlaeche(double ladeFlaeche) {
        this.ladeFlaeche = ladeFlaeche;
    }

    public double getLadeFlaeche() {
        return this.ladeFlaeche;
    }

    public Lkw(double tankGroesse, Gps aktuellePosition, double ladeFlaeche) {
        super(tankGroesse, aktuellePosition);
        setLadeFlaeche(ladeFlaeche);
    }

    public void beladen(double menge) {
        if (ladung <= ladeFlaeche)
            ladung += menge;
    }

    public void entladen(double menge) {
        if(menge <= ladung && menge > 0)
        {
            ladung -= menge;
        }
    }

    @Override
    public void einsteigenFahrer(Fahrer fahrer) {
        if (fahrer.fuehrerscheinKlasse.toUpperCase().startsWith("C")) {
            super.einsteigenFahrer(fahrer);
        } else {
            System.out.println("Sie haben keinen gültigen Führerschein um Personen zu befördern");
        }
    }

    @Override
    public double auslastung() {
        return ladeFlaeche / 100;
    }

    @Override
    public int compareTo(Lkw o) {
        return 0;
    }
}
