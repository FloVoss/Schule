package LS08_Flohan.src.Figuren;

public class Kugel extends Figur3D<Kreis>{
    public Kugel(Kreis grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }
    @Override
    public double volumen() {
        double flaeche = grundflaeche.flaeche();
        double hoehe = this.hoehe;
        double something = 4.00/3.00;
        return something * hoehe * flaeche;
    }

    @Override
    public double oberflaeche() {
        return 2 * hoehe * grundflaeche.umfang();
    }
    
}
