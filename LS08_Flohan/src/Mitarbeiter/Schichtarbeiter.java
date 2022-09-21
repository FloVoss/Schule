package Mitarbeiter;

public class Schichtarbeiter extends Mitarbeiter {
    private double stundenSatz;
    private int anzahlStunden;
    public Schichtarbeiter(int id, String name, double stundenSatz, int stunden) {
        super(id, name);
        setStundenSatz(stundenSatz);
        setAnzahlStunden(stunden);
    }
    public Schichtarbeiter(int id, String name, double stundenSatz) {
        super(id, name);
    }
    @Override
    protected void setId(int id)
    {
        if(id >= 3000 && id <= 3999)
        {
            super.setId(id);
        }
    }
    @Override
    public double einkommen() {
       return stundenSatz * anzahlStunden;
    }
    public double getStundenSatz() {
        return stundenSatz;
    }
    public void setStundenSatz(double stundenSatz) {
        this.stundenSatz = stundenSatz;
    }
    public int getAnzahlStunden() {
        return anzahlStunden;
    }
    public void setAnzahlStunden(int anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }
}
