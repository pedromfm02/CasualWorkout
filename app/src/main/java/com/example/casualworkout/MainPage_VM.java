package com.example.casualworkout;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;



import java.util.List;

public class MainPage_VM  extends AndroidViewModel {
    private static Repository Repository;
    private final LiveData<List<Treinos>> lst_Tr;

    public MainPage_VM(@NonNull Application application) {
        super(application);
        Repository = new Repository(application);
        lst_Tr = Repository.getLst_tr();
    }

    public LiveData<List<Treinos>> getLst_tr() {
        return lst_Tr;
    }

    public static void insert(Treinos treino) {
        Repository.insert(treino);
    }
}
