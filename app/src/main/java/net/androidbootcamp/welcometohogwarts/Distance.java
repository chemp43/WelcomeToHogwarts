package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class Distance extends AppCompatActivity
        implements OnMapReadyCallback {

    Button backSorting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_distance);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //Back to the Sorting Hat button
        backSorting=(Button)findViewById(R.id.backSorting);
        backSorting.setOnClickListener(btnBackSorting);
    }

    Button.OnClickListener btnBackSorting = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Distance.this, SortingHat.class));
        }
    };

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng sydney = new LatLng(51.5316, 0.1244);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Platform 9 and Three-Quarters (King Cross Station)"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
