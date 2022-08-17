package LS08_Flohan.src.Figuren;

public abstract class GeraderPrisma<T extends IFigur2D> implements IFigur3D
{
    double hoehe;
    T grundflaeche;
    @Override
    public double oberflaeche() {
        return 2 * grundflaeche.flaeche() + grundflaeche.umfang() * hoehe;
    }
    @Override
    public double volumen() {
        return grundflaeche.flaeche() * hoehe;
    }
    public GeraderPrisma(T grundflaeche, double hoehe) {
        this.grundflaeche = grundflaeche;
        this.hoehe = hoehe;
    }
}