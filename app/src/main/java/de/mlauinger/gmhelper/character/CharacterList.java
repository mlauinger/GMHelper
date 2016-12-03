package de.mlauinger.gmhelper.character;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.activeandroid.query.Select;

import java.util.List;

import de.mlauinger.gmhelper.R;

public class CharacterList extends Fragment {

    public CharacterList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Character> characters = new Select().all().from(Character.class).execute();
        CharacterListAdapter characterListAdapter = new CharacterListAdapter(getActivity(), characters);

        View rootView = inflater.inflate(R.layout.fragment_character_list, container, false);

        ListView characterListView = (ListView) rootView.findViewById(R.id.listview_characterlist);
        characterListView.setAdapter(characterListAdapter);
        return rootView;
    }
}
