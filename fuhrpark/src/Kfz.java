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
        }
    }

    public void parken() {
        if (motorAn) {
            geschwindigkeit = 0;
            motorAn = false;
            fahrer = null;
        }

    }

    public void tanken(double liter) {
        if (liter <= tankGroesse) {
            liter = tankGroesse;
        }
    }

    public void einsteigenFahrer(Fahrer fahrer) {
        if (fahrer == null) {
            this.fahrer = fahrer;
        } else {
            System.out.println("Der Fahrer ist schon eingestiegen !!!");
        }
    }

    public abstract double auslastung();
}
