package fuhrpark.src;

public abstract class Kfz {
    private double tankGroesse;
    private double tankInhalt;
    private boolean motorAn = false;
    private int geschwindigkeit = 0;
    private Fahrer fahrer = null;
    private Gps aktuellePosition;

    private void setTankGroesse(double tankGroesse) {
        if (tankGroesse < 45) {
            throw new IllegalArgumentException("Das ist zu wenig für ein KFZ !!!");
        } else if (tankGroesse > 65) {
            throw new IllegalArgumentException("Das ist zu viel für ein KFZ !!!");
        } else {
            this.tankGroesse = tankGroesse;
        }
    }

    private void setTankInhalt(double tankInhalt) {
        if (tankInhalt <= this.tankGroesse) {
            this.tankInhalt = tankInhalt;
        } else {
            throw new IllegalArgumentException("Beachten Sie, dass die maximale Tankgroesse ist " + this.tankGroesse + "!!!");
        }
    }

    private void setGeschwindigkeit(int geschwindigkeit) {
        if (geschwindigkeit > 0) {
            this.geschwindigkeit = geschwindigkeit;
        } else {
            throw new IllegalArgumentException("Die Geschwindigkeit ist ungültig !!!");
        }
    }

    private void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    private void setAktuellePosition(Gps position) {
        aktuellePosition = position;
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
        if (fahrer != null) {
            motorAn = true;
            aktuellePosition = ziel;
        } else {
            throw new NoDriverException("Es gibt keinen Fahrer !!!");
        }
    }

    public void parken() {
        if (motorAn) {
            geschwindigkeit = 0;
            motorAn = false;
            fahrer = null;
        } else {
            throw new IllegalArgumentException("Motor ist aus !!!");
        }
    }

    public void tanken(double liter) {
        if (liter <= tankGroesse) {
            liter = tankGroesse;
        } else {
            throw new IllegalArgumentException("Das KFZ ist voll getankt!!!");
        }
    }

    public void einsteigenFahrer(Fahrer fahrer) {
        if (this.fahrer == null) {
            this.fahrer = fahrer;
        } else {
            throw new IllegalArgumentException("Der Fahrer ist schon eingestiegen !!!");
        }
    }

    public abstract double auslastung();
}
