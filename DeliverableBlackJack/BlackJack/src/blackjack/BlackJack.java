package blackjack;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the
        Deck theDeck = new Deck(1, true);
        System.out.println("Please enter a number");
        String name = sc.nextLine();
        boolean meDone = false;
        boolean dealerDone = false;
        String ans;

        //init the player's objects
        Player me = new Player(name);
        Player dealer = new Player("Dealer");
        Game game = new Game();

        game.addCards(me, dealer);

        //print initial hands
        System.out.println("Cards are dealt\n");
        System.out.println("/******************/");
        System.out.println("/*                */");
        me.printHand(true);
        System.out.println("/*                */");
        System.out.println("/******************/");
        System.out.println("/******************/");

        System.out.println("/*                */");
        dealer.printHand(true);
        System.out.println("/*                */");
        System.out.println("/******************/");

        //flags for when ach player is finished hitting
        game.turn(me, dealer);
        int mySum = me.getHandSum();
        System.out.println("Your hand Sum is " + mySum);

        //close scanner
        sc.close();
        //print final hands
        System.out.println("/******************/");
        System.out.println("/*                */");
        me.printHand(true);
        System.out.println("/*                */");
        System.out.println("/******************/");

        System.out.println("/******************/");
        System.out.println("/*                */");
        dealer.printHand(true);
        System.out.println("/*                */");
        System.out.println("/******************/");

        //Calls the win method to check if the user wins
        game.win(me, dealer);

    }
}
