package Week06FinalProject;

import java.util.*;

public class Player {
    // Public instance fields:
    
    public String name;
    public List<Card> hand;
    public int score;
    
    // Constructor:
    
    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.score = 0;
    }
    
    // Public instance methods:
    
    public void describe() {
        System.out.println(this.name + " has the following cards in hand:");
        Iterator<Card> handIterator = this.hand.iterator();
        handIterator.forEachRemaining((card) -> card.describe());
    }
    
    public void draw(Deck bicycles){
        Card nextCard = bicycles.draw();
        this.hand.add(nextCard);
    }
    
    public Card flip(){
        Card topCard = this.hand.get(0);
        this.hand.remove(topCard);
        return topCard;
    }
    
    public void incrementScore(){
        this.score += 1;
    }
}
