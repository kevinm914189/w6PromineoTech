package w6Promineo;


public class Card { //1.a.

	//instantiating strings
	 private int value; //1.a.i.1. The value of the card is displayed as string to incorporate face cards.
	 private int name; //1.a.i.2. The name of the card's suit is displayed as string to ??? lmao
	 int score; //player score
	 //value comparison of String and int values for cards
	 public static final int Two = 0;
	 public static final int Three = 1;
	 public static final int Four = 2;
	 public static final int Five = 3;
	 public static final int Six = 4;
	 public static final int Seven = 5;
	 public static final int Eight = 6;
	 public static final int Nine = 7;
	 public static final int Ten = 8;
	 public static final int Jack = 9;
	 public static final int Queen = 10;
	 public static final int King = 11;
	 public static final int Ace = 12;
	 
	 public static final int Spades = 0;
	 public static final int Diamonds = 1;
	 public static final int Clubs = 2;
	 public static final int Hearts = 3;
	 
	 
	 
	 

	 
	
	//1.a.ii.1. getter and setter methods
	public int getValue() { //value getter
		return value;
	}
	
	public void setValue(int newValue) { //value setter
		this.value = newValue;
	}
	
	public int getName() { //name getter
		return name;
	}
	
	public void setName(int newName) { //name setter
		this.name = newName;
	}
	
	
	//1.a.ii.2. describe (it should convert int to string

	public String toString() {
		String card = "";
				if(value == 0) {
					card += "Two";
				} else if (value == 1) {
					card += "Three";
				} else if (value == 2) {
					card += "Four";
				} else if (value == 3) {
					card += "Five";
				} else if (value == 4) {
					card += "Six";
				} else if (value == 5) {
					card += "Seven";
				} else if (value == 6) {
					card += "Eight";
				} else if (value == 7) {
					card += "Nine";
				} else if (value == 8) {
					card += "Ten";
				} else if (value == 9) {
					card += "Jack";
				} else if (value == 10) {
					card += "Queen";
				} else if (value == 11) {
					card += "King";
				} else {
					card += "Ace";
				}
		
		card += " of ";
				if (name == 0) {
					card += "Spades";
				} else if (name == 1) {
					card += "Diamonds";
				} else if (name == 2) {
					card += "Clubs";
				} else {
					card += "Hearts";
				}
			return card;
		}
	
	
	public void describe() {
		System.out.println(this.toString() + "\n");
	}
	
	
	
}
