package blackjack;

import java.util.Random;
//Represents a deck of cards

public class Deck {

    //The array of cards in the deck, where the top cards is in the first index
    private Card[] myCards;
    //The number of cards currently in the deck
    private int numCards;

    //Constructor with a default of one deck (ie 52 cards) and no shuffling
    public Deck() {
        //call the other constructor, defining one deck without shuffling
        this(1, false);
    }

    //Constructor that defines the number of decks (ie. how many sets of 52
    //cards are in the deck) and whether it should be shuffled
    //numDeck - the number of individual decks in this deck
    //shuffle - whether to shuffle the cards
    public Deck(int numDecks, boolean shuffle) {

        numCards = numDecks * 52;
        myCards = new Card[numCards];

        //inti card index
        int c = 0;
        //for each deck 
        for (int d = 0; d < numDecks; d++) {
            //for each suit
            for (int s = 0; s < 4; s++) {
                //for each number
                for (int n = 1; n <= 13; n++) {
                    //add a new card to the deck
                    myCards[c] = new Card(Suit.values()[s], n);
                    c++;
                }
            }
        }
    }

    //Shuffle deck by randomly swapping pairs of cards
    public void shuffle() {
        //init random number generator
        Random rand = new Random();

        //temporary card
        Card temp;

        int j;
        for (int i = 0; i < numCards; i++) {
            //get a random int n j to swap i's value with
            j = rand.nextInt(numCards);

            //do swap
            temp = myCards[i];
            myCards[i] = myCards[j];
            myCards[j] = temp;
        }
    }

    //Deal the next card from the top of the deck
    public Card dealNextCard() {

        //Get the top card
        Card top = myCards[0];

        //Shifts all subsequent cards to the left of the index
        for (int c = 1; c < numCards; c++) {
            myCards[c - 1] = myCards[c];
        }
        myCards[numCards - 1] = null;

        //decrement the number of cards in our deck
        numCards--;

        return top;
    }

    //Print the top cards in the deck
    // numToPrint - the number of cards from the top of the deck to print
    public void printDeck(int numToPrint) {

        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% 3d/%d %s\n", c + 1, numCards, myCards[c].toString());
        }
        System.err.printf("\t[%d other]\n", numCards - numToPrint);
    }

}
