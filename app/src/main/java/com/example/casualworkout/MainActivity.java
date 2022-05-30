package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddTr(View view) {
        Log.d(LOG_TAG, "AddEx clicked!");
        Intent intent = new Intent(this, Criar_Treinos.class);
        startActivity(intent);
    }

    public void do_treino(View view) {
        Log.d(LOG_TAG, "Treino clicked!");
        Intent intent = new Intent(this, Treino.class);
        startActivity(intent);
    }
}