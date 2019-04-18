package blackjack;

public class Card {

    private Suit _cardSuit;//The suit of my card
    private int _cardVal;//The card number value of my card

    public Card(Suit cardSuit, int oddNum) {
        _cardSuit = cardSuit;

        if (oddNum >= 1 && oddNum <= 13) {
            _cardVal = oddNum;
        } else {
            System.err.println(oddNum + " is not a valid card number");
            System.exit(1);
        }

    }

    public int getCardVal() {
        return _cardVal;
    }

    public String toString() {
        String cardFace = "";
        switch (_cardVal) {
            case 2:
                cardFace = "Two";
                break;
            case 3:
                cardFace = "Three";
                break;
            case 4:
                cardFace = "Four";
                break;
            case 5:
                cardFace = "Five";
                break;
            case 6:
                cardFace = "Six";
                break;
            case 7:
                cardFace = "Seven";
                break;
            case 8:
                cardFace = "Eight";
                break;
            case 9:
                cardFace = "Nine";
                break;
            case 10:
                cardFace = "Ten";
                break;
            case 11:
                cardFace = "Jack";
                break;
            case 12:
                cardFace = "Queen";
                break;
            case 13:
                cardFace = "King";
                break;
            case 1:
                cardFace = "Ace";
                break;
        }
        return cardFace + " of " + _cardSuit.toString();
    }
}
