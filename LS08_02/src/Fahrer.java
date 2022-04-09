public static void main(String[] args) {

    Manager ruediger = new Manager(5000, "R�diger", 3000., 10.0);
	Manager barbara = new Manager(5001, "Barbara", 3500., 8.0);
		
	//Abteilungen erstellen
	Abteilung hartAmArbeiten = new Abteilung("hartAmArbeiten", ruediger);
	Abteilung nurChillenUndSo = new Abteilung("nurChillenUndSo", barbara);
		
	//Mitarbeiter erstellen
	SchichtArbeiter arbeiter1 = new SchichtArbeiter(3001, "Bernd", 15.);
	arbeiter1.setAnzahlStunden(150);
	BueroArbeiter arbeiter2 = new BueroArbeiter(5101, "Sabine", 2200.);
	hartAmArbeiten.add(arbeiter1);
	hartAmArbeiten.add(arbeiter2);
	System.out.println(hartAmArbeiten.gehaltsliste());
	System.out.println(nurChillenUndSo.gehaltsliste());
}
