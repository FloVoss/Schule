package Mitarbeiter.src;

public class BueroArbeiter extends Mitarbeiter {
    private double festGehalt;

    private void setFestGehalt(double festGehalt) {
        if(festGehalt > 0)
            this.festGehalt = festGehalt;
    }

    @Override
    protected void setId(int id) {
        if (id >= 5100 && id <= 5999)
            super.setId(id);
    }

    public double getFestGehalt() {
        return festGehalt;
    }

    public BueroArbeiter(int id, String name, double festGehalt) {
        super(id, name);
        setFestGehalt(festGehalt);
    }

    @Override
    public double einkommen() {
        return getFestGehalt();
    }
}
