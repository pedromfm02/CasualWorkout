package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Exercicios_2 extends AppCompatActivity {

    private static final String LOG_TAG = Exercicios_2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios2);
    }

    public void Save(View view) {
        Log.d(LOG_TAG, "Save");
        Intent intent = new Intent(this, EditTreino.class);
        startActivity(intent);
    }

    public void Cancel(View view) {
        Log.d(LOG_TAG, "Cancel");
        Intent intent = new Intent(this, EditTreino.class);
        startActivity(intent);
    }
}