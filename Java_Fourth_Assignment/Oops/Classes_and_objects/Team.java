package Oops.Classes_and_objects;

import java.util.List;

public class Team {
    // Attributes
    private String name;
    private String city;
    private String division;
    
    // A team has a list of players (1-to-many relationship)
    private List<Player> players;

    // Constructor
    public Team(String name, String city, String division, List<Player> players) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = players;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    // Methods
    public void playGame() {
        System.out.println(name + " team is playing a game.");
    }

    public void hireCoach() {
        System.out.println("Coach hired for " + name + " team.");
    }
}