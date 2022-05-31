package com.example.casualworkout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

;


public class DoTreino extends AppCompatActivity {

    private static final String LOG_TAG = DoTreino.class.getSimpleName();

    Chronometer chronometer;
    Button btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_treino);

        chronometer = findViewById(R.id.chronometer);
        btReset = findViewById(R.id.bt_reset);

    }

    public void end(View view) {
        Log.d(LOG_TAG, "Terminar");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}