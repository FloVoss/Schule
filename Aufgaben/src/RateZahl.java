package Aufgaben.src;
import java.util.Scanner;

public class RateZahl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 15;

        System.out.println("Zufälliger Wert in int von "+min+" bis "+max+ ": ");
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        int guessNum = scan.nextInt();
        int counter = 1; //counter starts by 1
        
        while (randomNum != guessNum) {
            System.out.println("Falsche Zahl !!!, versuchen sie noch einmal !");
            guessNum = scan.nextInt();
            counter++;  //counter will increase +1 every round
        }  
        System.out.println("Richtig!");
        System.out.println("Sie haben "+counter+" male versucht.");
        scan.close();
    }
}
