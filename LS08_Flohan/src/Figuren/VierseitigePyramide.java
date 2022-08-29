package Figuren;

public class VierseitigePyramide extends Pyramidenartig<Rechteck> {
    public VierseitigePyramide(Rechteck grundflaeche, double hoehe) {
        super(grundflaeche, hoehe);
    }
    @Override
    public double mantelFlaeche() {
        double diagonaleGrundflaeche = Math.sqrt((Math.pow(grundflaeche.getBreite(), 2) + Math.pow(grundflaeche.getHoehe(), 2)));
        double seitenLaenge = Math.sqrt((Math.pow(hoehe, 2) + Math.pow((diagonaleGrundflaeche / 2.00), 2)));
        return (new Dreieck(seitenLaenge, seitenLaenge, grundflaeche.getBreite()).flaeche() + new Dreieck(seitenLaenge, seitenLaenge, grundflaeche.getHoehe()).flaeche()) * 2;
        
    }
}
