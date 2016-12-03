package de.mlauinger.gmhelper.character;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import de.mlauinger.gmhelper.abilities.Abilities;

@Table(name = "character")
public class Character extends Model {

    @Column(name = "name")
    private String name;

    @Column(name = "class")
    private String characterClass;

    @Column(name = "armor_class")
    private int armorClass;

    @Column(name = "abilities")
    private Abilities abilities;

    @Column(name = "max_hp")
    private int maxHP;

    public Character(String name, String characterClass, int armorClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.armorClass = armorClass;
        this.abilities = new Abilities();
    }

    public Character() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }
}
