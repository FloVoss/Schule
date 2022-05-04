package LS08_Flohan.src.Figuren;

public abstract class Pyramidenartig<T extends Mantelflaeche<T>, x extends Figur2D> extends Figur3D<x> implements Mantelflaeche<T> {
    public Pyramidenartig(x grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }

    @Override
    public double oberflaeche() {
        return (grundflaeche.flaeche() * hoehe)/3.00;
        
    }

    @Override
    public double volumen() {
        Mantelflaeche<T> mf 
        return grundflaeche.flaeche() + new Mantelflaeche<T>();
    }
    
}
