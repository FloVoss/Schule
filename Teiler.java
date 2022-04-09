import java.util.Scanner;

public class Teiler {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "", output = ""; 
        boolean Znum = false;
         
        while(!Znum){
        System.out.print("Geben Sie eine ganze Zahl ein: ");
             
        input = scan.next();
                 
            if(!input.matches("[0-9]+")){
                System.out.println("Nur ganze Zahlen eingeben!");
            }else Znum = true;
        }
         
        int zahl = Integer.parseInt(input);
        output = "Die Teiler der Zahl "+input+" sind:{" ;
        for(int i = 1; i < zahl + 1; i++) {
            if(zahl % i == 0) {
                output = output +" "+ String.valueOf(i);
            }   
        }
        output = output + " }";
        System.out.println(output);
        scan.close();
    }
}