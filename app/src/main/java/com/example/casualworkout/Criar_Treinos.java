package com.example.casualworkout;


import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Criar_Treinos extends AppCompatActivity {

    private static final String LOG_TAG = Criar_Treinos.class.getSimpleName();
    String op = "";

    private EditText EditTreino;
    public static final String EXTRA_REPLY = "com.example.android.treinolist.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_treinos);
        EditTreino = findViewById(R.id.edit_treino);
    }

    public void Save(View view) {
        Log.d(LOG_TAG, "Save");
        Intent intent = new Intent();

        if (TextUtils.isEmpty(EditTreino.getText())) {
            setResult(RESULT_CANCELED, intent);
        } else {
            String word = EditTreino.getText().toString();
            intent.putExtra(EXTRA_REPLY, word);
            setResult(RESULT_OK, intent);
        }
        finish();



    }

    public void Cancel(View view) {
        Log.d(LOG_TAG, "Cancel");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Escolha(){
        if(op == "escrever"){
            Intent op1 = new Intent(this,Escrever_Ex.class);
            startActivity(op1);
        }else if(op == "Escolher"){
            Intent op2 = new Intent(this,Exercicios.class);
            startActivity(op2);
        }
    }

    public void AddEx(View view) {
        Log.d(LOG_TAG, "Add Exercise");
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(Criar_Treinos.this);
        // Set the dialog title and message.
        myAlertBuilder.setTitle("Adicionar Exercício:");
        myAlertBuilder.setMessage("Escolha ou escreva o exercício:");
        // Add the dialog buttons.
        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton("Escrever", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        //Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        op = "escrever";
                    }
                });
        myAlertBuilder.setNegativeButton("Escolher", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        //Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        op = "Escolher";
                    }
                });
        myAlertBuilder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Escolha();
            }
        });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}