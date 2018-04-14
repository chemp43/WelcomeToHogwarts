package net.androidbootcamp.welcometohogwarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SortingHat extends AppCompatActivity {
    Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_hat);
        submitBtn=(Button)findViewById(R.id.btnSortingSubmit);
        submitBtn.setOnClickListener(btnSortingSubmit);
    }
    Button.OnClickListener btnSortingSubmit = new Button.OnClickListener() {

        @Override
        public void onClick(View view) {
            startActivity(new Intent(SortingHat.this,SortingClass.class));

        }
    };

}
