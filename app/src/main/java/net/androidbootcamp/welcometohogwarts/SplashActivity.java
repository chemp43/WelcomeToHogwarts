package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer hpTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        hpTheme = MediaPlayer.create(this, R.raw.hptheme);
        hpTheme.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this,SortingHat.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,7000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        hpTheme.release();
        finish();
    }
}
