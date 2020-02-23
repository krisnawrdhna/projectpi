package com.example.projectpi;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapjakarta extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapjakarta);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

//        mMap.getUiSettings().isZoomControlsEnabled();
        mMap = googleMap;


        LatLng jakarta = new LatLng(-6.175232, 106.827078);
        mMap.addMarker(new MarkerOptions().position(jakarta).title("JAKARTA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jakarta,8));
    }
}
