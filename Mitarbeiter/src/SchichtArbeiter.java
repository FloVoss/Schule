package Mitarbeiter.src;

public class SchichtArbeiter extends Mitarbeiter {
    private double stundenSatz;
    private int anzahlStunden;

    private void setStundenSatz(double stundenSatz) {
        if(stundenSatz > 0)
            this.stundenSatz = stundenSatz;
    }

    private void setAnzahlStunden(int anzahlStunden) {
        if(anzahlStunden > 0)
            this.anzahlStunden = anzahlStunden;
    }

    @Override
    protected void setId(int id) {
        if(id >= 3000 && id <= 3999)
            super.setId(id);
    }

    public int getAnzahlStunden() {
        return anzahlStunden;
    }

    public double getStundenSatz() {
        return stundenSatz;
    }

    public SchichtArbeiter(int id, String name, double stundenSatz, int anzahlStunden) {
        super(id, name);
        setStundenSatz(stundenSatz);
        setAnzahlStunden(anzahlStunden);
    }

    @Override
    public double einkommen() {
        return getStundenSatz() * getAnzahlStunden();
    }
}
