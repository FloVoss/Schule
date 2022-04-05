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
    
    public Dreieck(double a, double b, double c) {
        if (isKonstruierbar(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
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
        return a + b > c && b + c > a && a + c > b;
    }
}
