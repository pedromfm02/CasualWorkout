package com.example.casualworkout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

;


public class DoTreino extends AppCompatActivity {

    Chronometer chronometer;
    Button btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_treino);

        chronometer = findViewById(R.id.chronometer);
        btReset = findViewById(R.id.bt_reset);

    }
}