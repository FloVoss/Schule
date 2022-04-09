

public class BueroArbeiter extends Mitarbeiter {

	private double festgehalt;
	
	public BueroArbeiter(int id, String name, double festgehalt) throws IllegalArgumentException {
		super(id, name);
		if (festgehalt < 0 || !Integer.toString(id).startsWith("5")) {
			throw new IllegalArgumentException();
		}
		this.festgehalt = festgehalt;
	}
	
	public void setFestgehalt(double festgehalt) throws IllegalArgumentException {
		if (festgehalt < 0) {
			throw new IllegalArgumentException();
		}
		this.festgehalt = festgehalt;
	}

	@Override
	public double einkommen() {
		return festgehalt;
	}
	
	@Override
	protected void setID(int id) throws IllegalArgumentException {
		if (!Integer.toString(id).startsWith("5")) {
			throw new IllegalArgumentException();
		}
		super.setID(id);
	}

}
