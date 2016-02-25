package com.example.seth.developmenttest;

/**
 * Created by Seth on 2/24/16.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

class MyCurrentLoctionListener implements LocationListener {

    private static final int MY_PERMISSION_ACCESS_COARSE_LOCATION = 11;
    public String myLocation;
    private TextView mTextView;

    MyCurrentLoctionListener(TextView tv) {
        this.mTextView = tv;
    }

    @Override
    public void onLocationChanged(Location location) {
        location.getLatitude();
        Log.d("this", String.valueOf(location.getLongitude()));
        Log.d("what", "ever");
        mTextView.setText("Latitude = " + location.getLatitude() + "\n Longitude = " + location.getLongitude());
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}