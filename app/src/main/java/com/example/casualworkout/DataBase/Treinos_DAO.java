package com.example.casualworkout.DataBase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Treinos_DAO {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Treinos treino);

    @Query("DELETE FROM Treinos")
    void deleteAll();

    @Query("SELECT Nome_Treino FROM Treinos")
    LiveData<List<Treinos>> Lst_Treinos();
}
