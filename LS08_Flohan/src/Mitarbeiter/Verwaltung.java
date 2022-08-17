package LS08_Flohan.src.Mitarbeiter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import LS08_Flohan.src.Fuhrpark.Kfz;
import LS08_Flohan.src.Fuhrpark.Lkw;


public class Verwaltung {
    private List<Kfz> fuhrpark;
    private List<Mitarbeiter> personal;
    private List<Schichtarbeiter> schichtarbeiter;
    private List<Abteilung> abteilungen;

    public Verwaltung() 
    {
        fuhrpark = new ArrayList<Kfz>();
        personal = new ArrayList<Mitarbeiter>();
        schichtarbeiter = new ArrayList<Schichtarbeiter>();
        abteilungen = new ArrayList<Abteilung>();
    }

    public void add(Kfz neues) {
        fuhrpark.add(neues);
    }

    public void remove(Kfz altes) {
        fuhrpark.remove(altes);
    }

    public void add(Mitarbeiter neuen) {
        personal.add(neuen);
        Collections.sort(personal);
    }

    public void remove(Mitarbeiter alten) {
        personal.remove(alten);
    }

    public void add(Schichtarbeiter neuen) {
        schichtarbeiter.add(neuen);
    }

    public void remove(Schichtarbeiter alten) {
        schichtarbeiter.remove(alten);
    }

    public void add(Abteilung neue) {
        abteilungen.add(neue);
    }

    public void remove(Abteilung alte) {
        abteilungen.remove(alte);
    }

    public void arbeitsTag() 
    {
        for(Schichtarbeiter sc : schichtarbeiter)
        {
            sc.setAnzahlStunden(sc.getAnzahlStunden() + 8);
        }
    }
}
