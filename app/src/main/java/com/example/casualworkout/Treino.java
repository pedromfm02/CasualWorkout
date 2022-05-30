package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Treino extends AppCompatActivity {

    private static final String LOG_TAG = Criar_Treinos.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treino);
    }

    public void Treinar(View view) {
        Log.d(LOG_TAG, "Começa treino");
        Intent intent = new Intent(this, DoTreino.class);
        startActivity(intent);
    }

    public void Editar(View view) {
        Log.d(LOG_TAG, "Edita treino");
        Intent intent = new Intent(this, EditTreino.class);
        startActivity(intent);
    }
}