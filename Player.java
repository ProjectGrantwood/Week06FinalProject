package Week06FinalProject;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Player {
    
    // PUBLIC FIELD INITIALIZATIONS

    public String name;
    public List<Card> hand;
    public int score;

    // CONSTRUCTORS

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.score = 0;
    }

    // PUBLIC METHODS

    public void describe() {
        System.out.println(this.name + " has the following cards in hand:");
        Iterator<Card> handIterator = this.hand.iterator();
        handIterator.forEachRemaining((card) -> card.describe());
    }

    // remove the top card of the Deck provided as a parameter and add it to the player's hand
    public void draw(Deck bicycles) {
        Card nextCard = bicycles.draw();
        this.hand.add(nextCard);
    }

    // remove the top card of the player's hand and return it
    public Card flip() {
        Card topCard = this.hand.get(0);
        this.hand.remove(topCard);
        return topCard;
    }

    // increase the player's score
    public void incrementScore() {
        this.score += 1;
    }
}
