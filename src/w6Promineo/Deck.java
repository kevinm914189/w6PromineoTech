package w6Promineo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> newDeck = new ArrayList<Card>();
	

	
	public Card playCard() {
		Card cardFin = this.newDeck.get(0);
		this.newDeck.remove(0);
		return cardFin;
	}
	
	
	public Deck() {
		for(int i = 0; i <= 12; i++) {
			for(int i2 = 0; i2 <= 3; i2++) {
				newDeck.add(new Card());
			}
		}
	}
	
	public List<Card> cardAdd(){
		return newDeck;
	}
	public void setCards(List<Card> deck) {
		this.newDeck = deck;
	}
	
	public Card draw() {
		if (newDeck.isEmpty()) {
			System.out.println("End.");
			return null;
		} else {
			Card drawnTopCard = newDeck.get(0);
			newDeck.remove(0);
			return drawnTopCard;
		}
	}
	
	//???
	public void shuffle() {
		Collections.shuffle(newDeck);
	}
	
}
	
	


