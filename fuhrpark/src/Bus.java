package fuhrpark.src;

public class Bus extends Personentransportfahrzeug {
    public Bus(double tankGroesse, Gps aktuellePosition, int sitze) {
        super(tankGroesse, aktuellePosition, sitze);
    }

    @Override
    public void einsteigenFahrer(Fahrer fahrer) {
        super.einsteigenFahrer(fahrer);
    }
}
