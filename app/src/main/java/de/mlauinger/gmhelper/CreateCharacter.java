package de.mlauinger.gmhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import de.mlauinger.gmhelper.abilities.Abilities;
import de.mlauinger.gmhelper.abilities.Charisma;
import de.mlauinger.gmhelper.abilities.Constitution;
import de.mlauinger.gmhelper.abilities.Dexterity;
import de.mlauinger.gmhelper.abilities.Intelligence;
import de.mlauinger.gmhelper.abilities.Strength;
import de.mlauinger.gmhelper.abilities.Wisdom;
import de.mlauinger.gmhelper.character.Character;

public class CreateCharacter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.classes_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getClassField().setAdapter(adapter);
    }

    private Spinner getClassField() {
        return (Spinner) findViewById(R.id.character_class);
    }

    private String getClassValue() {
        return getClassField().getSelectedItem().toString();
    }

    private EditText getConstitutionField() {
        return (EditText) findViewById(R.id.constitution);
    }

    private int getConstitution() {
        return Integer.parseInt(getConstitutionField().getText().toString());
    }

    private EditText getStrengthField() {
        return (EditText) findViewById(R.id.strength);
    }

    private int getStrength() {
        return Integer.parseInt(getStrengthField().getText().toString());
    }

    private EditText getCharacterNameField() {
        return (EditText) findViewById(R.id.character_name);
    }

    private String getCharacterName() {
        return getCharacterNameField().getText().toString();
    }

    private EditText getDexterityField() {
        return (EditText) findViewById(R.id.dexterity);
    }

    private int getDexterity() {
        return Integer.parseInt(getDexterityField().getText().toString());
    }

    private EditText getIntelligenceField() {
        return (EditText) findViewById(R.id.intelligence);
    }

    private int getIntelligence() {
        return Integer.parseInt(getIntelligenceField().getText().toString());
    }

    private EditText getWisdomField() {
        return (EditText) findViewById(R.id.wisdom);
    }

    private int getWisdom() {
        return Integer.parseInt(getWisdomField().getText().toString());
    }

    private EditText getCharismaField() {
        return (EditText) findViewById(R.id.charisma);
    }

    private int getCharisma() {
        return Integer.parseInt(getCharismaField().getText().toString());
    }

    private EditText getACField() {
        return (EditText) findViewById(R.id.ac);
    }

    private int getAC() {
        return Integer.parseInt(getACField().getText().toString());
    }

    private EditText getMaxHPField() {
        return (EditText) findViewById(R.id.max_hp);
    }

    private int getMaxHP() {
        return Integer.parseInt(getMaxHPField().getText().toString());
    }


    public void saveCharacter(View view) {
        Character character = new Character();
        character.setName(getCharacterName());
        character.setCharacterClass(getClassValue());
        character.setArmorClass(getAC());
        character.setAbilities(
                new Abilities(new Strength(getStrength()), new Constitution(getConstitution()),
                        new Dexterity(getDexterity()), new Intelligence(getIntelligence()),
                        new Wisdom(getWisdom()), new Charisma(getCharisma())));
        character.save();
    }
}
