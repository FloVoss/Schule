package LS08_Flohan.src.Figuren;


public class Dreieck implements IFigur2D {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        if (isKonstruierbar(a, this.b, this.c)) {
            this.a = a;
        }
    }

    public void setB(double b) {
        if (isKonstruierbar(this.a, b, this.c)) {
            this.b = b;
        }
    }

    public void setC(double c) {
        if(isKonstruierbar(this.a, this.b, c)) {
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public Dreieck(double a, double b, double c) {
        if (isKonstruierbar(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else
        {
            throw new IllegalArgumentException("falsche argumente");
        }
    }

    @Override
    public double flaeche() {
        double s = umfang() /2.00;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double umfang() {

        return a + b + c;
    }

    public static boolean isKonstruierbar(double a, double b, double c) {
        if(!( a > 0 || b > 0 || c > 0)) {
            throw new IllegalArgumentException("Stellen Sie sicher, dass immer 2 Seitenlänge zusammen größer als die Dritte !");
        }
        boolean x = a < (b + c) && b < (a + c) && c < (a + b);
        return x;
    }
}
