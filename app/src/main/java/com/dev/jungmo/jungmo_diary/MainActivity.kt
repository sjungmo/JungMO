package com.dev.jungmo.jungmo_diary

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


class MainActivity : FragmentActivity(), OnMapReadyCallback {
    private lateinit var googleMaps: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragment = getSupportFragmentManager().findFragmentById(R.id.map) as SupportMapFragment
        fragment.getMapAsync(this)


    }

    override fun onMapReady(googleMap: GoogleMap) {
        val sydney = LatLng(-34.0, 151.0)
        googleMaps = googleMap
        googleMaps.addMarker(MarkerOptions().position(sydney).title("Marker in Sydeny!"))
        googleMaps.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}
