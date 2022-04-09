package src.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    private String name;
    private List<Mitarbeiter> mitarbeiter;
    private Manager leiter;
    
    private void setName(String name) {
        this.name = name;
    }

    private void setMitarbeiter(List<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
    
    public void setLeiter(Manager leiter) {
        this.leiter = leiter;
    }
    
    public String getName() {
        return name;
    }

    public List<Mitarbeiter> getMitarbeiter() {
        return mitarbeiter;
    }

    public Manager getLeiter() {
        return leiter;
    }

    public Abteilung(String name, Manager leiter) {
        setName(name);
        setLeiter(leiter);
        mitarbeiter = new ArrayList<Mitarbeiter>(0);
        mitarbeiter.add(leiter);
    }

    public void add(Mitarbeiter neuer) {
        this.mitarbeiter.add(neuer);
    }

    public void remove(Mitarbeiter welcher) {
        this.mitarbeiter.remove(welcher);
    }

    public Manager changeLeiter(Manager neuer) {
        Manager temp = leiter;
        leiter = neuer;
        return temp;
    }

    public String gehaltsliste() {
        String result = "Die Gehaltsliste der Abteilung: " + name + 
        "\n Mitarbeiter: ";
        
        for (Mitarbeiter i : mitarbeiter) {
            result += i.getName() + ": " + i.einkommen(); 
        }
        return result; 
    }
}
