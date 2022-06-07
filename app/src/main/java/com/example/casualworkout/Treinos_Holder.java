package com.example.casualworkout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class Treinos_Holder extends RecyclerView.ViewHolder {
    private final TextView TreinoView;

    private Treinos_Holder(View itemView) {
        super(itemView);
        TreinoView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        TreinoView.setText(text);
    }

    static Treinos_Holder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Treinos_Holder(view);
    }
}