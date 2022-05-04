package LS08_Flohan.src.Figuren;

public abstract class GeraderPrisma<T extends Figur2D> extends Figur3D<T>
{
    @Override
    public double oberflaeche() {
        return 2 * grundflaeche.flaeche() + grundflaeche.umfang() * hoehe;
    }
    @Override
    public double volumen() {
        return grundflaeche.flaeche() * hoehe;
    }
    protected void setGrundflaeche(T grundflaeche) {
        this.grundflaeche = grundflaeche;
    }
    protected void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }    
    public GeraderPrisma(T grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }
}