

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
	
	private String name;
	private Manager leiter;
	private List<Mitarbeiter> mitarbeiter;
	
	public Abteilung(String name, Manager leiter) {
		this.name = name;
		this.leiter = leiter;
		mitarbeiter = new ArrayList<Mitarbeiter>();
	}
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	public Manager getLeiter() { return leiter; }
	
	public List<Mitarbeiter> getMitarbeiter() {
		return mitarbeiter;
	}
	
	public void add(Mitarbeiter neuer) {
		mitarbeiter.add(neuer);
	}
	
	public void remove(Mitarbeiter welcher) {
		mitarbeiter.remove(welcher);
	}
	
	public Manager changeLeiter(Manager neuer) {
		Manager alter = this.leiter;
		this.leiter =neuer;
		return alter;
	}
	
	public String gehaltsliste() {
		StringBuilder gehaltsliste = new StringBuilder();
		gehaltsliste.append(String.format("Gehaltsliste %s", this.name));
		double gehalt = 0;
		for (Mitarbeiter worker : mitarbeiter) {
			gehaltsliste.append(String.format("\n%s %.2f �", worker.getName(), worker.einkommen()));
			gehalt += worker.einkommen();
		}
		gehaltsliste.append(String.format("\n%s %.2f �",  leiter.getName(), leiter.einkommen()));
		gehalt += leiter.einkommen();
		gehaltsliste.append(String.format("\nGesamtgehalt: %.2f �", gehalt));
		return gehaltsliste.toString();
	}

}
