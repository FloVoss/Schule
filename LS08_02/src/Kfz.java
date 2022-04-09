

public class Kfz {

    private String name = "";
    private int anzahlSitze = 0;
    private int enthaltenePersonen = 0;
    private int tankGroesse = 0;
    private int tankInhalt = 0;
    private int aktuelleGeschwindigkeit = 0;
    private int maximaleGeschwindigkeit = 0;
    private int anschaffungskosten = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String erlaubt = name.replaceAll("[^a-zA-Z0-9]", " ");

        if (erlaubt.length() > 1)
            this.name = erlaubt;
        else {
            System.out.println("Name ist zu kurz!");
        }
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        if (anzahlSitze < 1) {
            System.out.println("Das ist unmöglich, ein KFZ kann mindestens einen Sitz haben !!!");
            this.anzahlSitze = 1;
        } else if (anzahlSitze > 9) {
            System.out.println("Das ist zu viel, ein KFZ kann maximal 9 Sitze haben !!!");
            this.anzahlSitze = 9;
        } else {
            this.anzahlSitze = anzahlSitze;
        }
    }

    public int getEnthaltenePersonen() {
        return enthaltenePersonen;
    }

    public void setEnthaltenePersonen(int enthaltenePersonen) {
        if (enthaltenePersonen <= this.anzahlSitze) {
            this.enthaltenePersonen = enthaltenePersonen;
        } else {
            System.out.println("Beachten Sie, dass die maximale Sitzanzahl ist " + this.anzahlSitze + "!!!");
        }
    }

    public int getTankGroesse() {
        return tankGroesse;
    }

    public void setTankGroesse(int tankGroesse) {
        if (tankGroesse < 45) {
            System.out.println("Das ist zu wenig für ein KFZ !!!");
            this.tankGroesse = 45;
        } else if (tankGroesse > 65) {
            System.out.println("Das ist zu viel für ein KFZ !!!");
            this.tankGroesse = 65;
        } else {
            this.tankGroesse = tankGroesse;
        }
    }

    public int getTankInhalt() {
        return tankInhalt;
    }

    public void setTankInhalt(int tankInhalt) {
        if (tankInhalt <= this.tankGroesse) {
            this.tankInhalt = tankInhalt;
        } else {
            System.out.println("Beachten Sie, dass die maximale Tankgroesse ist " + this.tankGroesse + "!!!");
        }
    }

    public int getMaximaleGeschwindigkeit() {
        return maximaleGeschwindigkeit;
    }

    public void setMaximaleGeschwindigkeit(int maximaleGeschwindigkeit) {
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
    }

    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    public void setAktuelleGeschwindigkeit(int aktuelleGeschwindigkeit) {
        if (aktuelleGeschwindigkeit <= this.maximaleGeschwindigkeit) {
            this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
        } else {
            System.out.println(
                    "Beachten Sie, dass die maximale Geschwindigkeit ist " + this.maximaleGeschwindigkeit + "!!!");
        }

    }

    public int getAnschaffungskosten() {
        return anschaffungskosten;
    }

    public void setAnschaffungskosten(int anschaffungskosten) {
        this.anschaffungskosten = anschaffungskosten;
    }

    public void bremsen() {
        this.aktuelleGeschwindigkeit -= 10;
    }

    public void beschleunigen() {
        this.aktuelleGeschwindigkeit += 10;
    }

    public void fahren() {
        this.getAktuelleGeschwindigkeit();
        this.tankInhalt -= 1;
    }

    public void einsteigen() {
        if (this.enthaltenePersonen < this.anzahlSitze) {
            this.enthaltenePersonen += 1;
        } else {
            System.out.println("Das KFZ ist voll !!!, die maximale Sitzanzahl ist: " + this.anzahlSitze);
        }
    }

    public void aussteigen() {
        if (this.enthaltenePersonen > 0) {
            this.enthaltenePersonen -= 1;
        }
    }

    public void tanken() {
        this.tankInhalt = this.tankGroesse;
    }

    public void ausgabe() {
        System.out.println();
        System.out.println("KFZ Name: " + this.name + ".");
        System.out.println("Anzahl der Sitze: " + this.anzahlSitze + ".");
        System.out.println("Die aktuelle enthaltene Personen: " + this.enthaltenePersonen + ".");
        System.out.println(this.name + " hat Tankgroesse: " + this.tankGroesse + "L" + ".");
        System.out.println(this.name + " beinhaltet gerade " + this.tankInhalt + "L" + " Benzin" + ".");
        System.out.println("Die maximale Geschwindigkeit ist " + this.maximaleGeschwindigkeit + "km/s" + ".");
        System.out.println("Die akteulle Geschwindigkeit ist " + this.aktuelleGeschwindigkeit + "km/s" + ".");
        System.out.println("Die Anschaffungskosten von " + this.name + " ist " + this.anschaffungskosten + ".");
        System.out.println();
    }
}
