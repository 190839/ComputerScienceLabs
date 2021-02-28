
public class numbersToWords {

	public numbersToWords() {
		
	}
	
	public static String convert(int x) {
		String a = "";
		
		if (x==2) {
			a = "Two";
		}else if (x==3) {
			a = "Three";
		}else if (x==4) {
			a = "Four";
		}else if (x==5) {
			a = "Five";
		}else if (x==6) {
			a = "Six";
		}else if (x==7) {
			a = "Seven";
		}else if (x==8) {
			a = "Eight";
		}else if (x==9) {
			a = "Nine";
		}else if (x==10) {
			a = "Ten";
		}else if (x==11) {
			a = "Ace";
		}
		
		
		
		
		return a;
	}

}
