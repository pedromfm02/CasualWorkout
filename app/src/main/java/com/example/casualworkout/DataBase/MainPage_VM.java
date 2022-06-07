package com.example.casualworkout.DataBase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MainPage_VM  extends AndroidViewModel {
    private Treino_repository Repository;
    private final LiveData<List<Treinos>> lst_Tr;

    public MainPage_VM(@NonNull Application application) {
        super(application);
        Repository = new Treino_repository(application);
        lst_Tr = Repository.getTreinos();
    }

    LiveData<List<Treinos>> getTreinos() {
        return lst_Tr;
    }

    public void insert(Treinos treino) {
        Repository.insert(treino);
    }
}
