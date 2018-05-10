package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SortingClass extends AppCompatActivity {
    Button continuePatronus;
    Integer[] Houses = {R.drawable.gryffindor,R.drawable.slytherin,R.drawable.hufflepuff,R.drawable.ravenclawd};
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_class);
        final ImageView pic = (ImageView) findViewById(R.id.sortingClass);
        continuePatronus=(Button)findViewById(R.id.btnContinuePatronus);
        continuePatronus.setOnClickListener(btnContinuePatronus);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        pic.setImageResource(Houses[sharedPref.getInt("classPOS",0)]);

    }

    Button.OnClickListener btnContinuePatronus = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(SortingClass.this, Patronus.class));
        }
    };

}
