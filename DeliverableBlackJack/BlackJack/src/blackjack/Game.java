/*
 * Ayoob Atcha
 * Student ID: 991512971
 * SYST10199 - Web Programmer
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author ayoob
 */
public class Game {

    Deck theDeck = new Deck(1, true);

    public void turn(Player me, Player dealer) {
        Scanner sc = new Scanner(System.in);

        boolean meDone = false;
        boolean dealerDone = false;
        String ans;

        while (!meDone || !dealerDone) {

            //player's turn
            if (!meDone) {
                System.out.println("Hit or Stay? (Enter H or S): ");
                ans = sc.next();
                System.out.println();

                //if the player hits
                if (ans.compareToIgnoreCase("H") == 0) {

                    //add next card in the deck and store whether play is busted
                    meDone = !me.addCard(theDeck.dealNextCard());
                    me.printHand(true);
                    dealer.printHand(true);
                } else {
                    meDone = true;
                }
            }

            //dealer's turn
            if (!dealerDone) {
                if (dealer.getHandSum() < 17) {
                    System.out.println("The dealer hits\n");
                    dealerDone = !dealer.addCard(theDeck.dealNextCard());
                    dealer.printHand(false);
                } else {
                    System.out.println("The dealer stays\n");
                    dealerDone = true;
                }
            }
            System.out.println();
        }
        return;
    }

    public void addCards(Player me, Player dealer) {
        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());
        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());

    }

    public void win(Player me, Player dealer) {
        int mySum = me.getHandSum();
        int dealerSum = dealer.getHandSum();

        System.out.println("Your hand Sum was " + mySum);
        System.out.println("The dealer hand Sum was " + dealerSum);
        if (mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
    }

}
