package com.example.prueba2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class NewsViewHolder extends RecyclerView.ViewHolder {
    public TextView title;

    public TextView description;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.ID);
        description = (TextView) itemView.findViewById(R.id.clase);
    }
}
