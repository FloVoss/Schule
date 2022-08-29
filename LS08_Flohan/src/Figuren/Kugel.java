package Figuren;

public class Kugel implements IFigur3D{
    private double radius;
    public Kugel(double radius) {
        this.radius = radius;
    }
    @Override
    public double volumen() {
        return 4.00/3.00 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double oberflaeche() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
}
