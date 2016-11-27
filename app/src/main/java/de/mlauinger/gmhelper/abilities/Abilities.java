package de.mlauinger.gmhelper.abilities;

/**
 *
 */

public class Abilities {

    private final Strength strength;
    private final Constitution constitution;
    private final Dexterity dexterity;
    private final Intelligence intelligence;
    private final Wisdom wisdom;
    private final Charisma charisma;

    public Abilities() {
        this.strength = new Strength();
        this.constitution = new Constitution();
        this.dexterity = new Dexterity();
        this.intelligence = new Intelligence();
        this.wisdom = new Wisdom();
        this.charisma = new Charisma();
    }

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
