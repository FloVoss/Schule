package LS08_Flohan.src.Preiskalkulationen;

public class Material {
    private String oberflaeche;
    private String fuellung;
    public String getOberflaeche() {
        return oberflaeche;
    }
    public void setOberflaeche(String oberflaeche) {
        this.oberflaeche = oberflaeche;
    }
    public String getFuellung() {
        return fuellung;
    }
    public void setFuellung(String fuellung) {
        this.fuellung = fuellung;
    }
    public Material(String oberflaeche, String fuellung) {
        this.fuellung = fuellung;
        this.oberflaeche = oberflaeche;
    }
}
