package com.example.casualworkout.DataBase;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

class Treino_repository {
    private Treinos_DAO Tr_DAO;
    private LiveData<List<Treinos>> lst_tr;


    Treino_repository(Application application) {
        CasualWorkoutDB db = CasualWorkoutDB.getDatabase(application);
        Tr_DAO = db.TreinosDao();
        lst_tr = Tr_DAO.Lst_Treinos();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Treinos>> getTreinos() {
        return lst_tr;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Treinos treinos) {
        CasualWorkoutDB.databaseWriteExecutor.execute(() -> {
            Tr_DAO.insert(treinos);
        });
    }
}
