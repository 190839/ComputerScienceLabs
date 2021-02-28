import java.util.ArrayList;

public abstract class Calculator implements MathMachine {
	
	
	
	

 //      ░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░
//      ██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗
//      ██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝
//      ██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗
//      ╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║
//      ░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝
//      
//      ░█████╗░██╗░░░░░░█████╗░░██████╗░██████╗
//      ██╔══██╗██║░░░░░██╔══██╗██╔════╝██╔════╝
//      ██║░░╚═╝██║░░░░░███████║╚█████╗░╚█████╗░
//      ██║░░██╗██║░░░░░██╔══██║░╚═══██╗░╚═══██╗
//      ╚█████╔╝███████╗██║░░██║██████╔╝██████╔╝
//      ░╚════╝░╚══════╝╚═╝░░╚═╝╚═════╝░╚═════╝░


/*------------------------------------------------------------------------------------------*/
	
	public static ArrayList<Number> results = new ArrayList<Number>();
	
	

//		▄▀█ █▀▄ █▀▄
//		█▀█ █▄▀ █▄▀
	
	public static <T extends Number> Number add(T n1, T n2) {
		double num1;
		double num2;
		try {num1 = n1.doubleValue(); } catch(Exception e) {num1 = (double)n1;}
		try {num2 = n2.doubleValue(); } catch(Exception e) {num2 = (double)n2;}
		
		double sum = num1+num2;
		if (Math.round(sum) == sum) {
			results.add((int)sum);
			return (int)sum;
		}else {
			results.add(sum);
			return sum;
		}
	}
	


//		█▀ █ █ █▄▄ ▀█▀ █▀█ ▄▀█ █▀▀ ▀█▀
//		▄█ █▄█ █▄█  █  █▀▄ █▀█ █▄▄  █
	
	public static <T extends Number> Number subtract(T n1, T n2) {
		double num1;
		double num2;
		try {num1 = n1.doubleValue(); } catch(Exception e) {num1 = (double)n1;}
		try {num2 = n2.doubleValue(); } catch(Exception e) {num2 = (double)n2;}
		
		double sum = num1-num2;
		if (Math.round(sum) == sum) {
			results.add((int)sum);
			return (int)sum;
		}else {
			results.add(sum);
			return sum;
		}
	}

	
	

//		█▀▄▀█ █ █ █   ▀█▀ █ █▀█ █   █▄█
//		█ ▀ █ █▄█ █▄▄  █  █ █▀▀ █▄▄  █
	
	public static <T extends Number> Number multiply(T n1, T n2) {
		double num1;
		double num2;
		try {num1 = n1.doubleValue(); } catch(Exception e) {num1 = (double)n1;}
		try {num2 = n2.doubleValue(); } catch(Exception e) {num2 = (double)n2;}
		
		double total = num1*num2;
		if (Math.round(total) == total) {
			results.add((int)total);
			return (int)total;
		}else {
			results.add(total);
			return total;
		}
	}

	
	

//		█▀▄ █ █ █ █ █▀▄ █▀▀
//		█▄▀ █ ▀▄▀ █ █▄▀ ██▄
	
	public static <T extends Number> Number divide(T n1, T n2) {
		double num1;
		double num2;
		try {num1 = n1.doubleValue(); } catch(Exception e) {num1 = (double)n1;}
		try {num2 = n2.doubleValue(); } catch(Exception e) {num2 = (double)n2;}
		
		double dividend = num1/num2;
		if (Math.round(dividend) == dividend) {
			results.add((int)dividend);
			return (int)dividend;
		}else {
			results.add(dividend);
			return dividend;
		}
	}
	
	
	
	
	
	
	

}
