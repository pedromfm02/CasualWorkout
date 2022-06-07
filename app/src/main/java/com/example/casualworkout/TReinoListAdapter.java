package com.example.casualworkout;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.casualworkout.DataBase.Treinos;

class TreinoListAdapter extends ListAdapter<Treinos, Treinos_Holder> {

    public TreinoListAdapter(@NonNull DiffUtil.ItemCallback<Treinos> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Treinos_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return Treinos_Holder.create(parent);
    }

    @Override
    public void onBindViewHolder(Treinos_Holder holder, int position) {
        Treinos current = getItem(position);
        holder.bind(current.getTreinos());
    }

    static class TreinoDiff extends DiffUtil.ItemCallback<Treinos> {

        @Override
        public boolean areItemsTheSame(@NonNull Treinos oldItem, @NonNull Treinos newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Treinos oldItem, @NonNull Treinos newItem) {
            return oldItem.getTreinos().equals(newItem.getTreinos());
        }
    }
}
