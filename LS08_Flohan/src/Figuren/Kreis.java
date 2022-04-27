package LS08_Flohan.src.Figuren;

public class Kreis extends Figur2D{
    private double radius;

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis(double radius) {
        setRadius(radius);
    }

    @Override
    public double flaeche() {
        return Math.PI * radius;
    }

    @Override
    public double umfang() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
