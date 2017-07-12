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


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.about0));
        words.add(new Word(R.string.about1));
        words.add(new Word(R.string.about2));
        words.add(new Word(R.string.about3));
        words.add(new Word(R.string.about4));
        words.add(new Word(R.string.about5));
        words.add(new Word(R.string.about6));
        words.add(new Word(R.string.about7));
        words.add(new Word(R.string.about8));
        words.add(new Word(R.string.about9));
        words.add(new Word(R.string.about10));
        words.add(new Word(R.string.about11));
        words.add(new Word(R.string.about12));
        words.add(new Word(R.string.about13));
        words.add(new Word(R.string.about14));
        words.add(new Word(R.string.about15));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.color_about);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

                }