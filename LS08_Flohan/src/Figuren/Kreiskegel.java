package LS08_Flohan.src.Figuren;

/**
 * Kreiskegel
 */
public class Kreiskegel extends Pyramidenartig<Kreiskegel, Kreis>{

    public Kreiskegel(Kreis grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }

    @Override
    public double oberflaeche() {
        return super.oberflaeche();
    }

    @Override
    public double volumen() {
        return super.volumen();
    }

    @Override
    public double flaeche(Kreiskegel pyramide) {
        
        return 0;
    }

}