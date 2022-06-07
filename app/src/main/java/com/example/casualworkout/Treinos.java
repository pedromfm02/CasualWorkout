package com.example.casualworkout;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Treinos {

    @PrimaryKey
    @NonNull
    public String Nome_Treino;

    public String getNome_Treino() {
        return Nome_Treino;
    }


}