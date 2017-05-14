/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            earthquakes.add(new EarthQuake(7.2, "San Francisco", dateFormat.parse("02/01/2016")));
            earthquakes.add(new EarthQuake(6.1, "London", dateFormat.parse("07/20/2015")));
            earthquakes.add(new EarthQuake(3.9, "Tokyo", dateFormat.parse("11/10/2014")));
            earthquakes.add(new EarthQuake(5.4, "Mexico City", dateFormat.parse("05/14/2014")));
            earthquakes.add(new EarthQuake(2.8, "Moscow", dateFormat.parse("01/31/2013")));
            earthquakes.add(new EarthQuake(4.9, "Rio de Janeiro", dateFormat.parse("08/19/2012")));
            earthquakes.add(new EarthQuake(1.6, "Paris", dateFormat.parse("10/30/2011")));

        }
        catch (Exception e) { }
        EarthQuakeAdapter quakeAdapter = new EarthQuakeAdapter(this, earthquakes);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.earthquake_list);

        earthquakeListView.setAdapter(quakeAdapter);

    }
}
