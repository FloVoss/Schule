package Fuhrpark;

import Mitarbeiter.Fahrer;

public abstract class Kfz {
    private double tankGroesse;
    private double tankInhalt;
    private boolean motorAn = false;
    private int geschwindigkeit = 0;
    private Fahrer fahrer = null;
    private Gps aktuellePosition;

    private void setTankGroesse(double tankGroesse) {
        if (tankGroesse < 45) {
            System.out.println("Das ist zu wenig für ein KFZ !!!");
            this.tankGroesse = 45;
        } else if (tankGroesse > 65) {
            System.out.println("Das ist zu viel für ein KFZ !!!");
            this.tankGroesse = 65;
        } else {
            this.tankGroesse = tankGroesse;
        }
    }

    private void setTankInhalt(double tankInhalt) {
        if (tankInhalt <= this.tankGroesse) {
            this.tankInhalt = tankInhalt;
        } else {
            System.out.println("Beachten Sie, dass die maximale Tankgroesse ist " + this.tankGroesse + "!!!");
        }
    }

    private void setGeschwindigkeit(int geschwindigkeit) {
        if (geschwindigkeit > 0)
            this.geschwindigkeit = geschwindigkeit;
    }

    private void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    private void setAktuellePosition(Gps position) {
        aktuellePosition = position;
    }

    private void motorEinUndAusschalten(Boolean state) {
        this.motorAn = state;
    }

    private boolean isMotorAn() {
        return motorAn;
    }

    public double getTankGroesse() {
        return tankGroesse;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public Gps getAktuellePosition() {
        return aktuellePosition;
    }

    public Kfz(double tankGroesse, Gps aktuellePosition) {
        setTankGroesse(tankGroesse);
        setAktuellePosition(aktuellePosition);
    }

    public void fahrenZu(Gps ziel) {
        if(!motorAn) motorEinUndAusschalten(true);
        if (fahrer != null && motorAn) {
            setGeschwindigkeit(120);
            aktuellePosition = ziel;
        }
    }

    public void parken() {
        if (motorAn) {
            geschwindigkeit= 0;
            motorAn = false;
            fahrer = null;
        }
    }

    public void tanken(double liter) {
        if (liter <= tankGroesse) {
            tankInhalt = liter;
        }
    }

    public void einsteigenFahrer(Fahrer fahrer) {
        if (this.fahrer == null && fahrer.fuehrerscheinKlasse != null) {
            this.fahrer = fahrer;
        } else {
            System.out.println("Es sitzt schon ein Fahrer in dem Auto drin!");
        }
    }

    public abstract double auslastung();
}
