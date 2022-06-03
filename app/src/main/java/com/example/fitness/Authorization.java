package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Authorization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        ImageView button_back_1=(ImageView) findViewById(R.id.button_back_1);
        button_back_1.setOnClickListener(this::onClick);
        CardView button_further_1=(CardView) findViewById(R.id.button_further_1);
        button_further_1.setOnClickListener(this::onClick_1);
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