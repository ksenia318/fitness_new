package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        CardView button_registr=(CardView) findViewById(R.id.button_registr);
        button_registr.setOnClickListener(this::onClick);
        CardView button_auth=(CardView) findViewById(R.id.button_skip);
        button_auth.setOnClickListener(this::onClick_1);
    }

    public void onClick(View view) {
        Intent intent;
        intent = new Intent(this,Registration.class);
        startActivity(intent);
    }

    public void onClick_1(View view) {
        Intent intent;
        intent = new Intent(this,Authorization.class);
        startActivity(intent);
    }
}