package com.example.casualworkout.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.casualworkout.Exercicios;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Treinos.class}, version = 1, exportSchema = true)
public abstract class CasualWorkoutDB extends RoomDatabase {

    public abstract Treinos_DAO TreinosDao();


    private static volatile CasualWorkoutDB INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static CasualWorkoutDB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CasualWorkoutDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    CasualWorkoutDB.class, "CasualWorkout_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}