package Week06FinalProject;

public class Card {

    // PRIVATE FIELD INITIALIZATIONS:

    private int value;
    private String name;

    // CONSTRUCTORS:

    public Card(String name, int val) {
        this.name = name;
        this.value = val;
    }

    // GETTERS:

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    // SETTERS:

    public void setValue(int val) {
        this.value = val;
    }

    public void setName(String name) {
        this.name = name;
    }

    // PUBLIC METHODS:

    public void describe() {
        System.out.println((this.name == "Joker" ? "a " : "the ") + this.name + ", with a value of " + this.value);
    }
}
