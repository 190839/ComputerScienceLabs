import java.util.Scanner;


public class question {
	
	static Scanner s = new Scanner(System.in);
	static String operation;
	static double value1;
	static double value2;
	
	//quf is question unformatted
	public <T> void ask(T quf) {
	//start of ask
		
		String q = quf.toString();
		
		if (q.equals("o") || q.equals("O")) {
			System.out.print("What operation would you like to run? (+, -, *, /) ");
			operation = s.nextLine();
		}else if (q.equals("v1") || q.equals("V1")) {
			System.out.print("Enter value 1: ");
			value1 = getNumber();
		}else if (q.equals("v2") || q.equals("V2")) {
			System.out.print("Enter value 2: ");
			value2 = getNumber();
		}else {
			System.out.println("\n\nPlease enter o, v1, or v2 into the \"ask\" argument.\nOperation has defaulted to +\n\n");
			operation = "+";
		}
		
	//end of ask
	}
	
	public static double getNumber() {
		boolean validNumber = false;
		while (!validNumber) {
			Scanner nsc = new Scanner(System.in);
			try {
				double n = nsc.nextDouble();
				validNumber = true;
				return n;
			}catch (Exception e) {
				validNumber = false;
				System.out.println("\n\nNot a number. Please enter a number.\n");
			}
		}
		return 0;
		
	}
	
}
