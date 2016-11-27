package de.mlauinger.gmhelper.character;

/**
 *
 */

public class Attribute {
    private final String name;
    private int value;
    private int bonus;

    public Attribute(String name, int value) {
        this.name = name;
        this.value = value;
        this.bonus = calculateBonus(value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.bonus = calculateBonus(value);
    }

    public int getBonus() {
        return bonus;
    }

    private int calculateBonus(int value) {
        int temp = value - 10;
        int bonus = temp / 2;
        if ((temp % 2) < 0) {
            bonus = bonus - 1;
        }
        return bonus;
    }
}
