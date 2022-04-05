package LS08_01;

public class SchichtArbeiter extends Mitarbeiter {
	
	private double stundenSatz;
	private int anzahlStunden;
	
	public SchichtArbeiter(int id, String name, double stundenSatz) throws IllegalArgumentException {
		super(id, name);
		setStundenSatz(stundenSatz);
		
	}
	
	public double getStundenSatz() {
		return stundenSatz;
	}
	
	public void setStundenSatz(double stundenSatz) throws IllegalArgumentException {
		if (stundenSatz <= 0) {
			throw new IllegalArgumentException();
		}
		this.stundenSatz = stundenSatz;
	}
	
	public int getAnzahlStunden() {
		return anzahlStunden;
	}
	
	public void setAnzahlStunden(int anzahlStunden) throws IllegalArgumentException {
		if (anzahlStunden <= 0) {
			throw new IllegalArgumentException();
		}
		this.anzahlStunden = anzahlStunden;
	}
	
	@Override
	public double einkommen() {
		return anzahlStunden * stundenSatz;
	}
	
	@Override
	protected void setID(int id) throws IllegalArgumentException {
		if (!Integer.toString(id).startsWith("3")) {
			throw new IllegalArgumentException();
		}
		super.setID(id);
	}

}
