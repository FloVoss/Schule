package LS08_Flohan.src.Figuren;

public class Rechteck extends Figur2D {
    private double hoehe;
    private double breite;

    private void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    private void setBreite(double breite) {
        this.breite = breite;
    }
    
    public double getHoehe() {
        return hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public Rechteck(double hoehe, double breite) {
        setHoehe(hoehe);
        setBreite(breite);
    }

    @Override
    public double flaeche() {
        return hoehe * breite;
    }

    @Override
    public double umfang() {
        return 2 * (hoehe + breite);
    }

}
