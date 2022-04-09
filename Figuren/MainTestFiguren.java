package Figuren;

public class MainTestFiguren {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis(3.0);
        Rechteck rechteck1 = new Rechteck(3.4, 6.5);

        System.out.println(kreis1.flaeche());
        System.out.println(kreis1.umfang());

        System.out.println(rechteck1.flaeche());
        System.out.println(rechteck1.umfang());
    }
}