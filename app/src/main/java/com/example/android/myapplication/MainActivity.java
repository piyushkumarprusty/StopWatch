package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash , tvSubSplash ;
    Button btnget;
    Animation atg;
    ImageView ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash = findViewById(R.id.tvSubSplash);
        btnget = findViewById(R.id.btnget);
        ivSplash = findViewById(R.id.ivSplash);

        // Animation
    }
}