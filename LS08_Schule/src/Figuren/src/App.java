public class App {
    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck(4,6,8);
        System.out.println(dreieck.flaeche());
        System.out.println(dreieck.umfang());

        dreieck.setA(2);
        dreieck.setB(3);
        dreieck.setC(6);

        System.out.println(dreieck.getA()+ "\n" + dreieck.getB()+ "\n" + dreieck.getC());
    }
}
