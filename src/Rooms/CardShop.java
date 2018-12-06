package Rooms;

import Game.Runner;
import People.Person;

public class CardShop extends Room {
    public CardShop(int x1, int y1) {
        super(x1,y1);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setxDeck(this.xDeck);
        x.getxGold(this.xGold);
        System.out.println("Welcome to the Card Shop! How can we assist you?");
            if(xDeck >=-1 & xDeck<=1) {
                System.out.println("Oh is this your first time playing CreatureBrawl? Well lets teach you how to play.");
                System.out.println("So Each Player starts off with a Deck of 10 Creatures.");
                System.out.println("Each game starts with each player shuffling their deck and getting three cards. Out of the three cards, they choose one fighter.");
                System.out.println("After Each Fighter is chosen, The players battle it out til one is the victor. ");
                System.out.println("So which Deck would you like? You can pick from GreekBox, RomanBox, or EgyptianBox.");
            }

    }

}
