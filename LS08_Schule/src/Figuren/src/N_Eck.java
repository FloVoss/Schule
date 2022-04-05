public class N_Eck extends Figur2D {
    private double seitenLaenge;
    private int anzahlSeiten;

    private void setSeitenLaenge(double seitenLaenge) {
        this.seitenLaenge = seitenLaenge;
    }

    private void setAnzahlSeiten(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
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
    public double umfang() {
        return seitenLaenge * anzahlSeiten;
    }

    @Override
    public double flaeche() {
        double umkreisRadius = seitenLaenge/(2 * Math.sin(Math.PI/anzahlSeiten));
        double s = (seitenLaenge + (umkreisRadius * 2)) / 2;
        return Math.sqrt(s * (s-seitenLaenge) * (s-umkreisRadius) * (s-umkreisRadius)) * anzahlSeiten;
    }

}
