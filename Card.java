/*
 * Ayoob Atcha
 * Student ID: 991512971
 * SYST10199 - Web Programmer
 */
package blackjack;

/**
 *
 * @author ayoob
 */
public class Card {

	private value value;
	private suit suit;

	public void getValue() {
		// TODO - implement Card.getValue
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		// TODO - implement Card.setValue
		throw new UnsupportedOperationException();
	}

	public void getSuit() {
		// TODO - implement Card.getSuit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(int suit) {
		// TODO - implement Card.setSuit
		throw new UnsupportedOperationException();
	}


	public enum value {
		Ace,
		Two,
		Three,
		Four,
		Five,
		Six,
		Seven,
		Eight,
		Nine,
		Jack,
		Queen,
		King
	}


	public enum suit {
		Hearts,
		Diamonds,
		Clubs,
		Spades
	}
    
}
