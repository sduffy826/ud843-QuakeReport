package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class represents the attributes for an earthquake, it has the magnitude, city it was
 * located in and the date of the event.
 *
 * Created by seanduffy on 5/13/17.
 */

public class EarthQuake {
    private double mMagnitude;
    private String mLocation;
    private Date mDate;

    public EarthQuake(double magnitude, String location, Date date) {
        setmMagnitude(magnitude);
        setmLocation(location);
        setmDate(date);
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getHumanDate() {
        return new SimpleDateFormat("MMM d, yyyy").format(mDate);
    }
}
