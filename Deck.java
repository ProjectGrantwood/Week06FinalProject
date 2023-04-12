package Week06FinalProject;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {

    // STATIC FIELDS

    private static String[] valueNames = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace" };
    private static String[] suitNames = { "Spades", "Clubs", "Hearts", "Diamonds" };
    private static int[] cardValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

    // PUBLIC FIELD INITIALIZATIONS

    public List<Card> cards = new ArrayList<Card>();

    // CONSTRUCTORS

    public Deck() {

        // add all standard playing cards with nested loops:
        // one for all the suits, the other for the values.
        for (String suit : Deck.suitNames) {
            for (int i = 0; i < Deck.valueNames.length; i++) {
                this.cards.add(new Card(valueNames[i] + " of " + suit, Deck.cardValues[i]));
            }
        }

        // Don't forget the jokers!
        for (int i = 0; i < 2; i++) {
            this.cards.add(new Card("Joker", 0));
        }

    }

    // PUBLIC METHODS:

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        Card nextCard = this.cards.get(0);
        this.cards.remove(nextCard);
        return nextCard;
    }

}
