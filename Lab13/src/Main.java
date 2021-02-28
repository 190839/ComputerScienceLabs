import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean a = false;
		ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
		
		
		while (!a) {
			try {
				System.out.print("How many calculations would you like to conduct? ");
				n = sc.nextInt();
				a=true;
			}catch(Exception e) {
				System.out.println("Just a number  (integer) please. Try again...");
				a=false;
			}
		}
		
		
		

		int numberOfCalculations = n;
		
		clearConsole();
		for (int i=0; i<numberOfCalculations; i++) {
			calculationSequence cs = new calculationSequence();
			cs.start();

		}
		
		
		
		
		
		
		
			
	//End of main method
	}
	
	
	
	
	public static void clearConsole() {
		for (int i = 0; i<1000; i++) {
			System.out.println("\n");
		}
	}
	
	
//End of Main class
}
