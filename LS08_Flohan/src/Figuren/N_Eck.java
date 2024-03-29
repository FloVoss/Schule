package Figuren;

public class N_Eck implements IFigur2D {
    private double seitenLaenge;
    private int anzahlSeiten;

    private void setSeitenLaenge(double seitenLaenge) {
        if(seitenLaenge > 0) {
            this.seitenLaenge = seitenLaenge;
        }
    }

    private void setAnzahlSeiten(int anzahlSeiten) {
        if(anzahlSeiten > 1) {
            this.anzahlSeiten = anzahlSeiten;
        }
    }
    
    public double getSeitenLaenge() {
        return seitenLaenge;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public N_Eck(double seitenLaenge, int anzahlSeiten) {
        setSeitenLaenge(seitenLaenge);
        setAnzahlSeiten(anzahlSeiten);
    }

    @Override
    public double flaeche() {
        double temp = aussenKreisRadius();
        try {
            return new Dreieck(temp, temp, seitenLaenge).flaeche() * anzahlSeiten;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return 0.0;
        }

    }

    @Override
    public double umfang() {
        double temp = aussenKreisRadius();
        try {
            return new Dreieck(temp, temp, seitenLaenge).flaeche() * anzahlSeiten;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return 0.0;
        }
    }

    public double innenKreisRadius() {
        return seitenLaenge / (2 * Math.tan(Math.PI / anzahlSeiten));
    }

    public double aussenKreisRadius() {
        return seitenLaenge / (2 * Math.sin(Math.PI / anzahlSeiten));
    }

}
