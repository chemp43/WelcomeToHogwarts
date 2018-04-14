package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SortingClass extends AppCompatActivity {
    Button continuePatronus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_class);
        continuePatronus=(Button)findViewById(R.id.btnContinuePatronus);
        continuePatronus.setOnClickListener(btnContinuePatronus);
    }
    Button.OnClickListener btnContinuePatronus = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(SortingClass.this, Patronus.class));
        }
    };

}
