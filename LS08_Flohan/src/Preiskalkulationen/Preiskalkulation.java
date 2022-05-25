package LS08_Flohan.src.Preiskalkulationen;

import java.io.File;
import java.nio.file.ClosedWatchServiceException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import LS08_Flohan.src.Figuren.IFigur3D;

public class Preiskalkulation {
    private double preis;
    private Material material;
    private static Map<String, Double> oberflaeche = new TreeMap<String, Double>();
    private static Map<String, Double> fuellung = new TreeMap<String, Double>();
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Preiskalkulation(double preis, Material material) {
        this.preis = preis;
        this.material = material;
    }
    public static double berechnePreis() throws Exception
    {   
        Scanner scanner = new Scanner(new File("C:\\Users\\florian.voss\\Downloads\\Materialpreise Oberflaechen.csv"), "UTF-8");
        scanner.useDelimiter("\t|\n");
        while(scanner.hasNext())
        {
            oberflaeche.put(scanner.next(), Double.parseDouble(scanner.next().replace(',', '.')));
        }
        scanner.close();
        Scanner scanner2 = new Scanner(new File("C:\\Users\\florian.voss\\Downloads\\Materialpreise Fuellung.csv"), "UTF-8");
        scanner2.useDelimiter(";|\n");
        while(scanner2.hasNext())
        {
            fuellung.put(scanner2.next(), Double.parseDouble(scanner2.next()));
        }
        scanner2.close();
        for(String entry : oberflaeche.keySet())
        {
            System.out.println(entry + "\t" + oberflaeche.get(entry));
        }
        System.out.println("\n");
        for(String entry : fuellung.keySet())
        {
            System.out.println(entry + "\t" + fuellung.get(entry));
        }
        return 0.0;
    }
}
