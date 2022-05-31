package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EditTreino extends AppCompatActivity {

    private static final String LOG_TAG = Criar_Treinos.class.getSimpleName();
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_treino);
    }

    public void Save(View view) {
        Log.d(LOG_TAG, "Save");
        Intent intent = new Intent(this, Treino.class);
        startActivity(intent);

        //Guardar os dados novos
    }

    public void Cancel(View view) {
        Log.d(LOG_TAG, "Cancel");
        Intent intent = new Intent(this, Treino.class);
        startActivity(intent);

        // não faz nenhuma mudança no treino
    }

    public void Escolha_ADD(){
        if(op == "escrever"){
            Intent op1 = new Intent(this,Escrever_Ex_2.class);
            startActivity(op1);
        }else if(op == "Escolher"){
            Intent op2 = new Intent(this,Exercicios_2.class);
            startActivity(op2);
        }
    }

    public void Escolha_Edit(){
        if(op == "editar"){
            Intent op1 = new Intent(this,EditEX.class);
            startActivity(op1);
        }else if(op == "remover"){

        }
    }

    public void AddEx(View view) {
        Log.d(LOG_TAG, "Add Exercise");
        AlertDialog.Builder Adicionar = new AlertDialog.Builder(EditTreino.this);
        // Set the dialog title and message.
        Adicionar.setTitle("Adicionar Exercício:");
        Adicionar.setMessage("Escolha ou escreva o exercício:");
        // Add the dialog buttons.
        // Add the dialog buttons.
        Adicionar.setPositiveButton("Escrever", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        //Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        op = "escrever";
                    }
                });
        Adicionar.setNegativeButton("Escolher", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        //Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        op = "Escolher";
                    }
                });
        Adicionar.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Escolha_ADD();
            }
        });
        // Create and show the AlertDialog.
        Adicionar.show();
    }

    public void edit_ex(View view) {
        Log.d(LOG_TAG, "Edit Exercise");
        AlertDialog.Builder Editar = new AlertDialog.Builder(EditTreino.this);
        // Set the dialog title and message.
        Editar.setTitle("Editar Exercício:");
        Editar.setMessage("Remover ou Edite o Exercício:");
        // Add the dialog buttons.
        // Add the dialog buttons.
        Editar.setPositiveButton("Editar", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        //Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        op = "editar";
                    }
                });
        Editar.setNegativeButton("Remover", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        //Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        op = "remover";
                    }
                });
        Editar.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Escolha_Edit();
            }
        });
        // Create and show the AlertDialog.
        Editar.show();
    }

}