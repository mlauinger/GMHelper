package de.mlauinger.gmhelper.abilities;

/**
 *
 */

public class Abilities {

    private Strength strength;
    private Constitution constitution;
    private Dexterity dexterity;
    private Intelligence intelligence;
    private Wisdom wisdom;
    private Charisma charisma;

    public Abilities(Strength strength, Constitution constitution, Dexterity dexterity, Intelligence intelligence, Wisdom wisdom, Charisma charisma) {
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Strength getStrength() {
        return strength;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public Dexterity getDexterity() {
        return dexterity;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public Wisdom getWisdom() {
        return wisdom;
    }

    public Charisma getCharisma() {
        return charisma;
    }
}
