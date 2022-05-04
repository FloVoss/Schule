package LS08_Flohan.src.Figuren;

public interface Mantelflaeche<T extends Mantelflaeche<T>>{
    
    public double flaeche(T pyramide);
}
