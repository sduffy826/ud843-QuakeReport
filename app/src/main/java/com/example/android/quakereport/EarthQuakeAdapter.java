package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by seanduffy on 5/13/17.
 */

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {

    public EarthQuakeAdapter(Context context, ArrayList<EarthQuake> earthquakes) {
        // Call super with context, the listview resource (we'll do later) and list of object
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Block ensures we have a listItemView object to return; this listviews has the attributes
        // for an earthquake :)
        View listItemView = convertView;
        if (listItemView == null) {
            // List item doesn't exist create it
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the earthquake object at the position requested
        EarthQuake earthQuake = getItem(position);

        // Bind the attributes from the earthquake object to the view
        TextView tvMagniture = (TextView) listItemView.findViewById(R.id.magnitude);
        tvMagniture.setText(Double.toString(earthQuake.getmMagnitude()));

        TextView tvLocation = (TextView) listItemView.findViewById(R.id.city);
        tvLocation.setText(earthQuake.getmLocation());

        TextView tvDate = (TextView) listItemView.findViewById(R.id.date);
        tvDate.setText(earthQuake.getHumanDate());

        return listItemView;

    }



}
