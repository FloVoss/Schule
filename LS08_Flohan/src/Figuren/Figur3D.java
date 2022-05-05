package LS08_Flohan.src.Figuren;

public abstract class Figur3D<T extends IFigur2D>{
    protected T grundflaeche;
    protected double hoehe;
    public abstract double volumen();
    public abstract double oberflaeche();
    public Figur3D(T grundflaeche, double hoehe) {
        this.grundflaeche = grundflaeche;
        this.hoehe = hoehe;
    }
}
