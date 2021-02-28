
public class FR1101 {

	public static void main(String[] args) {
		
		System.out.print(testMethod(5));
	}
	
	public static double testMethod(int x) {
		double y;
		double[] array = new double[x];
		
		for (int i=0; i<array.length; i++) {
			array[i] = (i+i);
		}
		
		double t = 0;
		for (int i=0; i<array.length; i++) {
			t += array[i];
		}
		
		y = (t/array.length);
		
		return y;
		
	}

}
