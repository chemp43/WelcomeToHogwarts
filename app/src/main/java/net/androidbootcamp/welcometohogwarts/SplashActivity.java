package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer hpTheme;
    Integer[] Houses = {R.drawable.gryffindor,R.drawable.slytherin,R.drawable.hufflepuff,R.drawable.ravenclawd};

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

        /*for(int i=0;i<Houses.length;i++){
            Integer.toString(i);
            String pos = "key" + (i+1); //input key position for shared pref...1-4
            editor.putInt(pos,i);
        }
        editor.putInt("key5",Houses.length);*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        hpTheme.release();
        finish();
    }
}
//change so i can commit again