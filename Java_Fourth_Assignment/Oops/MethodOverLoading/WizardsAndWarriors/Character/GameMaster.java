package Oops.MethodOverLoading.WizardsAndWarriors.Character;

public class GameMaster {

    public static final String WALKING = "walking";
    public static final String HORSEBACK = "on horseback";

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() +
               " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(String travelMethod) {
        if (travelMethod.equals(HORSEBACK)) {
            return "You're traveling to your destination on horseback.";
        } else {
            return "You're traveling to your destination by walking.";
        }
    }

    public String describe(Character character, Destination destination, String travelMethod) {
        return describe(character) + "\n" + describe(travelMethod) + "\n" + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + "\n" + describe(WALKING) + "\n" + describe(destination);
    }

    public static void main(String[] args) {

        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        GameMaster gameMaster = new GameMaster();

        System.out.println(gameMaster.describe(character));
        System.out.println(gameMaster.describe(destination));
        System.out.println(gameMaster.describe(HORSEBACK));
        System.out.println(gameMaster.describe(character, destination, HORSEBACK));
        System.out.println(gameMaster.describe(character, destination));
    }
}
