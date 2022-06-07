package com.example.casualworkout;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

class MP_ListAdapter extends ListAdapter<Treinos, MP_Holder> {

    public MP_ListAdapter(@NonNull DiffUtil.ItemCallback<Treinos> diffCallback) {
        super(diffCallback);
    }

    @Override
    public MP_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return MP_Holder.create(parent);
    }

    @Override
    public void onBindViewHolder(MP_Holder holder, int position) {
        Treinos current = getItem(position);
        holder.bind(current.getNome_Treino());
    }

    static class TreinoDiff extends DiffUtil.ItemCallback<Treinos> {

        @Override
        public boolean areItemsTheSame(@NonNull Treinos oldItem, @NonNull Treinos newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Treinos oldItem, @NonNull Treinos newItem) {
            return oldItem.getNome_Treino().equals(newItem.getNome_Treino());
        }
    }
}
