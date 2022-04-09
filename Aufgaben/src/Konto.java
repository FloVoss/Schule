package Aufgaben.src;
import java.util.Scanner;

public class Konto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        int balance = 1000;

        while(true) {
            System.out.println("Drucken Sie Taste '1', um Geld auszuzahlen!");
            System.out.println("Drucken Sie Taste '2', um Geld einzuzahlen!");
            int button = scan.nextInt(); 
            System.out.println("Geben Sie einen Betrag ein!");
            int amount = scan.nextInt();

    
            if(button == 1 && amount<=balance){
                balance = balance - amount;
                 
            } else if(button == 2){
                balance = balance + amount;
            } else {
                System.out.println("Sie haben nicht Genung Geld in Ihrer Konto!!!");
            }
            
            System.out.println("Ihre aktuelle Kontostand ist: " + balance);
            System.out.println("Möchten Sie weitermachen, Ja 'y' oder Nein 'n'!");
            String s = scan.next();

            if(s.equals("n")) {
                break;
            }
        }
        scan.close();
    }
}