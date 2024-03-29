package com.example.prueba2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    private Context context;

    private List<ApiObject> apiObjectList;

    public NewAdapter(Context context, List<ApiObject> apiObjects){
        this.context = context;
        this.apiObjectList =  apiObjects;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        ApiObject apiObject = apiObjectList.get(position);
        holder.title.setText(apiObject.getNombre());
        holder.description.setText(apiObject.getClase());
        Picasso.get().load(apiObject.getFoto()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return apiObjectList.size();
    }
}