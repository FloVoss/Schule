import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie Seitenlänge Quadrat ein: ");

        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}