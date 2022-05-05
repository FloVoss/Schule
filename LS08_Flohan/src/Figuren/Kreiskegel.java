package LS08_Flohan.src.Figuren;

/**
 * Kreiskegel
 */
public class Kreiskegel extends Pyramidenartig<Kreis> {
    public Kreiskegel(Kreis grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }

    @Override
    public double mantelFlaeche() {
        double seitenLaenge = Math.sqrt((Math.pow(hoehe, 2) + Math.pow(grundflaeche.getRadius(), 2)));
        return grundflaeche.getRadius() * seitenLaenge * Math.PI;
    }

}