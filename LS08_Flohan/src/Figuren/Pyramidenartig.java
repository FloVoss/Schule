package LS08_Flohan.src.Figuren;

public abstract class Pyramidenartig<T extends IFigur2D> extends Figur3D<T> implements IMantelflaeche{
    public Pyramidenartig(T grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }
    @Override
    public double oberflaeche() {
        double flaeche = grundflaeche.flaeche();
        double mantel = this.mantelFlaeche();
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
