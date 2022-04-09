package LS08_Flohan.src.Mitarbeiter;

public class Manager extends BueroArbeiter{
    private double bonusSatz;
    
    private void setBonusSatz(double bonusSatz) {
        if(bonusSatz > 0)
            this.bonusSatz = bonusSatz;
    }
    
    @Override
    protected void setId(int id) {
        if(id >= 5000 && id <= 5099)
            super.setId(id);
    }

    public double getBonusSatz() {
        return bonusSatz;
    }

    public Manager(int id, String name, double festGehalt, double bonusSatz) {
        super(id, name, festGehalt);
        setBonusSatz(bonusSatz);
    }

    public double berechnenBonus() {
        return getFestGehalt() * getBonusSatz() / 100;
    }

    @Override
    public double einkommen() {
        return berechnenBonus() + getFestGehalt();
    }
}
