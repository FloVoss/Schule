import java.util.Scanner;

public class Bustarif {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Geben Sie eine Zahl ein: ");
		int number = scan.nextInt();
		String digit = null;
		
		switch (number) {
			case 0: digit = "Null "; 
				break;
			case 1: digit = "Eins ";
				break;
			case 2: digit = "Zwei "; 
				break;
			case 3: digit = "Drei "; 
				break;
			case 4: digit = "Vier "; 
				break;
			case 5: digit = "Fuenf "; 
				break;
			case 6: digit = "Sechs "; 
				break;
			case 7: digit = "Sieben "; 
				break;
			case 8: digit = "Acht "; 
				break;
			case 9: digit = "Neun "; 
				break;
			case 10: digit = "Zehn "; 
				break;
			default: System.out.println("Sie Sollen nur ganze Zahlen zwischen 0 und 10 eingeben !!!"); 
				break;
		}
		System.out.println(digit);
		scan.close();
	}
}