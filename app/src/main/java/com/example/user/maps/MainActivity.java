package com.example.user.maps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    LatLng victoria=new LatLng(40.7128,-74.0059);
    GoogleMap googleMap;
    Marker mymarker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            if(googleMap==null) {
                googleMap=((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
            }
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(victoria,15));
            mymarker=googleMap.addMarker(new MarkerOptions().position(victoria).title("Victoria"));
        }catch (Exception e){

            e.printStackTrace();
        }

    }
}
