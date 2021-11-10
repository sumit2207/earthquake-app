package com.example.android.quakereport;

public class Earthquake {
    private  String mLocation;
    private double mMagnitude;
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude,String location,long date,String url){
        mLocation=location;
        mMagnitude=magnitude;
        mTimeInMilliseconds=date;
        mUrl=url;
    }

    public String getLocation(){return mLocation;}
    public double getMagnitude(){return mMagnitude;}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }

}
