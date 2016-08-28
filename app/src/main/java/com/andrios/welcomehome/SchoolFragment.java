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
 */
public class SchoolFragment extends Fragment {



    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        AndriosData ad = new AndriosData();

        // get a list of schools
        ArrayList<Location> schools = ad.getSchools();


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getContext(), schools, R.color.category_schools);



        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //Make listView Clickable
        listView.setClickable(true);

        /**
         * onItemClickListener pulls associated word from adapter in order to access imageResource
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //Location item returned from listView... used to figure out what audio to play
                Location l = (Location) (listView.getItemAtPosition(position));

                //TODO: remove TOAST and add intent to go to details view.
                Toast toast=Toast.makeText(rootView.getContext(),l.getName(),Toast.LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();

            }
        });
        return rootView;
    }
    
    @Override
    public void onStop(){
        super.onStop();

    }


}
