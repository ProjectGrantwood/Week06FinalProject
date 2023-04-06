package Week06FinalProject;

import java.util.*;

public class Deck {

    // Static fields (no need to keep these private/protected, hence public).

    public static String[] valueNames = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace" };
    public static String[] suitNames = { "Spades", "Clubs", "Hearts", "Diamonds" };
    public static int[] cardValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

    // Public instance fields:

    public List<Card> cards = new ArrayList<Card>();
    public Iterator<Card> drawIterator = this.cards.iterator();

    // Constructor:

    public Deck() {

        // add all standard playing cards

        for (String suit : Deck.suitNames) {
            for (int i = 0; i < Deck.valueNames.length; i++) {
                this.cards.add(new Card(valueNames[i] + " of " + suit, Deck.cardValues[i]));
            }
        }

        for (int i = 0; i < 2; i++) {
            this.cards.add(new Card("Joker", 0));
        }

    }

    // Public methods:

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        Card nextCard = this.cards.get(0);
        this.cards.remove(nextCard);
        return nextCard;
    }

}
