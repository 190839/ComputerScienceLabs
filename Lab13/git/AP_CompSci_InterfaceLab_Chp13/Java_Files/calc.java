
public class calc extends question {
		
	public void run() {
	//Start of run
		String o = operation.toString();
		
		if (o.equals("+")) {
			Calculator.add(value1, value2);
		}else if (o.equals("-")) {
			Calculator.subtract(value1, value2);
		}else if (o.equals("*")) {
			Calculator.multiply(value1, value2);
		}else if (o.equals("/")) {
			Calculator.divide(value1, value2);
		}else{
			System.out.println("\n\nOperation of \""+operation+"\" is invalid. Enter +, -, *, or /\n");
		}
		
		System.out.println("\n\nDisplaying all results:");
		Calculator.results.forEach(System.out::println);
	
	//End of run
	}
	
}
