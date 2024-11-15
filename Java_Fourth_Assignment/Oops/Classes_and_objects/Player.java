package Oops.Classes_and_objects;

public class Player {
    // Attributes
    private String name;
    private String position;
    private int jerseyNumber;

    // Constructor
    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    // Methods
    public void playGame() {
        System.out.println(name + " is playing in position " + position + " with jersey number " + jerseyNumber + ".");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
    
}