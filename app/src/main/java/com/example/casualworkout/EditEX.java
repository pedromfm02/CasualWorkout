package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EditEX extends AppCompatActivity {

    private static final String LOG_TAG = Criar_Treinos.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ex);
    }

    public void Save(View view) {
        Log.d(LOG_TAG, "Save");
        Intent intent = new Intent(this, EditTreino.class);
        startActivity(intent);

        //Guardar os dados novos
    }

    public void Cancel(View view) {
        Log.d(LOG_TAG, "Cancel");
        Intent intent = new Intent(this, EditTreino.class);
        startActivity(intent);

        // não faz nenhuma mudança no exercicio
    }
}