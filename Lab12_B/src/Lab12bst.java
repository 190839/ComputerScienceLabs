// Lab12bvst.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;
import java.util.Objects;

public class Lab12bst
{
	public static void main(String[] args)
	{   
		Deck deck = new Deck();
	    deck.displayCards();
		//System.out.println(deck);
	}
}


//				 _________
//			    / ======= \
//			   / __________\
//			  | ___________ |
//			  | | -       | |
//			  | |         | |
//			  | |_________| |
//			  \=____________/ 
//			  / """"""""""" \                       
//			 /:::::::::::::: \                  
//			(_________________)




class Deck 
{
	private ArrayList<Card> cards;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	String c = "Clubs";
    String d = "Diamonds";
    String h = "Hearts";
    String s = "Spades";
    
    private String[] suits = {c,d,h,s}; //not currently used anywhere (but it's here just in case)

    
    
	public Deck() 
   {
      size = 52;
      cards = new ArrayList<Card>();
      initializeArray(cards, size);
      
      addAllCards(cards);
      //shuffleSwap(cards);
      shuffle(cards);
      
      
      
	}  
	
	
	public void initializeArray(ArrayList<Card> array, int deckSize) {
		for (int i=0; i<(deckSize); i++) {
		    array.add((new Card("", "", 0)));
		}
	}
	
	public void addAllCards(ArrayList<Card> array) {
		addCards(array, c, 0);
	    addCards(array, d, 13);
	    addCards(array, h, 26);
	    addCards(array, s, 39);
	}
	
	
	public static void addCards(ArrayList<Card> array, String suit, int startAtIndex) {
		for (int p=0; p<13; p++) {
			
			int i = p+startAtIndex;
			array.get(i).setSuit(suit);
			if (p==8) {
				array.get(i).setRank("Ten");
				array.get(i).setValue(10);
			}else if (p==9) {
				array.get(i).setRank("Jack");
				array.get(i).setValue(10);
			}else if (p==10) {
				array.get(i).setRank("Queen");
				array.get(i).setValue(10);
			}else if (p==11) {
				array.get(i).setRank("King");
				array.get(i).setValue(10);
			}else if (p==12) {
				array.get(i).setRank("Ace");
				array.get(i).setValue(11);
			}
			else {
				array.get(i).setRank(numbersToWords.convert(p+2));
				array.get(i).setValue(p+2);
			}

		}
	}
	
	public void displayCards() {
		ArrayList<Card> displayArray = getCards();		
		
		for (int i=0; i<displayArray.size(); i++) {
			System.out.println((displayArray.get(i).toString()));
		}
	}
	
	
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	
	
	
	
	private void shuffleSwap(ArrayList<Card> array) {
		//ArrayList<Card> array = getCards();
		int rNum1;
		int rNum2;
		
		for (int i=0; i<1000; i++) {
			rNum1 = (int )(Math.random() * 52 + 0);
			rNum2 = (int )(Math.random() * 52 + 0);
			Card temp = array.get(rNum1);
			array.set(rNum1, array.get(rNum2));
			array.set(rNum2, temp);
		}
	}
	
	private void shuffle(ArrayList<Card> array) {
		//ArrayList<Card> array = getCards();
		int randomCard;
		int randomCard2;
		Card stored;
		int selected;
		Card selected2;
		Card current;
		
		for (int i=0; i<array.size(); i++) {
			randomCard = (int )(Math.random() * 52 + 0);
			randomCard2 = (int )(Math.random() * 52 + 0);
			
			//current = array.get(i);
			//selected = randomCard;
			selected2 = array.get(randomCard2);
			//stored = array.get(randomCard);
			
			array.set(i, selected2);
		}
	}



	
	
	
 }