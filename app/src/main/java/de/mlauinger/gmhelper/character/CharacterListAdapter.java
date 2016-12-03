package de.mlauinger.gmhelper.character;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import de.mlauinger.gmhelper.R;


public class CharacterListAdapter extends ArrayAdapter<Character> {

    private List<Character> characters;

    public CharacterListAdapter(Context context, List<Character> objects) {
        super(context, 0, objects);
        this.characters = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Character character = getItem(position);

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_characterlist, parent, false);
        }

        TextView characterName = (TextView) convertView.findViewById(R.id.characterName);
        TextView characterClass = (TextView) convertView.findViewById(R.id.characterClass);
        TextView maxHP = (TextView) convertView.findViewById(R.id.max_hp);

        characterName.setText(character.getName());
        characterClass.setText(character.getCharacterClass());
        maxHP.setText(String.valueOf(character.getMaxHP()));

        return convertView;
    }
}
