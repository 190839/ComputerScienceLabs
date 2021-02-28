// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment. 


public class Lab11bvst
{
	public static void main(String[] args)
	{ 
      Deck deck = new Deck();
      deck.displayCards();
	}
}

//       _________
//      / ======= \
//     / __________\
//    | ___________ |
//    | | -       | |
//    | |         | |
//    | |_________| |
//    \=____________/ 
//    / """"""""""" \                       
//   / ::::::::::::: \                  
//  (_________________)

class Deck 
{
	private Card[] cards;
	private int size;
	
	String c = "Clubs";
    String d = "Diamonds";
    String h = "Hearts";
    String s = "Spades";
    
    private String[] suits = {c,d,h,s}; //not currently used anywhere (but it's here just in case)

    
    
	public Deck() 
   {
      size = 52;
      cards = new Card[size];
      initializeArray(cards);
      
      addAllCards();
      shuffle();
      
      
	}  
	
	public void initializeArray(Card[] array) {
		for (int i=0; i<array.length; i++) {
		    array[i] = new Card("", "", 0);
		}
	}
	
	public void addAllCards() {
		addCards(cards, c, 0);
	    addCards(cards, d, 13);
	    addCards(cards, h, 26);
	    addCards(cards, s, 39);
	}
	
	
	public static void addCards(Card[] array, String suit, int startAtIndex) {
		for (int p=0; p<13; p++) {
			
			int i = p+startAtIndex;
			array[i].setSuit(suit);
			if (p==8) {
				array[i].setRank("Ten");
				array[i].setValue(10);
			}else if (p==9) {
				array[i].setRank("Jack");
				array[i].setValue(10);
			}else if (p==10) {
				array[i].setRank("Queen");
				array[i].setValue(10);
			}else if (p==11) {
				array[i].setRank("King");
				array[i].setValue(10);
			}else if (p==12) {
				array[i].setRank("Ace");
				array[i].setValue(11);
			}
			else {
				array[i].setRank(numbersToWords.convert(p+2));
				array[i].setValue(p+2);
			}

		}
	}
	
	public void displayCards() {
		Card[] array = getCards();
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
	
	private void shuffle() {
		Card[] array = getCards();
		int rNum1;
		int rNum2;
		
		for (int i=0; i<1000; i++) {
			rNum1 = (int )(Math.random() * 52 + 0);
			rNum2 = (int )(Math.random() * 52 + 0);
			Card temp = array[rNum1];
			array[rNum1] = array[rNum2];
			array[rNum2] = temp;
		}
	}


	public Card[] getCards() {
		return cards;
	}


	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	
	
 }
