package kfz;

public class MainKfzstest {
    public static void main(String[] args) {
        Kfz bmw = new Kfz();

        bmw.setName("BMW-M2");
        bmw.setAnzahlSitze(4);
        bmw.setEnthaltenePersonen(2);
        bmw.setTankGroesse(60);
        bmw.setTankInhalt(35);
        bmw.setMaximaleGeschwindigkeit(320);
        bmw.setAktuelleGeschwindigkeit(180);
        bmw.setAnschaffungskosten(50000);

        bmw.ausgabe();
        bmw.beschleunigen();
        bmw.ausgabe();
    }
}
