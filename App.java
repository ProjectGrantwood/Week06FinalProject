package Week06FinalProject;

public class App {

    public static void main(String[] args) {
        Player p1 = new Player("John");
        Player p2 = new Player("Sally");
        Deck bicycles = new Deck();
        bicycles.shuffle();

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                p1.draw(bicycles);
            } else {
                p2.draw(bicycles);
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println("");
            System.out.println("--------ROUND " + i + "--------");
            Card p1Card = p1.flip();
            System.out.println(p1.name + " flips...");
            p1Card.describe();
            Card p2Card = p2.flip();
            System.out.println("");
            System.out.println(p2.name + " flips...");
            p2Card.describe();
            String winner = "Neither player";
            if (p1Card.getValue() > p2Card.getValue()) {
                p1.incrementScore();
                winner = p1.name;
            } else if (p1Card.getValue() < p2Card.getValue()) {
                p2.incrementScore();
                winner = p2.name;
            }
            System.out.println("");
            System.out.println(p1.name + " has a score of " + p1.score + ".");
            System.out.println(p2.name + " has a score of " + p2.score + ".");
            System.out.println(winner + " wins the round.");
        }

        String winner = "Neither player";
        if (p1.score > p2.score) {
            winner = p1.name;
        } else if (p1.score < p2.score) {
            winner = p2.name;
        }
        System.out.println("");
        System.out.println("--------FINAL RESULTS--------");
        System.out.println(p1.name + " has a final score of " + p1.score + ".");
        System.out.println(p2.name + " has a final score of " + p2.score + ".");
        System.out.println(winner + " wins the game.");

    }

}
