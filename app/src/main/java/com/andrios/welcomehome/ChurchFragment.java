package com.andrios.welcomehome;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * This fragment will display a simple list of churches in the Chula Vista Area
 */
public class ChurchFragment extends Fragment {

    /**
     * Class Constructor
     * Should be empty
     */
    public ChurchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        //This object creates all sample data for the app.  Keeps fake data building routines out
        //of the rest of the app.
        AndriosData ad = new AndriosData();

        // get a list of churches
        ArrayList<Location> churches = ad.getChurches();

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getContext(), churches, R.color.category_churches);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        //Make listView Clickable
        listView.setClickable(true);

        /**
         * onItemClickListener pulls associated Location from adapter in order to access imageResource
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //Location item returned from listView... used to create Intent to open Details Activity
                Location l = (Location) (listView.getItemAtPosition(position));

                //TODO: remove TOAST and add intent to go to details view.
                Toast toast=Toast.makeText(rootView.getContext(),l.getName(),Toast.LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();
            }
        });
        return rootView;
    }
}
