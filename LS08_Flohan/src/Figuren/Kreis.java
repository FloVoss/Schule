package LS08_Flohan.src.Figuren;

public class Kreis {

    private double radius = 0.0;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Falsche Eingabe,Geben Sie einen richtigen Wert ein !!!");
        }
    }

    public double umfang() {
        return 2 * Math.PI * radius;
    }

    public double flaeche() {
        return Math.PI * Math.pow(radius, 2);
    }
}
