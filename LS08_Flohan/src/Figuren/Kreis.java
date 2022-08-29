package Figuren;

public class Kreis implements IFigur2D{
    private double radius;

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis(double radius) {
        setRadius(radius);
    }

    @Override
    public double flaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double umfang() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
