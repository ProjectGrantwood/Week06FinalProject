package Week06FinalProject;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // initialize a Scanner
        Scanner inputReader = new Scanner(System.in);
        
        // initialize the players with user-selected names
        lineBreak();
        System.out.println("Player 1, enter your name:");
        String name1 = inputReader.nextLine();
        System.out.println("Player 2, enter your name:");
        String name2 = inputReader.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        
        // close the Scanner here, we're done with it
        inputReader.close();
        
        System.out.println("Hello " + player1.name + " and " + player2.name + ". Welcome to WAR!");
        
        // initialize the deck and shuffle it
        Deck bicycles = new Deck();
        bicycles.shuffle();
        
        // players get their hands by drawing cards until the deck is depleted
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(bicycles);
            } else {
                player2.draw(bicycles);
            }
        }

        // The simulated game logic & outputs are all in the following loop.
        for (int i = 0; i < 26; i++) {
            
            // Print the round number
            System.out.println("");
            System.out.println("--------ROUND " + (i + 1) + "--------");
            
            // Have each player flip their cards
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            
            // Print each flipped card to the output stream
            lineBreak();
            System.out.print(player1.name + " flips ");
            player1Card.describe();
            lineBreak();
            System.out.print(player2.name + " flips ");
            player2Card.describe();
            
            // initialize a string that will contain the name of the player who wins the round.
            String roundWinner;
            
            //if player1 wins the round...
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                roundWinner = player1.name;
            //if player2 wins the round...
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
                roundWinner = player2.name;
            //if the round is a tie...
            } else {
                roundWinner = "Neither player";
            }
            
            //print the round winner to the console, as well both player's scores.
            lineBreak();
            System.out.println(roundWinner + " wins the round!");
            lineBreak();
            System.out.println(player1.name + " currently has a score of " + player1.score + ".");
            System.out.println(player2.name + " currently has a score of " + player2.score + ".");
        }

        // Once all rounds have been played, initialize a string that will contain the name of the player with the highest score.
        String overallWinner;
        
        // If player1 has the greater score...
        if (player1.score > player2.score) {
            overallWinner = player1.name;
        // If player2 has the greater score...
        } else if (player1.score < player2.score) {
            overallWinner = player2.name;
        //If the scores are the same...
        } else {
            overallWinner = "Neither player";
        }
        
        // Print the final scores and the name of the winner.
        lineBreak();
        System.out.println("--------FINAL RESULTS--------");
        System.out.println(player1.name + " has a final score of " + player1.score + ".");
        System.out.println(player2.name + " has a final score of " + player2.score + ".");
        System.out.println(overallWinner + " wins the game.");
        
    }
    
    private static void lineBreak(){
        System.out.println("");
    }

}
