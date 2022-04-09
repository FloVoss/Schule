package LS08_Flohan.src.Mitarbeiter;

public class Schichtarbeiter extends Mitarbeiter {
    private double stundenSatz;
    private int anzahlStunden;
    public Schichtarbeiter(int id, String name) {
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
}
