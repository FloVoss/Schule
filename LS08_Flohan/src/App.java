package LS08_Flohan.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import LS08_Flohan.src.Figuren.Dreieck;
import LS08_Flohan.src.Figuren.Dreiecksprisma;
import LS08_Flohan.src.Figuren.DreiseitigePyramide;
import LS08_Flohan.src.Figuren.Figur3D;

import LS08_Flohan.src.Figuren.Kreis;
import LS08_Flohan.src.Figuren.Kreiskegel;
import LS08_Flohan.src.Figuren.Kugel;
import LS08_Flohan.src.Figuren.Quader;
import LS08_Flohan.src.Figuren.Rechteck;
import LS08_Flohan.src.Figuren.VierseitigePyramide;
import LS08_Flohan.src.Figuren.Zylinder;
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
        
        
        List<Figur3D<Kreis>> figuren = new ArrayList<Figur3D<Kreis>>();
        figuren.add(new Kreiskegel(new Kreis(10), 10));
        figuren.add(new Zylinder(new Kreis(10), 10));
        figuren.add(new Kugel(new Kreis(10), 10));
        List<Figur3D<Rechteck>> figuren2 = new ArrayList<Figur3D<Rechteck>>();
        figuren2.add(new Quader(new Rechteck(10, 10), 10));
        figuren2.add(new VierseitigePyramide(new Rechteck(10, 10), 10));
        List<Figur3D<Dreieck>> figuren3 = new ArrayList<Figur3D<Dreieck>>();
        figuren3.add(new Dreiecksprisma(new Dreieck(3, 4, 5), 10));
        figuren3.add(new DreiseitigePyramide(new Dreieck(3, 4, 5), 10));
        System.out.println("3D Kreisfiguren: \n");
        for(var item : figuren)
        {
            System.out.println(item.volumen() + "\n" + item.oberflaeche() + "\n");
        }
        System.out.println("3D Rechteckige Figuren: \n");
        for(var item : figuren2)
        {
            System.out.println(item.volumen() + "\n" + item.oberflaeche() + "\n");
        }
        System.out.println("3D Dreieckige Figuren: \n");
        for(var item : figuren3)
        {
            System.out.println(item.volumen() + "\n" + item.oberflaeche() + "\n");
        }
    }
}