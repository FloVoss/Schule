package Aufgaben.src;
import java.util.Scanner;

public class Taschenrechner{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        while(true){
            System.out.println("Geben Sie eine Zahl ein!");
            double num1 = scan.nextDouble(); 
            
            System.out.println("Geben Sie eine Operator ein!");
            String operator = scan.next(); 

            System.out.println("Geben Sie eine Zahl ein!");
            double num2 = scan.nextDouble(); 

            double result = 0;
            
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if(operator.equals("-")) {
                result = num1 - num2;
            } else if(operator.equals("*")) {
                result = num1 * num2;
            } else if(operator.equals("/")) {
                result = num1 / num2;
            } else if(operator.equals("%")) {
                result = num1 % num2;
            }
            System.out.println(result);

            System.out.println("Möchten Sie weiterrechnen, Ja 'y' oder Nein 'n'");
            String s = scan.next();

            if(s.equals("n")){
                break;
            }
        }
        scan.close();    
    }
}