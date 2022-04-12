package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //OCULTAR ACTION BAR
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

        cardInicio = findViewById(R.id.cardINICIO);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}