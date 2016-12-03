package de.mlauinger.gmhelper.character;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import de.mlauinger.gmhelper.R;

public class CharacterList extends Fragment {

    public CharacterList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View rootView = inflater.inflate(R.layout.fragment_character_list, container, false);

        ListView aktienlisteListView = (ListView) rootView.findViewById(R.id.listview_aktienliste);

        return rootView;
    }
}
