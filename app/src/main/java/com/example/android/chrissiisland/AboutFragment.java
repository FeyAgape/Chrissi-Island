package com.example.android.chrissiisland;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of words about the location.
 */
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.about0));
        locations.add(new Location(R.string.about1));
        locations.add(new Location(R.string.about2));
        locations.add(new Location(R.string.about3));
        locations.add(new Location(R.string.about4));
        locations.add(new Location(R.string.about5));
        locations.add(new Location(R.string.about6));
        locations.add(new Location(R.string.about7));
        locations.add(new Location(R.string.about8));
        locations.add(new Location(R.string.about9));
        locations.add(new Location(R.string.about10));
        locations.add(new Location(R.string.about11));
        locations.add(new Location(R.string.about12));
        locations.add(new Location(R.string.about13));
        locations.add(new Location(R.string.about14));
        locations.add(new Location(R.string.about15));


        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.color_about);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}