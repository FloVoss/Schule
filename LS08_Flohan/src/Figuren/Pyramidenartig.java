package LS08_Flohan.src.Figuren;

public abstract class Pyramidenartig<T extends IFigur2D> implements Figur3D, IMantelflaeche{
    T grundflaeche;
    double hoehe;
    public Pyramidenartig(T grundflaeche, double hoehe) {
        super();
        this.grundflaeche = grundflaeche;
        this.hoehe = hoehe;
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
