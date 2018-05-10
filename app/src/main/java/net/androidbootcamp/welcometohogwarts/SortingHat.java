package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SortingHat extends AppCompatActivity {
    Button grifSub;
    Button slySub;
    Button ravenSub;
    Button huffSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPref.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_hat);
        grifSub = (Button) findViewById(R.id.btnGrif);
        slySub = (Button) findViewById(R.id.btnSly);
        huffSub = (Button) findViewById(R.id.btnHuff);
        ravenSub = (Button) findViewById(R.id.btnRaven);
        grifSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int grif = 0;
                editor.putInt("classPOS", grif);
                editor.commit();
                startActivity(new Intent(SortingHat.this, SortingClass.class));
            }
        });
        slySub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int sly = 1;
                editor.putInt("classPOS", sly);
                editor.commit();
                startActivity(new Intent(SortingHat.this, SortingClass.class));
            }
        });
        huffSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int huff = 2;
                editor.putInt("classPOS", huff);
                editor.commit();
                startActivity(new Intent(SortingHat.this, SortingClass.class));
            }
        });
        ravenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int raven = 3;
                editor.putInt("classPOS", raven);
                editor.commit();
                startActivity(new Intent(SortingHat.this, SortingClass.class));
            }
        });
    }
}