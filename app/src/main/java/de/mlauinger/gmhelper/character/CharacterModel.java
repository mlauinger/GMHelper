package de.mlauinger.gmhelper.character;

public class CharacterModel {
    private String name;
    private String characterClass;
    private int armorClass;

    public CharacterModel(String name, String characterClass, int armorClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.armorClass = armorClass;
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
