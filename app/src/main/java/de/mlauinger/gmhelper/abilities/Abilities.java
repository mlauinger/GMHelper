package de.mlauinger.gmhelper.abilities;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 *
 */

@Table(name = "Abilities")
public class Abilities extends Model{

    @Column(name = "str")
    private final Strength strength;

    @Column(name = "con")
    private final Constitution constitution;

    @Column(name = "dex")
    private final Dexterity dexterity;

    @Column(name = "int")
    private final Intelligence intelligence;

    @Column(name = "wis")
    private final Wisdom wisdom;

    @Column(name = "cha")
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
