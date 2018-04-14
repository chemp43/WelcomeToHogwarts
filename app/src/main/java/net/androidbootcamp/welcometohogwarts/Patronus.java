package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patronus extends AppCompatActivity {
    Button distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patronus);
        distance=(Button)findViewById(R.id.btnDistance);
        distance.setOnClickListener(btnDistance);
    }
    Button.OnClickListener btnDistance = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Patronus.this, Distance.class));

        }
    };

}
