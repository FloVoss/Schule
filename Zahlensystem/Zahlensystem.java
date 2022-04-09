package Zahlensystem;

import java.util.*;

public class Zahlensystem {

    public void convertFromDecimal() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int num = scan.nextInt();

        // convert decimal to binary
        String binVal = Integer.toBinaryString(num);
        System.out.println("Binary number is : " + binVal);

        // convert decimal to octal
        String octVal = Integer.toOctalString(num);
        System.out.println("Octal number is : " + octVal);

        // convert decimal to hexadecimal
        String hexVal = Integer.toHexString(num);
        System.out.println("Hexadecimal Number is: " + hexVal);
    }

    public void convertToDecimal() {
        Scanner scanTyp = new Scanner(System.in);
        System.out.print("Enter any system number for binary number (b), octal number (o) and hexdecimal number (h) ?");
        String typeStr = scanTyp.next();
        char letter = typeStr.charAt(0);

        if (letter == 'b') {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any binary number: ");
            String bin = scan.nextLine();
            int num = Integer.valueOf(bin, 2);
            System.out.println(bin + " as an integer is " + num);
        } else if (letter == 'o') {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any octal number: ");
            String oct = scan.nextLine();
            int num = Integer.valueOf(oct, 8);
            System.out.println(oct + " as an integer is " + num);
        } else if (letter == 'h') {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any hexadecimal number: ");
            String hexa = scan.nextLine();
            int num = Integer.valueOf(hexa, 16);
            System.out.println(hexa + " as an integer is " + num);
        } else {
            System.out.println("This Number system does not exist !!!");
        }
    }
}
