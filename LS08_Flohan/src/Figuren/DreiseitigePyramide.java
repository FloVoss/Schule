package LS08_Flohan.src.Figuren;

/**
 * DreiseitigePyramide
 */
public class DreiseitigePyramide extends Pyramidenartig<Dreieck> implements Mantelflaeche{
    public DreiseitigePyramide(Dreieck grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
        super.mantelflaeche = this;
    }
    @Override
    public double mantelFlaeche() {
        double seitenHälften = 0.5 * Math.sqrt(2 * Math.pow(grundflaeche.getA(), 2) + 2 * Math.pow(grundflaeche.getC(), 2) - Math.pow(grundflaeche.getA(), 2));
        double seitenLaenge = Math.sqrt(Math.pow(hoehe, 2) + Math.pow(2 * seitenHälften, 2));
        return new Dreieck(seitenLaenge, seitenLaenge, grundflaeche.getA()).flaeche() + new Dreieck(seitenLaenge, seitenLaenge, grundflaeche.getB()).flaeche() + new Dreieck(seitenLaenge, seitenLaenge, grundflaeche.getC()).flaeche();
    }    
}