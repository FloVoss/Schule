package LS08_Flohan.src.Mitarbeiter;

import java.util.List;

import LS08_Flohan.src.Fuhrpark.Kfz;



public class Verwaltung {
    private List<Kfz> fuhrpark;
    private List<Mitarbeiter> personal;
    private List<Schichtarbeiter> malocher;
    private List<Abteilung> abteilungen;

    public Verwaltung() {}

    public void add(Kfz neues) {
        fuhrpark.add(neues);
    }

    public void remove(Kfz altes) {
        fuhrpark.remove(altes);
    }

    public void add(Mitarbeiter neuen) {
        personal.add(neuen);
    }

    public void remove(Mitarbeiter alten) {
        personal.remove(alten);
    }

    public void add(Schichtarbeiter neuen) {
        malocher.add(neuen);
    }

    public void remove(Schichtarbeiter alten) {
        malocher.remove(alten);
    }

    public void add(Abteilung neue) {
        abteilungen.add(neue);
    }

    public void remove(Abteilung alte) {
        abteilungen.remove(alte);
    }

    public void arbeitsTag() {}
}
