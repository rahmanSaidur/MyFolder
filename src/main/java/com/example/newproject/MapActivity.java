package com.example.newproject;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
   GoogleMap map;
   SupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
       mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.google_Map);
       mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
      map=googleMap;
        LatLng Nstu=new LatLng(22.791536,91.098092);
        map.addMarker(new MarkerOptions().position(Nstu).title("You are here "));
        map.moveCamera(CameraUpdateFactory.newLatLng(Nstu));
    }
}
