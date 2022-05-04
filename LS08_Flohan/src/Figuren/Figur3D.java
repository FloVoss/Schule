package LS08_Flohan.src.Figuren;

public abstract class Figur3D<T extends Figur2D>{
    T grundflaeche;
    double hoehe;
    public Figur3D(T grundflaeche, double hoehe) {
        this.hoehe = hoehe;
        this.grundflaeche = grundflaeche;
    }
    public abstract double volumen();
    public abstract double oberflaeche();
}
