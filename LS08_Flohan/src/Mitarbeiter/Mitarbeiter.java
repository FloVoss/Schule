package LS08_Flohan.src.Mitarbeiter;

public abstract class Mitarbeiter implements Comparable<Mitarbeiter> {
    private int id;
    private String name;

    protected void setId(int id) {
        if (id >= 3000 && id <= 5999)
            this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Mitarbeiter(int id, String name) {
        setId(id);
        setName(name);
    }

    public abstract double einkommen();

    public int compareTo(Mitarbeiter mt) {
        if(name.compareTo(mt.name) == 0) {
            return 0;
        }else if (name.compareTo(mt.name) >= 0) {
            return 1;
        }
        else {
            return -1;
        }
    }
}