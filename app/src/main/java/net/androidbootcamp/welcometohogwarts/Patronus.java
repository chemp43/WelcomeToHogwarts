package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Patronus extends AppCompatActivity {
    Button distance;
    private ImageView imageViewPatronus;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patronus);
        distance=(Button)findViewById(R.id.btnDistance);
        distance.setOnClickListener(btnDistance);

        imageViewPatronus = findViewById(R.id.image_patronus);
        imageViewPatronus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changePicture();
            }
    });

    }

    private void changePicture (){
        int ranNum = rng.nextInt(4) +1 ;

        switch (ranNum){
            case 1:
                imageViewPatronus.setImageResource(R.drawable.otter);
                break;
            case 2:
                imageViewPatronus.setImageResource(R.drawable.stag);
                break;
            case 3:
                imageViewPatronus.setImageResource(R.drawable.fox);
                break;
            case 4:
                imageViewPatronus.setImageResource(R.drawable.rabbit);
                break;
        }


    }


    Button.OnClickListener btnDistance = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Patronus.this, Distance.class));

        }
    };

}
