package LS08_01;

public abstract class Mitarbeiter {
	
	private int id;
	private String name;
	
	public Mitarbeiter(int id, String name) throws IllegalArgumentException {
		setID(id);
		this.name = name;
	}
	
	public int getID() {
		return id;
	}
	
	protected void setID(int id) {
		if (id < 999 || id > 10_000) {
			throw new IllegalArgumentException();
		}
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double einkommen();
}
