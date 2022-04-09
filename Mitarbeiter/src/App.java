package Mitarbeiter.src;

/**
 * App class zum testen
 */
public class App {

    public static void main(String[] args) {
        Abteilung abt = new Abteilung("IT", new Manager(5011, "Tim", 4000.00, 2.00)); 
        System.out.println(abt.gehaltsliste());
    }
    
}