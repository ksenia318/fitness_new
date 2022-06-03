package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ImageView button_back=(ImageView) findViewById(R.id.button_back);
        button_back.setOnClickListener(this::onClick);
        CardView button_further=(CardView) findViewById(R.id.button_further);
        button_further.setOnClickListener(this::onClick_1);
    }

    public void onClick(View view) {
        Intent intent;
        intent = new Intent(this,Activity_3.class);
        startActivity(intent);
    }

    public void onClick_1(View view) {
        Intent intent;
        intent = new Intent(this,Splash_screen.class);
        startActivity(intent);
    }
}