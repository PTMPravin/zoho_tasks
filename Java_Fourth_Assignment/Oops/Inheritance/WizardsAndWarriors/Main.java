package Oops.Inheritance.WizardsAndWarriors;

abstract class Fighter {

    public abstract boolean isVulnerable();
    public abstract int getDamagePoints(Fighter opponent);
    
    public String toString() {
        return "Fighter";
    }
}

class Warrior extends Fighter {
    
    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter opponent) {
        return opponent.isVulnerable() ? 10 : 6;
    }

    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    public boolean isVulnerable() {
        return !spellPrepared;
    }

    public int getDamagePoints(Fighter opponent) {
        return spellPrepared ? 12 : 3;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }
}



public class Main {
    public static void main(String[] args) {
        
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println(warrior);

        System.out.println(wizard);

        System.out.println("Warrior vulnerable: " + warrior.isVulnerable());

        System.out.println("Wizard vulnerable: " + wizard.isVulnerable());

        wizard.prepareSpell();
        System.out.println("Wizard vulnerable after preparing spell: " + wizard.isVulnerable());

        System.out.println("Warrior deals damage to Wizard: " + warrior.getDamagePoints(wizard));

        System.out.println("Wizard deals damage to Warrior: " + wizard.getDamagePoints(warrior));
    }
}
