package LS08_Flohan.src.Figuren;

import java.io.FileNotFoundException;
import java.io.InvalidObjectException;

public class Dreieck extends Figur2D {
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
    
    public Dreieck(double a, double b, double c) throws InvalidObjectException{
        if (isKonstruierbar(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else
        {
            throw new InvalidObjectException("falsche argumente");
        }
    }

    @Override
    public double flaeche() {
        int s = (int) umfang() /2;
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
