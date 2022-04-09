package Punkt;

public class Punkt {
    private double x = 0.0;
    private double y = 0.0;

    private boolean setX(double x) {
        if (x >= -100 && x <= 100) {
            this.x += x;
            return true;
        }
        return false;
    }

    private boolean setY(double y) {
        if (y >= -100 && y <= 100) {
            this.y += y;
            return true;
        }
        return false;
    }

    public void verschiebe(double plusX, double plusY) {
        if (setX(plusX) && setY(plusY)) {
            System.out.println("Values: " + this.x + ", " + this.y);
        } else {
            System.out.println("Falsches Ergebnis, probieren Sie noch ein mal !!!");
        }
    }
}
