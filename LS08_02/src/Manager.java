

public class Manager extends BueroArbeiter {
	
	private double bonusSatz;
	
	public Manager(int id, String name, double festgehalt, double bonusSatz) throws IllegalArgumentException {
		super(id, name, festgehalt);
		if (bonusSatz < 0 || !Integer.toString(id).startsWith("50")) {
			throw new IllegalArgumentException();
		}
		this.bonusSatz = bonusSatz;
	}
	
	public double getBonusSatz() {
		return bonusSatz;
	}
	
	public void setBonusSatz(double bonusSatz) throws IllegalArgumentException {
		if (bonusSatz < 0) {
			throw new IllegalArgumentException();
		}
		this.bonusSatz = bonusSatz;
	}
	
	@Override
	public double einkommen() {
		return super.einkommen() * (1 + bonusSatz / 100);
	}
	
	@Override
	protected void setID(int id) throws IllegalArgumentException {
		if (!Integer.toString(id).startsWith("50")) {
			throw new IllegalArgumentException();
		}
		super.setID(id);
	}
	
	public double berechneBonus() {
		return super.einkommen() * bonusSatz / 100;
	}

}
