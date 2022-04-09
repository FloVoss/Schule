import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int num = scan.nextInt(); 

        int numSum, i, rest;
        numSum = 0;

        i = num;
        while (num > 0) {
            rest = num % 10;
            numSum = numSum + rest;
            num = num / 10;
        }
        System.out.println("Quersumme von " + i + " = "  + numSum);
        scan.close();
    }
}
