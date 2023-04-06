package Week06FinalProject;

public class Card {

    // Fields:

    private int value;
    private String name;

    // Constructor:

    public Card(String name, int val) {
        this.name = name;
        this.value = val;
    }

    // Getters:

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    // Setters:

    public void setValue(int val) {
        this.value = val;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods:

    public void describe() {
        System.out.println((this.name == "Joker" ? "A " : "The ") + this.name + ", with a value of " + this.value);
    }
}
