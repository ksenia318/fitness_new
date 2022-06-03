package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        ImageView logo=findViewById(R.id.logo);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animat);

        ViewCompat.animate(logo)
                        .rotationBy(360F)
                                .setDuration(6000L)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(loading.this, MainActivity.class));
                    }
                })
                                        .start();

        logo.startAnimation(animation);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(loading.this, MainActivity.class));
//            }
//        },2000);
    }
}