import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {


		for (int n=1; n<=10; n++) {
			System.out.print(t(n) + " ");
		}

	}
	
	public static int t(int n) {
		int temp1 = 0;
		int temp2 = 1;
		int temp3 = 1;
		for (int k=3;k<=n; k++) {
			temp3 = temp1+temp2;
			temp1 = temp2;
			temp2 = temp3;
		}
		return temp3;
	}
	
	

}
