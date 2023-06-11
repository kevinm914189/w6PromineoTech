package w6Promineo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player playerOne = new Player ("I have");
		Player playerTwo = new Player ("Dealer has");
		
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i = 1; i <= 26; i++) {
			playerOne.hand.add(deck.draw());
			playerTwo.hand.add(deck.draw());
		}
		
		
		playerOne.describe();
		playerTwo.describe();
		
		for(int i = 0; i < 26; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
			} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				playerTwo.incrementScore();
			} else {
				System.out.println("Draw");
			}
		}
		
		
		if (playerOne.score > playerTwo.score) {
			System.out.println("******************************");
			System.out.println("You win");
			System.out.println("Total of " + playerOne.score + " vs " + playerTwo.score);
			System.out.println("******************************");
		} else if (playerOne.score < playerTwo.score) {
			System.out.println("******************************");
			System.out.println("Dealer wins");
			System.out.println("Total of " + playerOne.score + " vs " + playerTwo.score);
			System.out.println("******************************");
		} else {
			System.out.println("******************************");
			System.out.println("Tie");
			System.out.println("Total of " + playerOne.score + " vs " + playerTwo.score);
			System.out.println("******************************");
		}
		
		
	}
	
}
