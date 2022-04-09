package src.Figuren;

public class Rechteck {

    private double laenge = 0.0;
    private double breite = 0.0;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getlaenge() {
        return this.laenge;
    }

    private void setlaenge(double laenge) {
        if (laenge > 0) {
            this.laenge = laenge;
        } else {
            System.out.println("Falsche Eingabe,Geben Sie einen richtigen Wert ein !!!");
        }
    }

    public double getBreite() {
        return this.breite;
    }

    private void setBreite(double breite) {
        if (breite > 0) {
            this.breite = breite;
        } else {
            System.out.println("Falsche Eingabe,Geben Sie einen richtigen Wert ein !!!");
        }
    }

    public double umfang() {
        return (laenge + breite) * 2;
    }

    public double flaeche() {
        return laenge * breite;
    }
}
