package Oops.MethodOverLoading.WizardsAndWarriors.Character;

public class Character {
    private String characterClass;
    private int level;
    private int hitPoints;

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
