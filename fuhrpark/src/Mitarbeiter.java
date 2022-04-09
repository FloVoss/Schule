package fuhrpark.src;

public abstract class Mitarbeiter {
    private int id;
    private String name;

    protected void setId(int id) {
        if(id >= 3000 && id <= 5999)
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
}
