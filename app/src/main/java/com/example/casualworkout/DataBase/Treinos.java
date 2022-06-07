package com.example.casualworkout.DataBase;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Treinos {

    @PrimaryKey
    @NonNull
    public String Nome_Treino;

    public String Descrição;

    public String getTreinos() {
        return Nome_Treino;
    }

    public String getDescrição(){
        return Descrição;
    }
}