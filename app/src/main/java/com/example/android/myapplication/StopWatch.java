package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class StopWatch extends AppCompatActivity {

    Button btnstart;
    ImageView icanchor;
    Animation roundingalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart =findViewById(R.id.btnget);
        icanchor = findViewById(R.id.icanchor);

        //Load animations

    }
}