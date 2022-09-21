import Mitarbeiter.Abteilung;
import Mitarbeiter.Mitarbeiter;

public class Person {
    public boolean isChecked = false;
    public int id;
    public String name;
    public Abteilung abteilung;
    public String mitarbeiterTyp;
    public double gehalt;
    public Person(int id, String name, Abteilung abteilung, String mitarbeiterTyp, double gehalt) {
        this.id = id;
        this.name = name;
        this.abteilung = abteilung;
        this.mitarbeiterTyp = mitarbeiterTyp;
        this.gehalt = gehalt;
    }
}
