package de.mlauinger.gmhelper.character;

import de.mlauinger.gmhelper.abilities.Abilities;
import de.mlauinger.gmhelper.abilities.Strength;

public class CharacterModel {
    private String name;
    private String characterClass;
    private int armorClass;
    private Abilities abilities;

    public CharacterModel(String name, String characterClass, int armorClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.armorClass = armorClass;
        this.abilities = new Abilities();
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
}
