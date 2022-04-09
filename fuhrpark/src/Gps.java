package fuhrpark.src;

public class Gps {
    private double laengenGrad;
    private double breitenGrad;

    private void setLaengenGrad(double laengenGrad) {
        if (laengenGrad >= 0 && laengenGrad <= 360)
            this.laengenGrad = laengenGrad;
    }

    private void setBreitenGrad(double breitenGrad) {
        if (breitenGrad >= -90 && breitenGrad <= 90)
            this.breitenGrad = breitenGrad;
    }

    public double getLaengenGrad() {
        return this.laengenGrad;
    }

    public double getBreitenGrad() {
        return this.breitenGrad;
    }

    public Gps(double laengenGrad, double breitenGrad) {
        setLaengenGrad(laengenGrad);
        setBreitenGrad(breitenGrad);
    }
}
