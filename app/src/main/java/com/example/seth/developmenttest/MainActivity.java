package com.example.seth.developmenttest;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    Button btnShowLocation;

    GPSTracker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_test);

        btnShowLocation = (Button) findViewById(R.id.button1);

        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gps = new GPSTracker(MainActivity.this);

                if (gps.canGetLocation()) {
                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    String coords = (String) "Lat: " + latitude + "\nLong: "
                            + longitude;
                    setLabel(coords);
                } else {
                    gps.showSettingsAlert();
                }
            }
        });
    }

    public void setLabel(String s) {
        TextView info1 = (TextView) findViewById(R.id.info1);
        info1.setText(s);
    }
}
