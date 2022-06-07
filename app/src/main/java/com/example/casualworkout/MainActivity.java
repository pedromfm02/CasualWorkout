package com.example.casualworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MainPage_VM MP_ViewModel;

    public static final int Criar_Treino_ACTIVITY_REQUEST_CODE = 1;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final MP_ListAdapter adapter = new MP_ListAdapter(new MP_ListAdapter.TreinoDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MP_ViewModel = new ViewModelProvider(this).get(MainPage_VM.class);

        MP_ViewModel.getLst_tr().observe(this, treinos -> {
            // Update the cached copy of the words in the adapter.
            adapter.submitList(treinos);
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Criar_Treino_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            Treinos treino = new Treinos();
            MainPage_VM.insert(treino);
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    R.string.empty_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void AddTr(View view) {
        Log.d(LOG_TAG, "AddEx clicked!");
        Intent intent = new Intent(this, Criar_Treinos.class);
        startActivity(intent);
    }

}