package Figuren;

public abstract class Pyramidenartig<T extends IFigur2D> implements IFigur3D, IMantelflaeche{
    T grundflaeche;
    double hoehe;
    public Pyramidenartig(T grundflaeche, double hoehe) {
        super();
        this.grundflaeche = grundflaeche;
        this.hoehe = hoehe;
    }
    @Override
    public double oberflaeche() {
        return grundflaeche.flaeche() + this.mantelFlaeche();
    }

    @Override
    public double volumen() {
        return grundflaeche.flaeche() * hoehe / 3.00;
    }
}
