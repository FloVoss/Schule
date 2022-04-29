package LS08_Flohan.src;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import LS08_Flohan.src.Figuren.Dreieck;
import LS08_Flohan.src.Fuhrpark.Gps;
import LS08_Flohan.src.Fuhrpark.Kfz;
import LS08_Flohan.src.Fuhrpark.Lkw;
import LS08_Flohan.src.Fuhrpark.Personentransportfahrzeug;
import LS08_Flohan.src.Mitarbeiter.Abteilung;
import LS08_Flohan.src.Mitarbeiter.Fahrer;
import LS08_Flohan.src.Mitarbeiter.Manager;

/**
 * App class zum testen
 */
public class App {

    public static void main(String[] args) {
        Abteilung abt = new Abteilung("IT", new Manager(5011, "Tim", 4000.00, 2.00));
        System.out.println(abt.gehaltsliste());
        Kfz kfz = new Lkw(50, new Gps(0.0, 0.0), 0);
        kfz.einsteigenFahrer(new Fahrer(0, "name", "C"));
        List<Kfz> kfzs = Arrays.asList(kfz, new Personentransportfahrzeug(55, new Gps(0, 0), 6));
        for (Kfz kfz2 : kfzs) {
            kfz2.fahrenZu(new Gps(90, 90));
            kfz2.parken();
        }
        
        Dreieck dreieck = null;
        
        Scanner sc = new Scanner(System.in);
        boolean validDreieck = false;
        while (!validDreieck) {
            try {
                System.out.println("Bitte geben Sie Werte ein!");
                dreieck = new Dreieck(sc.nextInt(), sc.nextInt(), sc.nextInt());
                validDreieck = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println(dreieck.flaeche());
        System.out.println(dreieck.umfang());


        System.out.println(dreieck.getA()+ "\n" + dreieck.getB()+ "\n" + dreieck.getC());

        System.out.println("Diese Zeile wird geschrieben werden weil unser programm nicht abstürtzt");
    }
}