package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Exercicios extends AppCompatActivity {

    private static final String LOG_TAG = Exercicios.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);
    }

    public void Save(View view) {
        Log.d(LOG_TAG, "Save");
        Intent intent = new Intent(this, Criar_Treinos.class);
        startActivity(intent);
    }

    public void Cancel(View view) {
        Log.d(LOG_TAG, "Cancel");
        Intent intent = new Intent(this, Criar_Treinos.class);
        startActivity(intent);
    }
}