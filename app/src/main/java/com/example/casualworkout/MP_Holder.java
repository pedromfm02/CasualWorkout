package com.example.casualworkout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MP_Holder extends RecyclerView.ViewHolder {
    private final TextView Nome_TR_View;

    private MP_Holder(View itemView) {
        super(itemView);
        Nome_TR_View = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        Nome_TR_View.setText(text);
    }

    static MP_Holder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new MP_Holder(view);
    }
}