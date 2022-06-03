package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView button_okey=(ImageView) findViewById(R.id.okey);
        button_okey.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        Intent intent;
        intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}