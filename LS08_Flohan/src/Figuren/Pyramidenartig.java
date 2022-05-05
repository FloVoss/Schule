package LS08_Flohan.src.Figuren;

public abstract class Pyramidenartig<T extends Figur2D> extends Figur3D<T>{
    Mantelflaeche mantelflaeche;
    public Pyramidenartig(T grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }
    @Override
    public double oberflaeche() {
        double flaeche = grundflaeche.flaeche();
        double mantel = mantelflaeche.mantelFlaeche();
        double oberflaeche = flaeche + mantel;
        return oberflaeche;
    }

    @Override
    public double volumen() {
        double flaeche = grundflaeche.flaeche();
        double höhe = hoehe;
        double volumen = flaeche * höhe / 3.00;
        return volumen;
    }
}
