package blackjack;

public class Player {

    //The player's name
    private String name;

    //The cards in the player's current hand
    private Card[] hand = new Card[10];

    //The nimber of cards in the player current hand
    private int numCards;

    //playerName - the name of the player
    public Player(String playerName) {

        name = playerName;

        //set a player's hand to empty
        emptyHand();
    }

    public void emptyHand() {
        for (int c = 0; c < 10; c++) {
            hand[c] = null;
        }
        numCards = 0;
    }

    //Add a card to the players hand
    //aCard - the card to be added
    public boolean addCard(Card aCard) {
        //print error if we already have the max number of cards
        if (numCards == 10) {
            System.err.printf("%s's hand already has 10 cards; cannot add another \n", name);
            System.exit(1);
        }

        //add new card in next slot and increment number of cards counter
        hand[numCards] = aCard;
        numCards++;

        return (getHandSum() <= 21);
    }

    //Get the sum of the cards in the player's hand 
    public int getHandSum() {
        int handSum = 0;
        int cardNum;
        int numAces = 0;

        //calc each card's contribution to the hand sum
        for (int c = 0; c < numCards; c++) {
            cardNum = hand[c].getCardVal();

            if (cardNum == 1) {
                numAces++;
                handSum += 11;
            } else if (cardNum > 10) {
                handSum += 10;
            } else {
                handSum += cardNum;
            }
        }

        //if we have aces and our sum is > 21 set some/all of them to value 1 instead
        while (handSum > 21 && numAces > 0) {
            handSum -= 10;
            numAces--;
        }
        return handSum;
    }

    //Print the cards in the player's hand
    //showFirstCard whether the first card is hidden or not
    public void printHand(boolean showFirstCard) {
        System.out.printf("%s's cards;\n", name);
        for (int c = 0; c < numCards; c++) {
            if (c == 0 && !showFirstCard) {
                System.out.println(" [hidden]");
            } else {
                System.out.printf(" %s\n", hand[c].toString());
            }
        }
    }
}
